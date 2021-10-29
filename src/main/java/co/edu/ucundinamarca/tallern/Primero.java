
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;


public class Primero {

    static Logger log = Logger.getLogger(Primero.class.getName());

    public static nodo primero;
    public static nodo ultimo;

    public static void main(String[] args) {
        log.debug("");
        log.info("");

        Primero borrado = new Primero();

        borrado.ListaNom(1, "Francisco");
        borrado.ListaNom(2, "jorge");
        borrado.ListaNom(3, "luis");
        borrado.ListaNom(4, "Sergio");
        borrado.ListaNom(6, "salvador");
        borrado.ListaNom(7, "Diego");
        borrado.ListaNom(8, "Mario");
        borrado.mostrarlist(4);
    }

    public Primero() {
        primero = null;
        ultimo = null;
    }

    public void mostrarlist(int numero) {
        nodo lugar = new nodo();

        lugar = primero;

        while (lugar != null) {

            if (lugar.lugar == numero) {
                log.info("salio:" + lugar.nombre);
            }
            lugar = lugar.siguiente;

            return;
        }

    }

    public void ListaNom(int lugar, String nombre) {
        nodo pocision = new nodo();
        pocision.lugar = lugar;
        pocision.nombre = nombre;

        if (primero == null) {
            primero = pocision;
            pocision.siguiente = null;
            ultimo = primero;
        } else {
            ultimo.siguiente = pocision;
            pocision.siguiente = primero;
            ultimo = pocision;
        }
    }
}
