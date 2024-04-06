package main.java.com.clinica;

public class Procedimento {
    private String descricaoProcedimento;
    private double valor;

    public Procedimento(String descricaoProcedimento, double valor) {
        this.descricaoProcedimento = descricaoProcedimento;
        this.valor = valor;
    }

    // Getters e Setters
    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }
    public void setDescricaoProcedimento(String descricaoProcedimento) {
        this.descricaoProcedimento = descricaoProcedimento;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Procedimento: " +
                getDescricaoProcedimento() +
                " – " + "R$ " + getValor();
    }
}
