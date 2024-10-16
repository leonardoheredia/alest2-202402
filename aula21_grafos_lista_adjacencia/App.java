package aula21_grafos_lista_adjacencia;

public class App {
    public static void main(String[] args) {
        GrafoListaAdjacencia g = new GrafoListaAdjacencia(5);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0,2);
        g.adicionarAresta(2, 3);
        System.out.println(g);
        System.out.println("----");
        //System.out.println(g.toDot());
    }
}
