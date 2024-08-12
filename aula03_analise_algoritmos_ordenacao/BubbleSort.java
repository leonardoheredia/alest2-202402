package aula03_analise_algoritmos_ordenacao;

public class BubbleSort {
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public int getOperacoes() {
        return operacoes;
    }

    public long getTempoExecucao() {
        long tempoExecucao = (tempoFim - tempoInicio) / 1_000_000  ;
        return tempoExecucao;
    }

    public void ordenar(int[] arrayInteiros) {
        tempoInicio = System.nanoTime();
        operacoes = 0;
        int tamanho = arrayInteiros.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if(arrayInteiros[j]>arrayInteiros[j + 1]) {
                    int temp = arrayInteiros[j];
                    arrayInteiros[j] = arrayInteiros[j + 1];
                    arrayInteiros[j + 1] = temp;
                    operacoes++;
                }
                operacoes++;
            }
        }
        tempoFim = System.nanoTime();
    }

    public static void main(String[] args) {
        //exemplo do slide da aula
        BubbleSort bs = new BubbleSort();
        int[] arrayParaOrdenar = {82,32,77,45,25};
        bs.ordenar(arrayParaOrdenar);
        for (int i = 0; i < arrayParaOrdenar.length; i++) {
            System.out.printf("%d ", arrayParaOrdenar[i]);
        }
        System.out.printf("%nOperacoes: %d %n", bs.getOperacoes());
        System.out.printf("Tempo de execucao: %d ms %n", bs.getTempoExecucao());
    }
}
