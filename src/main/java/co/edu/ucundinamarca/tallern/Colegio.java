package co.edu.ucundinamarca.tallern;

import java.util.*;

public class Colegio{

    Map alumno = new HashMap();

    public void agregarAlumnos(String nacionalidad) {
        if (alumno.containsKey(nacionalidad)) {
            Integer i = (Integer) alumno.get(nacionalidad);
            alumno.remove(nacionalidad);
            alumno.put(nacionalidad, i++);
        } else {
            alumno.put(nacionalidad, 1);
        }
    }

    public void mostrarTodosAlumnos() {
        Iterator it = alumno.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Numero de alumno:" + alumno.get(key));
        }
    }

    public int cuantosAlumnos() {
        return alumno.size();
    }

    public void borrarAlumnos(String nacionalidad) {
        alumno.remove(nacionalidad);
    }
}
