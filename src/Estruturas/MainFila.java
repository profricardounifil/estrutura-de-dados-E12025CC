package Estruturas;

public class MainFila {
    public static void main(String[] args) {
        FilaSimples filaSimples = new FilaSimples(4);
        filaSimples.enfileira("1");
        filaSimples.enfileira("2");
//        filaSimples.enfileira("3");
//        filaSimples.enfileira("5");
        filaSimples.desinfileirar();
        filaSimples.visualizar();
    }

}
