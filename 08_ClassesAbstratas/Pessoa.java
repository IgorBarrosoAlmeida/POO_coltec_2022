public abstract class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Construtores
    Pessoa() {
        this.nome = "Indefinido";
        this.idade = 0;
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
