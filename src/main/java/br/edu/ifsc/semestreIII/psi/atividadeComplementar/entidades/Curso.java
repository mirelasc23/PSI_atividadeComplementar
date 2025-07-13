package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class Curso {
    private String nome;
    private int horasComplementares;
    private Turno turno;

    public Curso(String nome, int horasComplementares) { //, Turnos turnos, String turno_id) {
        this.nome = nome;
        this.horasComplementares = horasComplementares;
        //this.turno =  turnos.turno(turno_id.toUpperCase());
    }

    public String nome() {
        return nome;
    }

    public int horasComplementares() {
        return horasComplementares;
    }

    public String turno() {
        return turno.nome();
    }
    
    
}
