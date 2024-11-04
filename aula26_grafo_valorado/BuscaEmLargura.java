package aula26_grafo_valorado;

import java.util.LinkedList;
import java.util.Queue;

public class BuscaEmLargura {
    private DigrafoValorado grafo;
    private boolean[] visitados;
    private int[] anteriores;
    private int[] custo;

    public BuscaEmLargura(DigrafoValorado grafo, int origem) {
        this.grafo = grafo;
        visitados = new boolean[grafo.getNumVertices()];
        anteriores = new int[grafo.getNumVertices()];
        custo = new int[grafo.getNumVertices()];
        for (int v = 0; v < anteriores.length; v++) {
            anteriores[v] = -1;
        }

        Queue<Integer> fila = new LinkedList<>();
        fila.add(origem);
        while (!fila.isEmpty()) {
            int v = fila.poll();
            visitados[v] = true;
            for(DigrafoValorado.Aresta aresta: grafo.adjacentes(v)) {
                if(!visitados[aresta.w]) {
                    fila.add(aresta.w);
                    anteriores[aresta.w] = v;
                    custo[aresta.w] = custo[v] + aresta.peso;
                    visitados[aresta.w] = true;
                }
            }
        }

        System.out.println("v  visitados  anteriores");
        for (int v = 0; v < grafo.getNumVertices(); v++) {
            System.out.println(v + "  " + visitados[v] + "  " + anteriores[v] + "  " + custo[v]);
        }
    }
}
