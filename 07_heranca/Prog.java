/* @File Prog.java
 * @Author Igor Barroso Almeida
 * @Brief main utilizada para testar
 * as classes de conta e "Banco.java"
 * @Date 10/11/2022
*/
public class Prog {
    public static void main(String[] args) {
        // Exercicio 04
        Conta c = new Conta();
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

        // Exercicio 06
        Banco B = new Banco();
        AtualizadorDeContas att = new AtualizadorDeContas(13.75);

        c.setUser("Igor Barroso");
        cc.setUser("Leandro Rodrigues");
        cp.setUser("Júlia Luna");

        B.add(c);
        B.add(cc);
        B.add(cp);

        for (int i = 0; i < B.pegaTotalDeContas(); i++) {
            Conta aux = B.pegaConta(i);

            att.roda(aux);
        }
    }
}
