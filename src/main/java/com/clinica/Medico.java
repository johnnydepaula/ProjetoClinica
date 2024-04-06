package main.java.com.clinica;

public class Medico {
    private String nome;
    private String email;
    private String crm;
    private static int numCodigo = 1;
    private String codigo;

    public Medico(String nome, String email, String crm) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;

        this.codigo = "ME"+numCodigo;
        numCodigo++;
    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public String getCodigo() {
        return codigo;
    }

    // toString()
    public String toString(){
        return "Medico:\t\tDr(a) " +
                getNome() + " – " +
                "CRM: " + getCrm() +
                "\n\t\t\t" +
                "("+getEmail()+")";
    }
}
