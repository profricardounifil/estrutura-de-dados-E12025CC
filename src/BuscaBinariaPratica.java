public class BuscaBinariaPratica {
    public Integer buscaBinaria(int valor, Integer[] estrutura) {
        int inicio = 0;
        int fim = estrutura.length-1;
        int meio;
        while(inicio <= fim) {
            meio = (inicio+fim)/2;
            if(valor == estrutura[meio]) {
                return valor;
            }
            if(valor > estrutura[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }
}
