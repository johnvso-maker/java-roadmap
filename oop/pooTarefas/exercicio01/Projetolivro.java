package exercicio01;



public class Projetolivro {
    public static void main(String[] args) {
        Pessoa[] p =  new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Maria", 22, "Feminino");
        p[1] = new Pessoa("Meretriz", 22, "Feminino");

        l[0] = new Livro ("cu", "cleitinho do grau", 122, p[0]);
        l[1] = new Livro("cuzao", "rapariga do cuzao", 300, p[1]);
        l[2] = new Livro("mamaq", "vitinho do grau", 152, p[1]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
