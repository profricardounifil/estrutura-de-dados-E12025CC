public class SelectionSortPratica {

    public Integer[] selectionSort(Integer[] estrutura) {
        int aux;
        for (int i = 0; i < estrutura.length; i++) {//i = 1
            aux = estrutura[i];// valor 2
            int indiceMenor = indiceMenor(estrutura, i);//indice 1
            estrutura[i] = estrutura[indiceMenor];//valor 1
            estrutura[indiceMenor] = aux;//valor
        }
        return estrutura;
    }

    public Integer indiceMenor(Integer[] estrutura, int indice) {//1
        int menor = indice;
        int valorMenor = estrutura[indice];
        for (int i = indice; i < estrutura.length; i++) {
            if(estrutura[i] < valorMenor) {
                menor = i;
                valorMenor = estrutura[i];
            }
        }
        return menor;
    }
}
