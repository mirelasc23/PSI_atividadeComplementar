package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class ValidacaoPorSomaTotal implements Validacao_{
    private Requerimento requerimento;
    private Avaliador avaliador;
    private HorasValidadas horasValidadas;
    private double somaHorasValidas;
    
    public ValidacaoPorSomaTotal(Requerimento requerimento, Avaliador avaliador) {
        this.requerimento = requerimento;
        this.avaliador = avaliador;
    }
    
    @Override
    public void validar() {
        if(requerimento.soma() < requerimento.horasComplementares()){
            System.out.println("Requerimento indeferido. \nMotivo: não atingiu as horas mínimas necessárias.");
        } 
    }

    @Override
    public void proximo(Validacao_ validacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
