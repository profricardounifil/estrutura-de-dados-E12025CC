package AlgoritmosOrdenacao;

public class QuickSort {
    public Integer[] quickSort(Integer[] estrutura, int menor, int maior) {
        if (menor < maior) {
            int pi = particao(estrutura, menor, maior);
            quickSort(estrutura, menor, pi - 1);
            quickSort(estrutura, pi + 1, maior);
        }
        return estrutura;
    }

    public int particao(Integer[] estrutura, int menor, int maior) {
        int pivo = estrutura[maior];
        int i = menor - 1;
        for (int j = menor; j < maior; j++) {
            if (estrutura[j] < pivo) {
                i++;
                int aux = estrutura[i];
                estrutura[i] = estrutura[j];
                estrutura[j] = aux;
            }
        }
        int aux = estrutura[i + 1];
        estrutura[i + 1] = estrutura[maior];
        estrutura[maior] = aux;
        return i + 1;
    }
}
