package aula06_heapsort;

import utils.ArrayUtils;

public class AppHeapSort {
    public static void main(String[] args) {
        int a[] = {19, 80, 25, 15};
        ArrayUtils.imprimir(a);

        HeapSort hs = new HeapSort();
        hs.ordenar(a);
        System.out.println("---");
        ArrayUtils.imprimir(a);

    }
}
