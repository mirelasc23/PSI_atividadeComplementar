package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.HashMap;
import java.util.Map;

public class Repositorio_Cursos {
    public static final Repositorio_Cursos INSTANCE = new Repositorio_Cursos();
    private Turnos turnos;
    private Map<String, TurnoDoCurso> cursos = new HashMap<>();
    
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
        
        //ASSOCIA CURSO E TURNO:
        cursos.put("ads_n", new TurnoDoCurso(ads, turnos, "n"));
        cursos.put("pg_n", new TurnoDoCurso(pg, turnos, "n"));
        cursos.put("se_n", new TurnoDoCurso(se, turnos, "n"));
        cursos.put("se_v", new TurnoDoCurso(se, turnos, "v"));
        
    }

    public Map<String, TurnoDoCurso> cursos() {
        return cursos;
    }
    
    
}
