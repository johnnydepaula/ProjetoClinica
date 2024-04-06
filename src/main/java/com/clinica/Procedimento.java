package main.java.com.clinica;

public class Procedimento {
    private String descricaoProcedimento;
    private double valor;
    private static int numCodigo = 1;
    private String codigo;

    public Procedimento(String descricaoProcedimento, double valor) {
        this.descricaoProcedimento = descricaoProcedimento;
        this.valor = valor;

        this.codigo = "PO"+numCodigo;
        numCodigo++;
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

    public String getCodigo() {
        return codigo;
    }

    public String toString(){
        return "Procedimento: " +
                getDescricaoProcedimento() +
                " – " + "R$ " + getValor();
    }
}
