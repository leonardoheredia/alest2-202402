package aula20_grafos;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(5);
        g.adicionarAresta(0, 4);
        g.adicionarAresta(0, 3);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(0, 4);
        g.imprimirMatriz();
        System.out.println("");
        System.out.println(g.toDot());

        g.removerAresta(0, 4);
        System.out.println("");
        System.out.println(g.toDot());

    }
}
