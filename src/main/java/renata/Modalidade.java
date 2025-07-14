package renata;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Modalidade {
    private String nome;
    private double horasMaximas;
    private List<Atividade> atividades;

    public Modalidade(String nome, double horasMaximas) {
        this.nome = nome;
        this.horasMaximas = horasMaximas;
        this.atividades = new ArrayList<>();
    }

    public void addAtividade(Atividade atividade){
       atividades.add(atividade);
       atividade.setModalidade(this);
    }

    public String getNome() {
        return nome;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public double getHorasMaximas() {
        return horasMaximas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modalidade that = (Modalidade) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
