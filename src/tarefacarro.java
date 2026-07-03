import carro.Carros;

import java.util.Scanner;


public class tarefacarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd;
        do{
            System.out.println("Digite um numero de carros que deseja criar: ");
            qtd = sc.nextInt();
            if (qtd <= 0 || qtd > 50) {
                System.out.println("Digite um numero valido entre 0 e 50!");
            }
        }while(qtd <= 0 || qtd > 50);
        sc.nextLine();

        Carros[] carros = new Carros[qtd];
        for (int i = 0; i < carros.length; i++) {
            Carros carro = new Carros();
            System.out.println("Digite o nome do carro: " + (i + 1));
            carro.nome =  sc.nextLine();

            System.out.println("Digite o marca do carro: ");
            carro.marca = sc.nextLine();

            System.out.println("Digite o preço do carro: ");
            carro.preco = sc.nextDouble();

            carros[i] = carro;
            System.out.println("Carro criado com sucesso!");
            System.out.println();
            sc.nextLine();
        }

        double soma = 0;
        for (int i = 0; i < carros.length; i++) {
            soma = soma + carros[i].preco;
        }

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro numero " + i+ ":\n" + " Nome: "+ carros[i].nome
            + "\n" + " Marca: " +carros[i].marca +"\n" + " Preço: "+ carros[i].preco);
        }
        System.out.println("A soma de todos os carros e: R$" + soma);
        System.out.println();




    }
}
