package br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades;

public class RegraSomatoriaMaiorQueCargaHorariaEstipulada implements Regra{
	private double somaHoras;
	private Requerimento requerimento;
    
    public RegraSomatoriaMaiorQueCargaHorariaEstipulada(double somaHoras, Requerimento requerimento) {
        this.somaHoras = somaHoras;
		this.requerimento = requerimento;
    }
    
    @Override
    public void isSatisfiedBy() {
        if(this.somaHoras < requerimento.horasComplementares()){
            System.out.println("Requerimento indeferido. \nMotivo: não atingiu as horas mínimas necessárias.");
        } 
    }  
}
