/* @File Exercicio8.java
 * @Author Igor Barroso Almeida
 * @Brief 8- Imprima a seguinte tabela, usando fors encadeados:
 * 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 * n n*2 n*3 .... n*n
 * @Date 01/10/2022
*/

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        // Inicializa um Objeto para ler variaveis
        Scanner read = new Scanner(System.in);

        System.out.println("inform n: ");
        int n = read.nextInt();

        // Imprime a tabela
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + " ");
            }

            System.out.println();
        }
    }
}
