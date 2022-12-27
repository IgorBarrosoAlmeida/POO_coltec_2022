public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.setNome("Amazon");
        empresa.setcnpj("2012134539");

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();
        Funcionario f4 = new Funcionario();

        /*
         * Aula 6
         * 1. R: Não é possivel acessar os atributos, portanto
         * é necessario utlizar os getters e setters
         */
        f1.setDataEntrada(10, 10, 2020);
        f1.setNome("Igor Barroso Almeida");
        f1.setDepartamento("Desenvolvimento");
        f1.setRG("2021953526");
        f1.setSalario(50000.00);

        f2.setDataEntrada(11, 11, 2021);
        f2.setNome("Lorena Ricoy");
        f2.setDepartamento("Admnistração");
        f2.setRG("5041234533");
        f2.setSalario(500.00);

        f3.setDataEntrada(15, 05, 2022);
        f3.setNome("Leandro Rodrigues");
        f3.setDepartamento("Desenvolvimento");
        f3.setRG("5492310922");
        f3.setSalario(200.00);

        f4.setDataEntrada(07, 11, 2019);
        f4.setNome("Juju");
        f4.setDepartamento("Estagiaria");
        f4.setRG("4582123992");
        f4.setSalario(5000.00);

        // Teste aula
        empresa.addFunc(f1);
        empresa.addFunc(f2);
        empresa.addFunc(f3);
        empresa.addFunc(f4);

        empresa.mostraEmpregados();
    }
}