package aula10_tabela_simbolos;

public class TabelaSimbolo<Chave, Valor> {
    class Nodo<Chave, Valor> {
        Chave chave;
        Valor valor;
        Nodo proximo;

        public Nodo(Chave chave, Valor valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }
    private Nodo inicio;
    private int tamanho;

    public TabelaSimbolo() {
        this.tamanho = 0;
    }
    public void atualizar(Chave chave, Valor valor) {
        //atualizar("IBL-9444", "OPALA")
        Nodo n = buscarNodo(chave);
        if(n!=null) {
            n.valor = valor;
        }
        else {
            n = new Nodo(chave, valor);
            n.proximo = inicio;
            inicio = n;
            tamanho++;
        }
    }

    public Valor buscar(Chave chave) {
        Nodo n = buscarNodo(chave);
        if(n!=null) return (Valor) n.valor;
        return null;
    }

    private Nodo buscarNodo(Chave chave) {
        for (Nodo n = inicio; n!=null; n = n.proximo) {
            if(n.chave.equals(chave)) return n;
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Nodo n = inicio; n!=null; n = n.proximo) {
            sb.append(n.chave).append(" ").append(n.valor).append(System.lineSeparator());
        }
        return sb.toString();
    }
}



