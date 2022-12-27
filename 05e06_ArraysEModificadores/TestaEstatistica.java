
public class TestaEstatistica {
    public static void main(String[] args) {
        Estatistica e = new Estatistica();
        int[] vet = { 1, 1, 3, 1, 2, 2, 1, 2, 2, 3 };

        e.setArray(vet);
        System.out.println("Mediana: " + e.mediana());
        System.out.println("Media: " + e.media());
        System.out.println("Moda: " + e.moda());
    }
}
