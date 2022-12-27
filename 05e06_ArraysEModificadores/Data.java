/* @File Data.java
 * @Author Igor Barroso Almeida
 * @Brief Modelagem de uma classe referente
 * a uma data.
 * @Date 06/10/2022
*/

public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Contrutores
    Data() {
    }

    Data(int dia, int mes, int ano) {
        if (dia > 31 || dia < 0 || mes < 0 || mes > 12) {
            System.out.println("Data invalida");
        } else if (mes == 2 && dia > 28) {
            System.out.println("Data invalida");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public void mostraData() {
        System.out.println(this.dia + "/" + this.mes + "/" + ano);
    }

    // Gets
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    // Sets
    public void setDia(int dia) {
        if (dia < 0 || dia > 31) {
            System.out.println("Dia invalida");
        } else if (this.mes == 2 && dia > 28) {
            System.out.println("Dia invalida");
        } else {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}