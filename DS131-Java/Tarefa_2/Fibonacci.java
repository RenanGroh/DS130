import java.util.Scanner;
/**
 *
 * Escreva um programa que tenha como entrada do usuário, através do 
 * teclado, um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1, 2, 3, 5, 
 * 8, 13, 21, ...) até que o número da série seja maior que o número fornecido pelo 
 * usuário.
 * 
 * Exercico 5 Tarefa 2
 * Aluno: Renan Groh - GRR20250818
 *
 */
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
