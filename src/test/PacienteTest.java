package test;

import main.java.com.clinica.Paciente;

import java.time.LocalDate;

public class PacienteTest {
    public static void main(String[] args){
        Paciente paciente = new Paciente("Johnny Dias",
                "johnny@gmail.com",
                LocalDate.of(1999, 1, 11));

        System.out.println(paciente);
    }
}
