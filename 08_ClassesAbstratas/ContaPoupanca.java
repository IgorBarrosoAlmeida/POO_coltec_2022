
public class ContaPoupanca extends Conta {

    // Metodos
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (3 * taxa);
    }
}