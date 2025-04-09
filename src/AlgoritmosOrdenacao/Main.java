package AlgoritmosOrdenacao;

public class Main {
    public static void main(String[] args) {
        Integer [] estrutura = {7, 3, 5, 2, 9};
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        ExibirEstrutura exibirEstrutura = new ExibirEstrutura();
        exibirEstrutura.exibir(insertionSort.insertionSort(estrutura));
        exibirEstrutura.exibir((selectionSort.selectionSort(estrutura)));
        exibirEstrutura.exibir((mergeSort.mergeSort(estrutura, 0, estrutura.length-1)));
        exibirEstrutura.exibir((quickSort.quickSort(estrutura, 0, estrutura.length-1)));
    }
}
