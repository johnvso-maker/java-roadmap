package aulascaneta0;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tapada;
    private String cor;

   public  Caneta(String m, String c, float p) {
       this.modelo = m;
        this.cor = c;
        this.ponta = p;
   }

   public void status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Cor: " + this.cor);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Tapada: " + this.tapada);
   }
}
