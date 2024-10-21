package aula21_grafos_lista_adjacencia;

import java.util.ArrayList;

public class GrafoListaAdjacencia {
    private int numVertices;
    private int numArestas;
    private ArrayList<Integer>[] listaAdjacencias;

    public GrafoListaAdjacencia(int numVertices) {
        this.numVertices = numVertices;
        this.numArestas = 0;
        listaAdjacencias = new ArrayList[this.numVertices];
        for (int v = 0; v < this.numVertices; v++) {
            listaAdjacencias[v] = new ArrayList<>();
        }

    }
    public boolean existeAresta(int v, int w) {
        if(listaAdjacencias[v].contains(w) && listaAdjacencias[w].contains(v)) return true;
        return false;
    }
    public void adicionarAresta(int v, int w) {
        if(!existeAresta(v,w)) {
            listaAdjacencias[v].add(w);
            listaAdjacencias[w].add(v);
            numArestas++;
        }
    }
    public void removerAresta(int v, int w) {
        if(existeAresta(v,w)) {
            listaAdjacencias[v].remove((Integer) w);
            listaAdjacencias[w].remove((Integer) v);
            numArestas--;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i).append(": ");
            for (int j : listaAdjacencias[i]) {
                sb.append(j).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("graph G {").append(System.lineSeparator());
        for (int i = 0; i < numVertices; i++) {
            for (int j : listaAdjacencias[i]) {
                if (i < j) {
                    sb.append(i).append(" -- ").append(j).append(";").append(System.lineSeparator());
                }
            }
        }
        sb.append("}").append(System.lineSeparator());
        return sb.toString();
    }


}





