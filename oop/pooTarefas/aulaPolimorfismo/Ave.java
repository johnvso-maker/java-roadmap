package aulaPolimorfismo;

public class Ave extends Animal {

    @Override
    public void locomover() {
        System.out.println("Esta voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo comida de aves");
    }
    @Override
    public void emitirSom() {
        System.out.println("Batendo as asas e piando");
    }

    private String cordapena;

    public String getCordapena() {
        return cordapena;
    }
    public void setCordapena(String cordapena) {
        this.cordapena = cordapena;
    }

    private String Corpena;

    public String getCorpena() {
        return Corpena;
    }
    public void setCorpena(String Corpena) {
        this.Corpena = Corpena;
    }

    public void fazerninho(){
        System.out.println("Esta fazndo um ninho");
    }
}

