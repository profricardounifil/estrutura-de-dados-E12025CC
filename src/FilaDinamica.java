public class FilaDinamica {
    private No primeiro;
    private No ultimo;

    public FilaDinamica(String conteudo) {
        this.primeiro = new No(conteudo);
        this.ultimo = this.primeiro;
    }

    public void enfileira(String conteudo) {
        No novoNo = new No(conteudo);
        if(vazia()) {
            this.primeiro = novoNo;
            this.ultimo = this.primeiro;
        } else {
            this.ultimo.setProx(novoNo);
            this.ultimo = novoNo;
        }
    }

    public void visualizar() {
        if(vazia()) {
            System.out.println("Não existem elementos na fila.");
        } else {
            No aux = this.primeiro;
            while(aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
        }
    }

    public boolean vazia() {
        if(this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void desinfileira() {
        if(vazia()) {
            System.out.println("Não existem elementos para serem removidos.");
        } else {
            if(this.primeiro == this.ultimo) {
                this.primeiro = null;
                this.ultimo = null;
            } else {
                this.primeiro = this.primeiro.getProx();
            }
        }
    }
}
