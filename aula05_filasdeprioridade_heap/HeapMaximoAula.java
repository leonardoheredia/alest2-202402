package aula05_filasdeprioridade_heap;

import utils.ArrayUtils;

public class HeapMaximoAula {
    private int tamanho;
    private int capacidade = 10;
    private int[] chaves;

    public HeapMaximoAula() {
        chaves = new int[capacidade];
        tamanho = 0;
        for (int i = 0; i < capacidade; i++) {
            chaves[i] = -1;
        }
    }

    public void inserir(int chave) {
        chaves[tamanho] = chave;
        //pai do novo elemento
        int posicao = tamanho;
        int pai = (posicao-1)/2;

        while (chave > chaves[pai]) {
            int temp = chaves[pai];
            chaves[pai] = chave;
            chaves[posicao] = temp;
            posicao = pai;
            pai = (posicao-1)/2;
        }

        tamanho++;
    }

    public int remover() {
        int temp = chaves[0];
        chaves[0] = chaves[tamanho-1];
        chaves[tamanho-1] = -1;
        afundar(0);
        return temp;
    }
    public void afundar(int posicao) {
        int pai = (posicao - 1) /2;
        if(chaves[posicao] > chaves[pai]) {
            int temp = chaves[pai];
            chaves[pai] = chaves[posicao];
            chaves[posicao] = temp;
            afundar(pai);
        }
    }
    public void imprimir() {
        ArrayUtils.imprimir(chaves);
    }
}

