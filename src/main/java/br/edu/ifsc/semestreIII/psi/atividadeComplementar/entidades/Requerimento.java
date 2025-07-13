package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Requerimento {
    private Aluno aluno;
    private String numero;
    private List<AtividadeDeclarada> atividadesDeclaradas;

    public Requerimento(Aluno aluno) {
        // Define o tamanho do número aleatório
        int tamanho = 8;

        // Cria uma instância da classe Random
        Random random = new Random();

        // Define o valor mínimo e máximo
        int min = (int) Math.pow(10, tamanho - 1); // 10^(tamanho-1)
        int max = (int) Math.pow(10, tamanho) - 1; // 10^(tamanho) - 1

        // Gera o número aleatório
        int numero = random.nextInt(max - min + 1) + min;
        this.aluno = aluno;
        this.numero = Integer.toString(numero);
        this.atividadesDeclaradas = new ArrayList<>();
    }
    
    public void adicionarAtividade(AtividadeDeclarada atividadeDeclarada){
        this.atividadesDeclaradas.add(atividadeDeclarada);
    }

    public List<AtividadeDeclarada> atividadesDeclaradas() {
        return atividadesDeclaradas;
    }
    
    

    public String numero() {
        return numero;
    }

    public double soma(){
        double soma = 0;
            for (AtividadeDeclarada atividade : atividadesDeclaradas) {
                soma += atividade.horasDeclaradas();
            }
        return soma;
    }
    @Override
    public String toString() {
        return "Requerimento: " + numero() + "\nMatrículoa do Aluno: " + aluno.matricula();
    }
    
    
    
    
}
