package aulaPolimorfismo;

public class Mamifero extends Animal {

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Esta mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    private String cordopelo;

    public String getCordopelo() {
        return cordopelo;
    }
    public void setCordopelo(String cordopelo) {
        this.cordopelo = cordopelo;
    }

}
