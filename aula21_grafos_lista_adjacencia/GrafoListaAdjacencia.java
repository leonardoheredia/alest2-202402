package aula21_grafos_lista_adjacencia;

import java.util.ArrayList;

public class GrafoListaAdjacencia {
    public GrafoListaAdjacencia(int numVertices) {
    }
    public boolean existeAresta(int v, int w) {
        //IMPLEMENTAR
        return false;
    }
    public void adicionarAresta(int v, int w) {
        //IMPLEMENTAR
    }
    public void removerAresta(int v, int w) {
        //IMPLEMENTAR
    }
/*
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i).append(": ");
            for (int j : listaAdjacencias[i]) {
                sb.append(j).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    public String toDot() {
        StringBuilder sb = new StringBuilder();
        sb.append("graph G {").append(System.lineSeparator());
        for (int i = 0; i < numVertices; i++) {
            for (int j : listaAdjacencias[i]) {
                if (i < j) {
                    sb.append(i).append(" -- ").append(j).append(";").append(System.lineSeparator());
                }
            }
        }
        sb.append("}").append(System.lineSeparator());
        return sb.toString();
    }

 */
}
