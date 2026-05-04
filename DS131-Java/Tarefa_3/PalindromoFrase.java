import java.util.Scanner;

public class PalindromoFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String normalizada = frase.toLowerCase().replaceAll("[^a-z0-9]", "");
        String invertida = new StringBuilder(normalizada).reverse().toString();

        if (normalizada.equals(invertida)) {
            System.out.println("A frase e um palindromo.");
        } else {
            System.out.println("A frase nao e um palindromo.");
        }

        sc.close();
    }
}
