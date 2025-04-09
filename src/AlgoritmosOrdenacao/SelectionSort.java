package AlgoritmosOrdenacao;

public class SelectionSort {
    public Integer[] selectionSort(Integer[] estrutura) {
        for (int i = 0; i < estrutura.length - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < estrutura.length; j++) {
                if (estrutura[j] < estrutura[menorIndice]) {
                    menorIndice = j;
                }
            }
            int aux = estrutura[menorIndice];
            estrutura[menorIndice] = estrutura[i];
            estrutura[i] = aux;
        }
        return estrutura;
    }
}
