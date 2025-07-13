package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades;

import java.util.ArrayList;
import java.util.List;

public class Modalidades {
    private List<Modalidade> modalidades;

    public Modalidades() {
        this.modalidades = new ArrayList<>();
    }
    
    public void adicionar(Modalidade modalidade){
        modalidades.add(modalidade);
    }
    
    public void remover(Modalidade modalidade){
        modalidades.remove(modalidade);
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }
    
    
}
