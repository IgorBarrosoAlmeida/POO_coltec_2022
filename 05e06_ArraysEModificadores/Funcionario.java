/* @File Funcionario.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe para representar
 * as informações de funcionarios de um banco. Atualizado, aula 5 e 6.
 * @Date 16/10/2022
*/

class Funcionario {
    // Atributos
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String RG;
    // Aula 6
    private static int nFunc = 0;
    private int id;

    // Contrutores
    Funcionario() {
        Funcionario.nFunc += 1;
        id = nFunc;
    }

    Funcionario(String nome) {
        Funcionario.nFunc += 1;
        id = nFunc;
        this.nome = nome;
    }

    // Métodos
    public void mostraInfo() {
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Identificador: " + this.id);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.print("Data de entrada: ");
        this.dataEntrada.mostraData();
        System.out.println("RG: " + this.RG);
        System.out.println("----------------------");
    }

    // getters
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

    // setters
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

/* Classe empresa */
class Empresa {
    // Atributos
    private String nome;
    private String cnpj;
    private Funcionario[] empregados = new Funcionario[2];
    private int nEmpregados = 0;

    // Métodos
    public void addFunc(Funcionario f) {
        if (this.nEmpregados >= this.empregados.length) {
            Funcionario[] aux = new Funcionario[this.nEmpregados + 1];

            // Copia os funcionarios já existentes para aux
            for (int i = 0; i < this.empregados.length; i++) {
                aux[i] = this.empregados[i];
            }

            // Empregados passa a conter uma nova quantidade de empregrados
            this.empregados = aux;
        }

        this.empregados[this.nEmpregados] = new Funcionario();
        this.empregados[this.nEmpregados] = f;

        this.nEmpregados++;
    }

    public void mostraEmpregados() {
        for (int i = 0; i < nEmpregados; i++) {
            System.out.println("Funcionario " + i + ":");
            empregados[i].mostraInfo();
        }
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public int getNEmpregados() {
        return this.nEmpregados;
    }

    public Funcionario[] getEmpregados() {
        return this.empregados;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /*
     * Aula 6
     * 6. R: Não é necessario setNEmpregados nem setEmpregados
     * já que temos o metodo addFunc().
     */
}