package br.thomas.auladiegorepitiliano.vetores;

public class Exercicio_2_estoque_critico {
    public static void main(String[] args) {

        IO.println("============================================");
        IO.println("            SISTEMA DE ESTOQUE              ");
        IO.println("                BEM-VINDO!                  ");
        IO.println("============================================");

            IO.readln("\npressione ENTER para continuar....");


            int[] estoque = new int[10];
                IO.println("\n=====CADASTRO DE ESTOQUE=====");

                    for (int i = 0; i < estoque.length; i++) {
                        estoque[i] = Integer.parseInt(
                                IO.readln("Quantidade do produto " + (i + 1) + ": ")
                        );
                    }

                        int criticos = 0;

                            IO.println("===========================================");
                            IO.println("         RELATÓRIO DE ESTOQUE              ");
                            IO.println("           ESTOQUE CRÍTICO                 ");
                            IO.println("===========================================");

                                    for (int i = 0; i < estoque.length; i++) {
                                        if (estoque[i] < 5){
                                            criticos++;
                                                IO.println("Produto " + (i + 1) + " | Estoque " + estoque[i] + " unidades");
                                        }

                                    }
                                        IO.println("=========================================");
                                        IO.println("TOTAL DE PRODUTOS CRÍTICOS: " + criticos  );
                                        IO.println("=========================================");
                                        IO.println("         FIM DO RELATÓRIO                ");
                                        IO.println("=========================================");
    }
}