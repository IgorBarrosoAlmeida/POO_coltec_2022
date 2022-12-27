/* 1. Vamos testar tudo o que vimos até agora com o seguinte programa:
* ▶ Classe: Casa Atributos: cor, totalDePortas, portas[] Métodos: void pinta(String s), int
* quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas() 
*/

public class Porta {
    // Atributos
    private String cor;
    private String material;
    private boolean aberto;

    // Getters
    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAberto() {
        return aberto;
    }

    // Setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
