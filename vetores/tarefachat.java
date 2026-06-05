import java.util.Scanner;

public class tarefachat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        String[] vetor = new String[tamanho];
        sc.nextLine();

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite a palavra na pocisão " + i + " do vetor: ");
            vetor[i]= sc.nextLine();
        }
        for (int i = 0; i < vetor.length; i++){
             System.out.println(vetor[i]);
        }


        String maior = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i].length() > maior.length()){
            maior = vetor[i];
            }
        }
        System.out.println("O maior nome do vetor e: " + maior);

        int vogais = 0;
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor[i].length(); j++){
                char letra = vetor[i].charAt(j);
                  if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                      vogais++;
                  }
            }
        }
        System.out.println("A quantidade de vogais nos vetores e: " + vogais);

        int iniciais = 0;
        for(int i = 0; i < vetor.length; i++){
            char letra = vetor[i].charAt(0);
            if (letra == 'a'){
                iniciais ++;
            }
        }
        System.out.println("Nomes que começam com a letra A:" + iniciais);


        char[] nomemaior = maior.toCharArray();
        for(int i = 0; i < nomemaior.length / 2; i++){
            char aux =nomemaior[i];
            nomemaior[i] = nomemaior[nomemaior.length - 1 - i];
            nomemaior[nomemaior.length - 1 - i] = aux;
        }
         String invertido = new String(nomemaior);
         System.out.println("Nome mais longo invertido: " + invertido);

    }
}
