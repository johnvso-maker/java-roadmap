public class chat1 {
    public static void main(String[] args) {
        int[] numeros = {4,2,8,1,9,3,10,15};

        int resultado = maiornumero(numeros, 0);

        System.out.println(resultado);

        }
    public static void contagemregressiva(int n){
        System.out.println(n);

        if(n == 1){
            System.out.println("Fim");
            return;
        }
        contagemregressiva(n - 1);

    }
    public static int soma(int n){
        /*  PODERIA SER MENOR:

        if (n==1){
          return 1;
        }

        return n + soma(n - 1);
     }
        */
        int resultado = n;
        if (n == 1){
            return resultado;
        }
        resultado = resultado + soma(n - 1);
        return resultado;
    }
    public static int potencia(int base, int espoente){

        if(espoente == 1){
            return base;
        } else if (espoente == 0){
            return 1;
        }
        return base*potencia(base, espoente-1);
    }


    public static int contarcaracteres(String txt){

        if(txt.equals("")){
            return 0;
        }

        String novotxt = txt.substring(0, txt.length() - 1);
        int resultado = 1;

        return resultado + contarcaracteres(novotxt);
    }


    public static String inverter(String txt){

        String novotxt;

        if(txt.equals("")){
            return "";
        }
        String invertido = txt.substring(txt.length() - 1);
        novotxt = txt.substring(0, txt.length() - 1);
        return invertido + inverter(novotxt);
    }


    public static int contatrocorrencias(String txt,char caractere){
        if(txt.equals("")){
            return 0;
        }

        String novotxt = txt.substring(0,  txt.length() - 1);

        if(txt.charAt(txt.length() - 1) == caractere){
            return 1 + contatrocorrencias(novotxt, caractere);
        }
        return contatrocorrencias(novotxt, caractere);
    }

    public static int maiornumero(int[] numeros, int indice){
        if(indice == numeros.length){
            return 0;
        }
        int maiorrestante = maiornumero(numeros, indice + 1);
        if(numeros[indice] > maiorrestante){
            maiorrestante = numeros[indice];
            return maiorrestante;
        }
        return  maiornumero(numeros, indice + 1);
    }



}
