package main.java.com.clinica;
import java.util.Locale;
import java.time.LocalDate;


public class Paciente {
    private String nome;
    private String email;
    private LocalDate dataNascimento; // YYYY-MM-DD

    public Paciente(String nome, String email, LocalDate dataNascimento){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
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

    // toString()
    public String toString(){
        return "Paciente:\tSr(a) " +
                getNome() +
                "\n\t\t\t" +
                "("+getEmail()+")";
    }
}
