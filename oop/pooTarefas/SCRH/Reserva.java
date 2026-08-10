package SCRH;

public class Reserva {
    private String nomeHospede;
    private String tipoQuarto;
    private String cpf;
    private int numeroDiasDiaria;
    private double valorDiaria;

    //contrutor e sua assinatura
    public Reserva(String nomeHospede, String tipoQuarto, String cpf, int numeroDiasDiaria, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDiasDiaria = numeroDiasDiaria;
        this.valorDiaria = valorDiaria;
        this.cpf = cpf;
    }
    //uma sobregarga feita do construtor para uma hopedagem apenas com nome e tipo de quarto
    public Reserva(String nomeHospede, String tipoQuarto) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
    }
    //calculador do valor da diaria vezes os dias de hospedagem
    public double cauculodiaria() {
        this.setValorDiaria(this.getNumeroDiasDiaria() * getValorDiaria());
        return this.getValorDiaria();
    }
    // metodo de mostrar todos os atributos do objeto
    public String toString() {
        return "Reserva: " +
                "Nome do Hospede: " + this.nomeHospede + '\n' +
                "CPF: " + this.cpf + '\n' +
                "Tipo do Quarto: " + this.tipoQuarto + '\n' +
                "Numero de diarias: " + this.numeroDiasDiaria + '\n'+
                "Valor da Diaria: " + this.valorDiaria + '\n'+
                "Valor total a pagar: " + cauculodiaria();
    }

    //Metodos getters e setters

    public String getNomeHospede() {
        return nomeHospede;
    }
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroDiasDiaria() {
        return numeroDiasDiaria;
    }

    public void setNumeroDiasDiaria(int numeroDiasDiaria) {
        this.numeroDiasDiaria = numeroDiasDiaria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }




}
