import AlgoritmosOrdenacao.SelectionSort;

public class MainSelectionSort {
    public static void main(String[] args) {
        Integer [] estrutura = {4,2,15, 22, 1,9};
        SelectionSortPratica selectionSortPratica = new SelectionSortPratica();
        estrutura = selectionSortPratica.selectionSort(estrutura);
//        for (int i = 0; i < estrutura.length; i++) {
//            System.out.println(estrutura[i]);
//        }
        BuscaBinariaPratica buscaBinariaPratica = new BuscaBinariaPratica();
        System.out.println(buscaBinariaPratica.buscaBinaria(7, estrutura));
    }
}
