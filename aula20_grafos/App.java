package aula20_grafos;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 3);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(2, 4);
        g.adicionarAresta(3, 4);
        g.imprimirMatriz();
        System.out.println("");
        System.out.println(g.toDot());

        int v = 0;
        ArrayList<Integer> adjacentes = g.verticesAdjacentes(3);

        System.out.println("");
        System.out.print("Adjacentes do " + v + " = ");
        for(int w:adjacentes) System.out.printf(" %d ", w);


    }
}
