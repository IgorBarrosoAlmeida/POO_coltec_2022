/* @File Exercicio07.java
 * @Author Igor Barroso Almeida
 * @Brief 7- Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
 * novo x de acordo com a seguinte regra:
 * se x é par, x = x / 2
 * se x é impar, x = 3 * x + 1
 * imprime x
 * @Date 01/10/2022
*/

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        // Inicializa um Objeto para ler variaveis
        Scanner read = new Scanner(System.in);

        System.out.println("inform x: ");
        int x = read.nextInt();

        while (x != 1) {
            if (x % 2 == 0) { // par
                x = x / 2;
            } else { // impar
                x = 3 * x + 1;
            }

            System.out.print(x + " -> ");
        }

        System.out.println();
    }
}
