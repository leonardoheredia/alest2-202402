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

}
