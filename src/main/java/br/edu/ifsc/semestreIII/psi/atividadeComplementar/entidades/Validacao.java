package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class Validacao {
    private Requerimento requerimento;
    private Avaliador avaliador;
    private HorasValidadas horasValidadas;

    public Validacao(Requerimento requerimento, Avaliador avaliador) {
        this.requerimento = requerimento;
        this.avaliador = avaliador;
    }
    
    public void validar(){
        if(requerimento.soma() < requerimento.horasComplementares()){
            System.out.println("Requerimento indeferido. \nMotivo: não atingiu as horas mínimas necessárias.");
        } else {
            horasValidadas = new HorasValidadas(this.requerimento);
            horasValidadas.validarHoras();
        }
    }
}
