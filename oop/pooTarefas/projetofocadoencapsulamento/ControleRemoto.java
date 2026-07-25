package projetofocadoencapsulamento;

public class ControleRemoto implements Controlador{

    //Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Metodos Especiais

    public ControleRemoto() {
        this.ligado = false;
        if ( this.ligado == true ) {
        this.tocando = false;
        this.volume = 50;
        }
    }

    private int getVolume() {
        return volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void  setVolume(int v) {
        if (getVolume() > 100) {
            System.out.println("VOLUME_MAXIM0");
        }
        this.volume = v;
    }
    private void  setLigado(boolean l) {
        this.ligado = l;
    }
    private void  setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirmenu() {
        if(this.getLigado()) {
        System.out.println("------------MENU------------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        for (int i = 0; i <= getVolume() ; i+=10) {
            System.out.print("|");
        }
        System.out.print(" VOLUME: " + this.getVolume());
        }else{
            System.out.println("O controle se encontra desligado");
        }
    }
    @Override
    public void fecharmenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisvolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }
    @Override
    public void menosvolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("IMPOSSIVEL ABAIXAR MAIS");
        }
    }
    @Override
    public void ligamudo() {
        if  (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }else {
            System.out.println("IMPOSSIVEL AUMENTAR MAIS");
        }
    }
    @Override
    public void desligamudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
