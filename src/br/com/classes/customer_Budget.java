package br.com.classes;

public class customer_Budget {
    public boolean aprovado = false;
    protected int total;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public customer_Budget(double total){

    }

}
