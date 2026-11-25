package br.thomas.auladiegorepitiliano.matriz;

public class _04_contar_pares {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("       CONTAR PARES                    ");
        IO.println("=======================================");

            IO.readln("\naperta qualquer tecla ai");

                int[][] um = new int[2][3];

                    IO.println("\nCADASTRAR A PORRA DA MATRIZ DE NOVO");

                        for (int dois = 0; dois < um.length; dois++) {
                            for (int tres = 0; tres < um[dois].length; tres++) {
                                um[dois][tres] = Integer.parseInt(
                                        IO.readln("Elemento [" + dois + "][" + tres + "]: "));
                            }
                        }

                            int quatro = 0;

                                for (int dois =0; dois < um.length; dois++) {
                                    for (int tres = 0; tres < um[dois].length; tres++) {
                                        if (um[dois][tres] % 2 == 0) {
                                            quatro++;
                                        }
                                    }
                                }
                                IO.println("=======================================");
                                IO.println("RELATORIO FINAL                        ");
                                IO.println("=======================================");

                                    IO.println("Quatidade de pares: " + quatro);

                                        IO.println("======================================");
                                        IO.println("       FINAL DO RELATÓRIO             ");
                                        IO.println("======================================");


    }
}
