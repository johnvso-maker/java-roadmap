package aTarefafinaldePOO;

public class projetoyoutube {
    public static void main(String[] args) {
        Video[] v = new Video[2];
        v[0] = new Video("FUI amarrado????");
        v[1] = new Video("FUI solto????");

        System.out.println(v[0].toString());
        System.out.println();
        Gafanhotos[] g = new Gafanhotos[2];

        g[0] = new Gafanhotos("juju", 22, "f", "piru");
        g[1] = new Gafanhotos("jaja", 23,"M", "jaja");

        System.out.println(g[0].toString());

        System.out.println();

        Visualocao[] vis = new Visualocao[5];
        vis[0] = new Visualocao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());


        System.out.println();
        vis[1] = new Visualocao(g[0], v[1]);
        vis[1].avaliar(89.0f);
        System.out.println(vis[1].toString());

        System.out.println();

    }
}
