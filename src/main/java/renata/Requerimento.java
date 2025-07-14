package renata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        Map<Atividade, Double> atividadeHoras = new HashMap<>();

        atividadesAvaliadas.forEach(atividadeAvaliada -> {
            Atividade atividade = atividadeAvaliada.atividadeDeclarada.getAtividade();

            atividadeHoras.computeIfPresent(atividade, (key, valorAtual) -> {
                double total = valorAtual + atividadeAvaliada.horasValidadas;
                return Double.min(total, atividade.getLimiteMaxHoras());
            });
            atividadeHoras.putIfAbsent(atividade, atividadeAvaliada.horasValidadas);
        });

        Map<Modalidade, List<AtividadeAvaliada>> atividadesPorModalidade = atividadesAvaliadas.stream()
                .collect(Collectors.groupingBy(a -> a.atividadeDeclarada.getAtividade().getModalidade()));

        Map<Modalidade, Double> modalidadesHoras = new HashMap<>();

        atividadesPorModalidade.forEach((m, avaliadas) -> {
            double total = avaliadas.stream().mapToDouble(a -> a.horasValidadas).sum();
            modalidadesHoras.put(m, Double.min(total, m.getHorasMaximas()));
        });

        double horasValidadas = modalidadesHoras.values().stream().reduce(0.0, Double::sum);

        if (horasValidadas < horasMinimas) {
            throw new IllegalArgumentException("Horas calculadas: " + horasValidadas + " não atingiram o minímo necessário");
        }
    }
}
