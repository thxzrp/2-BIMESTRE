package br.thomas.auladiegorepitiliano.matriz;

public class _05_diagonal_principal {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("            DIAGONAL PRINCIPAL         ");
        IO.println("=======================================");

            IO.readln("\nOLE OLE OLE OLE OLA LULA LULAAAAAA");

                int[][] arroz = new int[3][3];

                    IO.println("\n=========CADASTRO MATRIZES==========");

                        for(int feijao = 0; feijao < arroz.length; feijao++){
                            for (int macarrao = 0; macarrao < arroz[0].length; macarrao++){
                                arroz[feijao][macarrao] = Integer.parseInt(
                                        IO.readln("Elemento [" + feijao + "][" + macarrao + "]: "));
                            }
                        }
                        IO.println("===========================================");
                        IO.println("              RELATÓRIO FINAL               ");
                        IO.println("===========================================");

                            IO.print("Diagonal principal: ");

                                for (int acucar = 0; acucar < arroz.length; acucar++){
                                    IO.print(arroz[acucar][acucar] + " ");
                                }
                                IO.println("");

                                    IO.println("==============================");
                                    IO.println("    FIM DO RELATORIO          ");
                                    IO.println("==============================");

    }
}
