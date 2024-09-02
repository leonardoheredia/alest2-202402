package aula08_tabela_hash;

public class App {
    public static void main(String[] args) {
        TabelaHashEndAberto tabelaHash = new TabelaHashEndAberto();
        tabelaHash.adicionar(22280054, "carolina");
        tabelaHash.adicionar(22207004, "gabriel");
        tabelaHash.adicionar(22204078, "eduarda");
        tabelaHash.adicionar(22280199, "arthur");
        tabelaHash.adicionar(23201072, "samuel");
        tabelaHash.adicionar(22204047, "larissa");
        System.out.println(tabelaHash);


    }
}
