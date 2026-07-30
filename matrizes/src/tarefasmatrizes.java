import java.util.Scanner;

public class tarefasmatrizes {
    public static class matizes {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[][] matriz = {{18,22,31},{40,53,62},{71,88,59}};
                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length; j++){
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
        }
    }
}
