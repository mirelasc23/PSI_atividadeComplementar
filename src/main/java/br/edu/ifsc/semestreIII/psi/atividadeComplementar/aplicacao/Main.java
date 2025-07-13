package br.edu.ifsc.semestreIII.psi.atividadeComplementar.aplicacao;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.Modalidade;
import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.Repositorio;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*var modalidades = Repositorio.INSTANCE.getModalidades();
        var menuModalidades = new StringBuilder("==Menu de Modalidades==\n");*/                //adiciona item ao menu
        List<Modalidade> modalidades = Repositorio.INSTANCE.getModalidades();
        StringBuilder menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append((i + 1) + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções");
        Scanner scanner = new Scanner(System.in);

        int opcao;
        /*do {
            System.out.println(menuModalidades);
            opcao = scanner.nextInt();
            modalidades.get(opcao - 1).mostrarMenu(scanner);                                 //mostra o item do submenu do menu escolhido

        } while (opcao != 0);*/
        
        System.out.println(menuModalidades);
        opcao = scanner.nextInt();
        
        while (opcao != 0) {
            modalidades.get(opcao - 1).mostrarMenu(scanner);                                 //mostra o item do submenu do menu escolhido

        } 

    }
}
