/* @File Exercicio6.java
 * @Author Igor Barroso Almeida
 * @Brief 6- Imprima os primeiros números da série de Fibonacci até passar de 100.
 * @Date 01/10/2022
*/

public class Exercicio06 {

    public static void main(String[] args) {
        int fibonacci = 0;
        int aux = 1;
        int ant = 0;

        while (true) {
            System.out.print(fibonacci + ", ");

            // Para a impressão se passar de 100
            if (fibonacci > 100) {
                System.out.println();
                break;
            }

            // Atualiza as variaveis
            fibonacci = aux + ant;
            aux = ant;
            ant = fibonacci;
        }
    }
}
