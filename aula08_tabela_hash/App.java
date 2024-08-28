package aula08_tabela_hash;

public class App {
    public static void main(String[] args) {
        TabelaHashEndAberto tabelaHash = new TabelaHashEndAberto();
        tabelaHash.adicionar(17, "mariana");
        tabelaHash.adicionar(19, "leonardo");
        tabelaHash.adicionar(18, "tales");
        tabelaHash.adicionar(27,"francisco");
        tabelaHash.adicionar(21, "joao");
        System.out.println(tabelaHash);

    }
}
