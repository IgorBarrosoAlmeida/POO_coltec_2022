/* Crie uma casa, pinte-a. Crie três portas e coloque-as na casa através do método
* adicionaPorta, abra e feche-as como desejar. Utilize o método quantasPortasEstaoAbertas
* para imprimir o número de portas abertas e o método totalDePortas para imprimir o total
* de portas em sua casa.
*/

public class TestaCasa {
    public static void main(String[] args) {
        // Cria portas
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();

        // Preenche as informações da porta
        p1.setAberto(false);
        p1.setCor("Vermelho");
        p1.setMaterial("Metal");

        p2.setAberto(true);
        p2.setCor("Marrom");
        p2.setMaterial("Madeira");

        p3.setAberto(true);
        p3.setCor("Verde");
        p3.setMaterial("Madeira");

        // Cria a casa
        Casa casa = new Casa();

        casa.pinta("Branco");
        casa.addPorta(p1);
        casa.addPorta(p2);
        casa.addPorta(p3);

        System.out.println("Quantidade de portas: " + casa.getTotalPortas());
        System.out.println("Portas abertas: " + casa.qntPortasAbertas());
    }
}
