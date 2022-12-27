/* 2. Escreva uma classe Estatística em Java que contenha métodos que recebam um array
* de inteiros e calculem:
* ▶ a) a moda dos elementos no array (elemento mais frequente).
* ▶ b) A mediana dos elementos no array (elemento central).
* ▶ c) a média.
*/

public class Estatistica {
    // Atributos
    private int[] array;

    // Metodos
    public int moda() {
        int moda = 0;
        int repeticao;
        int maiorRep = 0;

        for (int i = 0; i < array.length; i++) {
            repeticao = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeticao++;
                }
            }

            if (repeticao > maiorRep) {
                moda = i;
                maiorRep = repeticao;
            }
        }
        return array[moda];
    }

    public float mediana() {
        float mediana = 0;

        if (this.array.length % 2 == 0) { // Tamanho de sequencia par
            mediana = this.array[(this.array.length / 2)] + this.array[(this.array.length / 2) - 1];
            mediana /= 2;
        } else { // Tamanho de sequancia impar
            mediana = this.array[(this.array.length / 2)];
        }

        return mediana;
    }

    public float media() {
        float soma = 0;

        for (int i = 0; i < this.array.length; i++) {
            soma += this.array[i];
        }

        return (soma / this.array.length);
    }

    // Getters
    public int[] getArray() {
        return this.array;
    }

    // Setters
    public void setArray(int[] array) {
        this.array = array;
    }
}
