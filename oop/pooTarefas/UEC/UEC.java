package UEC;

import java.util.Random;
import java.util.Scanner;

public class UEC {
    public static void main(String[] args) {

        Lutador l[] = new Lutador [6];


        l[0] = new Lutador ("juca","dinamarca","masculino" ,25, 1.80f,90.9f, 10, 3, 0 );

        l[1] = new Lutador("cleitom", "brazil", "feminino", 24 ,1.9f, 94.9f, 8, 3, 2 );

        l[2] = new Lutador("juju", "frança", "feminino",30, 1.78f, 74.5f, 5, 5, 0);

        l[3] = new Lutador("java", "noruega", "masculino",34, 1.79f, 91.1f, 12,1, 0);

        l[4] = new Lutador("louris", "brazil", "feminino",19, 1.80f, 75.5f, 8, 4, 2);

        l[5] = new Lutador("manel", "brazil", "masculino",22, 1.83f, 90.0f, 6,6,4);

        LUTA UEC01 = new LUTA();
        UEC01.marcarLuta(l[0], l[3]);
        UEC01.lutar();
        System.out.println();

        //TENTANDO CRIAR LUTAS INFINITAS ATRAVES DE UM CODIGO

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar){
        System.out.println("deseja refazer mais uma luta?");
        String resposta = sc.nextLine();
            if (resposta.equals("sim") || resposta.equals("SIM")){
                Random sorteio  = new Random();
                int lutador =  sorteio.nextInt(l.length);
                sorteio = new Random();
                int lutador2 = sorteio.nextInt(l.length);
                LUTA UEC02 = new LUTA();
                UEC02.marcarLuta(l[lutador], l[lutador2]);
                UEC02.lutar();
                System.out.println();

            }else {
                continuar = false;
                System.out.println("------------------------------------------------------------------------");
                System.out.println("O UEC ESTA SENDO FINALIZADO, OBRIGADO POR COMPARECEREM A ESSE SHOW!!!!");
                System.out.println("========================================================================");
            }
        }
        sc.close();
    }
}
