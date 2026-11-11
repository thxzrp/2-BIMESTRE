package br.thomas.auladiegorepitiliano.vetores;

public class Exercicio_3_consulta_preco {
    public static void main(String[] args) {

        IO.println("====================================");
        IO.println("     SISTEMA DE CONSULTA PRECO      ");
        IO.println("            BEM VINDO!              ");
        IO.println("====================================");

         IO.readln("\npressione ENTER para começar");

                int[] codigos = {101, 102, 103, 104, 105};
                double[] precos = {10.50, 25.00, 15.90, 8.50, 42.00};

                    IO.println("\n===== CONSULTA DE PREÇOS ======");

                        int codigoBuscado = Integer.parseInt(IO.readln("Digite o codigo do produto: ")
                        );

                        boolean encontrado = false;

                            IO.println("\n=====================================");
                            IO.println("          RESULTADO DA CONSULTA        ");
                            IO.println("=======================================");

                                for (int i = 0; i < codigos.length; i++) {
                                    if (codigos[i] == codigoBuscado) {
                                        IO.println("Código: " + codigos[i]);
                                        IO.println("Preço: " + precos[i]);
                                            encontrado = true;
                                            break;
                                    }
                                }
                                if (!encontrado) {
                                    IO.println("Produto não cadastrado");
                                }
                                IO.println("=====================================");
                                IO.println("           FIM DA CONSULTA           ");
                                IO.println("=====================================");
    }
}
