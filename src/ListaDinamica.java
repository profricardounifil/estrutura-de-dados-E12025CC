public class ListaDinamica {
    private No primeiro;

    public ListaDinamica(String conteudo) {
        this.primeiro = new No(conteudo);
    }

    public void verLista() {
        if(!estaVazio()) {
            No aux = primeiro;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public boolean estaVazio() {
        if(primeiro == null) { //A lista está vazia
            System.out.println("Não existem elementos na lista.");
            return true;
        } else {
            return false;
        }
    }
}
