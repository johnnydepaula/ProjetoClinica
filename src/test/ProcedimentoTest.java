package test;

import main.java.com.clinica.Procedimento;

public class ProcedimentoTest {
    public static void main(String[] args) {
        Procedimento procedimento = new Procedimento(
                "Exame das glandulas mamarias",
                150.00);

        System.out.println(procedimento);
    }
}
