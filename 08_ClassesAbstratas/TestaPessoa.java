
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        Agenda a = new Agenda(read.nextInt());

        a.addInformacoes();

        a.imprimeAniversarios();
        a.imprimeEmail();
    }
}
