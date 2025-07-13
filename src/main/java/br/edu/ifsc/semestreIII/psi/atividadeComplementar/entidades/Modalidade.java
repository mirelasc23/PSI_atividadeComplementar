package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modalidade {
    private String nome;
    private double percentualMaximo;
    private List<Atividade> atividades;

    public Modalidade(String nome, double percentualMaximo) {
        this.nome = nome;
        this.percentualMaximo = percentualMaximo;
        this.atividades = new ArrayList<>();
    }

    public void addAtividade(Atividade atividade){
       atividades.add(atividade);
       atividade.setModalidade(this);
    }

    public String getNome() {
        return nome;
    }

    public void mostrarMenu(Scanner scanner){
        //var menuAtividades = new StringBuilder("==Menu de Atividades==\n");
        StringBuilder menuAtividades = new StringBuilder("==Menu de Atividades==\n");

        for (int i = 0; i < atividades.size(); i++) {
            menuAtividades.append(i + 1 + " - " + atividades.get(i).getDescricao() + "\n");
        }
        menuAtividades.append("0 - Voltar.\nEscolha uma das opções");

        int opcao;

        do {
            System.out.println(menuAtividades);
            opcao = scanner.nextInt() - 1;

            if (opcao >= atividades.size()) {
                System.out.println("\n!!!! Selecione uma atividade válida!!!\n");
            } else if (opcao >= 0) {
                //var atividadeSelecionada = atividades.get(opcao);
                Atividade atividadeSelecionada = atividades.get(opcao);
                System.out.println("Quantas horas nesta atividade vc fez?");
                //var horas = scanner.nextDouble();
                //var atividadeDeclarada = new AtividadeDeclarada(horas, atividadeSelecionada);
                double horas = scanner.nextDouble();
                AtividadeDeclarada atividadeDeclarada = new AtividadeDeclarada(horas, atividadeSelecionada);
                Repositorio.INSTANCE.addAtividadeDeclarada(atividadeDeclarada);
            }
        } while (opcao >= 0);
    }


}
