package renata;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atividade atividade01 = new Atividade("monitoria", 70);
        Atividade atividade02 = new Atividade("Texto em jornal ou revista da área.", 40);
        Atividade atividade03 = new Atividade("Livro na área afim.", 100);
        Atividade atividade04 = new Atividade("Partcipação em empresa júnior.", 40);
        Modalidade modalidadeEnsino = new Modalidade("Ensino", 40);
        Modalidade modalidadeExtensao = new Modalidade("Extensão", 40);
        Modalidade modalidadePesquisa = new Modalidade("Pesquisa e invoação", 40);
        Modalidade modalidadeComplementacao = new Modalidade("Complementacao", 20);
        modalidadeEnsino.addAtividade(atividade01);
        modalidadeExtensao.addAtividade(atividade02);
        modalidadePesquisa.addAtividade(atividade03);
        modalidadeComplementacao.addAtividade(atividade04);

        var modalidades = List.of(modalidadeEnsino, modalidadeExtensao, modalidadePesquisa, modalidadeComplementacao); //variavel lista itens do menu
        var menuModalidades = new StringBuilder("==Menu de Modalidades==\n"); //adiciona item ao menu

        for (int i = 0; i < modalidades.size(); i++) { // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n"); //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções"); //add esse item ao menu


        Scanner scanner = new Scanner(System.in); //input para digitar a opcao desejada

        var opcao = 0;
        do {
            System.out.println(menuModalidades);
            opcao = scanner.nextInt();
            modalidades.get(opcao - 1).mostrarMenu(scanner); //mostra o submenu do menu escolhido

        } while (opcao != 0);

    }
}
