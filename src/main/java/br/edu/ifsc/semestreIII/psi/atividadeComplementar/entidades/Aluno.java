package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class Aluno {
    private String matricula;
    public Aluno(String matricula) {
        this.matricula = matricula;
    }
    
    public void gerarRequerimento(String numero){
        Requerimento requerimento = new Requerimento(this, numero);
    }
}
