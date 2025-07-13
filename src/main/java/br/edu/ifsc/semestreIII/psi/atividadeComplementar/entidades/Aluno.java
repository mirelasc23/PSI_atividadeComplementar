package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.Random;

public class Aluno {
    private String matricula, nome;
    public Aluno(String nome) {
        this.nome = nome;

        // Gera o número aleatório
        int tamanho = 8;
        Random random = new Random();
        int min = (int) Math.pow(10, tamanho - 1); // 10^(tamanho-1)
        int max = (int) Math.pow(10, tamanho) - 1; // 10^(tamanho) - 1
        int numero_matricula = random.nextInt(max - min + 1) + min;
        
        this.matricula = Integer.toString(numero_matricula);
    }

    public String matricula() {
        return matricula;
    }
    
    
}
