package aula10_tabela_simbolos;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        TabelaSimbolo<String, String> carros = new TabelaSimbolo<>();
        carros.atualizar("IBL-9444", "Tempra");
        carros.atualizar("JDO-0025", "Vectra");
        carros.atualizar("IZV-4444", "Tracker");
        System.out.println(carros);

        String c = "IZV-4443";
        System.out.println(carros.buscar(c));
    }
}
