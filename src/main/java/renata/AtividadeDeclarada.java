package renata;

public class AtividadeDeclarada {
    private final double horasDeclaradas;
    private final Atividade atividade;

    public AtividadeDeclarada(double horasDeclaradas, Atividade atividade) {
        this.horasDeclaradas = horasDeclaradas;
        this.atividade = atividade;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public double getHorasDeclaradas() {
        return horasDeclaradas;
    }
}
