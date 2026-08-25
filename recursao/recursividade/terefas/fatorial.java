public class fatorial {

    public fatorial(int n){
        int resultado = fatorialequacao(n);
        System.out.println("Resultado: "+resultado);
    }


    private int fatorialequacao(int n) {
        if (n == 0) {
            return 1;
        }return n * fatorialequacao(n-1);
    }
}
