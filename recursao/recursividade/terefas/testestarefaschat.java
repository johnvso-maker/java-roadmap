import java.util.Scanner;

public class testestarefaschat {
    public static void main(String[] args) {

        System.out.println(fibonacci(8));

    }
    public static int tarefa(String txt, int indice){
        if(indice == txt.length()){
            return 0;
        }
        char carac = txt.charAt(indice);
        if(carac == ('a') ||
           carac == ('e') ||
           carac == ('i') ||
           carac == ('o') ||
           carac == ('u')){
              return 1 + tarefa(txt, indice + 1);
        }
        return tarefa(txt, indice + 1);
    }

    public static boolean palavra(String txt, int inicio, int fim){
        if(inicio >= fim)
            return true;
        if(txt.charAt(inicio) != txt.charAt(fim))
            return false;
        return palavra(txt, inicio + 1, fim - 1);
    }
    public static String inverter(String txt){
        if(txt.equals(""))
            return "";
        char novotxt = txt.charAt(txt.length() - 1);
        return novotxt + inverter(txt.substring(0,txt.length() - 1));
    }
    public static int mutiplicacao(int [] numeros, int indice){
        if(indice == numeros.length)
            return 1;
        return numeros[indice] * mutiplicacao(numeros, indice + 1);
    }
    public static int somarpares(int [] numeros, int indice){
        if(indice == numeros.length)
            return 0;
        if(numeros[indice] % 2 == 0)
            return numeros[indice] + somarpares(numeros, indice + 1);
        return somarpares(numeros, indice + 1);
    }
    public static int contadigitos(int num){
        if(num == 0)
            return 1;
        num = num / 10;
        return 1 + contadigitos(num);
    }
    public static int potencia(int num, int exponente){
        if(exponente == 0)
            return 1;
        return num * potencia(num, exponente - 1);
    }
    public static int somadigitos(int num){
        if(num == 0)
            return 0;
        return (num % 10) + somadigitos(num / 10);
    }
    public static int contaocorrencias(String txt, char procurado, int indice){
        if(indice == txt.length())
            return 0;
        if(procurado == txt.charAt(indice))
            return 1 + contaocorrencias(txt, procurado, indice + 1);
        return contaocorrencias(txt, procurado, indice + 1);
    }
    public static int encontrar(int [] numeros, int indice, int encontrado){
        if(indice == numeros.length){
            return encontrado;
        }
        if(encontrado < numeros[indice])
            encontrado = numeros[indice];
        return encontrar(numeros, indice + 1, encontrado);
    }
    public static boolean verificar(int[] numeros, int indice){
        if(indice == numeros.length - 1)
            return true;
        if(numeros[indice] <= numeros[indice + 1])
            return verificar(numeros,indice + 1);
        return false;
    }
    public static int fibonacci(int num){
        if(num == 0)
            return 0;
        if(num == 1)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

}
