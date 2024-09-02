package aula09_tabela_hash_implementacao;

public class TabelaHashEncadeamentoSeparado {
    private final int CAPACIDADE_INICIAL = 5;
    private final double FATOR_DE_CARGA = 0.7;
    private int capacidade;
    private int tamanho;
    private Nodo[] tabela;

    public TabelaHashEncadeamentoSeparado() {
        capacidade = CAPACIDADE_INICIAL;
        tabela = new Nodo[capacidade];
    }

    private int funcaoHash(int chave) {
        return chave % capacidade;
    }

    public void adicionar(int chave, String valor) {
        //IMPLEMENTAR SOLUCAO PARA QUANDO O TAMANHO EXCEDER O FATOR DE CARGA * CAPACIDADE
        if(tamanho>=capacidade*FATOR_DE_CARGA) {
            duplicarTabelaHash();
        }

        Nodo n = new Nodo(chave, valor);
        int posicao = funcaoHash(n.getChave());

        if(tabela[posicao]==null) {
            tabela[posicao] = n;
        }
        else {
            n.setProximo(tabela[posicao]);
            tabela[posicao] = n;
        }
        tamanho++;
    }

    private void duplicarTabelaHash() {
        //IMPLEMENTAR
    }
    public String buscar(int chave) {
        //IMPLEMENTAR
        return null;
    }
    public void remover(int chave) {
        //IMPLEMENTAR
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacidade; i++) {
            Nodo n = tabela[i];
            sb.append(System.lineSeparator()).append(i);
            while(n!=null) {
                sb.append(" ").append(n);
                n = n.getProximo();
            }
        }
        return sb.toString();
    }
}


