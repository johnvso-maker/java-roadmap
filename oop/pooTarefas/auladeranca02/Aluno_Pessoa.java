package auladeranca02;

public class Aluno_Pessoa extends Pessoa{
    private String matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso");
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}


