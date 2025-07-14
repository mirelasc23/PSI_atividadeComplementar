package renata;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Requerimento {
    public final UUID id = UUID.randomUUID();
    public final Double horasMinimas = 100.0;
    public final Aluno aluno;
    public final List<AtividadeDeclarada> atividadesDeclaradas;
    public List<AtividadeAvaliada> atividadesAvaliadas;

    public Requerimento(Aluno aluno, List<AtividadeDeclarada> atividadesDeclaradas) {
        this.aluno = aluno;
        this.atividadesDeclaradas = atividadesDeclaradas;
    }

    public void valida() {
        var atividadeHoras = new HashMap<Atividade, Double>();

        atividadesAvaliadas.forEach(atividadeAvaliada -> {
            var atividade = atividadeAvaliada.atividadeDeclarada.getAtividade();

            atividadeHoras.computeIfPresent(atividade, (key, valorAtual) -> {
                var total = valorAtual + atividadeAvaliada.horasValidadas;
                return Double.min(total, atividade.getLimiteMaxHoras());
            });
            atividadeHoras.putIfAbsent(atividade, atividadeAvaliada.horasValidadas);
        });

        var atividadesPorModalidade = atividadesAvaliadas.stream()
                .collect(Collectors.groupingBy(a -> a.atividadeDeclarada.getAtividade().getModalidade()));

        var modalidadesHoras = new HashMap<Modalidade, Double>();

        atividadesPorModalidade.forEach((m, avaliadas) -> {
            var total = avaliadas.stream().mapToDouble(a -> a.horasValidadas).sum();
            modalidadesHoras.put(m, Double.min(total, m.getHorasMaximas()));
        });

        var horasValidadas = modalidadesHoras.values().stream().reduce(0.0, Double::sum);

        if (horasValidadas < horasMinimas) {
            throw new IllegalArgumentException("Horas calculadas: " + horasValidadas + " não atingiram o minímo necessário");
        }
    }
}
