package aula22_grafos_caminhamento;

import java.util.ArrayList;

public class BuscaEmProfundidade {
    private GrafoListaAdjacencia grafo;
    private int origem;
    private int[] anteriores;
    private boolean[] visitados;

    public BuscaEmProfundidade(GrafoListaAdjacencia grafo, int origem) {
        this.grafo = grafo;
        this.origem = origem;
        anteriores = new int[this.grafo.getNumVertices()];
        visitados = new boolean[this.grafo.getNumVertices()];
        for(int i = 0; i < anteriores.length; i++) anteriores[i] = -1;
        for(int i = 0; i < visitados.length; i++) visitados[i] = false;

        buscarProfundidadeRecursivo(origem);

        //imprimir
        for (int i = 0; i < this.grafo.getNumVertices(); i++) {
            System.out.println(i + " " + visitados[i] + " " + anteriores[i]);
        }
    }

    private void buscarProfundidadeRecursivo(int v) {
        visitados[v] = true;
        for(int w:grafo.verticesAdjacentes(v)) {
            if(!visitados[w]) {
                anteriores[w] = v;
                buscarProfundidadeRecursivo(w);
            }
        }
    }

    public String caminhoPara(int destino) {
        //IMPLEMENTAR
        //RETORNA O CAMINHO DO VERTICE ORIGEM PARA O DESTINO
        ArrayList<Integer> caminho = new ArrayList<>();
        int v = destino;
        String r = "";
        while(v!=origem) {
            caminho.add(0, v);
            v = anteriores[v];
        }
        caminho.add(0, origem);
        for(int i:caminho) r = r + " " + i;
        return r;
    }
    public String resultado() {
        //IMPLEMENTAR
        //RETORNAR UM STRING CONTENDO O RESULTADO DO CAMINHAMENTO
        //CONFORME VISTO EM AULA
        // V | VISITADO | ANTERIOR |
        // 0 |  TRUE    |    -1    |
        // 1 |  TRUE    |    0     |
        // 2 |  TRUE    |    0     |
        // 3 |  TRUE    |    1     |
        // 4 |  FALSE   |   -1     |
        return null;
    }

}
