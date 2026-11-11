package br.thomas.auladiegorepitiliano.vetores;

public class Exercício_1_Vendas_da_semana {
    public static void main(String[] args) {


            IO.println("==========================");
            IO.println("    SISTEMA DE VENDAS     ");
            IO.println("       BEM-VINDO!         ");
            IO.println("==========================");
            IO.readln("\npressione ENTER para continuar...");

        double[] vendas = new double[7];
        double soma = 0;

            IO.println("\n==== DIGITE SEU PEDIDO ====");

        for (int i = 0; i < vendas.length; i++) {

            vendas[i] = Double.parseDouble(
                    IO.readln("Venda do dia " + (i + 1) + ": ")
            );
            soma += vendas[i];
        }
                double media = soma / vendas.length;

                    double maior = vendas[0];
                    int diamaior = 0;

                        for (int i = 0; i < vendas.length; i++) {
                            if (vendas[i] > maior) {
                                maior = vendas[i];
                                diamaior = i;
                            }
                        }
                IO.println("\n==========================================");
                IO.println("                 CUPOM VENDAS               ");
                IO.println("              SEM VALOR FISCAL              ");
                IO.println("============================================");

                    for (int i = 0; i < vendas.length; i++) {
                        IO.println("Dia " + (i + 1) + ": R$ " + vendas[i]);

                    }

                IO.println("=================================================");
                IO.println("           TOTAL: R$ " + soma);
                IO.println("           MÉDIA DIÁRIA: R$ " + media);
                IO.println("           MAIOR VENDA: R$ " + maior);
                IO.println("           DIA DA MAIOR VENDA: " + (diamaior + 1));
                IO.println("==================================================");
                IO.println("           OBRIGADO PELA PREFERÊNCIA!             ");
                IO.println("==================================================");
    }
}