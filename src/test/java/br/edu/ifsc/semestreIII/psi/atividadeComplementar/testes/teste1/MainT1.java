package br.edu.ifsc.semestreIII.psi.atividadeComplementar.introducao;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.util.Util;

public class MainT1 {
    static int horas_apresentadas = 0, horas_apresentadas_ensino = 0, horas_apresentadas_pesquisa = 0, 
                horas_apresentadas_extensao = 0, hora_apresentadas_outrasAtividades = 0, 
                horas_validadas = 0, horas_validadas_ensino = 0, horas_validadas_pesquisa = 0, 
                horas_validadas_extensao = 0, horas_validadas_outrasAtividades = 0;
    
    public static void main(String[] args) {
        String nome, curso, numero_requerimento,
                matricula, turno;
        
        System.out.println("Informe o nome do aluno:");
        nome = Util.lerString();
        
        System.out.println("Informe a matrícula do aluno:");
        nome = Util.lerString();
        
        System.out.println("Informe o curso do aluno:");
        nome = Util.lerString();
        
        System.out.println("Informe o turno do curso do aluno:");
        nome = Util.lerString();
                
        System.out.println("Informe o número do requerimento:");
        nome = Util.lerString();
        
        
        
        menu();
        
        
    }
    
    public static void menu(){
        System.out.println("Menu de Modalidades:");
        System.out.println("1 - Ensino");
        System.out.println("2 - Pesquisa");
        System.out.println("3 - Extensão");
        System.out.println("4 - Outras Atividades");
        System.out.println("5 - Adicionar Atividade");
        System.out.println("6 - Finalizar");
        
        
        int escolha = Util.lerInt();
        switch (escolha){
            case 1: menuEnsino();
                break;
            case 2: menuPesquisa();
                break;
            case 3: menuExtensao();
                break;
            case 4: menuOutrasAtividades();
                break;
        }
    }
    
    public static void menuEnsino(){
        System.out.println("Ensino:");
        System.out.println("1 - Disciplinas cursadas com aproveitamento, "
                + "não previstas no currículo do curso.");
        System.out.println("2 - Semana acadêmica dos cursos, quando não obrigatória.");
        System.out.println("3 - Participação em atividades de monitoria.");
        System.out.println("4 - Atividades realizadas em laboratórios e/ou "
                + "oficinas do instituto.");
        System.out.println("5 - Visita técnica relacionada à área.");
        System.out.println("6 - Participação em cursos de qualificação na área afim do curso ...");
        System.out.println("7 - Participação como ouvinte em bancas de projetos...");
        System.out.println("8 - Participação como ouvinte em bancas de TCC...");
        System.out.println("9 - Desenvolvimento de material, ...");
        System.out.println("10 - Instrutor de cursos abertos à comunidade.");
        System.out.println("11 - Voltar ao menu");
        
        
        int escolha = Util.lerInt();
        switch (escolha){
            case 7:
            case 8:
                horas_apresentadas_ensino += 20;
                horas_apresentadas_pesquisa += 20;
                horas_validadas_outrasAtividades += 20;
                break;
                
            case 11: menu();
                break;
        }
    }
    
    public static void menuPesquisa(){
        System.out.println("Pesquisa:");
        System.out.println("1 - Participação em programa ou projeto de pesquisa relacionados a área.");
        System.out.println("2 - Apresentação de projeto de pesquisa relacionado à área.");
        System.out.println("3 - Autoria e coautoria em artigo publicado em Periódico na área afim.");
        System.out.println("4 - Livro na área afim.");
        System.out.println("5 - Capitulo de livro na área afim.");
        System.out.println("6 - Publicação em Anais de Evento Técnico Científico.");
        System.out.println("7 - Apresentação de trabalho em Evento Técnico Científico.");
        System.out.println("8 - Participação de Programa de Iniciação Científica.");
        System.out.println("9 - Participação como palestrante, conferencionista, ... .");
        System.out.println("10 - Prêmios concedidos por instituições acadêmicas, científicas e profissionais.");
        System.out.println("11 - Participação na criação de Produto ou Processo Tecnológico com propriedade  .");
        System.out.println("12 - Participação em grupo de pesquisa na área.");
        System.out.println("13 - Voltar ao menu");
        
        
        int escolha = Util.lerInt();
        switch (escolha){
            case 13: menu();
                break;
        }
    }
    
    public static void menuExtensao(){
        System.out.println("Extensão:");
        System.out.println("1 - Participação em programa ou projeto de extensão.");
        System.out.println("2 - Apresentação de projeto de extensão.");
        System.out.println("3 - Participação em ações sociais cívicas e comunitárias.");
        System.out.println("4 - Texto em jornal ou revista da área.");
        System.out.println("5 - Intercâmbio com instituições de ensino no Brasil ou no exterior.");
        System.out.println("6 - Estágio não-obrigatório na área do curso, formalizado pelo IFSC.");
        System.out.println("7 - Exercício profissional com vínculo empregaatício, desde que na área do curso.");
        System.out.println("8 - Voltar ao Menu");
        
        int escolha = Util.lerInt();
        switch (escolha){
            case 2:
                horas_apresentadas_extensao += 20;
                break;
            case 8: menu();
                break;
        }
    }
    
    public static void menuOutrasAtividades(){
        System.out.println("Outras Atividades:");
        System.out.println("1 - Participação em congressos, jornadas, simpósios, .");
        System.out.println("2 - Comissão organizadora de congressos, jornadas, simpósios.");
        System.out.println("3 - Premiação em eventos que tenha relação com.");
        System.out.println("4 - Curso de língua estrangeira.");
        System.out.println("5 - Premiação em atividades esportivas como representante do Instituto.");
        System.out.println("6 - Representação estudantil em colegiado, grêmio estudantil, centro acadêmico, .");
        System.out.println("7 - Representação de turma (inclui a participação em conselhos de classe).");
        System.out.println("8 - Participação em Empresa Junior.");
        System.out.println("9 - Classificação em concursos culturais.");
        System.out.println("10 - Participação em projetos socias.");
        System.out.println("11 - Desenvolvimento de atividades socioculturais, artísticas e esportivas (coral, .");
        System.out.println("12 - Voltar ao menu");
        
        int escolha = Util.lerInt();
        switch (escolha){
            case 12: menu();
                break;
        }
    }
}
