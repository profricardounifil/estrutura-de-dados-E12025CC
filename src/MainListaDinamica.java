public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica turma = new ListaDinamica("Ysadora");

        turma.inserirValor("Isabely");
        turma.inserirValor("Jorge");
        turma.inserirValor("Eduardo");
        turma.removerValor("Eduardo");
        turma.verLista();
    }
}
