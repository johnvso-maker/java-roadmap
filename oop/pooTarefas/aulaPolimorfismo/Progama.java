package aulaPolimorfismo;

public class Progama {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.locomover();
        m.emitirSom();

        System.out.println();

        Lobo l =  new Lobo();
        l.locomover();
        l.emitirSom();

        System.out.println();

        Cachorro c = new Cachorro();
        c.locomover();
        c.emitirSom();
        c.reagir(13, 10);
        c.reagir(4, 1.45f);
    }
}
