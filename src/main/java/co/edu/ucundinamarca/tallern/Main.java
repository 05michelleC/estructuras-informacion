package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author michelle
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");

        Scanner sc = new Scanner(System.in);
        int numero;
        List<Integer> numeros = new ArrayList();

        System.out.println("pro favor introducir nujmeros: ");
        System.out.println("Numeros: ");
        numero = sc.nextInt();
        numeros.add(numero);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print("La lista de numeros es:" + numeros.get(i));
        }

        System.out.println();
        int mayor = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
            System.out.println("Mayor: " + mayor);

            for (int k = 0; k < numeros.size(); k++) {

                int c = 1;

                for (int l = k + 1; l < numeros.size(); l++) {

                    if (numeros.get(k).equals(numeros.get(l))) {

                        c++;
                    }
                }

                if (numeros.get(k) != null) {

                    System.out.println();

                    System.out.println("los numeros " + numeros.get(k) + " " + "se presento " + c + "veces");

                }
            }

        }

    }
}
