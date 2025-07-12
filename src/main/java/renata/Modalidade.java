package renata;

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
        var menuAtividades = new StringBuilder("==Menu de Atividades==\n");

        for (int i = 0; i < atividades.size(); i++) {
            menuAtividades.append(i + 1 + " - " + atividades.get(i).getDescricao() + "\n");
        }
        menuAtividades.append("0 - Voltar.\nEscolha uma das opções");

        int opcao;

        do {
            System.out.println(menuAtividades);
            opcao = scanner.nextInt();
            if (opcao > atividades.size()) {
                System.out.println("Selecione uma atividade válida");
            } else {
                var atividadeSelecionada = atividades.get(opcao);
                System.out.println("Quantas horas nesta atividade vc fez?");
                var horas = scanner.nextDouble();
                var atividadeDeclarada = new AtividadeDeclarada(horas, atividadeSelecionada);
                Repositorio.INSTANCE.addAtividadeDeclarada(atividadeDeclarada);
            }
        } while (opcao != 0);

        while (scanner.nextInt() != 0) {
            System.out.println(menuAtividades);
        }
    }
}
