package aula11_trie;

public class App {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.adicionar("MARIA");
        t.adicionar("MARIANA");
        t.adicionar("MONGE");
        t.adicionar("MONTANA");
        t.adicionar("MARGARINA");
        t.adicionar("PESADO");
        t.adicionar("PESO");
        t.adicionar("PEDIDO");
        t.palavrasComPrefixo("MAR");
        //t.imprimir();
        //String s = t.toString();
    }
}
