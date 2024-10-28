package aula24_grafos_ordenacao_topologica;

import java.util.ArrayList;

public class Digrafo {
    private int numVertices;
    private int numArestas;
    private ArrayList<Integer>[] listaAdjacencias;

    public Digrafo(int numVertices) {
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
            numArestas++;
        }
    }
    public void removerAresta(int v, int w) {
        if(existeAresta(v,w)) {
            listaAdjacencias[v].remove((Integer) w);
            numArestas--;
        }
    }
    public ArrayList<Integer> verticesAdjacentes(int v) {
        ArrayList<Integer> adjacentes = new ArrayList<>();
        for (int w:listaAdjacencias[v]) {
            adjacentes.add(w);
        }
        return adjacentes;
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
        sb.append("digraph G {").append(System.lineSeparator());
        for (int i = 0; i < numVertices; i++) {
            for (int j : listaAdjacencias[i]) {
                    sb.append(i).append(" -> ").append(j).append(";").append(System.lineSeparator());
            }
        }
        sb.append("}").append(System.lineSeparator());
        return sb.toString();
    }

    public int getNumVertices() {
        return numVertices;
    }
    public String ordenacaoTopologica() {
        //IMPLEMENTAR AULA 28/10
        return null;
    }
    private String ordenarTopologicamente() {
        boolean[] visitados = new boolean[this.numVertices];
        ArrayList<Integer> ordemTopologica = new ArrayList<>();
        for (int v = 0; v < numVertices; v++) {
            buscarEmProfundidadeRecursivo(v, visitados, ordemTopologica);
        }
        return ordemTopologica.toString();
    }
    private void buscarEmProfundidadeRecursivo(int v,
                                               boolean[] visitados,
                                               ArrayList<Integer> ordemTopologica) {

    }
}




