package aulaPolimorfismo;

public class Peixe extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo ração ou substancias");
    }
    public void soltarbolha(){
        System.out.println("Soltando uma bolha");
    }
    private String corescama;

    public String getCorescama() {
        return corescama;
    }
    public void setCorescama(String corescama) {}
}
