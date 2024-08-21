package aula06_heapsort;

public class HeapSort {
    public void ordenar(int[] a) {
        //transforma o array a em um Heap Maximo
        HeapMaximo heap = new HeapMaximo(a);
        for (int i = 0; i < a.length; i++) {
            a[a.length - i - 1] = heap.removerMaximo();
        }

    }
}
