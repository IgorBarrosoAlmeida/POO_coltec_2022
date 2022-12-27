/* @File ContaCorrente.java
 * @Author Igor Barroso Almeida
 * @Brief Classe filha de Conta, criada
 * para representar uma conta corrente
 * @Date 10/11/2022
*/

public class ContaCorrente extends Conta implements Itributavel {

    // Metodos
    @Override
    public void atualiza(double taxa) {

        this.saldo += this.saldo * (2 * taxa);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
        this.saldo -= 0.10;
    }

    // Modificação --> método herdado de "Tributavel"
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
}