import java.util.Scanner;

public class Determinante3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][3];

        System.out.println("Informe os 9 elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        double determinante =
                matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                        - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                        + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

        System.out.printf("Determinante = %.2f%n", determinante);
        sc.close();
    }
}
