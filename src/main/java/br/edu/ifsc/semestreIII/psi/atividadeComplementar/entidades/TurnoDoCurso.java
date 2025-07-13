package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class TurnoDoCurso {
    private Turno turno;
    private Curso curso;

    public TurnoDoCurso(Curso curso, Turnos turnos, String turno_id) {
        this.curso = curso;
        this.turno =  turnos.turno(turno_id.toUpperCase());
    }
    
    
}
