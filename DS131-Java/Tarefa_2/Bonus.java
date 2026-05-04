import java.util.Scanner;

/**
 *
 * Exercico 5 Tarefa 2
 * Aluno: Renan Groh - GRR20250818
 *
 */
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cargo do funcionário: ");
        String cargo = sc.nextLine().trim();

        System.out.print("Salário atual: ");
        double salario = sc.nextDouble();

        double bonus = 0.0;

        String c = cargo.toLowerCase();

        switch (c) {
            case "diretor":
                System.out.print("Quantidade de departamentos gerenciados: ");
                int departamentos = sc.nextInt();
                bonus = 4 * salario + 3000.0 * departamentos;
                break;
            case "gerente":
                System.out.print("Quantidade de pessoas gerenciadas: ");
                int pessoas = sc.nextInt();
                bonus = 2 * salario + 100.0 * pessoas;
                break;
            case "analista":
                bonus = 1 * salario;
                break;
            case "programador":
                bonus = 0.8 * salario;
                break;
            case "auxiliar de limpeza":
            case "auxiliar":
                bonus = 0.5 * salario;
                break;
            default:
                System.out.println("Cargo não reconhecido. Encerrando.");
                sc.close();
                return;
        }

        System.out.printf("Bônus anual: R$%.2f%n", bonus);
        sc.close();
    }
}
