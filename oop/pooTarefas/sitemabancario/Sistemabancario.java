package sitemabancario;

public class Sistemabancario {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        b1.setNumConta(1111);
        b1.setDono("cleitom");
        b1.abrirConta("CC");
        b1.depositar(500);
        b1.sacar(500);

        Banco b2 = new Banco();
        b2.setNumConta(2222);
        b2.setDono("creusa");
        b2.abrirConta("CP");
        b2.depositar(400);
        b2.sacar(1000);

        b1.estadoatual();
        b2.estadoatual();
    }
}
