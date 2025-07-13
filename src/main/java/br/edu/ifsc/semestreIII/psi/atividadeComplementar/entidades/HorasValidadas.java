package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

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
            System.out.println("Atividade: " + atividade);
        }
    }
}
