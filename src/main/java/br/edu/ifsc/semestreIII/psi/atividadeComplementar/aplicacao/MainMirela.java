package br.edu.ifsc.semestreIII.psi.atividadeComplementar.aplicacao;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.Repositorio;
import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.Repositorio_Cursos;

public class MainMirela {
    public static void main(String[] args) {
        StringBuilder cursos = Repositorio_Cursos.INSTANCE.menuCursos();
        StringBuilder modalidades = Repositorio.INSTANCE.menuModalidades();
        
        System.out.println(cursos);
        System.out.println(modalidades);
        
    }
}
