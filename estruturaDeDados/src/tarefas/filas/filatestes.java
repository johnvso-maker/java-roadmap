package tarefas.filas;

public class filatestes {
    public static void main(String[] args) {

        Fila fila = new Fila(8);

        fila.enfilaeirar(1);
        fila.enfilaeirar(2);
        fila.enfilaeirar(3);
        fila.enfilaeirar(4);
        fila.enfilaeirar(5);
        fila.enfilaeirar(6);
        fila.enfilaeirar(7);
        fila.enfilaeirar(8);

        fila.mostrarfila();

        fila.desenfileierar();
        fila.desenfileierar();

        fila.mostrarfila();

        fila.enfilaeirar(9);
        fila.enfilaeirar(10);

        fila.mostrarfila();

        fila.enfilaeirar(11);

        fila.mostrarfila();

        fila.desenfileierar();
        fila.desenfileierar();

        fila.mostrarfila();

        fila.enfilaeirar("teste");

        fila.mostrarfila();

        System.out.println("Quantidade esperando na fila " + fila.getQhauntidadefila());

        fila.desenfileierar();
        fila.desenfileierar();

        fila.mostrarfila();




    }
}
