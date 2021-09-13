package co.edu.ucundinamarca.tallern;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(String nombre, int edad, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public static void main(String[] args) {

        Persona personaUno = new Persona("Hanner", 10, 20);
        Persona personaDos = new Persona("Hanner", 10, 20);

        if (personaUno.equals(personaDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }

    }

    @Override
    public String toString() {
        return "Persona [nombre : " + getNombre() + " edad : " + getEdad() + " Identificacion : " + getIdentificacion() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Persona that = (Persona) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

}
