package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class Repositorio_Cursos {
    public static final Repositorio_Cursos INSTANCE = new Repositorio_Cursos();
    private Turnos turnos;
    
    private Repositorio_Cursos() {
        inicializaTurnos();
        inicializaCursos();
        
    }

    private void inicializaTurnos() {
        turnos = new Turnos();
    }

    private void inicializaCursos() {
        //Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 100, turnos, "n");
        //Curso pg = new Curso("Processos Gerenciais", 100, turnos, "n");
        //Curso se = new Curso("Sistemas Embarcados", 100, turnos, "m");
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 100);
        Curso pg = new Curso("Processos Gerenciais", 100);
        Curso se = new Curso("Sistemas Embarcados", 100);
        
    }
    
    
}
