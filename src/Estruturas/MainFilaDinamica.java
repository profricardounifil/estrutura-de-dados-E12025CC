package Estruturas;

public class MainFilaDinamica {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica("Julio");
//        filaDinamica.enfileira("Ronaldo");
//        filaDinamica.enfileira("Jorge");
//        filaDinamica.enfileira("Ysadora");
//        filaDinamica.enfileira("Isabely");
        filaDinamica.desinfileira();
        filaDinamica.visualizar();

    }
}
