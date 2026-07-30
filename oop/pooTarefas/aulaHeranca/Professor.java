package aulaHeranca;

public class Professor extends Pessoa{

    private String especiade;
    private float salario;

    public void receberAumento(float aumento){
        setSalario(getSalario() + aumento);
    }

    public String getEspeciade() {
        return especiade;
    }
    public void setEspeciade(String especiade) {
        this.especiade = especiade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
