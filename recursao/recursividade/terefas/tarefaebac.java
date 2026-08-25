public class tarefaebac {
    public static void main(String[] args) {


        //Chamando o metodo criado
        System.out.println(subirdegraus(5));
    }
    public static int subirdegraus(int degraus){

        //Caso base
        if(degraus == 1){
            return 1;
        //Segunda opção das padrões
        }else if(degraus == 2){
            return 2;
        }
        //Chamada recursiva!!
        return subirdegraus(degraus - 1) + subirdegraus(degraus - 2);
    }
}
