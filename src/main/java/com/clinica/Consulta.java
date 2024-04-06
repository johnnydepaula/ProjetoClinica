package main.java.com.clinica;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private List<Procedimento> procedimentos;

    public Consulta(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
        this.procedimentos = new ArrayList<>();
    }

    public void adicionaProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }
    public void removeProcedimento(Procedimento procedimento) {
        procedimentos.remove(procedimento);
    }

    public boolean existeProcedimento(String codigo) {
        for (Procedimento procedimento : procedimentos) {
            if (procedimento.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }


    public double calcularConsulta(){
        double total = 0.0;
        for(Procedimento procedimento : procedimentos){
            total += procedimento.getValor();
        }
        return total;
    }


    // Método toString
    @Override
    public String toString() {
        return "Consulta{" +
                "medico='" + medico + '\'' +
                ", paciente='" + paciente + '\'' +
                ", procedimentos=" + procedimentos +
                ", total=" + calcularConsulta() +
                '}';
    }
}
