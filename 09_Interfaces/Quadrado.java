public class Quadrado implements AreaCalculavel {
    // Atributos
    private double lado;

    // Getters
    public double getLado() {
        return lado;
    }

    // Setters
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Construtor
    Quadrado(double lado) {
        this.lado = lado;
    }

    // Métodos
    public double calculaArea() {
        return lado * lado;
    }

}
