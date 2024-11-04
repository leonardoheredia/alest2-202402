package aula26_grafo_valorado;

import java.util.ArrayList;

public class DigrafoValorado {
    public class Aresta {
        public int v;
        public int w;
        public int peso;
        public Aresta(int v, int w, int peso) {
            this.v = v;
            this.w = w;
            this.peso = peso;
        }
    }

    private ArrayList<Aresta>[] listaAdjacencia;
    private int numVertices;
    private int numArestas;

    public DigrafoValorado(int numVertices) {
        this.numVertices = numVertices;
        listaAdjacencia = new ArrayList[this.numVertices];
        for (int v = 0; v < this.numVertices; v++) {
            listaAdjacencia[v] = new ArrayList<Aresta>();
        }
    }

    public void adicionarAresta(int v, int w, int peso) {
        Aresta e = new Aresta(v, w, peso);
        listaAdjacencia[v].add(e);
        numArestas++;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public ArrayList<DigrafoValorado.Aresta> adjacentes(int v) {
        return listaAdjacencia[v];
    }

    public String toDot() {
        StringBuilder sb = new StringBuilder();
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
