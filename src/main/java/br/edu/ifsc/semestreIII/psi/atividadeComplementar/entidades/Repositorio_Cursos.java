package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.ArrayList;
import java.util.List;

public class Repositorio_Cursos {
    public static final Repositorio_Cursos INSTANCE = new Repositorio_Cursos();
    private Turnos turnos;
    private List<TurnoDoCurso> cursos = new ArrayList<>();
    
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
        
        cursos.add(new TurnoDoCurso(ads, turnos, "n"));
        cursos.add(new TurnoDoCurso(pg, turnos, "n"));
        cursos.add(new TurnoDoCurso(se, turnos, "n"));
        cursos.add(new TurnoDoCurso(se, turnos, "v"));
    }

    public StringBuilder menuCursos() {
            StringBuilder menuCursos = new StringBuilder("==Menu de Cursos==\n");                //adiciona item ao menu
            for (int i = 0; i < cursos.size(); i++) {                                       // monta o menu
                menuCursos.append((i + 1) + " - " + cursos.get(i).curso() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
            }
            menuCursos.append("Escolha o curso: ");
        return menuCursos;
    }

    public List<TurnoDoCurso> cursos() {
        return cursos;
    }
        
}
