package exercicio01;

public class Livro implements Publicacao{
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.paginas) {
            this.paginas = 0;
            System.out.println("O livro não tem essa quantidade de paginas!");
        } else{
        this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }

    private String titulo;
    private String autor;
    private int paginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int paginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }

    public String detalhes() {
        return " livro {" + "titulo =" + titulo + ",\n autor = " + autor +
                ",\n paginas =" + paginas + ", pagAtual = " + pagAtual +
                ",\n aberto =" + aberto + ", leitor = " + leitor.getNome() + '}';
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String ti) {
        this.titulo = ti;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String au) {
        this.autor = au;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int p) {
        this.paginas = p;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pga) { // pga = paginaAtual
        this.pagAtual = pga;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean ab) {
        this.aberto = ab;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa le) {
        this.leitor = le;
    }



}
