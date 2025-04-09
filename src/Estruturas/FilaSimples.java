package Estruturas;

public class FilaSimples {
    private int tamanho;
    private String[] fila;

    public FilaSimples(int tamanho) {
        this.tamanho = tamanho;
        fila = new String[tamanho];
    }

    public void enfileira(String conteudo) {
        if(cheia()) {
            System.out.println("Não há espaço na fila.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if(checarConteudoIndice(i)) {
                    this.fila[i] = conteudo;
                    return;
                }
            }
        }
    }

    public boolean cheia() {
        for (int i = 0; i < tamanho; i++) {
            if(this.fila[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean vazia() {
        if(this.fila[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checarConteudoIndice(int indice) {
        if(this.fila[indice] == null) {
            return true;
        }
        return false;
    }

    public void visualizar() {
        if(!vazia()) {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(fila[i]);
            }
            //Tentem implementar a visualização otimizada, sem precisar passar por todos elementos, caso a fila não esteja cheia
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public void desinfileirar() {
        if(vazia()) {
            System.out.println("Não há elementos para serem desenfileirados.");
        } else {
            this.fila[0] = null;
            rearranjar();
        }
    }

    public void rearranjar() {
        int i = 0;
        while(i < tamanho-1 && !checarConteudoIndice(i+1) ) {
            this.fila[i] = this.fila[i+1];
            i = i+1;
        }
        this.fila[i] = null;

    }

}
