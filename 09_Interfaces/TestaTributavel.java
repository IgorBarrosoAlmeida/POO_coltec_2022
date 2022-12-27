public class TestaTributavel {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
        ContaCorrente cc = new ContaCorrente();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        cc.setUser("Igor");
        cc.deposita(5000);

        g.addTributos(cc);
        g.addTributos(seguroDeVida);

        System.out.printf("O saldo é: %.2f\n", cc.getSaldo());
        System.out.printf("O tributo total é: %.2f\n", g.getTotalTributos());
    }
}
