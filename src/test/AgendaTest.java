package test;

import main.java.com.clinica.*;

import java.time.LocalDate;

public class AgendaTest {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Medico medico1 = new Medico("João da Silva Teixeira",
                "joaosilvateixeira.gmail.com",
                "999999");
        Medico medico2 = new Medico("Jose de Amaral",
                "josedeamaral.gmail.com",
                "12345");

        Paciente paciente1 = new Paciente("Johnny Dias",
                "johnny@gmail.com",
                LocalDate.of(1999, 1, 11));
        Paciente paciente2 = new Paciente("Amanda",
                "amanda@gmail.com",
                LocalDate.of(1998, 6, 24));

        Procedimento procedimento1 = new Procedimento(
                "Exame das glandulas mamarias",
                150.00);
        Procedimento procedimento2 = new Procedimento(
                "Exame de vista",
                50.00);
        Procedimento procedimento3 = new Procedimento(
                "Exame de Nariz",
                70.00);
        Procedimento procedimento4 = new Procedimento(
                "Exame de Pe",
                90.00);


        // Cria Consulta 1
        Consulta consulta1 = new Consulta(medico1, paciente1);
        consulta1.adicionaProcedimento(procedimento1);
        consulta1.adicionaProcedimento(procedimento2);

        agenda.adicionaConsulta(consulta1);


        // Cria Consulta 2
        Consulta consulta2 = new Consulta(medico2, paciente2);
        consulta2.adicionaProcedimento(procedimento3);
        consulta2.adicionaProcedimento(procedimento4);

        agenda.adicionaConsulta(consulta2);

        System.out.println(agenda.faturamentoTotalClinica());
        System.out.println(agenda.quantidadeConsultas());
        System.out.println(agenda.getConsultas());
    }
}
