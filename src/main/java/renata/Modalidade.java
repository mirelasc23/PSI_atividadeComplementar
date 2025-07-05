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
        System.out.println(menuAtividades);

        while (scanner.nextInt() != 0) {
            System.out.println(menuAtividades);
        }
    }
}
