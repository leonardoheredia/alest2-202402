package aula20_grafos;

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
        matrizAdjacencia[v][w] = true;
        matrizAdjacencia[w][v] = true;
        numArestas++;
    }

    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator()).append("Graph {");
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
    //implementar o exsiteAresta(v, w)

}
