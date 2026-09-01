package tarefas.filas;

public class Fila {

    private Object[] fila;
    private int inicio = 0;
    private int fim = 0;

    public Fila(int capacidade) {
        fila = new Object[capacidade];

    }
    public void enfilaeirar(Object obg){
        if(!filacheia()){
            if(fim == fila.length){
                moverelementos();
            }
            fila[fim] = obg;
            fim++;
        }else{
            System.out.println();
            System.out.println("----Fila esta cheia----");
        }
    }

    private void moverelementos() {
        int indice = 0;
        for(int i = inicio; i < fim; i++){
            fila[indice] = fila[i];
            indice++;
        }
        inicio = 0;
        fim = indice;
        limparelementos(indice);
    }

    private void limparelementos(int indice) {
        do{
            fila[indice] = null;
            indice++;
        }while(indice < fila.length);
    }

    public boolean filacheia(){
        return getQhauntidadefila() == fila.length;

    }
    public boolean filaVazia(){
        return inicio == fim;
    }
    public int getQhauntidadefila(){
        return fim - inicio;
    }
    public void desenfileierar(){
        if(!filaVazia()){
            System.out.println();
            System.out.println(String.format(" O elemento '%s' foi tiraado da fila", fila[inicio]));
            fila[inicio] = null;
            inicio++;
        }else{
            System.out.println();
            System.out.println("----Fila esta vazia----");
        }
    }

    public void mostrarfila(){
        if(!filaVazia()){
            System.out.println();
            System.out.println("=========================================================");
            System.out.println();
            for (int i = inicio; i < fim ; i++) {
                System.out.print(fila[i] + " -- ");

            }
        }else{
            System.out.println();
            System.out.println("----Fila esta vazia----");
        }
    }

}

