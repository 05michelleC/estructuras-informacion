package co.edu.ucundinamarca.tallern;

/**
 *
 * @author michelle
 */
public class Pila{

    private Nodo cabeza = null;
    private int longitud = 0;

    public class Nodo{

        public int numero;
        public Nodo siguiente = null;

        public Nodo(int numero) {
            this.numero = numero;
        }
    }

    public void insertar(int numero) {
        Nodo nodo = new Nodo(numero);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public String Cabeza() {
        String Dato = "";
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            return Dato = "" + puntero.numero;
        }
    }

    public String Vacia() {
        if (cabeza == null) {
            return "Pila vacia";
        } else {
            return "Pila no vacia";
        }
    }

    public void Quitar() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer = null;
            longitud--;
        }
    }

    public String Listar() {
        String dato = "";
        Nodo ayuda = cabeza;
        int n = 0;
        while (ayuda != null) {
            dato += ayuda.numero + " ";
            ayuda = ayuda.siguiente;
            n++;
        }
        return (dato);
    }

    public void Vaciar() {
        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente = null;
            primer = null;
            longitud = 0;
        }
    }
}
