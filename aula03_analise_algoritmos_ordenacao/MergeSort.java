package aula03_analise_algoritmos_ordenacao;

public class MergeSort {
    private int[] numbers;
    private int[] helper;
    private int number;
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public long getTempoExecucao() {
        long tempoExecucao = (tempoFim - tempoInicio) / 1_000  ;
        return tempoExecucao;
    }

    public int getOperacoes() {
        return operacoes;
    }

    public void ordenar(int[] values) {
        tempoInicio = System.nanoTime();

        operacoes = 0;
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];

        mergeSort(0, number - 1);

        tempoFim = System.nanoTime();

    }
    private void mergeSort(int low, int high) {
        operacoes++;
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }
    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
            operacoes++;
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            operacoes++;
            k++;
        }
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
            operacoes++;
        }
    }
}
