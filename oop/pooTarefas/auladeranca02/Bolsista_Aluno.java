package auladeranca02;

public class Bolsista_Aluno extends Aluno_Pessoa {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " e bolsista! Pagamento concluido!");
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
