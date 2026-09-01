package tarefas.listas;

public class Lista {

    private Object[] lista;
    private int contador = 0;

    public Lista(int cap) {
        lista = new Object[cap];
    }

    public void adicionar(Object obj, int index){
        if(indiceDisponivel(index)){
            lista[index] = obj;
            contador++;
            System.out.println(String.format("O elemento %s foi adicionado a lista. ", obj));
        } else
            System.out.println(String.format("O indice %d não esta disponivel ou e invalido. ", index));
    }

    private boolean indiceDisponivel(int index) {
        return indiceValido(index) && lista[index] == null;
    }

    public boolean indiceValido(int index){
        return index >= 0 && index < lista.length;
    }

    public Object getElemento(Object obj){

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equals(obj))
                return lista[i];
        }
        System.out.println(String.format("O elemento %s nâo existe na lista. ", obj));
        return null;
    }

    public void excluir(int index){
        if(!indiceEmUso(index)){
            lista[index] = null;
            contador--;
            System.out.println(String.format("O elemento na pocisão %s foi excluido. ", index));
        } else{
            System.out.println(String.format("O indice %d esta vazio ou fora do intervalo da lista", index));
        }
    }

    private boolean indiceEmUso(int index) {
        return indiceEmUso(index) && lista[index] != null;
    }

    public void excluir(Object obj){

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] != null && lista[i].equals(obj))
                lista[i] = null;
        }
        System.out.println(" ============================================================");
        System.out.println(String.format("O elemento %s foi excluido da lista. ", obj));
        System.out.println(" ============================================================");
    }

    public void excluirtodos(){
        for (int i = 0; i < lista.length; i++) {
            lista[i] = null;
        }
    }

    public void mostrarlista(){
        if(!listavazia()){
            System.out.println(" ================================================= ");
            for (int i = 0; i < lista.length; i++) {
                System.out.print(lista[i] + " - ");
            }
            System.out.println();
        }
    }

    public boolean listavazia(){
        return contador == 0;
    }
}
