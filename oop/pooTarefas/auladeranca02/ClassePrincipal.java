package auladeranca02;

public class ClassePrincipal {
    public static void main(String[] args) {
        Visitante_Pessoa v1 = new Visitante_Pessoa();
        v1.setNome("Pedro");
        v1.setIdade(30);
        v1.setSexo("masculino");
        System.out.println(v1.toString());
        Aluno_Pessoa a1 = new Aluno_Pessoa();

        System.out.println();

        a1.setNome("cleitom");
        a1.setIdade(16);
        a1.setSexo("feminino");
        a1.setMatricula("matematica");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        System.out.println();

        Bolsista_Aluno b1 = new Bolsista_Aluno();
        b1.setMatricula("matematica");
        b1.setNome("rapaz");
        b1.setSexo("feminino");
        System.out.println(b1.toString());
        b1.setBolsa(30.5f);
        b1.pagarMensalidade();
    }
}
