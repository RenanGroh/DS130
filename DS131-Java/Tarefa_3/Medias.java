import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;
        int quantidade = 0;

        while (true) {
            System.out.print("Informe um valor inteiro ou real, ou S para encerrar: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equalsIgnoreCase("S")) {
                break;
            }

            try {
                double valor = Double.parseDouble(entrada.replace(',', '.'));
                soma += valor;
                quantidade++;
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Informe novamente o valor.");
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("Media = %.2f%n", media);
        } else {
            System.out.println("Nenhum valor valido foi informado.");
        }

        sc.close();
    }
}
