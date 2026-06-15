import java.util.Scanner;

public class tarefas4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double[][] matriz = new double[3][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Preencha as notas do aluno " + i + " :  nota - " + j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println();

        for(int i = 0; i < matriz.length; i++){
            System.out.print("Aluno " + i + " : ");
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Media do aluno " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                media = matriz[i][j] + media;
            }
            media = media / matriz[i].length;
            String mediam = String.format("%.1f\n", media);
            System.out.print(mediam);
            media = 0;
        }
        System.out.println();

        double maiormedia = 0;
        int aluno = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media = matriz[i][j] + media;
            }
            media = media / matriz[i].length;
            if( maiormedia < media){
            maiormedia = media;
                aluno = i;
            }
            media = 0;
        }
        String maior = String.format("%.1f\n", maiormedia);
        System.out.print("Aluno com maior media " + aluno + ": " + maior);
        System.out.println();


        media = 0;
        int qtddaprovados = 0; //qtdd = quantidade
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media = matriz[i][j] + media;
            }
            media = media / matriz[i].length;
            if(media >= 7){
                qtddaprovados++;
            }
            media = 0;
        }
        System.out.println("Quantidade de aprovados: " + qtddaprovados);
        System.out.println();


        double maiornota = 0;
        for( int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if( matriz[i][j] > maiornota){
                    maiornota = matriz[i][j];
                }
            }
        }
        System.out.println("Maior nota da turma: " + maiornota);
    }
}
