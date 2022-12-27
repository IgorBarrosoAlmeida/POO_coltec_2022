/* @File Funcionario.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe para representar
 * as informações de funcionarios de um banco
 * @Date 06/10/2022
*/

class Funcionario {
    // Atributos
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String RG;

    // Métodos
    public void mostraInfo() {
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.print("Data de entrada: ");
        this.dataEntrada.mostraData();
        System.out.println("RG: " + this.RG);
        System.out.println("----------------------");
    }

    // gets
    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public Data getDataEntrada() {
        return this.dataEntrada;
    }

    public String getRG() {
        return this.RG;
    }

    // sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(int dia, int mes, int ano) {
        this.dataEntrada = new Data(dia, mes, ano);
    }

    public void setDataEntrada(Data data) {
        this.dataEntrada = data;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
