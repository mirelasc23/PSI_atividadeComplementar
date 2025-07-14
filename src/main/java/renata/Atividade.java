package renata;

import java.util.Objects;
import java.util.UUID;

public class Atividade {
    private UUID id = UUID.randomUUID();
    private String descricao;
    private int limiteMaxHoras;
    private Modalidade modalidade;

    public Atividade(String descricao, int limiteMaxHoras) {
        this.descricao = descricao;
        this.limiteMaxHoras = limiteMaxHoras;
    }

    public UUID getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public int getLimiteMaxHoras() {
        return limiteMaxHoras;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
