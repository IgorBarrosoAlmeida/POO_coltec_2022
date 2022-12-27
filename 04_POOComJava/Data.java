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

    // Métodos
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
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Contrutores
    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
