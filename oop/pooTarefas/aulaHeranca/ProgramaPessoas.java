package aulaHeranca;

public class ProgramaPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Ana");
        p4.setNome("Joao");

        p1.setIdade(12);
        p2.setIdade(23);
        p3.setIdade(32);
        p4.setIdade(90);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("F");
        p4.setSexo("M");

        p2.setCurso("Computador");
        p3.setEspeciade("Matematica");
        p4.setSetor("estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
