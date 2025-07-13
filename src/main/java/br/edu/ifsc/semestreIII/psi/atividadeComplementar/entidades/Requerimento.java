package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.List;

public class Requerimento {
    private Aluno aluno;
    private String numero;
    private List<AtividadeDeclarada> atividadesDeclaradas;

    public Requerimento(Aluno aluno, String numero) {
        this.aluno = aluno;
        this.numero = numero;
        this.atividadesDeclaradas = atividadesDeclaradas;
    }
    
    
}
