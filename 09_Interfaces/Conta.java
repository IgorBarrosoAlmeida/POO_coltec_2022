/* @File Conta.java
 * @Author Igor Barroso Almeida
 * @Brief Classe mãe, que representa a
 * conta de um banco
 * @Date 10/11/2022
*/

public class Conta {
    // Atributos
    protected String User;
    protected double saldo;

    // Getters
    public String getUser() {
        return User;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setUser(String user) {
        User = user;
    }

    // Métodos
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(int valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}