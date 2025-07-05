package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades.of;

import java.util.ArrayList;
import java.util.List;

public class Modalidade{
    private String nome;
    private int limite;
    private List<AtividadeComplementar> atividades;

    public Modalidade(String nome, int limite) {
        this.nome = nome;
        this.limite = limite;
        this.atividades = new ArrayList<> ();
    }

    public String nome() {
        return this.nome;
    }

    public int limite() {
        return this.limite;
    }

    public List<AtividadeComplementar> atividades() {
        
        return atividades;
    }
    
    public void validar(){
        somar horas_validadas()
        
        se (horas_validas + horas_a_vailidar) > limit{
            soma = limite
        } else {
            horas_validas +=  horas_a_vailidar;
        }
           
    }
    }
    
    
}
