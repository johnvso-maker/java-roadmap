package aulaPolimorfismo;

public class Reptil extends Animal {
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("esta se alimentando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Esta grunindo");
    }

    private String corescama;

    public String getCorescama() {
        return corescama;
    }
    public void setCorescama(String corescama) {
        this.corescama = corescama;
    }
}
