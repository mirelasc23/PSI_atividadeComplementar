package renata;

import java.util.ArrayList;
import java.util.List;

import static renata.ScannerUtils.SCANNER;

public class Menu {
    private final String menuModalidades;

    public Menu() {
        this.menuModalidades = montaMenuModalidades();
    }

    private String montaMenuModalidades() {
        var modalidades = Repositorio.INSTANCE.getModalidades();
        var menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        return menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções").toString();
    }

    public List<AtividadeDeclarada> mostraMenuERetornaAtividadesDeclaradas() {
        var modalidades = Repositorio.INSTANCE.getModalidades();
        var opcao = 0;
        var atividadesDeclaradas = new ArrayList<AtividadeDeclarada>();

        do {
            System.out.println(menuModalidades);
            opcao = SCANNER.nextInt() - 1;

            if (opcao >= modalidades.size()) {
                System.out.println("\n!!!! Selecione uma modalidade válida!!!\n");
            } else if (opcao >= 0) {
                var declaradas = mostraMenu(modalidades.get(opcao));
                atividadesDeclaradas.addAll(declaradas);
            }
        } while (opcao >= 0);

        return atividadesDeclaradas;
    }

    public List<AtividadeAvaliada> mostraMenuAvaliadorERetornaAvaliadas(List<AtividadeDeclarada> declaradas) {
        System.out.println("==== Avaliação das horas ====");

        return declaradas
                .stream()
                .map(a -> {
                    System.out.println("Atividade: " + a.getAtividade().getDescricao());
                    System.out.println("Horas declaradas: " + a.getHorasDeclaradas());
                    System.out.println("Digite a quantidade de horas validadas para esta atividade a seguir");
                    var horasAvaliadas = SCANNER.nextDouble();
                    return new AtividadeAvaliada(a, horasAvaliadas);
                })
                .toList();
    }

    private List<AtividadeDeclarada> mostraMenu(Modalidade modalidade) {
        var atividades = modalidade.getAtividades();
        var menuAtividades = new StringBuilder("==Menu de Atividades==\n");

        for (int i = 0; i < atividades.size(); i++) {
            menuAtividades
                    .append(i + 1)
                    .append(" - ")
                    .append(atividades.get(i).getDescricao())
                    .append("\n");
        }
        menuAtividades.append("0 - Voltar.\nEscolha uma das opções");

        int opcao;
        var atividadesDeclaradas = new ArrayList<AtividadeDeclarada>();

        do {
            System.out.println(menuAtividades);
            opcao = SCANNER.nextInt() - 1;

            if (opcao >= atividades.size()) {
                System.out.println("\n!!!! Selecione uma atividade válida!!!\n");
            } else if (opcao >= 0) {
                var atividadeSelecionada = atividades.get(opcao);
                System.out.println("Quantas horas nesta atividade vc fez?");
                var horas = SCANNER.nextDouble();
                var atividadeDeclarada = new AtividadeDeclarada(horas, atividadeSelecionada);
                atividadesDeclaradas.add(atividadeDeclarada);
            }
        } while (opcao >= 0);

        return atividadesDeclaradas;
    }
}
