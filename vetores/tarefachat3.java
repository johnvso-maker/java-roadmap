import java.util.Scanner;

public class tarefachat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos que serão cadastrados: ");
        int quantidade = sc.nextInt();

        String[] produtos = new String[quantidade];
        double[] preco = new double[quantidade];
        sc.nextLine();


        for(int i = 0; i < produtos.length; i++){
            System.out.println("Digite o nome do produto: ");
                produtos[i] = sc.nextLine();
            System.out.println("Digte o preço desse produto: ");
                preco[i] = sc.nextDouble();
            sc.nextLine();
        }
        for(int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i] + " - R$" + preco[i]);
        }

        String pmc = produtos[0]; // pmc = Produto Mais Caro
        double maiscaro = preco[0]; // guardar o preco de maior valor
        for(int i = 0; i < produtos.length; i++){
            if(preco[i] > maiscaro){
                maiscaro = preco[i];
                pmc = produtos[i];
            }
        }
        System.out.println("Produto mais caro: " + pmc + " - R$" + maiscaro);

        String pmb = produtos[0]; // pmb = Produto Mais Barato
        double maisbarato = preco[0]; // Guardar o preco de menor valor
        for(int i = 0; i < produtos.length; i++){
            if(maisbarato > preco[i]){
                maisbarato = preco[i];
                pmb = produtos[i];
            }
        }
        System.out.println("Produto mais barato: " + pmb + " - R$" + maisbarato);

        double media = 0;  // Guardar o valor da media
        for(int i = 0; i < produtos.length; i++){
            media = preco[i] + media;
        }
        media = media / produtos.length;

        System.out.println("Média dos preços: R$" + media);

        int acd = 0; // adc = A Cima da Media
        for (int i = 0; i < produtos.length; i++){
            if(preco[i] > media){
                acd++;
            }
        }
        System.out.println("Produtos que tem o preço acima da media: " + acd);

        String PNML = produtos[0]; // PNML = Produto com Nome Mais Longo
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i].length() > PNML.length()){
                PNML = produtos[i];
            }
        }
        System.out.println("O produto com o maior nome: " + PNML);

        sc.close();
    }
}
