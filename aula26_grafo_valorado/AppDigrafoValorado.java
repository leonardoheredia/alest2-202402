package aula26_grafo_valorado;

import java.util.ArrayList;

public class AppDigrafoValorado {
    public static void main(String[] args) {
        DigrafoValorado g = new DigrafoValorado(6);
        g.adicionarAresta(0,1, 10);
        g.adicionarAresta(0,2,10);
        g.adicionarAresta(1,2,10);
        g.adicionarAresta(1,3,10);
        g.adicionarAresta(1,4, 10);
        g.adicionarAresta(3,4, 10);
        g.adicionarAresta(3,5, 10);
        g.adicionarAresta(4,5, 10);

        System.out.println(g.toDot());

        BuscaEmLargura busca = new BuscaEmLargura(g, 0);

    }
}
