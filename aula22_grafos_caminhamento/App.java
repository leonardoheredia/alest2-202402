package aula22_grafos_caminhamento;

public class App {
    public static void main(String[] args) {
        GrafoListaAdjacencia g = new GrafoListaAdjacencia(6);
        g.adicionarAresta(0, 2);
        g.adicionarAresta(1, 2);
        g.adicionarAresta(1, 4);
        g.adicionarAresta(2, 3);
        g.adicionarAresta(3, 4);

        BuscaEmProfundidade b = new BuscaEmProfundidade(g, 0);
        System.out.println(b.caminhoPara(4));


    }
}
