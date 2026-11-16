package br.thomas.auladiegorepitiliano.funcoes;

public class _03_numeros_primos {
    public static void main(String[] args) {

        IO.println("=====================================");
        IO.println("           NUMEROS PRIMOS            ");
        IO.println("=====================================");

                IO.readln("\npor obsequio poderio posicionar o dedo sobre a tecla enter e suavemente pressionar enter para iniciar?");

                        int[] korn = new int[8];

                    IO.println("\n=======CADASTRO DE NUMMEROS=========");

                        for (int i = 0; i < korn.length; i++) {
                            korn[i] = Integer.parseInt(
                                    IO.readln("Numero " + (i + 1) + ": "));
                        }

                            IO.println("=====================================");
                            IO.println("       RELATORIO - NUMEROS PRIMOS    ");
                            IO.println("=====================================");

                                exibirPrimos(korn);

                                IO.println("=====================================");
                                IO.println("           FIM DO RELATÓRIO          ");
                                IO.println("=====================================");
    }
                                    static boolean ehPrimo(int slipknot){
                                            if (slipknot <=1){
                                                return false;
                                            }
                                            for (int i = 2; i < slipknot; i++) {
                                                if (slipknot % i == 0) {
                                                    return false;
                                        }
                                     }
                                     return true;
                                }

                                static void exibirPrimos(int[] korn) {
                                    IO.print("Primos: ");
                                    for (int numero : korn) {
                                        if (ehPrimo(numero)) {
                                            IO.print(numero + " ");
                                        }
                                    }
                                    IO.println ("");
                                }
}