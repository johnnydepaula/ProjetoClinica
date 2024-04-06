package test;

import main.java.com.clinica.Consulta;
import main.java.com.clinica.Medico;
import main.java.com.clinica.Paciente;
import main.java.com.clinica.Procedimento;

import java.time.LocalDate;

public class ConsultaTest {
    public static void main(String[] args) {

        Medico medico = new Medico("João da Silva Teixeira",
                "joaosilvateixeira.gmail.com",
                "999999");

        Paciente paciente = new Paciente("Johnny Dias",
                "johnny@gmail.com",
                LocalDate.of(1999, 1, 11));

        Procedimento procedimento1 = new Procedimento(
                "Exame das glandulas mamarias",
                150.00);
        Procedimento procedimento2 = new Procedimento(
                "Exame de vista",
                50.00);
        Procedimento procedimento3 = new Procedimento(
                "Exame de Nariz",
                70.00);

        // Cria consulta
        Consulta consulta = new Consulta(medico, paciente);
        consulta.adicionaProcedimento(procedimento1);
        consulta.adicionaProcedimento(procedimento2);
        // Uncomment the line bellow to check if existeProcedimento() works
        //consulta.adicionaProcedimento(procedimento3);

        System.out.println(consulta);

        System.out.println(consulta.existeProcedimento("PO1")); // expected: true
        System.out.println(consulta.existeProcedimento("PO2")); // expected: true
        System.out.println(consulta.existeProcedimento("PO3")); // expected: false
    }
}
