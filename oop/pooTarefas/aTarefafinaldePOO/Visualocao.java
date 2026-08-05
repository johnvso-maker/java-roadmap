package aTarefafinaldePOO;

public class Visualocao {
    private Gafanhotos espectador;
    private Video filme;

    public Visualocao(Gafanhotos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotassistido(this.espectador.getTotassistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(this.filme.getAvaliacao() + 5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(this.filme.getAvaliacao() + nota);
    }

    public void avaliar(float porcentagem){
        int tot = 0;
        if ( porcentagem <= 20){
            tot = 3;
        }else if ( porcentagem <= 50){
            tot = 5;
        }else if( porcentagem <= 85){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhotos getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhotos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualocao {" +
                "espectador = " + espectador +
                ", filme = " + filme +
                '}';
    }
}
