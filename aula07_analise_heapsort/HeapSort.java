package aula07_analise_heapsort;

import utils.ArrayUtils;

public class HeapSort {
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public long getOperacoes() {
        return operacoes;
    }
    public long getTempoExecucao() {
        return 0;
    }
    public void ordenar(int[] arrayInteiros) {
        //ordenar
    }

    private void gerarHeap(int[] a) {
        //percorrer apenas os pais
        int p = (a.length-1-1)/2;
        while(p>=0) {

        }
    }
    private void afundar(int[] a, int k) {
        int maior = k;
        int fe = 2*k + 1;
        int fd = 2*k + 2;

        if(fe < a.length && a[fe]>a[maior]) maior = fe;
        if(fd < a.length && a[fd]>a[maior]) maior = fd;

        if(maior!=k) { //filho maior que o pai
            int temp = a[maior];
            a[maior] = a[k];
            a[k] = temp;
            ArrayUtils.imprimir(a);
            afundar(a, maior);
        }
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40, 13, 24, 99, 17};
        ArrayUtils.imprimir(a);
        HeapSort hs = new HeapSort();
        hs.gerarHeap(a);

    }
}
