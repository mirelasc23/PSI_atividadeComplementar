package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class AtividadeDeclarada {
    private double horasDeclaradas;
    private Atividade atividade;

    public AtividadeDeclarada(Requerimento requerimento, double horasDeclaradas, Atividade atividade) {
        this.horasDeclaradas = horasDeclaradas;
        this.atividade = atividade;
        requerimento.adicionarAtividade(this);
    }

    public double horasDeclaradas() {
        return horasDeclaradas;
    }
    
    
}
