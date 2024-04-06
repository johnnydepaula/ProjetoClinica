package test;

import main.java.com.clinica.Medico;

import java.time.LocalDate;

public class MedicoTest {
    public static void main(String[] args){
        Medico medico = new Medico("João da Silva Teixeira",
                                    "joaosilvateixeira.gmail.com",
                                    "999999");

        Medico medico2 = new Medico("Jose de Amaral",
                "josedeamaral.gmail.com",
                "12345");

        Medico medico3 = new Medico("Ricardo",
                "Ricardo.gmail.com",
                "111111");

        System.out.println(medico);
        System.out.println(medico.getCodigo());
        System.out.println();

        System.out.println(medico2);
        System.out.println(medico2.getCodigo());
        System.out.println();

        System.out.println(medico3);
        System.out.println(medico3.getCodigo());

    }
}
