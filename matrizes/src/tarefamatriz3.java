import java.util.Scanner;

public class tarefamatriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
         for (int i = 0; i < matriz.length; i++){
             for (int j = 0; j < matriz[i].length; j++){
                 System.out.println("Digite o valor [" + i + "] coluna [" + j + "]");
                 matriz[i][j] = sc.nextInt();
             }
         }
        System.out.println();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma = matriz[i][j] + soma;
            }
            System.out.println("A soma da linha" + i + ": " + soma);
            soma = 0;
        }
        System.out.println();

        int somatotal = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somatotal = matriz[i][j] + somatotal;
            }
        }
        System.out.println("A soma da linha: " + somatotal);
        System.out.println();

        int pocisao = 0;
        System.out.print("Os numeros diagonais são: ");
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][pocisao] + " ");
            pocisao++;
        }
        System.out.println();
        pocisao = 0;

        int pares = 0;
        for (int i = 0; i < matriz.length; i++){
            if(matriz[i][pocisao] % 2 == 0){
                pares++;
            }
            pocisao++;
        }
        System.out.println("Quantidade de pares na diagonal principal: " + pares);
        System.out.println();
        pocisao = 0;

        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++){
            if(matriz[i][pocisao] > maior){
               maior = matriz[i][pocisao];
            }
            pocisao++;
        }
        System.out.println("O maior numero na diagonal principal e: " + maior);


        System.out.println("A diagonal segundaria da matriz e: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][matriz.length - 1 - i]);
        }
    }
}
