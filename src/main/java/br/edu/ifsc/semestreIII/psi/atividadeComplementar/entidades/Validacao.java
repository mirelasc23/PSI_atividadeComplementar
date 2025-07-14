package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

import java.util.Map;

public class Validacao {
    private Requerimento requerimento;
    private Avaliador avaliador;
    private HorasValidadas horasValidadas;
    private double somaHorasValidas;

    public Validacao(Requerimento requerimento, Avaliador avaliador) {
        this.requerimento = requerimento;
        this.avaliador = avaliador;
    }
    
    public void validar(){
        if(requerimento.soma() < requerimento.horasComplementares()){
            System.out.println("Requerimento indeferido. \nMotivo: não atingiu as horas mínimas necessárias.");
        } else {
            horasValidadas = new HorasValidadas(this.requerimento);
            somaHorasValidas = horasValidadas.validarHoras();/*
            System.out.println("Total de Horas Validadas: " + somaHorasValidas);
            if(somaHorasValidas < requerimento.horasComplementares()){
                System.out.println("Requerimento indeferido. \nMotivo: não atingiu as horas mínimas necessárias.");
            } else{
                validacaoPorLimiteDeModalidade();
            }*/
        }
    }

    /*private void validacaoPorLimiteDeModalidade() {
        Map<Atividade, Double> atividadesValidadas = horasValidadas.horasValidadas();
        /*for (Map<Atividade, Double> atividadeValidada : atividadesValidadas) {
            
        }
    }*/
    
}
