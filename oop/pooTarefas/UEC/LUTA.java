package UEC;

import java.util.Random;

public class LUTA {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
        && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("A LUTA NÃO PODE ACONTECER");
        }
         if(l1.getSexo().equals(l2.getSexo()) && getAprovada()){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("LUTAS ENTRE HOMENS CONTRA MULHERES NÃO SÃO PERMITIDAS!!");
        }
    }
    public void lutar(){
        if(this.aprovada){
            this.desafiante.apresentar();
            System.out.println();
            System.out.println(" ############## DESAFIANDOOOOO ##############");
            this.desafiado.apresentar();
            System.out.println();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:  //Emapate
                    System.out.println(" Empateeeee, depois de rounds calorosos, a decisão dos juizes e EMPATE !!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    this.desafiante.status();
                    this.desafiado.status();
                    break;
                case 1: // Desafiado vence
                    System.out.println("Vitoria !!! " + this.desafiado.getNome() + " Agrega mais uma vitoria em sua carreira!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    this.desafiado.status();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitoria !!! " + this.desafiante.getNome() + " Agrega mais uma vitoria em sua carreira!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    this.desafiante.status();
                    break;
            }
            System.out.println("##############################################################");
        }else {
            System.out.println("A LUTA NÃO PODE ACONTECER!!!");
        }
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
