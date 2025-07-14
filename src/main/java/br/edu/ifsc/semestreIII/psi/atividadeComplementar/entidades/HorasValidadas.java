package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import br.edu.ifsc.semestreIII.psi.atividadeComplementar.util.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorasValidadas {
    private List<AtividadeDeclarada> atividadesDeclaradas;
    private Map<Atividade, Double> horasValidadas;

    public HorasValidadas(Requerimento requerimento) {
        this.atividadesDeclaradas = requerimento.atividadesDeclaradas();
        horasValidadas = new HashMap<>();
        
    }
    
    public void validarHoras(){
        for (AtividadeDeclarada atividade : atividadesDeclaradas) {
            System.out.println("Atividade: " + atividade.descricao());
            System.out.println("Horas Apresentadas: " + atividade.horasDeclaradas());
            
            System.out.println("As horas apresentadas são válidas?");
            System.out.println("[Escolha \"1\" para \"Sim\" e \"2\" para \"Não\"]");
            int escolha = Util.lerChar();
            
            if(escolha == 1){
                
            }
        }
    }
}
