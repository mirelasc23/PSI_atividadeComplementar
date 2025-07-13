import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.AtividadeDeclarada;
import br.edu.ifsc.semestreIII.psi.atividadeComplementar.entidades.Requerimento;

public class Validacao {
    private Requerimento requerimento;
    private Boolean validado;

    Validacao(Requerimento requerimento){
        this.requerimento = requerimento;
    }

    public void validarRequerimento(){
        for (AtividadeDeclarada atividadeDeclarada : requerimento.atividadesDeclaradas) {
            private double horasValidas;
            if (horasValidas(atividadeDeclarada)) {
                System.out.println("\nAtividade: " + atividadeDeclarada + "\nHoras válidas: " + horasValidas);
            }else if (!horasValidas(atividadeDeclarada)) {
                System.out.println("\nAtividade: " + atividadeDeclarada + "\nHoras insuficientes");
            }
        }
    }

    public boolean horasValidas(AtividadeDeclarada atividadeDeclarada){
        if(atividadeDeclarada.horasDeclaradas() >= atividadeDeclarada.atividade().limiteMaxHoras()){
            return true;
        }else if(atividadeDeclarada.horasDeclaradas() < atividadeDeclarada.atividade().limiteMaxHoras()){
            return false;
        }
    }
}