package co.edu.ucundinamarca.tallern;

import java.util.Objects;

public class Animal{

    private String nom;
    private String especie;
    private int patas;
    private int edad;
    private int id;
    private Object Objects;

    public Animal(String nom, int patas, int edad) {
        this.nom = nom;
        this.especie = especie;
        this.edad = edad;
        this.id = id;
        this.patas = patas;

    }

    public static void main(String[] args) {

        Animal animalUno = new Animal("Hanner", 10, 20);
        Animal animalDos = new Animal("Hanner", 10, 20);

        if (animalUno.equals(animalDos)) {
            System.out.println("******* Instacias Iguales *********");
        } else {
            System.out.println("******* Instacias Diferentes *********");
        }

    }

    public String toString() {
        return "Animal [nombre : " + getNom() + " edad : " + getEdad() + " Identificacion : " + getId() + " patas : " + getpatas() + " especie : " + getespecie() + "]";
    }

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

        Animal that = (Animal) obj;
        return Objects.equals(this.getNom(), that.getNom())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getespecie(), that.getespecie())
                && Objects.equals(this.getId(), that.getId());

    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getId();
        result = 4 * result + getpatas();
        return result;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int getpatas() {
        return patas;
    }

    public void setpatas(int patas) {
        this.patas = patas;
    }

    private String getespecie() {
        return especie;
    }

    public void setespecie(String especie) {
        this.especie = especie;
    }
}
