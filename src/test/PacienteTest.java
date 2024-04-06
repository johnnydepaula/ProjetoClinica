package test;

import main.java.com.clinica.Paciente;

import java.time.LocalDate;

public class PacienteTest {
    public static void main(String[] args){
        Paciente paciente1 = new Paciente("Johnny Dias",
                "johnny@gmail.com",
                LocalDate.of(1999, 1, 11));
        Paciente paciente2 = new Paciente("Hilton",
                "hilton@gmail.com",
                LocalDate.of(1997, 1, 20));
        Paciente paciente3 = new Paciente("Sandro",
                "sandro@gmail.com",
                LocalDate.of(1998, 1, 8));


        System.out.println(paciente1);
        System.out.println(paciente1.getCodigo());

        System.out.println(paciente2);
        System.out.println(paciente2.getCodigo());

        System.out.println(paciente3);
        System.out.println(paciente3.getCodigo());
    }
}
