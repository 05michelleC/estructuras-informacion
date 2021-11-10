package Punto1;

import java.util.Scanner;
import org.apache.log4j.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Michelle
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cola cola = new Cola();

        int salida = 0;
        int entrada;
        int Op;
        String nombre;
        String id_usuario;
        String Libro;

        do {
            log.info("Menu\n1.Ingresar\n2.Atender.\n3Mostrar pendiente"
                    + " y atendidos.\n4.Nuemero de pendientes y atendidos");
            log.info("Digite la opción");

            Op = leer.nextInt();
            switch (Op) {
                case 1:

                    id_usuario = JOptionPane.showInputDialog("digite la identificación");
                    nombre = JOptionPane.showInputDialog("digite el nombre");
                    Libro = JOptionPane.showInputDialog("digite el libro a entregar");
                    cola.ingresarnodo(id_usuario, nombre, Libro);

                    break;
                case 2:
                    log.info("Atendido el primero");

                    break;
                case 3:
                    log.info("En espera:");
                    cola.En_esperar();
                    log.info("Atendidos");
                    cola.En_salida();
                    salida = cola.getsalida();
                    break;
                case 4:
                    entrada = cola.getentrada();
                    JOptionPane.showMessageDialog(null, "El numero de espera es: " + entrada);
                    salida = cola.getsalida();
                    JOptionPane.showMessageDialog(null, "El numero de salida es: " + salida);
                    break;
                case 5:
                    break;
                default:
                    log.info("EROR");
                    break;

            }
        } while (Op != 5);
        log.info("Fin");

    }

}
