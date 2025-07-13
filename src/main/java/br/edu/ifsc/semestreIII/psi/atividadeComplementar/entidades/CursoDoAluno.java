package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class CursoDoAluno {
    private Aluno aluno;
    private TurnoDoCurso curso;

    public CursoDoAluno(Aluno aluno, String curso_id) {
        this.aluno = aluno;
        this.curso = curso;
    }
    
    public String turno() {
        return curso.turno();
    }
    
    public int horasComplementares() {
        return curso.horasComplementares();
    }
    
    public String matricula() {
        return aluno.matricula();
    }
}
