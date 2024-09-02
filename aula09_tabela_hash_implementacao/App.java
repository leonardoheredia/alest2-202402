package aula09_tabela_hash_implementacao;

public class App {
    public static void main(String[] args) {
        //teste usando encadeamento separado
        TabelaHashEncadeamentoSeparado t1 = new TabelaHashEncadeamentoSeparado();
        t1.adicionar(499, "leonardo");
        t1.adicionar(567, "joao");
        t1.adicionar(400, "maria");

        System.out.println(t1);
    }
}
