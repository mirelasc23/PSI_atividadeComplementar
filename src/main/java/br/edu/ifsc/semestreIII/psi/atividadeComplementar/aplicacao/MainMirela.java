package br.edu.ifsc.semestreIII.psi.atividadeComplementar.aplicacao;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.*;
import br.edu.ifsc.semestreIII.psi.atividadeComplementar.util.Util;
import java.util.List;

public class MainMirela {
    public static void main(String[] args) {
        //INSTANCIA REPOSITORIOS
        List<TurnoDoCurso> cursos = Repositorio_Cursos.INSTANCE.cursos();
        StringBuilder menuCursos = Repositorio_Cursos.INSTANCE.menuCursos();
        List<Modalidade> modalidades = Repositorio.INSTANCE.getModalidades();
        StringBuilder menuModalidades = Repositorio.INSTANCE.menuModalidades();
        
        //CADASTRA ALUNO COM CURSO e gera requerimento
        System.out.println("--------| SECRETARIA (cadastro) |--------");
        /*System.out.println("Informe o nome do aluno: ");
        String cadastro = Util.lerString();
        System.out.println(menuCursos);
        int escolha = Util.lerInt()-1;*/
        int escolha;
        
        CursoDoAluno maria = new CursoDoAluno(new Aluno("mirela"), cursos.get(1));
        Requerimento requerimento = new Requerimento(maria);
        
        //ESCOLHA DAS ATIVIDADES APRESENTADAS/DECLARADAS
        System.out.println("\n--------| ALUNO |--------");
        do {
            System.out.println(menuModalidades);
            escolha = Util.lerInt() - 1;

            if (escolha >= modalidades.size()) {
                System.out.println("\n!!!! Selecione uma modalidade válida!!!\n");
            } else if (escolha >= 0) {
                modalidades.get(escolha).mostrarMenu(requerimento); //mostra o item do submenu do menu escolhido
            }
        } while (escolha >= 0);
        
        System.out.println("\n" + requerimento);
        System.out.println("Horas apresentadas: " + requerimento.soma());
        
        System.out.println("\n--------| VALIDADOR |--------\n");
        Avaliador avaliador = new Avaliador("willian");
        Validacao validacao = new Validacao(requerimento, avaliador);
        
        validacao.validar();
        
        
    }
}
