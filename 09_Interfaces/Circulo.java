public class Circulo implements AreaCalculavel {
    // Atributos
    private double raio;

    // Getters
    public double getRaio() {
        return raio;
    }

    // Setters
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Construtor
    Circulo(double raio) {
        this.raio = raio;
    }

    // Métodos
    public double calculaArea() {
        return raio * raio * 3.14;
    }
}
