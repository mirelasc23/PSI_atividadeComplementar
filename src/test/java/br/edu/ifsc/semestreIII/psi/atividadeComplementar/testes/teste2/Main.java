package br.edu.ifsc.trabalhopsi_atividadescomplementares;

import br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades.of.util.Util;

public class Main {
    public static int count;
    
    public static void main(String[] args) {
        Instancia instancia  = new instanncia();
        iniciar();
        
        System.out.println("\nHoras Apresentada: " + count);
        /*informarHorasApresentadas;
        
        validarHoras();*/
        
        int cargaHorario = 80;
        
        
        if(count >= cargaHorario){
            for (Atividade atividade : atividades) {
                
                //soma das horas por ATIVIDADE.
                for (Modalidade modalidade : modalidades) {
                    //soma das horas por ATIVIDADE.
                    
                    //soma das horas por MODALIDADE.

                }
                //soma das horas por MODALIDADE.
            
            }
            
            
            
            
        } else {
            System.out.println("Requerimento inválido.");
        }
        
        
    }
    
    public static void iniciar(){
        //verificacaoDeUsuario();
        listarModalidades();
    }
    
    
    public static void listarModalidades(){
        System.out.println("MODALIDADES:");
        System.out.println("0 - cancelar");
        System.out.println("1 - submeter");
        System.out.println("2 - ensino");
        System.out.println("3 - pesquisa");
        
        int escolha = Util.lerInt();
        
        switch(escolha){
            case 0:
                System.out.println("REQUERIMENTO CANCELADO");
                break;
                
            case 1:
                System.out.println("REQUERIMENTO SUBMETIDO");
                break;
                
            case 2:
                listarAtividadesEnsino();
                break;
                
            case 3:
                listarAtividadesPesquisa();
                break;
                
            default: System.out.println("exit");
                break;
                
            
        }
        
    }
    
    public static void listarAtividadesEnsino(){
        System.out.println("ATIVIDADES:");
        System.out.println("0 - voltar");
        System.out.println("1 - monitoria");
        System.out.println("2 - semana academica");
        System.out.println("3 - visita tecnica");
        
        int escolha = Util.lerInt();
        
        switch(escolha){
            case 0:
                listarModalidades();
                break;
                
            case 1:
                horasApresentadasDaAtividade();
                break;
                
            case 2:
                horasApresentadasDaAtividade();
                break;
                
            case 3:
                horasApresentadasDaAtividade();
                break;

        }
    }
    
    public static void listarAtividadesPesquisa(){
        System.out.println("ATIVIDADES:");
        System.out.println("0 - voltar");
        System.out.println("1 - progr inicia cient");
        System.out.println("2 - premios instituicao academica");
        System.out.println("3 - livro na area");
        
        int escolha = Util.lerInt();
        
        switch(escolha){
            case 0:
                listarModalidades();
                break;
                
            case 1:
                horasApresentadasDaAtividade();
                break;
                
            case 2:
                horasApresentadasDaAtividade();
                break;
                
            case 3:
                horasApresentadasDaAtividade();
                break;

        }
        
        
        /* método para gerar lista de atividades/modadelidades com indice para selecao:
        
        gerarIndice(){
            int index = 0;                            
            for (Object object : lista) {
                index++;
                System.out.println(index + object.nome());
            }
            int escolha = in.nextInt();
        }
        
        
        escolha switch-case:
        
        int indice = escolha--;
        
        int horas = in.nextInt();
        
        lista.get(indice).setHorasApresentadas(horas).getAtividade.getModalidade.getLiomite;        //PADRAO BUILDER +-
        
        
        FALTA:
        
        associacao indice gerado no metodo gerarIndice() com a escolha do switch-case;
        
        
        */
        
    }
    
    public static void horasApresentadasDaAtividade(){
        System.out.println("Horas Apresentadas: ");
        int horas = Util.lerInt();
        count += horas;
        
        listarAtividadesEnsino();
    }
}
