package co.edu.ucundinamarca.tallern;

import java.util.HashSet;
import java.util.Iterator;

public class Seleccion_Colombia {

    Seleccion_Colombia jugadoruno = new Seleccion_Colombia("Hanner", 10, 20);
    Seleccion_Colombia jugadorDos = new Seleccion_Colombia("Hanner", 10, 20);

    if (personaUno.equals (personaDos) 
        ) {
            System.out.println("******* Instacias Iguales *********");
    }

    
        else {
            System.out.println("******* Instacias Diferentes *********");
    }

    HashSet jugadores = new HashSet<>();

    public void agregarJugadores() {

        jugadores.add("James");
        jugadores.add("Alexander");
        jugadores.add("Andres");
        jugadores.add("David");
        jugadores.add("Falcao");

    }

    public void mostrarJugadores() {
        int i = 0;
        Iterator it = jugadores.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (jugadores.size() - 1 > i) {
                System.out.print(",");
                i++;
            }
        }
        System.out.println();

    }

    public void contieneJugadores(String nombreJugador) {

        if (jugadores.contains(nombreJugador)) {
            System.out.println("Falcao Si está en el conjunto");
        } else {
            System.out.println("Mbappe No está en el conjunto");
        }
    }
}
