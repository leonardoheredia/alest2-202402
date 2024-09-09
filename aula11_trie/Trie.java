package aula11_trie;

import java.util.Arrays;

public class Trie {
    private static final int TAMANHO_ALFABETO = 26;        //apenas letras maiusculas
    //A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
    //00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    //65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90
    private class Nodo {
        private char valor;
        private boolean fimDaPalavra;
        private Nodo[] proximo;

        public Nodo() {
            this.proximo = new Nodo[TAMANHO_ALFABETO];
            this.fimDaPalavra=false;
        }
    }
    private Nodo raiz;
    private int quantidade;

    public Trie() {
        this.quantidade = 0;
        this.raiz = new Nodo();
    }

    public void adicionar(String chave){
        Nodo aux = this.raiz;
        for (int i = 0; i < chave.length(); i++) {
            int posicaoNoArray = chave.charAt(i) - 65;
            if(aux.proximo[posicaoNoArray]==null) {
                Nodo novoNodo = new Nodo();
                novoNodo.valor = chave.charAt(i);
                aux.proximo[posicaoNoArray] = novoNodo;
            }
            aux = aux.proximo[posicaoNoArray];
        }
        aux.fimDaPalavra = true;
    }

    public boolean buscar(String chave) {
        //retorna true ou false se a chave existe na TRIE
        Nodo aux = this.raiz;
        for (int i = 0; i < chave.length(); i++) {
            char c = chave.charAt(i);
            int posicao = c - 65;
            if(aux.proximo[posicao]==null) {
                return false;
            }
            aux = aux.proximo[posicao];
        }
        return aux.fimDaPalavra;
    }

    public void imprimir() {
        imprimirRecursivo(raiz, new StringBuilder());
    }
    private void imprimirRecursivo(Nodo n, StringBuilder palavra) {
        if(n==null) return;

        if(n.fimDaPalavra) {
            System.out.println(palavra.toString());
        }

        for (int i = 0; i < 26; i++) {
            if(n.proximo[i]!=null) {
                palavra.append(n.proximo[i].valor);
                imprimirRecursivo(n.proximo[i], palavra);
                palavra.deleteCharAt(palavra.length()-1);
            }
        }
    }

}