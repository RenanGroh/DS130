import java.util.Scanner;

public class SalariosAcimaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeFuncionarios = lerQuantidadeFuncionarios(sc);
        String[] nomes = new String[quantidadeFuncionarios];
        double[] salarios = new double[quantidadeFuncionarios];

        double soma = 0.0;

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            nomes[i] = lerNome(sc, i + 1);
            salarios[i] = lerSalario(sc, nomes[i]);
            soma += salarios[i];
        }

        double media = soma / quantidadeFuncionarios;
        System.out.printf("Média salarial: %.2f%n", media);
        System.out.println("Funcionários com salário acima da média:");

        boolean encontrou = false;
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (salarios[i] > media) {
                System.out.printf("%s - R$%.2f%n", nomes[i], salarios[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum funcionário ficou acima da média.");
        }

        sc.close();
    }

    private static int lerQuantidadeFuncionarios(Scanner sc) {
        while (true) {
            System.out.print("Informe quantos funcionários existem na empresa: ");
            String entrada = sc.nextLine().trim();

            try {
                int quantidade = Integer.parseInt(entrada);
                if (quantidade > 0) {
                    return quantidade;
                }
            } catch (NumberFormatException e) {
                // tratado abaixo
            }

            System.out.println("Quantidade inválida. Informe novamente.");
        }
    }

    private static String lerNome(Scanner sc, int posicao) {
        while (true) {
            System.out.print("Informe o nome do funcionário " + posicao + ": ");
            String nome = sc.nextLine().trim();

            if (nome.length() >= 3) {
                return nome;
            }

            System.out.println("Nome inválido. O nome deve conter ao menos 3 caracteres.");
        }
    }

    private static double lerSalario(Scanner sc, String nome) {
        while (true) {
            System.out.print("Informe o salário de " + nome + ": ");
            String entrada = sc.nextLine().trim().replace(',', '.');

            try {
                double salario = Double.parseDouble(entrada);
                if (salario >= 0) {
                    return salario;
                }
            } catch (NumberFormatException e) {
                // tratado abaixo
            }

            System.out.println("Salário inválido. Informe novamente.");
        }
    }
}