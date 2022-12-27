/* @File Banco.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem simples de um banco 
 * que contem uma serie de contas
 * @Date 10/11/2022
*/

public class Banco {
    // Atributos
    private String nome;
    private Conta[] contas;

    // Construtores
    Banco() {
    }

    Banco(String nome) {
        this.nome = nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void add(Conta c) {
        // Se não tem nenhuma conta, cadastra uma
        if (this.contas == null) {
            this.contas = new Conta[1];
        } else {
            Conta[] aux = new Conta[this.contas.length + 1];

            // Copia tudo para o auxiliar
            for (int i = 0; i < this.contas.length; i++) {
                aux[i] = this.contas[i];
            }

            this.contas = aux;
        }
        // Cria nova conta
        this.contas[this.contas.length - 1] = c;
    }

    // Retorna a conta de número X
    public Conta pegaConta(int x) {
        return contas[x];
    }

    // Retorna o total de contas cadastradas
    public int pegaTotalDeContas() {
        return this.contas.length;
    }
}