package main.java.com.clinica;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas;

    public Agenda() {
        this.consultas = new ArrayList<>();
    }

    public void adicionaConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
    public void removeConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public List<Consulta> getConsultas() {
        return List.copyOf(consultas);
    }

    public int quantidadeConsultas() {
        return consultas.size();
    }

    public double faturamentoTotalClinica(){
        double total = 0.0;
        for(Consulta consulta : consultas){
            total += consulta.calcularConsulta();
        }
        return total;
    }
}
