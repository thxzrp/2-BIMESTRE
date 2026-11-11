package br.thomas.auladiegorepitiliano.vetores;

public class Exercicio_4_reajuste {
    public static void main(String[] args) {

        IO.println("========================================");
        IO.println("      SISTEMA DE REAJUSTE SALARIAL      ");
        IO.println("              BEM-VINDO!                ");
        IO.println("========================================");
            IO.readln("\npressione ENTER para continuar...");

            double[] salarios = new double[8];

                IO.println("\n=====CADASTRO DE SALÁRIOS=====");

                    for (int i = 0; i < salarios.length; i++) {
                        salarios[i] = Double.parseDouble(IO.readln("Salário do funcionário " + (i + 1) + ": R$ ")
                        );
                    }


            double aumentoTotal = 0;

                IO.println("\n=====================================");
                IO.println("         RELATÓRIO DE REAJUSTE         ");
                IO.println("=======================================");

                    for (int i = 0; i < salarios.length; i++) {
                        double salarioAnterior = salarios[i];
                        double salarioNovo = salarioAnterior * 1.10;

                        if (salarioNovo > 5000) {
                            salarioNovo = 5000;
                        }
                        aumentoTotal += salarioNovo - salarioAnterior;

                        IO.println("Funcionário " + (i + 1));
                        IO.println("Antes: R$ " + salarioAnterior);
                        IO.println("Depois: R$ " + salarioNovo);
                        IO.println("=================================");
                    }

                    IO.println("AUMENTO TOTAL: R$ " + aumentoTotal);
                    IO.println("===================================");
                    IO.println("         FIM DO RELATÓRIO          ");
                    IO.println("===================================");
    }
}
