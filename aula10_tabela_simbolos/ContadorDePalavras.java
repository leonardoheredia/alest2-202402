package aula10_tabela_simbolos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) throws FileNotFoundException {
        String nomeArquivo = "tale.txt";

        TabelaSimbolo<String, Integer> tabela = new TabelaSimbolo<>();
        Scanner leitor = new Scanner(new File(nomeArquivo));

        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            linha = linha.replace(".", "").replace(",", "").replace("-","");
            String[] palavras = linha.split(" ");
            for(String p:palavras) {
                p = p.toLowerCase();
                if(tabela.contem(p)) {
                    int qtd = tabela.buscar(p);
                    tabela.atualizar(p, qtd+1);
                }
                else {
                    tabela.atualizar(p, 1);
                }
            }
        }

        System.out.println(tabela);
    }
}
