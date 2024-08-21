package aula06_heapsort;

import utils.ArrayUtils;

/*
 * Estrutura de dados HeapMaximo
 * Implementação para fins didáticos
 * Limitada a números inteiros maiores que 0.
 * O valor -1 na chave indica que a posição do heap está vazia
 * */
public class HeapMaximo {
    private static int POSICAO_INVALIDA = -10;
    private int[] chaves;
    private int capacidade; //capacidade do heap, não a sua quantidade de elementos/chaves
    private int tamanho; //quantidade de elementos/chaves do heap
    public HeapMaximo(int capacidade) {
        this.chaves = new int[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
        for (int i = 0; i < capacidade; i++) { chaves[i] = -1; }
    }
    public HeapMaximo(int[] chaves) {
        this.chaves = chaves;
        this.capacidade = this.chaves.length+1;
        this.tamanho = this.chaves.length;
        gerarHeap();
    }
    private int pai(int posicao) {
        int p = (posicao-1)/2;
        if(p<0) p = 0;
        return p;
    }
    private int filhoEsquerda(int posicao) {
        return posicao * 2 + 1;
    }
    private int filhoDireita(int posicao) {
        int p = posicao * 2 + 2;
        if(p>=tamanho) p = POSICAO_INVALIDA;
        return p;

    }
    private void gerarHeap() {
        //um array qualquer recebido no construtor pode nao ser um heap-maximo
        //nesse caso temos que transformar ele em um heap - heapify
        int ultimaPosicao = tamanho - 1;
        int ultimoPai = (ultimaPosicao - 1) / 2;
        for (int i = ultimoPai; i >= 0; i--) {
            ArrayUtils.imprimir(chaves);
            afundar(i);
        }
    }
    public int[] getChaves() {
        return chaves;
    }
    public int getTamanho() { return tamanho;}
    public int getCapacidade() { return capacidade;}
    public void inserir(int chave) {
        //Inserir sempre no final

        //verificar se ainda tem espcaço
        if(tamanho+1>capacidade) {
            System.out.println("lotou");
            aumentarCapacidade();
        }
        System.out.println("Inserindo " + chave);
        int ultimaPosicaoPreenchida = this.tamanho;
        this.chaves[ultimaPosicaoPreenchida] = chave;
        this.tamanho++;
        nadarSubindo(ultimaPosicaoPreenchida);
    }
    public void trocar(int posicaoA, int posicaoB) {
        //System.out.printf("   Trocando %d por %d.", chaves[posicaoA], chaves[posicaoB]);
        int temp = chaves[posicaoA];
        chaves[posicaoA] = chaves[posicaoB];
        chaves[posicaoB] = temp;
    }
    public int removerMaximo() { //remove o maior elemento, a raiz
        /*
         * Trocar a chave do pai com o último elemento do heap, ou seja o último elemento vira a raiz e a raiz anterior eh removida do heap
         * Isso pode deixar o heap inconsistente, com uma raiz menor que os filhos
         * Entao o algoritmo deve executar a operacao "afundar" até que o heap fique consistente
         * */

        if(tamanho==0) return -1;
        //troca
        int chaveMaxima = chaves[0];
        trocar(0, tamanho-1);

        //remove a antiga raiz
        this.chaves[this.tamanho-1] = -1;
        this.tamanho = this.tamanho - 1;

        //System.out.println("Removido " + chaveMaxima);
        //ArrayUtils.imprimir(getChaves());

        //inicia o ajuste afundando a nova raiz ate que o heap seja restaurado
        afundar(0);
        return chaveMaxima;
    }

    private void afundar(int posicao) {
        int maior = posicao;
        int fe = 2*posicao + 1;
        int fd = 2*posicao + 2;
        if(fe < tamanho && chaves[fe] > chaves[maior]) maior = fe;
        if(fd < tamanho && chaves[fd] > chaves[maior]) maior = fd;
        if(maior!=posicao) {
            int temp = chaves[posicao];
            chaves[posicao] = chaves[maior];
            chaves[maior] = temp;
            afundar(maior);
        }
    }
    private int maior(int posicao1, int posicao2) {
        if(posicao1== POSICAO_INVALIDA) return posicao2;
        if(posicao2== POSICAO_INVALIDA) return posicao1;
        if(chaves[posicao1]>=chaves[posicao2]) return posicao1;
        else return posicao2;
    }
    private void nadarSubindo(int posicao) {
        int pai = (posicao-1)/2;
        if(chaves[posicao]>chaves[pai]) {
            int temp = chaves[posicao];
            chaves[posicao] = chaves[pai];
            chaves[pai] = temp;
            nadarSubindo(pai);
        }
    }
    private void aumentarCapacidade() {
        capacidade = capacidade * 2;
        int[] novoArray = new int[capacidade];
        for (int i = 0; i < capacidade; i++) { novoArray[i] = -1; } //inicializa com -1
        for (int i = 0; i < tamanho; i++) {novoArray[i] = chaves[i];} //copia valores anteriores
        chaves = novoArray;
    }

    public void imprimir() {
        ArrayUtils.imprimir(chaves);
    }
    public boolean estaVazio() {
        return tamanho == 0;
    }
    public int tamanho() {
        return tamanho;
    }

}
