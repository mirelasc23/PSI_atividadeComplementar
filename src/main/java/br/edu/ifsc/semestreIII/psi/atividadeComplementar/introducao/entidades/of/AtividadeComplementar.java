package br.edu.ifsc.trabalhopsi_atividadescomplementares.entidades.of;

public class AtividadeComplementar {
    private String nome, descricao, limitePorAtividade, documentacaoComprobatoria;
    private int limite;

    public AtividadeComplementar(String nome, String descricao, String limitePorAtividade, String documentacaoComprobatoria, int limite) {
        this.nome = nome;
        this.descricao = descricao;
        this.limitePorAtividade = limitePorAtividade;
        this.documentacaoComprobatoria = documentacaoComprobatoria;
        this.limite = limite;
    }

    public String nome() {
        return nome;
    }

    public String descricao() {
        return descricao;
    }

    public String limitePorAtividade() {
        return limitePorAtividade;
    }

    public String documentacaoComprobatoria() {
        return documentacaoComprobatoria;
    }

    public int limite() {
        return limite;
    }
    
    
    
}
