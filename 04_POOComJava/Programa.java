/* @File Programa.java
 * @Author Igor Barroso Almeida
 * @Brief Aula 04 - OO com java: Modelagem de classes para 
 * funcionarios de um banco. Este arquivo contem testes
 * relacionados a referencias de objetos. Funcioario.java e
 * Data.java contem as classes criadas para os testes
 * @Date 06/10/2022
*/

public class Programa {
    public static void main(String[] args) {
        Funcionario F1 = new Funcionario(); // Funcionario 1
        Funcionario F2 = new Funcionario(); // Funcionario 2
        Funcionario F3 = F1; // Funcinario 3 ---> Referencia igual a F1

        // Preenche F1 e F2 com valores iguais
        F1.setNome("Igor Barroso Almeida");
        F1.setDataEntrada(10, 10, 2020);
        F1.setDepartamento("Desenvolvimento");
        F1.setSalario(15000.00);
        F1.setRG("000.111.222-33");

        F2.setNome(F1.getNome());
        F2.setDataEntrada(F1.getDataEntrada());
        F2.setDepartamento(F1.getDepartamento());
        F2.setSalario(F1.getSalario());
        F2.setRG(F1.getRG());

        // Imprime as informações dos três objetos
        System.out.println("F1:");
        F1.mostraInfo();
        System.out.println("F2:");
        F2.mostraInfo();
        System.out.println("F3:");
        F3.mostraInfo();

        /*
         * Compara apenas se a referencia é igual, logo F1 e F2
         * vão ser diferentes, já que são referencias diferentes
         * para coisas (objetos) diferentes e F1 e F3 são iguais
         * pois apsesar de serem referencias diferentes, elas
         * referenciam um mesmo espaço na memória, o mesmo objeto.
         */
        if (F1 == F2) {
            System.out.println("F1 == F2");
        } else {
            System.out.println("F1 != F2");
        }
        if (F1 == F3) {
            System.out.println("F1 == F3");
        } else {
            System.out.println("F1 != F2");
        }

    }
}