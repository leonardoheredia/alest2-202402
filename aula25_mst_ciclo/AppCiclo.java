package aula25_mst_ciclo;

public class AppCiclo {
    public static void main(String[] args) {
        GrafoListaAdjacencia g = new GrafoListaAdjacencia(6);
        g.adicionarAresta(0,1);
        g.adicionarAresta(0,3);
        g.adicionarAresta(1,2);
        g.adicionarAresta(3,4);
        g.adicionarAresta(3,5);
        g.adicionarAresta(4,5);
        g.temCiclo();
    }
}
