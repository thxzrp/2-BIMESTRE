package br.thomas.auladiegorepitiliano.matriz;

public class _01_ler_mostrar {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("        LER E MOSTRAR MATRIz           ");
        IO.println("=======================================");

            IO.readln("\n para começar, diga seu nome e a cidade de onda está falando");

                    int[][] bloodborne = new int[3][3];
                    IO.println("\n======CADASTRO DE MATRIZ=========");

                    for (int godOfWar =0; godOfWar < bloodborne.length; godOfWar++) {
                        for (int horizonZeroDawn = 0; horizonZeroDawn < bloodborne[godOfWar].length; horizonZeroDawn++) {
                            bloodborne[godOfWar][horizonZeroDawn] = Integer.parseInt(
                                    IO.readln("Elemento [" + godOfWar + "][" + horizonZeroDawn + "]: ")
                            );
                        }
                    }

                    IO.println("=======================================");
                    IO.println("          MATRIZ                       ");
                    IO.println("=======================================");

                        for (int godOfWar = 0; godOfWar < bloodborne.length; godOfWar++){
                            for (int horizonZeroDawn = 0; horizonZeroDawn < bloodborne[godOfWar].length; horizonZeroDawn++){
                                IO.print(bloodborne [godOfWar][horizonZeroDawn] + "");
                            }
                            IO.println("");
                        }
                        IO.println("=======================================");
                        IO.println("   FIM DO RELATÓRIO                    ");
                        IO.println("=======================================");


    }
}
