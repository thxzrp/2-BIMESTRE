package br.thomas.auladiegorepitiliano.funcoes;

public class _04_calculadora_IMC {
    public static void main(String[] args) {

        IO.println("============================================");
        IO.println("          CALCULADORA DE IMC                  ");
        IO.println("============================================");

             IO.readln("\nPressione ENTER para continuar...");

             double[] pesos = new double[4];
             double[] alturas =  new double[4];

                IO.println("\n======CADASTRO DAS PESSOAS=======");

                    for (int i =0; i < pesos.length; i++) {
                        pesos[i] = Double.parseDouble(
                            IO.readln("Insira seu peso " + (i + 1) + "(kg): "));
                                alturas[i] = Double.parseDouble(
                                        IO.readln("Insira sua altura " + (i + 1) + "(m): " ));
                    }

                    IO.println("===========================================");
                    IO.println("           RELATÓRIO DE IMC                 ");
                    IO.println("===========================================");

                        exibirRelatorio(pesos, alturas);

                            IO.println("===========================================");
                            IO.println("            FIM DO RELATÓRIO                ");
                            IO.println("===========================================");
                }
                static double calcularImc(double peso, double altura) {
                    return peso / (altura * altura);
                }

                static String classificarImc(double imc){
                    if (imc < 18.5) {
                        return "Uai sô";
                    } else if (imc < 25) {
                        return "Huuummmm";
                    } else if (imc < 30) {
                        return "ta gordin ein";
                    } else {
                        return "Vai devagar no pastel jubarti";
                    }
                }
                static void exibirRelatorio(double[] pesos, double[] alturas) {
                    for (int i = 0; i < pesos.length; i++) {
                        double imc = calcularImc(pesos[i], alturas[i]);
                            String classificacao = classificarImc(imc);
                                IO.println ("Pessoa " + (i + 1) + ": IMC " + String.format("%.2f", imc) + " - " + classificacao);
                    }
                }

}
