/* 1. Vamos testar tudo o que vimos até agora com o seguinte programa:
* ▶ Classe: Casa Atributos: cor, totalDePortas, portas[] Métodos: void pinta(String s), int
* quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas() 
*/

public class Casa {
    // Atributos
    private String cor;
    private int totalPortas;
    private Porta[] portas = new Porta[1];

    // Métodos
    public int qntPortasAbertas() {
        int qntPortasAbertas = 0;

        for (Porta x : this.portas) {
            if (x.isAberto()) {
                qntPortasAbertas++;
            }
        }

        return qntPortasAbertas;
    }

    public void addPorta(Porta p) {
        if (this.totalPortas >= this.portas.length) {
            Porta[] aux = new Porta[this.totalPortas + 1];

            // Copia as portas já existentes para aux
            for (int i = 0; i < this.portas.length; i++) {
                aux[i] = this.portas[i];
            }

            // portas é atualizado
            this.portas = aux;
        }

        this.portas[this.totalPortas] = new Porta();
        this.portas[this.totalPortas] = p;

        this.totalPortas++;
    }

    // Getters
    public String getCor() {
        return cor;
    }

    public int getTotalPortas() {
        return totalPortas;
    }

    public Porta[] getPortas() {
        return portas;
    }

    // Setters
    public void pinta(String cor) {
        this.cor = cor;
    }

    public void setTotalPortas(int totalPortas) {
        this.totalPortas = totalPortas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }
}
