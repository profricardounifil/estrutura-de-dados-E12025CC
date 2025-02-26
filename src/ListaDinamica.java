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

    public void inserirValor(String conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazio()) {
            this.primeiro = novoNo;
        } else {
            No aux = this.primeiro;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    public boolean verificaExistencia(String conteudo) {
        if(estaVazio()) {
            return false;
        } else {
            No aux = this.primeiro;
            while(aux != null) {
                if(aux.getConteudo() == conteudo) {
                    return true;
                }
                aux = aux.getProx();
            }
            return false;
        }
    }

    public void removerValor(String conteudo) {
        No aux = this.primeiro;
        if(this.primeiro.getConteudo() == conteudo) {//Removendo primeiro elemento
            this.primeiro = this.primeiro.getProx();
        } else {
            if(verificaExistencia(conteudo)){
                while (aux != null) {
                    if(aux.getProx().getConteudo() == conteudo) {
                        aux.setProx(aux.getProx().getProx());
                        return;
                    }
                    aux = aux.getProx();
                }
            }
            System.out.println("O elemento não existe.");
        }
    }
}
