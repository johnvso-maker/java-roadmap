import java.util.Arrays;
import java.util.Scanner;

//programa que recebe nomes de alunos, notas, verifica se foram aprovados, maior e menor nota

public class vetores2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastrados: ");
        int numerodealunos = sc.nextInt();
        sc.nextLine();

        String[] alunos = new String[numerodealunos];

        for (int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: n"+ i + " : " );
            alunos[i] = sc.nextLine();
        }

        double notas[] = new double[numerodealunos];
        for(int i = 0; i < alunos.length; i++){
            System.out.println("digite as nota do " + alunos[i] + " : ");
            double valores = sc.nextDouble();
            notas[i] = valores;
        }
        for (int i = 0; i < notas.length; i++){
            System.out.println("Aluno: " + alunos[i] +", Nota: "+ notas[i]);
        }

        double media = 0;
        for (int i = 0; i < alunos.length; i++){
            media = media + notas[i];
        }
        media /= numerodealunos;
        String mediam = String.format("%.1f\n", media);
        System.out.println("A media da turma e: " + mediam);

        //MN = maior nota

        double MN = notas[0];
        String maiornota = alunos[0];
        for (int i = 0; i < alunos.length; i++){
            if(notas[i] > MN){
                MN = notas[i];
                maiornota = alunos[i];

            }
        }
        System.out.println("Maior nota: " + maiornota + " - " + MN);

        double MenorN = notas[0];
        String menornota = alunos[0];
        for (int i = 0; i < alunos.length; i++){
            if(notas[i] < MenorN){
                MenorN = notas[i];
                menornota = alunos[i];
            }
        }
        System.out.println("Menor nota: " + menornota + " - " + MenorN);

        int acima = 0;
        for (int i = 0; i < alunos.length; i++){
            if(notas[i] >= 7){
                acima ++;
            }
        }
        System.out.println("Alunos aprovados: " + acima);


        for(int i = 0; i < alunos.length; i++){
            if(notas[i] >= 7){
                System.out.println("Aluno: " + alunos[i] + " Nota: " + notas[i] + " Status: Aprovado" );
            }
        }

        String maiornome = alunos[0];
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].length() > maiornome.length()){
                maiornome = alunos[i];
            }
        }
        System.out.println("Aluno com o maior nome: " + maiornome);

        sc.close();


    }
    public static void exibirnotas(double[] notas){
        for (int i = 0; i < notas.length; i++){
            System.out.println("Alunos " + " : " + notas[i]);
        }
    }
    public static void exibralunos(String[] alunos) {
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Alunos: " + i + " : " + alunos[i]);
        }
    }

}

























