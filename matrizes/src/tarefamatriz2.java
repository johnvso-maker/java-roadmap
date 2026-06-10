import java.util.Scanner;

public class tarefamatriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a matriz 3 x 3");
        int [][] mat = new int[3][3];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Digite o valor [" + i + "] coluna [" + j + "]");
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int soma = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                soma = soma + mat[i][j];
            }
        }
        System.out.println();

        System.out.println("A soma de todos os numeros da matriz e: " + soma);

        int maior = mat[0][0];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if (mat[i][j] > maior){
                    maior = mat[i][j];
                }
            }
        }
        System.out.println();

        System.out.println("O mairo numero da matriz e: " + maior);

        int pares = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] % 2 == 0){
                    pares++;
                }
            }
        }
        System.out.println();

        System.out.println("A quantidade de pares e: " + pares);
    }
}
