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
        boolean atualizou = false;
        for (Nodo n = this.inicio; n!=null; n = n.proximo) {
            if(n.chave.equals(chave)) {
                //ACHOU a chave que esta sendo atualizada!
                n.valor = valor;
                atualizou = true;
            }
        }
        if(!atualizou) {
            Nodo n = new Nodo(chave, valor);
            n.proximo = inicio;
            inicio = n;
            tamanho++;
        }
    }

    public Valor buscar(Chave chave) {
        //recebe uma chave e devolve o valor
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



