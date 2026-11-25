package br.thomas.auladiegorepitiliano.matriz;

public class _03_maior_valor {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("     MIOR VALOR                        ");
        IO.println("=======================================");

            IO.readln("\nESSA PORRA N ACABAAAAAAAAAAAAAAAAA");

                int[][] spiderMan = new int[3][3];

                    IO.println("\n CADASTRO DE MATRIZ");

                        for (int ratchetAndClank = 0; ratchetAndClank < spiderMan.length; ratchetAndClank++){
                            for (int horizonForbiddenWeste = 0; horizonForbiddenWeste < spiderMan[ratchetAndClank].length; horizonForbiddenWeste++){
                                spiderMan[ratchetAndClank][horizonForbiddenWeste] = Integer.parseInt(
                                        IO.readln("Elemento [" + ratchetAndClank + "][" + horizonForbiddenWeste + "]: ")
                                );
                            }
                        }
                        int bloodborneMaior = spiderMan[0][0];
                            for (int ratchetAndClank = 0; ratchetAndClank < spiderMan.length; ratchetAndClank++){
                                for (int horizonForbiddenWeste = 0; horizonForbiddenWeste < spiderMan[ratchetAndClank].length; horizonForbiddenWeste++){
                                    if (spiderMan[ratchetAndClank][horizonForbiddenWeste] > bloodborneMaior) {
                                        bloodborneMaior = spiderMan[ratchetAndClank][horizonForbiddenWeste];
                                    }
                                }
                            }
                            IO.println("=======================================");
                            IO.println("        RELATÓRIO FINAL                ");
                            IO.println("=======================================");

                                IO.println("Maior valor: " + bloodborneMaior);

                                    IO.println("=======================================");
                                    IO.println("          FIM DO RELATÓRIO             ");
                                    IO.println("=======================================");
    }
}
