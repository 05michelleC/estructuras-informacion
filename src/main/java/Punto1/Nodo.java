package Punto1;
/**
 *
 * @author Michelle
 */
public class Nodo {

    String nombre;
    String id_usuario;
    String libro;
    Nodo siguente;
    Nodo anterior;

    public String getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getlibro() {
        return libro;
    }

    public void setlibro(String libro) {
        this.libro = libro;

    }
}
