package Punto1;

import java.util.logging.Logger;
import static Punto1.Main.log;
/**
 *
 * @author Michelle
 */
public class Cola {

    Nodo iniciocola, finalcola;
    String Cola = "";
    int entrada, salida;

    public Cola() {

        iniciocola = null;
        finalcola = null;
    }

    public int getentrada() {
        return entrada;
    }

    public int getsalida() {
        return salida;
    }

    public boolean colavacia() {

        if (iniciocola == null) {

            return true;
        } else {

            return false;
        }
    }

    public void ingresarnodo(String id_usuario, String nombre, String libro) {

        Nodo Nuevo = new Nodo();
        Nuevo.nombre = nombre;
        Nuevo.id_usuario = id_usuario;
        Nuevo.libro = libro;

        if (iniciocola == null) {

            iniciocola = Nuevo;
            iniciocola.siguente = iniciocola;
            Nuevo.anterior = finalcola;
            finalcola = Nuevo;
        } else {

            finalcola.siguente = Nuevo;
            Nuevo.siguente = iniciocola;
            Nuevo.anterior = finalcola;
            finalcola = Nuevo;
            iniciocola.anterior = finalcola;
        }
        entrada++;
    }

    public void En_espera() {
        Nodo actual = new Nodo();
        actual = iniciocola;
        do {
            log.info("ID:" + actual.getid_usuario() + "\nNombres:"
                    + actual.getnombre() + "\nDatos del libro:" + actual.getlibro());
            actual = actual.siguente;
        } while (actual != iniciocola);
    }

    public void En_salida() {
        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();

        actual = iniciocola;
        anterior = finalcola;

        if (actual == iniciocola) {
            log.info(actual.getnombre() + " con identificación: " + actual.getid_usuario() + " atendido");

            iniciocola = iniciocola.siguente;
            finalcola.siguente = iniciocola;
            iniciocola.anterior = finalcola;

        }
        salida++;

        anterior = actual;
        actual = actual.siguente;

    }

    void En_esperar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
