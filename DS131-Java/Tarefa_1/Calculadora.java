
/**
 *
 * Exercico 2 Tarefa 1
 * Aluno: Renan Groh - GRR20250818
 *
 */
public class Calculadora {
    public static void main(String[] args) {
        // Verifica se foram passados exatamente 3 argumentos na linha de comando
        if (args.length != 3) {
            System.out.println("Uso: java Exercicio_2_Tarefa_1 <numero1> <numero2> <operacao>");
            System.out.println("Operacoes suportadas: +, -, *, /");
            return;
        }

        try {
            // Converte os dois primeiros argumentos para números reais (double)
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String operacao = args[2];

            // Executa a operação correspondente
            switch (operacao) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "x":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Erro: Divisao por zero!");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
                default:
                    System.out.println("Erro: Operacao invalida! Use +, -, x ou /.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os dois primeiros argumentos devem ser numeros validos.");
        }
    }
}
