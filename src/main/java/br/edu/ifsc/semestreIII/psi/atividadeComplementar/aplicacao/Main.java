package br.edu.ifsc.semestreIII.psi.atividadeComplementar.aplicacao;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.*;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //var scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matricula do Aluno");
        ///var aluno = new Aluno(scanner.next());
        Aluno aluno = new Aluno(scanner.next());

        //var modalidades = Repositorio.INSTANCE.getModalidades();
        //var menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        List<Modalidade> modalidades = Repositorio.INSTANCE.getModalidades();
        StringBuilder menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções");

        //var opcao = 0;
        int opcao = 0;
        
        do {
            System.out.println(menuModalidades);
            opcao = scanner.nextInt() - 1;

            if (opcao >= modalidades.size()) {
                System.out.println("\n!!!! Selecione uma modalidade válida!!!\n");
            } else if (opcao >= 0) {
                modalidades.get(opcao).mostrarMenu(scanner); //mostra o item do submenu do menu escolhido
            }
        } while (opcao >= 0);

        // somatoria em mapa
        
        
        
        
        //validacao

    }
}
