package tarefas.pilhas;

public class testeobj {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(7);

        pilha.empilhar("ebac");
        pilha.empilhar("brasil");
        pilha.empilhar("marcelo");
        pilha.empilhar(12783);
        pilha.empilhar(12.3);
        pilha.empilhar(19826.3);
        pilha.empilhar(12.31234);

        pilha.desempilhar();

        int numerodeelementos = pilha.getquantidadeelementos();

        System.out.println("Quantidade de elementos: " + numerodeelementos);

    }
}
