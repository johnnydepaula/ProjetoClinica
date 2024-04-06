package main.java.com.clinica;
import java.util.Locale;
import java.time.LocalDate;


public class Paciente {
    private String nome;
    private String email;
    private LocalDate dataNascimento; // YYYY-MM-DD

    private static int numCodigo = 1;
    private String codigo;

    public Paciente(String nome, String email, LocalDate dataNascimento){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;

        this.codigo = "PA"+numCodigo;
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

    public String getCodigo() {
        return codigo;
    }

    // toString()
    public String toString(){
        return "Paciente:\tSr(a) " +
                getNome() +
                "\n\t\t\t" +
                "("+getEmail()+")";
    }
}
