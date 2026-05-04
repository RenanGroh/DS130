import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int n = sc.nextInt();

        long a = 0;
        long b = 1;
        boolean primeiro = true;

        while (a <= n) {
            if (!primeiro) System.out.print(", ");
            System.out.print(a);
            primeiro = false;
            long proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println();
        sc.close();
    }
}
