public class ListaSimples {
    private int tamanho;
    int [] lista;

    public ListaSimples(int tamanhoEstrutura) {
        this.tamanho = tamanhoEstrutura;
        lista = new int[tamanhoEstrutura];
        System.out.println("A lista criada foi criada com sucesso. Seu tamanho é igual a:" + tamanhoEstrutura);
    }
}
