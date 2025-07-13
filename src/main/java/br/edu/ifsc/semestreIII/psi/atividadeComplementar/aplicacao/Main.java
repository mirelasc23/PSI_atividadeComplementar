package br.edu.ifsc.semestreIII.psi.atividadeComplementar.aplicacao;
import com.sun.source.tree.NewArrayTree;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var modalidades = Repositorio.INSTANCE.getModalidades();
        var menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções");
        Scanner scanner = new Scanner(System.in);

        var opcao = 0;
        do {
            System.out.println(menuModalidades);
            opcao = scanner.nextInt();
            modalidades.get(opcao - 1).mostrarMenu(scanner);                                 //mostra o item do submenu do menu escolhido

        } while (opcao != 0);

    }
}
