package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades;

import java.util.ArrayList;
import java.util.List;

public class Ensino implements Modalidade{
    private String nome;
    private int limite;
    private List<AtividadeComplementar> atividades;

    public Ensino(String nome, int limite) {
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
    
    
    
    
}
