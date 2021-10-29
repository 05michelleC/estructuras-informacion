package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroingresar;
        int numerobuscar;
        int numeromodificar;

        lista ejemplo = new lista();
        int opcion;

        do {
            log.info("\n\n----Cajas en Bodega----\n\n"
                    + "1.Ingresar numero de caja\n"
                    + "2.Mostrar cajas\n"
                    + "3.Modificar numero de caja\n"
                    + "5.salir");

            log.info("Ingrese la opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    log.info("Digite numero de la caja");
                    numeroingresar = leer.nextInt();

                    ejemplo.ingresar(numeroingresar);
                    break;

                case 2:

                    log.info("Mostrando las cajas");
                    ejemplo.mostrar();
                    break;

                case 3:

                    log.info("Digite la caja a cambiar");
                    numeromodificar = leer.nextInt();
                    ejemplo.modificar(numeromodificar);
                    break;

                case 5:

                    log.info("");
                    break;

                default:
                    log.info("ERROR");
            }

        } while (opcion != 5);
    }
}
