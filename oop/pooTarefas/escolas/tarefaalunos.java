package escolas;

import java.util.Scanner;

public class tarefaalunos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int qnt;
    int provas;

        System.out.println("bem vindo ao sistema de avaliação de alunos!!");
        System.out.print("Digite a quantidade de alunos que serão avaliados: ");
        qnt = sc.nextInt();
        System.out.print("Quantas provas foram feitas: ");
        provas = sc.nextInt();

        Aluno[] alunos = new Aluno[qnt];
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno " + (i + 1 )+ ": ");
            String nome = sc.next();
            System.out.println("Digite a idade do aluno " + (i + 1)+ ": ");
            int idade = sc.nextInt();
            System.out.println("digite de qual turma esse aluno e: ");
            String turma = sc.next();

            double[] notas = new double[provas];
                 for (int j = 0; j < notas.length; j++) {
                     System.out.println("Digite a nota " + (j + 1) + " do aluno: ");
                     notas[j] = sc.nextDouble();
                 }
            System.out.println();

            alunos[i] = new Aluno(nome, idade, notas, turma);
        }

        System.out.println("Alunos e seus dados: ");
        for (int i = 0; i < alunos.length; i++){
            alunos[i].exibirdados();

            System.out.println();
        }

    }
}
