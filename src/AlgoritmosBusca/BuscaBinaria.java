package AlgoritmosBusca;

public class BuscaBinaria {
    public int buscaBinaria(Integer[] estrutura, int numero) {
        int inicio = 0;
        int fim = estrutura.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (estrutura[meio] == numero)
                return meio;
            else if (estrutura[meio] < numero)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }

        return -1; // Elemento não encontrado
    }
}
