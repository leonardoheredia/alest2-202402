package aula22_grafos_caminhamento;

public class App {
    public static void main(String[] args) {
        GrafoListaAdjacencia g = new GrafoListaAdjacencia(5);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(0,3);
        g.adicionarAresta(1,2);
        g.adicionarAresta(1,3);
        g.adicionarAresta(1, 4);

    }
}
