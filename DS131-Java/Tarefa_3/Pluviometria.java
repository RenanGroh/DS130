import java.util.Scanner;

public class Pluviometria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] indice = new double[7];
        String[] dias = {"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado", "domingo"};

        double soma = 0.0;

        for (int i = 0; i < indice.length; i++) {
            while (true) {
                System.out.print("Informe o índice pluviométrico de " + dias[i] + ": ");
                String entrada = sc.nextLine().trim().replace(',', '.');

                try {
                    indice[i] = Double.parseDouble(entrada);
                    soma += indice[i];
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Informe novamente.");
                }
            }
        }

        double media = soma / indice.length;
        double max = indice[0];
        double min = indice[0];
        int diaMax = 0;
        int diaMin = 0;

        for (int i = 1; i < indice.length; i++) {
            if (indice[i] > max) {
                max = indice[i];
                diaMax = i;
            }

            if (indice[i] < min) {
                min = indice[i];
                diaMin = i;
            }
        }

        System.out.printf("Índice pluviométrico médio: %.2f%n", media);
        System.out.printf("Maior índice: %.2f em %s%n", max, dias[diaMax]);
        System.out.printf("Menor índice: %.2f em %s%n", min, dias[diaMin]);

        sc.close();
    }
}