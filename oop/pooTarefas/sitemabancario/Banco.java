package sitemabancario;
public class Banco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    //TESTE
    public void estadoatual(){
        System.out.println("--------------------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("--------------------------------------");
    }
    //METODOS
    public Banco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if  (getTipo().equals("CC") ||  getTipo().equals("Conta corrente") || getTipo().equals("corrente")) {
            this.setSaldo(50);
        }else if (getTipo().equals("CP") || getTipo().equals("Conta poupança") || getTipo().equals("Poupança")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta() {
        if  (this.getSaldo() > 0) {
            System.out.println("ERRO: A conta não pode ser fechada pois ainda existe saldo!!!");
        } else if (this.getSaldo() < 0) {
            System.out.println("ERRO: Existe um debito a ser pago!!!");
        } else  {
            setStatus(false);
            System.out.println("Conta Fechada com sucesso!!!");
        }
    }
    public void depositar(double valor) {
        if (this.getStatus()) {
        this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado comn sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!!!");
        }
    }
    public void sacar(double valor) {
        if (getStatus()) {
            if (getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque com sucesso na conta de " +  this.getDono());
            } else {
                System.out.println("Impossivel sacar, saldo insuficiente na conta de " + this.getDono());
              }
        } else {
            System.out.println("Impossivel sacar, conta inativa!!!");
          }
    }
    public void pagarMensal(String tipo, double saldo) {
        int v = 0;
            if  (this.getTipo().equals("CC")|| this.getTipo().equals("Conta corrente")) {
            v = 12;
            } else if (this.getTipo().equals("CP")|| this.getTipo().equals("Conta poupança")) {
            v = 20;
            }
            if (this.getStatus()) {
                if (this.getSaldo() > v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Pagamento realizado com sucesso por " +  this.getDono());
                } else  {
                    System.out.println("Saldo insuficiente!!!");
                }
            } else  {
                System.out.println("Impossivel pagar, conta inativa!!!");
            }

    }
    //METODOS ESPECIAIS
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


}
