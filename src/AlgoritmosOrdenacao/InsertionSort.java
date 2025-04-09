package AlgoritmosOrdenacao;

public class InsertionSort {
    public Integer[] insertionSort(Integer[] estrutura) {
        for (int i = 1; i < estrutura.length; i++) {
            int aux = estrutura[i];
            int j = i - 1;
            while (j >= 0 && estrutura[j] > aux) {
                estrutura[j + 1] = estrutura[j];
                j--;
            }
            estrutura[j + 1] = aux;
        }
        return estrutura;
    }
}
