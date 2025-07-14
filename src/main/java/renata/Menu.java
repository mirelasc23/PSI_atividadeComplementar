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
        List<Modalidade> modalidades = Repositorio.INSTANCE.getModalidades();
        StringBuilder menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        return menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções").toString();
    }

    public List<AtividadeDeclarada> mostraMenuERetornaAtividadesDeclaradas() {
        List<Modalidade> modalidades = Repositorio.INSTANCE.getModalidades();
        int opcao = 0;
        List<AtividadeDeclarada> atividadesDeclaradas = new ArrayList<>();

        do {
            System.out.println(menuModalidades);
            opcao = SCANNER.nextInt() - 1;

            if (opcao >= modalidades.size()) {
                System.out.println("\n!!!! Selecione uma modalidade válida!!!\n");
            } else if (opcao >= 0) {
                List<AtividadeDeclarada> declaradas = mostraMenu(modalidades.get(opcao));
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
                    double horasAvaliadas = SCANNER.nextDouble();
                    return new AtividadeAvaliada(a, horasAvaliadas);
                })
                .toList();
    }

    private List<AtividadeDeclarada> mostraMenu(Modalidade modalidade) {
        List<Atividade> atividades = modalidade.getAtividades();
        StringBuilder menuAtividades = new StringBuilder("==Menu de Atividades==\n");

        for (int i = 0; i < atividades.size(); i++) {
            menuAtividades
                    .append(i + 1)
                    .append(" - ")
                    .append(atividades.get(i).getDescricao())
                    .append("\n");
        }
        menuAtividades.append("0 - Voltar.\nEscolha uma das opções");

        int opcao;
        List<AtividadeDeclarada> atividadesDeclaradas = new ArrayList<AtividadeDeclarada>();

        do {
            System.out.println(menuAtividades);
            opcao = SCANNER.nextInt() - 1;

            if (opcao >= atividades.size()) {
                System.out.println("\n!!!! Selecione uma atividade válida!!!\n");
            } else if (opcao >= 0) {
                Atividade atividadeSelecionada = atividades.get(opcao);
                System.out.println("Quantas horas nesta atividade vc fez?");
                double horas = SCANNER.nextDouble();
                AtividadeDeclarada atividadeDeclarada = new AtividadeDeclarada(horas, atividadeSelecionada);
                atividadesDeclaradas.add(atividadeDeclarada);
            }
        } while (opcao >= 0);

        return atividadesDeclaradas;
    }
}
