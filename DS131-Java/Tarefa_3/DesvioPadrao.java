import java.util.Scanner;

public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lerQuantidadeAmostras(sc);
        double[] amostras = new double[n];

        for (int i = 0; i < n; i++) {
            amostras[i] = lerAmostra(sc, i + 1);
        }

        double media = calcularMedia(amostras);
        double desvioPadrao = calcularDesvioPadraoAmostral(amostras, media);

        System.out.printf("Media = %.4f%n", media);
        System.out.printf("Desvio padrao amostral = %.4f%n", desvioPadrao);

        sc.close();
    }

    private static int lerQuantidadeAmostras(Scanner sc) {
        while (true) {
            System.out.print("Informe o numero de amostras (n > 1): ");
            String entrada = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n > 1) {
                    return n;
                }
            } catch (NumberFormatException e) {
                // Tratado pela mensagem abaixo.
            }
            System.out.println("Quantidade inválida. Informe um inteiro maior que 1.");
        }
    }

    private static double lerAmostra(Scanner sc, int indice) {
        while (true) {
            System.out.print("Digite a amostra " + indice + ": ");
            String entrada = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Informe novamente.");
            }
        }
    }

    private static double calcularMedia(double[] valores) {
        double soma = 0.0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.length;
    }

    private static double calcularDesvioPadraoAmostral(double[] valores, double media) {
        double somaQuadrados = 0.0;
        for (double v : valores) {
            double diferenca = v - media;
            somaQuadrados += diferenca * diferenca;
        }
        return Math.sqrt(somaQuadrados / (valores.length - 1));
    }
}
