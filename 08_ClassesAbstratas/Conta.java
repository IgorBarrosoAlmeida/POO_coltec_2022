
public abstract class Conta {
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

    public abstract void atualiza(double taxa);
}