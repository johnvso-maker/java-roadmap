package tarefas.listas;

public class Listateste {
    public static void main(String[] args) {


        Lista lista = new Lista(8);

        lista.adicionar(1, 0);
        lista.adicionar(5, 0);
        lista.mostrarlista();

        lista.adicionar("bala ", 1);
        Object obj = lista.getElemento("bala");

        lista.mostrarlista();

        lista.adicionar("Ventilador", 11);
        lista.adicionar("teste", 7);
        lista.mostrarlista();

        lista.excluir("teste");
        lista.mostrarlista();

        lista.adicionar("teste1", 2);
        lista.adicionar(2, 3);
        lista.adicionar("Cleitom", 10);
        lista.adicionar("rapariga", 5);
        lista.adicionar("meuvov", 6);
        lista.mostrarlista();

        lista.excluirtodos();
        lista.mostrarlista();




    }
}
