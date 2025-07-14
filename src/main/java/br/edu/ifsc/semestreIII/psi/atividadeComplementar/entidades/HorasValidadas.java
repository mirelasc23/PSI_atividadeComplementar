package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.util.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorasValidadas {
    private List<AtividadeDeclarada> atividadesDeclaradas;
    private Map<Atividade, Double> horasValidadas;
    private Map<Modalidade, Double> horasValidadasPorModalidade;
    private Requerimento requerimento;
    

    public HorasValidadas(Requerimento requerimento) {
        this.atividadesDeclaradas = requerimento.atividadesDeclaradas();
        this.requerimento = requerimento;
        horasValidadas = new HashMap<>();
        horasValidadasPorModalidade = new HashMap<>();
        
    }
    
    public double validarHoras(){
        double somaHorasValidas = 0;
        for (AtividadeDeclarada atividade : atividadesDeclaradas) {
            System.out.println("\n-------- || --------");
            System.out.println("Atividade: " + atividade.descricao());
            System.out.println("Horas Apresentadas: " + atividade.horasDeclaradas());
            
            System.out.println("\nAs horas apresentadas são válidas?");
            System.out.println("[Escolha \"1\" para \"Sim\" e \"2\" para \"Não\"]");
            int escolha = Util.lerChar();
            
            if(escolha == '1'){
                if(atividade.horasDeclaradas() > (atividade.limiteMaximo() * requerimento.horasComplementares() / 100)){
                    
                    horasValidadas.put(atividade.atividade(), Double.parseDouble(String.valueOf((atividade.limiteMaximo() * requerimento.horasComplementares() / 100))));
                    horasValidadasPorModalidade(atividade, Double.parseDouble(String.valueOf(atividade.limiteMaximo() * requerimento.horasComplementares() / 100)));
                    somaHorasValidas += atividade.limiteMaximo() * requerimento.horasComplementares() / 100;
                } else {
                    horasValidadas.put(atividade.atividade(), atividade.horasDeclaradas());
                    horasValidadasPorModalidade(atividade, atividade.horasDeclaradas());
                    somaHorasValidas += atividade.horasDeclaradas();
                }
                
            }else{
                System.out.println("Informe as horas validadas: ");
                double horasValidas = Util.lerDouble();
                horasValidadas.put(atividade.atividade(), horasValidas);
                horasValidadasPorModalidade(atividade, horasValidas);
                somaHorasValidas += horasValidas;
            }
        }
        System.out.println("Total de horas validadas: " + somaHorasValidas);
        if(requerimento.aluno().horasComplementares() > somaHorasValidas){
            System.out.println("Requerimento indeferido. \\nMotivo: não atingiu as horas mínimas necessárias.\");");
        } else{
            
        }
        
        
        /*for (AtividadeDeclarada atividade : atividadesDeclaradas) {
            System.out.println("Atividade: " + atividade.descricao());
            System.out.println("Horas Apresentadas: " + atividade.horasDeclaradas());
            
            System.out.println("As horas apresentadas são válidas?");
            System.out.println("[Escolha \"1\" para \"Sim\" e \"2\" para \"Não\"]");
            int escolha = Util.lerChar();
            
            if(escolha == '1'){
                double horasValidadasAtuais = horasValidadas.getOrDefault(atividade, 0.0);

                double somaHorasDeclaradas += atividadeDeclarada.horasDeclaradas();

                if(somaHorasDeclaradas > atividade.limiteMaxHoras()){
                    somaHoras = limiteMax;
                }

                    horasValidadas.put(atividade, somaHoras);
                }

                for (Map.Entry<Atividade, Double> entry : horasValidadas.entrySet()) {
                System.out.println("Atividade: " + entry.getKey().getDescricao() +
                                "\nHoras validadas: " + entry.getValue());
                }
            }*/
        
        return somaHorasValidas;
    }

    public Map<Atividade, Double> horasValidadas() {
        return horasValidadas;
    }

    private void horasValidadasPorModalidade(AtividadeDeclarada atividade, double  horasValidas) {
        boolean inserido = false;
        for (Map.Entry<Modalidade, Double> modalidade : horasValidadasPorModalidade.entrySet()) {
            if(atividade.atividade().modalidade() == modalidade.getKey()){
                if((horasValidadasPorModalidade.get(atividade.atividade().modalidade()) + horasValidas) > atividade.limiteMaximo()){
                    horasValidadasPorModalidade.put(atividade.atividade().modalidade(), Double.parseDouble(String.valueOf(atividade.percentualMaximo() * requerimento.horasComplementares() / 100)));
                }else{
                    horasValidadasPorModalidade.put(atividade.atividade().modalidade(), horasValidadasPorModalidade.get(atividade.atividade().modalidade()) + horasValidas);
                }
                
                inserido = true;
            }
        }
        if(!inserido){
            horasValidadasPorModalidade.put(atividade.atividade().modalidade(), horasValidas);
        }
    }
    
    
}
