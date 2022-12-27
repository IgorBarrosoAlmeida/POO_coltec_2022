public class Amigo extends Pessoa {
    // Atributos
    private String dataAniversario;

    // Getters
    public String getDataAniversario() {
        return dataAniversario;
    }

    // Setters
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    // Construtores
    Amigo() {
        this.dataAniversario = "Indefinido";
    }
}
