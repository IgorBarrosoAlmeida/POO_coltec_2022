public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;

    // Getters
    public double getTotalTributos() {
        return totalTributos;
    }

    public void addTributos(Itributavel t) {
        totalTributos += t.calculaTributos();
    }
}
