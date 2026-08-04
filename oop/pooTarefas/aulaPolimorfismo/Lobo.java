package aulaPolimorfismo;

public class Lobo extends Mamifero{
    @Override
    public void locomover() {
        System.out.println("Correndo e escalando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo caça");
    }
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuu");
    }
}
