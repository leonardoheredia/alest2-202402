package aula26_grafo_valorado;

public class AppDigrafo {
    public static void main(String[] args) {
        Digrafo dg = new Digrafo(4);
        dg.adicionarAresta(0,1, 99);
        dg.adicionarAresta(0,2, 140);
        dg.adicionarAresta(1,3, 400);
        System.out.println(dg.toDot());
    }
}
