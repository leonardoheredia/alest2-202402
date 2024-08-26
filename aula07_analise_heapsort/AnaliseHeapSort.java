package aula07_analise_heapsort;

import utils.ArrayUtils;

public class AnaliseHeapSort {
    public static void main(String[] args) {
        final int LIMITE_INFERIOR = 100;
        final int LIMITE_SUPERIOR = 1_000;
        final int INCREMENTO = 50;

        int[] meuArray;
        int[] meuArrayHeap;

        System.out.println("n;heap");
        for (int n = LIMITE_INFERIOR; n <= LIMITE_SUPERIOR; n+=INCREMENTO) {
            meuArray = new int[n];
            meuArrayHeap = new int[n];
            ArrayUtils.preencherArrayComValoresInteirosAleatorios(meuArray, 1_000_000, true);

            ArrayUtils.clonarArray(meuArray, meuArrayHeap);

            HeapSort hs = new HeapSort();
            hs.ordenar(meuArrayHeap);

            System.out.println(n + ";" + ";" + hs.getOperacoes());
        }

    }
}
