import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de linhas: ");
        int n = scan.nextInt();

        int i, j;
        int[][] triangulo = new int[n][n];

        triangulo[0][0] = 1;
        triangulo[1][0] = 1;
        triangulo[1][1] = 1;

        // Preenche o triangulo
        for (i = 2; i < n; i++) {
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for (j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j] + triangulo[i - 1][j - 1];
            }
        }

        int nEspacos = 0;
        for (i = 0; i < n; i++) {
            nEspacos = n - i;

            for (j = 0; j < nEspacos; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }

            System.out.println("");
        }
    }
}
