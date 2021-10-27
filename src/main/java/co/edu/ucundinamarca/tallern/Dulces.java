package co.edu.ucundinamarca.tallern;

/**
 *
 * @author michelle
 */

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());
    public static ArrayList<String> listaDulces = new ArrayList<String>();

    public static void añadirElementos() {
        listaDulces.add("ChocoRamo");
        listaDulces.add("Submarino");
        listaDulces.add("Trident");
        listaDulces.add("Festival");
        listaDulces.add("Splot");
        listaDulces.add("Bianchi");
        listaDulces.add("Jet");
        listaDulces.add("Jumbo");
        listaDulces.add("Nucita");
        listaDulces.add("Super coco");
    }

    public static int imprimirIterando() {

        log.info("imprimiendo con iterador");
        for (int i = 0; i < listaDulces.size(); i++) {
            log.info(listaDulces.get(i));
            log.info(i + 1);

        }
        return listaDulces.size();

    }

    public static boolean imprimirSinIterador() {
        boolean encontrado = false;

        log.info("imprimiendo sin iterador");
        for (String lista : listaDulces) {
            log.info(lista);
        }
        if (listaDulces.contains("ChocoRamo")) {
            encontrado = true;
            log.info("Encontrado");
        }
        return encontrado;

    }

    public static void main(String[] args) {

        añadirElementos();
        imprimirIterando();
        imprimirSinIterador();

    }
}
