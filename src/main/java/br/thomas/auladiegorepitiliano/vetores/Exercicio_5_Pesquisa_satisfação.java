package br.thomas.auladiegorepitiliano.vetores;

public class Exercicio_5_Pesquisa_satisfação {
    public static void main(String[] args) {

        IO.println("=======================================");
        IO.println("        PESQUISA DE SATISFAÇÃO         ");
        IO.println("              BEM-VINDO!               ");
        IO.println("=======================================");

            IO.println("\navalie nosso atendimento de 0 a 10.");
            IO.readln("\npressione ENTER para começar...");

                int[] notas = new int[10];

                    IO.println("\n===== REGISTRO DE AVALIAÇÕES=====");
                        for (int i = 0; i < notas.length; i++) {
                            notas[i] = Integer.parseInt(IO.readln("Nota do cliente " + (i + 1) +  "(0 a 10): ")
                            );
                        }

                            int[] quantidade = new int[11];
                                for (int i = 0; i < notas.length; i++) {
                                 quantidade[notas[i]]++;
                                }

                                    int maior = quantidade[0];
                                    int notaMaisVotada = 0;

                                        for (int i = 0; i < quantidade.length; i++) {
                                            if (quantidade[i] > maior) {
                                                maior = quantidade[i];
                                                notaMaisVotada = i;
                                            }

                                        }

                                        IO.println("\n=====================================================");
                                        IO.println("                 RELATÓRIO DE SATISFAÇÃO               ");
                                        IO.println("=======================================================");

                                            for (int i = 0; i < quantidade.length; i++) {
                                                IO.println("Nota " + i + ": " + quantidade[i] + " voto");
                                            }

                                                IO.println("====================================================");
                                                IO.println("NOTA MAIS VOTADA: " + notaMaisVotada);
                                                IO.println("QUANTIDADE DE VOTOS: " + maior);
                                                IO.println("====================================================");
                                                IO.println("                        FIM                         ");





    }
}
