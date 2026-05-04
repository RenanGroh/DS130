import java.util.Scanner;

public class SomaDiagonais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lerDimensao(sc);
        double[][] matriz = new double[n][n];

        preencherMatriz(matriz, sc);
        double soma = calcularSomaDiagonais(matriz);

        System.out.printf("Soma das diagonais = %.2f%n", soma);
        sc.close();
    }

    private static int lerDimensao(Scanner sc) {
        while (true) {
            System.out.print("Informe a dimensão da matriz quadrada: ");
            String entrada = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(entrada);
                if (n > 0) {
                    return n;
                }
            } catch (NumberFormatException e) {
                // Tratado pela mensagem abaixo.
            }
            System.out.println("Dimensão inválida. Informe um inteiro positivo.");
        }
    }

    public static void preencherMatriz(double[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                while (true) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    String entrada = sc.nextLine().trim().replace(',', '.');
                    try {
                        matriz[i][j] = Double.parseDouble(entrada);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Informe novamente.");
                    }
                }
            }
        }
    }

    public static double calcularSomaDiagonais(double[][] matriz) {
        double soma = 0.0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            soma += matriz[i][i];
            soma += matriz[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            soma -= matriz[n / 2][n / 2];
        }

        return soma;
    }
}
