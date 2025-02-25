public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(10);
        listaSimples.verLista();
        listaSimples.inserirValor(1);
        listaSimples.inserirValor(2);
        listaSimples.inserirValor(3);
        listaSimples.buscaValor(2);
        listaSimples.removerPorIndice(1);
        listaSimples.verLista();
    }
}