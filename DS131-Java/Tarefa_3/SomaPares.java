import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPares = 0;
        int valoresValidos = 0;

        while (valoresValidos < 20) {
            System.out.print("Digite o " + (valoresValidos + 1) + "º elemento numérico: ");
            String entrada = sc.nextLine().trim();

            try {
                int numero = Integer.parseInt(entrada);

                if (numero % 2 == 0) {
                    somaPares += numero;
                }

                valoresValidos++;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        }

        System.out.println("Soma dos números pares = " + somaPares);
        sc.close();
    }
}
