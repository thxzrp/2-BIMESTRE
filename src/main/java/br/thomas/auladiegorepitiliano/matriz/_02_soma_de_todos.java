package br.thomas.auladiegorepitiliano.matriz;

public class _02_soma_de_todos {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("      SOMA DE TODOS OS NÚMEROS         ");
        IO.println("=======================================");

            IO.readln("\nORA ORA ESTAMOS AQUI DE NOVO");
                    int[][] theLastOfUs = new int[3][3];

                IO.println("\n======CADASTRO DE MATRIZ==========");
                    for (int ghostOfTsushima = 0; ghostOfTsushima < theLastOfUs.length; ghostOfTsushima++) {
                        for (int deathStranding = 0; deathStranding < theLastOfUs[ghostOfTsushima].length; deathStranding++) {
                            theLastOfUs[ghostOfTsushima][deathStranding] = Integer.parseInt(
                                    IO.readln("Elemento [" + ghostOfTsushima + "][" + deathStranding + "]: ")
                            );
                        }
                    }
                    int platinumTrophy = 0;

                        for (int ghostOfTsushima = 0; ghostOfTsushima < theLastOfUs.length; ghostOfTsushima++) {
                            for (int deathStranding = 0; deathStranding < theLastOfUs[ghostOfTsushima].length; deathStranding++) {
                                platinumTrophy += theLastOfUs[ghostOfTsushima][deathStranding];
                            }
                        }
                        IO.println("=======================================");
                        IO.println("     RELATÓRIO FINAL                   ");
                        IO.println("=======================================");

                            IO.println("Soma: " + platinumTrophy);

                                IO.println("=======================================");
                                IO.println("     FIM DO RELATÓRIO                  ");
                                IO.println("=======================================");

    }
}
