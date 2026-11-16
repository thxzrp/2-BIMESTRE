package br.thomas.auladiegorepitiliano.funcoes;

public class _02_numero_AO_contrario {

    public static void main(String[] args) {

        IO.println("===============================");
        IO.println("     NUMERO AO CONTRARIO       ");
        IO.println("===============================");

            IO.readln("\nclica enter ai p nois continuar");

                    int[] oklahoma = new int[5];

                            IO.println("\n====CADASTRO DOS NUMEROS====");

                        for (int i = 0; i < oklahoma.length; i++) {
                            oklahoma[i] = Integer.parseInt(
                                    IO.readln("Numero " + (i + 1) + ": "));
                        }

                                IO.println("=====================================");
                                IO.println("    RELATÓRIO - NUMEROS INVERTIDOS   ");
                                IO.println("=====================================");

                                    exibirInvertidos(oklahoma);

                                    IO.println("=====================================");
                                    IO.println("           FIM DO RELATÓRIO          ");
                                    IO.println("=====================================");
    }
                                        static int inverterNumero (int spike) {
                                            int inverso = 0;
                                                while (spike > 0) {
                                                    int digito = spike % 10;
                                                        inverso = inverso * 10 + digito;
                                                            spike /= 10;
                                            }
                                                return inverso;
                                        }

                                        static void exibirInvertidos(int[] oklahoma) {
                                            for (int spike : oklahoma) {
                                                int inverso = inverterNumero(spike);
                                                IO.println(spike + " ao contrario: " + inverso);
                                            }
                                        }
}
