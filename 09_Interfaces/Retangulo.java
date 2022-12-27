public class Retangulo implements AreaCalculavel {
    // Atributos
    private double altura;
    private double largura;

    // Construtor
    Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Getters
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    // Setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    // Métodos
    public double calculaArea() {
        return altura * largura;
    }

}
