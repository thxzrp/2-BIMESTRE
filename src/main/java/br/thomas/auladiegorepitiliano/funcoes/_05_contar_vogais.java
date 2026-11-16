package br.thomas.auladiegorepitiliano.funcoes;

public class _05_contar_vogais {
    public static void main(String[] args) {

        IO.println("=====================================");
        IO.println("         CONTADOR DE VOGAIS          ");
        IO.println("=====================================");

            IO.readln("\npressione enter para começar...");

                    String[] frases = new String[3];

            IO.println("\n===CADASTRO DE FRASES====");

                for (int i = 0; i < frases.length; i++) {
                    frases[i] = IO.readln("Frase " + (i + 1) + ": ");
                }

                IO.println("=====================================");
                IO.println("    RELATÓRIO - CONTAGEM DE COGAIS   ");
                IO.println("=====================================");

                    exibirContagem(frases);

                        IO.println("=====================================");
                        IO.println("           FIM DO RELATÓRIO          ");
                        IO.println("=====================================");
    }

                            static int contarVogais(String texto) {
                                int contagem = 0;
                                    String textoMinusculo = texto.toLowerCase();
                                        for (int i = 0; i < textoMinusculo.length(); i++) {
                                            char letra = textoMinusculo.charAt(i);
                                                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                                                    contagem++;
                                                }
                                        }
                                        return contagem;
                            }
                            static void exibirContagem(String[] frases) {
                                for (String frase : frases) {
                                    int qtd = contarVogais(frase);
                                        IO.println(frase + " -> " + qtd + " vogais");
                                }
                            }
}
