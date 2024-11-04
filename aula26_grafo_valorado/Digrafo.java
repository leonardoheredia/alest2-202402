package aula26_grafo_valorado;

import java.util.ArrayList;

public class Digrafo {
    private class Aresta {
        private int v;
        private int w;
        private int peso;
        public Aresta(int v, int w, int peso) {
            this.v = v;
            this.w = w;
            this.peso = peso;
        }
    }
    private ArrayList<Aresta>[] listaAdjacencia;
    private int numVertices;
    public Digrafo(int numVertices) {
        this.numVertices = numVertices;
        listaAdjacencia = new ArrayList[this.numVertices];
        for (int v = 0; v < this.numVertices; v++) {
            listaAdjacencia[v] = new ArrayList<Aresta>();
        }
    }
    public void adicionarAresta(int v, int w, int peso) {
        Aresta e = new Aresta(v, w, peso);
        listaAdjacencia[v].add(e);
    }

    public String toDot() {
        StringBuilder sb = new StringBuilder();
        //HashSet<String> arestas = new HashSet<>(); //nao repetir a aresta
        sb.append("digraph G {").append(System.lineSeparator());
        for (int v = 0; v < numVertices; v++) {
            for (Aresta a : listaAdjacencia[v]) {
                    sb.append(v).append(" -> ").append(a.w).append(" [label=\"").append(a.peso).append("\"];").append(System.lineSeparator());
                }
        }
        sb.append("}").append(System.lineSeparator());
        return sb.toString();
    }
}
