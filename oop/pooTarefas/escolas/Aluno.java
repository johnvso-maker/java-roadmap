package escolas;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;
    private String turma;

    public Aluno(String n, int i, double[] notas,  String t) {
        this.nome = n;
        this.idade = i;
        this.notas = notas;
        this.turma = t;
    }
    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i < this.notas.length; i++){
            soma += this.notas[i];
        }
        return soma/this.notas.length;
    }

    public void exibirdados(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("turma: " + this.turma);
        for(int i = 0; i < this.notas.length; i++){
            System.out.println("Notas " + (i + 1) + ": " + this.notas[i]);
        }
        System.out.println("Media do aluno: " + this.calcularMedia());
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
