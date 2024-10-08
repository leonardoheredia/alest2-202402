package aula20_grafos;

import java.util.ArrayList;

public class Grafo {
    private int numVertices;
    private int numArestas;
    private boolean[][] matrizAdjacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        numArestas = 0;
        matrizAdjacencia = new boolean[this.numVertices][this.numVertices];
    }
    public void adicionarAresta(int v, int w) {
        if(!existeAresta(v, w)) {
            matrizAdjacencia[v][w] = true;
            matrizAdjacencia[w][v] = true;
            numArestas++;
        }
    }
    public void removerAresta(int v, int w) {
        if(existeAresta(v, w)) {
            matrizAdjacencia[v][w] = false;
            matrizAdjacencia[w][v] = false;
            numArestas--;
        };
    }
    public boolean existeAresta(int v, int w) {
        return matrizAdjacencia[v][w];
    }

    public ArrayList<Integer> verticesAdjacentes(int v) {
        ArrayList<Integer> adjacentes = new ArrayList<>();
        for (int w = 0; w < numVertices; w++) {
            if(matrizAdjacencia[v][w]) {
                adjacentes.add(w);
            }
        }
        return adjacentes;
    }

    public void buscarEmProfundidade(int origem) {
        boolean[] visitados = new boolean[numVertices];
        System.out.println("");
        buscarEmProfundidadeRecursivo(origem, visitados);
    }
    private void buscarEmProfundidadeRecursivo(int vertice, boolean[] visitados) {
        visitados[vertice] = true;
        System.out.println("Marquei o " + vertice + " como vistado");
        for(int w:verticesAdjacentes(vertice)) {
            if(!visitados[w]) {
                System.out.println("Vou visitar o " + w);
                buscarEmProfundidadeRecursivo(w, visitados);
            }
        }
    }

    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator()).append("Graph {");
        for (int v = 0; v < numVertices; v++) {
            sb.append(System.lineSeparator()).append(v);
        }
        for (int v = 0; v < numVertices; v++) {
            for (int w = v; w < numVertices; w++) {
                if(matrizAdjacencia[v][w]) {
                    sb.append(System.lineSeparator());
                    sb.append(v).append("--").append(w);
                }
            }
        }
        sb.append(System.lineSeparator()).append("}");
        return sb.toString();
    }
    public void imprimirMatriz() {
        System.out.println("");
        System.out.printf("  ");
        for (int i = 0; i < matrizAdjacencia.length; i++) {
            System.out.printf("  %d ", i);
        }
        for (int v = 0; v < matrizAdjacencia.length; v++) {
            System.out.printf("%n %d", v);
            for (int w = 0; w < matrizAdjacencia[0].length; w++) {
                char c = 'F';
                if(matrizAdjacencia[v][w]) c = 'T';
                System.out.printf("  %c ", c);
            }
        }
    }

    //CORRIGIR O toDot para imprimir vertices isolados
    //implementar o removerAresta(v, w)
    //implementar o existeAresta(v, w)

}
