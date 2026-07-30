package aulaHeranca;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
