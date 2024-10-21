package aula22_grafos_caminhamento;

import java.util.ArrayList;

public class BuscaEmProfundidade {
    private GrafoListaAdjacencia grafo;
    private int origem;
    private int[] anteriores;
    private boolean[] visitados;

    public BuscaEmProfundidade(int origem) {
        //IMPLEMENTAR
    }
    public String caminhoPara(int destino) {
        //IMPLEMENTAR
        //RETORNA O CAMINHO DO VERTICE ORIGEM PARA O DESTINO
        return null;
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
