package aulaPolimorfismo;

public class Cachorro extends Lobo{
    @Override
    public void locomover() {
        System.out.println("Cachorro esta correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Cachorro esta comendo ração");
    }
    @Override
    public void emitirSom() {
        System.out.println("au! au! au!");
    }
    public void reagir(String frase){
        if (frase.equalsIgnoreCase("toma comida")|| frase.equalsIgnoreCase("ola dog")){
            System.out.println("Cachorro esta feliz");
        }else {
            System.out.println("Cachorro muito bravo!!! CORRA");
        }
    }
    public void reagir(int hora, int minuto){
        if(hora < 10){
            System.out.println("Cachorro esta feliz");
        } else if(hora > 10 && hora < 20){
            System.out.println("Cachorro esta traquilo");
        }else{
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono) {
        if (dono){
            System.out.println("Cachorro esta feliz");
        }else {
            System.out.println("Cachorro muito bravo!!! CORRA");
        }
    }
    public void reagir(int idade, float peso) {
        if  (idade < 5){
            if (peso < 10){
                System.out.println("abanar");
            }else{
                System.out.println("latir");
            }
        }else {
            if (peso < 10){
                System.out.println("rosnar");
            }else {
                System.out.println("ignorar");
            }
        }

    }
}
