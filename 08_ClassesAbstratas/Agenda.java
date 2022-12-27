import java.util.Scanner;

public class Agenda {
    // Atributos
    private Pessoa[] pessoas;
    private int nAmigos;
    private int nConhecidos;

    // Getters
    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public int getnAmigos() {
        return nAmigos;
    }

    public int getnConhecidos() {
        return nConhecidos;
    }

    // Setters
    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void setnAmigos(int nAmigos) {
        this.nAmigos = nAmigos;
    }

    public void setnConhecidos(int nConhecidos) {
        this.nConhecidos = nConhecidos;
    }

    // Construtores
    Agenda(int nPessoas) {
        int sorteia, qntAmigo = 0, qntConhecido = 0;

        pessoas = new Pessoa[nPessoas];

        for (int i = 0; i < nPessoas; i++) {
            sorteia = 1 + (int) (Math.random() * 2);

            if (sorteia == 1) {
                pessoas[i] = new Amigo();
                qntAmigo++;
            } else if (sorteia == 2) {
                pessoas[i] = new Conhecido();
                qntConhecido++;
            }
        }

        System.out.println(qntAmigo + " amigo(s) e " + qntConhecido + " conhecido(s).");
    }

    // Métodos
    public void addInformacoes() {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i] instanceof Amigo) {
                Amigo amigo = (Amigo) pessoas[i];
                System.out.println("-----DADOS DE AMIGO-----");
                System.out.println("Digite o nome: ");
                amigo.setNome(read.next());

                System.out.println("Digite a idade: ");
                amigo.setIdade(read.nextInt());

                System.out.println("Digite a data de aniversario: ");
                amigo.setDataAniversario(read.next());
            } else if (pessoas[i] instanceof Conhecido) {
                Conhecido conhecido = (Conhecido) pessoas[i];
                System.out.println("---DADOS DE CONHECIDO---");
                System.out.println("Digite o nome: ");
                conhecido.setNome(read.next());

                System.out.println("Digite a idade: ");
                conhecido.setIdade(read.nextInt());

                System.out.println("Digite o email: ");
                conhecido.setEmail(read.next());
            }
        }
    }

    public void imprimeAniversarios() {
        System.out.println("---Datas de aniversário---");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Amigo) {
                Amigo amigo = (Amigo) pessoas[i];

                System.out.println(amigo.getNome() + " " + amigo.getDataAniversario());
            }
        }
        System.out.println("");
    }

    public void imprimeEmail() {
        System.out.println("---------E-mails----------");
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] instanceof Conhecido) {
                Conhecido amigo = (Conhecido) pessoas[i];

                System.out.println(amigo.getNome() + " " + amigo.getEmail());
            }
        }
        System.out.println("");
    }
}
