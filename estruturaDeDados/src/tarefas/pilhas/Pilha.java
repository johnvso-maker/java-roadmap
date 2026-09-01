package tarefas.pilhas;

public class Pilha {

    private Object[] pilha;

    private int topoDaPilha = 0;

    public Pilha(int capacidadeMaxima) {

        pilha = new Object[capacidadeMaxima];

    }

    public void empilhar(Object obj){
        if (!pilhacheia()) {
            pilha[topoDaPilha] = obj;
            topoDaPilha++;
            System.out.println(String.format("Elemento %s empihado", obj));
        }else
            System.out.println("A piolha esta cheia, voce precisa desempilhar um elemento antes de empilhar um novo. ");

    }

    public void desempilhar(){
        if(!pilhavazia()){
            topoDaPilha--;
            System.out.println(String.format("Elemento %s desempilhado", pilha[topoDaPilha]));
            pilha[topoDaPilha] = null;
        }else{
            System.out.println("A pilha esta vazia. ");
        }
    }

    public void mostrarpilha(){
        System.out.println();
        for(int i = 0; i < topoDaPilha; i++){
            System.out.print(pilha[i] + " - ");

        }
        System.out.println();
    }
    public int getquantidadeelementos(){
        System.out.println(String.format("A pilha tem %d elementos. ", topoDaPilha));
        return topoDaPilha;
    }

    private boolean pilhavazia() {
        return topoDaPilha == 0;
    }

    public boolean pilhacheia(){
     return topoDaPilha == pilha.length;
    }


}
