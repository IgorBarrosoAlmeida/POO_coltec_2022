/* @File Exercicio9.java
 * @Author Igor Barroso Almeida
 * @Brief 9 - Desafio: Faça o exercício da série de Fibonacci usando apenas duas variáveis.
 * @Date 01/10/2022
*/

public class Exercicio9 {

    public static void main(String[] args) {
        int ant = 0;
        int aux = 0;

        while (true) {
            System.out.print((ant + aux) + ", ");

            if ((ant + aux) >= 100) {
                break;
            }

            // Calcula o proximo componente da série
            if (aux == 0) {
                aux++;
            } else {
                ant = ant + aux;
                aux = ant - aux;
            }
        }
    }
}
