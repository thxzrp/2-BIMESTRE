package br.thomas.auladiegorepitiliano.funcoes;

public class _01_quatidade_digitos {

    public static void main(String[] args) {

        IO.println("=================================");
        IO.println("        CONTADOR DE DIGITOS      ");
        IO.println("=================================");
            IO.readln("\npressione ENTER para continuar....");

                int[] numeros = new int[5];

                    IO.println("\n=======CADASTRO DEL EL NUMEROS=========");

                    for (int i = 0; i < numeros.length; i++) {
                        numeros[i] = Integer.parseInt(
                                IO.readln("Número " + (i + 1) + ": ")
                        );
                    }

                        IO.println("================================");
                        IO.println("    RELATÓRIO DE DIGITOS        ");
                        IO.println("=================================");

                            exibirDigitos(numeros);

                                IO.println("===============================");
                                IO.println("        FIM DO RELATORIO       ");
                                IO.println("===============================");
    }


        static int contarDigitos (int numero) {
            if (numero == 0) {
                return  1;
            }
                int contagem = 0;
                while (numero > 0){
                    numero /= 10;
                    contagem++;
                }

                return contagem;
        }
        static void exibirDigitos(int[] numeros){
         for (int numero : numeros) {
             int qtd = contarDigitos (numero);
             IO.println(numero + " tem " + qtd + " digitos");
         }
    }
}
