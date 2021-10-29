package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author michelle
 */
public class Hanoi{

    static Logger log = Logger.getLogger(HanoiT.class.getName());

    public static Pila fila1 = new Pila();
    public static Pila fila2 = new Pila();
    public static Pila fila3 = new Pila();

    public static int topDisco;
    public static int numDiscos = 3;

    public static void main(String[] args) {
        for (int i = 1; i <= numDiscos; i++) {
            fila1.insertar(i);
        }

        log.info("\nPrimero\t\t" + fila1.Listar() + "\nAyuda\t\t"
                + fila2.Listar() + "\nUltimo\t\t" + fila3.Listar() + "\n");
        Pasos(Integer.parseInt(fila1.Cabeza()), 1, 2, 3);
    }

    public static void Pasos(int n, int primero, int ayuda, int ultimo) {
        if (n == 1) {
            if (primero == 1) {
                topDisco = Integer.parseInt(fila1.Cabeza());
                fila1.Quitar();
            }
            if (primero == 2) {
                topDisco = Integer.parseInt(fila2.Cabeza());
                fila2.Quitar();
            }
            if (primero == 3) {
                topDisco = Integer.parseInt(fila3.Cabeza());
                fila3.Quitar();
            }

            if (ultimo == 1) {
                fila1.insertar(topDisco);
            }
            if (ultimo == 2) {
                fila2.insertar(topDisco);
            }
            if (ultimo == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nPrimero: " + fila1.Listar()
                    + "\nAyuda: " + fila2.Listar()
                    + "\nUltimo: " + fila3.Listar());
        } else {
            Pasos(n - 1, primero, ayuda, ultimo);
            log.info("Mover desde: " + primero + " hacia " + ultimo);
            if (primero == 1) {
                topDisco = Integer.parseInt(fila1.Cabeza());
                fila1.Quitar();
            }
            if (primero == 2) {
                topDisco = Integer.parseInt(fila2.Cabeza());
                fila2.Quitar();
            }
            if (primero == 3) {
                topDisco = Integer.parseInt(fila3.Cabeza());
                fila3.Quitar();
            }

            if (ultimo == 1) {
                fila1.insertar(topDisco);
            }
            if (ultimo == 2) {
                fila2.insertar(topDisco);
            }
            if (ultimo == 3) {
                fila3.insertar(topDisco);
            }
            log.info("\nprimero: " + fila1.Listar()
                    + "\nayuda: " + fila2.Listar()
                    + "\nultimo: " + fila3.Listar());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            Pasos(n - 1, ayuda, primero, ultimo);

        }
    }

}
