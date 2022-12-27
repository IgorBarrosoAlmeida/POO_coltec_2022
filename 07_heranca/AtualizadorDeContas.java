/* @File AtualizadorDeContas.java
 * @Author Igor Barroso Almeida
 * @Brief Classe utilizada para aplicar a taxa 
 * selic no saldo das contas de um banco
 * @Date 10/11/2022
*/

public class AtualizadorDeContas {
    // Atributos
    private double saldoTotal = 0;
    private double selic; // Dado em porcentagem

    // Getters
    public double getSaldoTotal() {
        return saldoTotal;
    }

    // Construtores
    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    // Métodos
    public void roda(Conta c) {
        System.out.println("USUARIO: " + c.getUser());
        System.out.println("Saldo Atual: " + c.getSaldo());

        // Atualiza saldo
        c.atualiza(selic / 100);

        System.out.println("Saldo final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
    }
}