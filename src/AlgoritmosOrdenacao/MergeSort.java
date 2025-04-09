package AlgoritmosOrdenacao;

public class MergeSort {
    public Integer[] mergeSort(Integer[] estrutura, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            mergeSort(estrutura, esquerda, meio);
            mergeSort(estrutura, meio + 1, direita);
            merge(estrutura, esquerda, meio, direita);
        }
        return estrutura;
    }

    public void merge(Integer[] estrutura, int esquerda, int meio, int direita) {
        int n1 = meio - esquerda + 1;
        int n2 = direita - meio;

        int[] E = new int[n1];
        int[] D = new int[n2];

        for (int i = 0; i < n1; i++)
            E[i] = estrutura[esquerda + i];
        for (int j = 0; j < n2; j++)
            D[j] = estrutura[meio + 1 + j];

        int i = 0, j = 0, k = esquerda;
        while (i < n1 && j < n2) {
            if (E[i] <= D[j]) {
                estrutura[k++] = E[i++];
            } else {
                estrutura[k++] = D[j++];
            }
        }

        while (i < n1) {
            estrutura[k++] = E[i++];
        }
        while (j < n2) {
            estrutura[k++] = D[j++];
        }
    }
}
