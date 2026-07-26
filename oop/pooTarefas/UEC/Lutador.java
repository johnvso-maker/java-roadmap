package UEC;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private String sexo;

    public Lutador(String no,String na ,String se,int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.sexo = se;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public void apresentar(){
        System.out.println("------------------------ EUC --------------------------");
        System.out.println("IIIIIIIIIIIIIIIIS TIMEEEEEEEEE, APRESENTANDOOOOO " + getNome());
        System.out.println("LUTADOR: " + getNome());
        System.out.println("IDADE: " + getIdade());
        System.out.println("ORIGEM: " + getNacionalidade());
        System.out.println("SEXO " + getSexo());
        System.out.println("ALTURA: " + getAltura());
        System.out.println("PESO: " + getPeso());
        System.out.println("CATEGORIA: " + getCategoria());
        System.out.println("VITORIAS: " + getVitorias());
        System.out.println("DERROTA: " + getDerrotas());
        System.out.println("EMPATES: " + getEmpates());

    }
    public void status(){
        System.out.println("------------ LUTADOR ------------");
        System.out.println(getNome());
        System.out.println("E um peso: " + getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido, muito leve";
        }else if  (this.peso < 70.3) {
            this.categoria = "leve";
        }else if (this.peso < 90.3) {
            this.categoria = "medio";
        }else if (this.peso < 120.3) {
            this.categoria = "pesado";
        }else {
            System.out.println("peso invalido!!");
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }
    public  String getSexo() {
        return sexo;
    }
    public void setSexo(String se) {
        this.sexo = se;
    }
}
