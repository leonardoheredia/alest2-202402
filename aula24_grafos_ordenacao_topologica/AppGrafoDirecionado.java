package aula24_grafos_ordenacao_topologica;

public class AppGrafoDirecionado {
    public static void main(String[] args) {
        Digrafo g = new Digrafo(7);
        g.adicionarAresta(0, 1);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(0, 5);
        g.adicionarAresta(1, 4);
        g.adicionarAresta(3, 2);
        g.adicionarAresta(3, 5);
        g.adicionarAresta(3, 6);
        g.adicionarAresta(5, 2);
        g.adicionarAresta(6, 0);
        g.adicionarAresta(6, 4);

        System.out.println(g.toDot());
    }
}
