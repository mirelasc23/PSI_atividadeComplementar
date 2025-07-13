package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class CursoDoAluno {
    private Aluno aluno;
    private Curso curso;
    private Turno turno;

    public CursoDoAluno(Aluno aluno, Curso curso, Turnos turnos, String turno_id) {
        this.aluno = aluno;
        this.curso = curso;
        this.turno =  turnos.turno(turno_id.toUpperCase());
    }
    
    public String turno() {
        return turno.nome();
    }
    
    public int horasComplementares() {
        return curso.horasComplementares();
    }
    
}
