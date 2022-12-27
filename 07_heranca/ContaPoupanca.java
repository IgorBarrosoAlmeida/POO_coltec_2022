/* @File ContaPoupanca.java
 * @Author Igor Barroso Almeida
 * @Brief Classe filha de Conta, criada
 * para representar uma conta poupança
 * @Date 10/11/2022
*/

public class ContaPoupanca extends Conta {

    // Metodos
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (3 * taxa);
    }

}