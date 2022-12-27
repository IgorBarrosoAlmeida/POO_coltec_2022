/* @File Prog.java
 * @Author Igor Barroso Almeida
 * @Brief main utilizada para testar ---------------------------------> mudar
 * as classes de conta e "Banco.java"
 * @Date 10/11/2022 
*/
public class TestaConta {
    public static void main(String[] args) {

        // Antes "Conta c = new Conta();" --> erro "Conta" é abstrata
        Conta c = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        c.setUser("Igor Barroso");
        cc.setUser("Leandro Rodrigues");
        cp.setUser("Júlia Luna");
    }
}
