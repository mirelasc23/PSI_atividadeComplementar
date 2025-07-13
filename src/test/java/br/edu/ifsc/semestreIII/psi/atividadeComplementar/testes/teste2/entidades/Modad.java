package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades;

public abstract class Modad {
    public final void preparacao(){
        ferver();
        preparar();
        mostrarItens();
        adicionarCondimento();
    }

    public void ferver() {
        System.out.println("1. Ferver");
    }

    public abstract void preparar();

    public void mostrarItens() {
        System.out.println("3. Servir");
    }

    public abstract void adicionarCondimento();
    
    
}
