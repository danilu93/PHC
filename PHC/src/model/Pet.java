// Paquete donde se encuentra la clase Mascota
package model;

import persistence.User_DB;

/**
 * Clase Pet
 * Descripción: Datos de la mascota.
 *
 * @author Lucia Vega
 * @version 1.1
 */

public class Pet {

    // Atributos privados de la mascota
    private String petId;
    private String petName;
    private String petBreed;
    private String animalType;
    private int age;
    private double weight;
    private String petSex;
    private String ownerId;

    private static int counter = 1;

    private String generateId() {
        return String.format("%02d",counter++);
    }

    /**
     * Constructor parametrico
     * Permite registrar mascotas con los datos ingresados desde la interfaz
     * El Id se genera automaticamente al crear el objeto.
     */

    public Pet(String petName, String petBreed, String animalType,
               int age, double weight, String petSex, String ownerId) {
        this.petId = generateId();
        this.petName = petName;
        this.petBreed = petBreed;
        this.animalType = animalType;
        this.age = age;
        this.weight = weight;
        this.petSex = petSex;
        this.ownerId = ownerId;
    }

    /**
     * Constructor vacío
     * Permite crear un usuario sin inicializar los atributos
     */

    public Pet() {
    }

    // --------------------- GETTERS ---------------------

    public String getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getPetSex() {
        return petSex;
    }

    public String getOwnerId() {
        return ownerId;
    }


    // --------------------- SETTERS ---------------------

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPetSex(String petSex) {
        this.petSex = petSex;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Metodo toString sobrescrito.
     * Devuelve una representación legible de la mascota,
     * mostrando todos sus datos principales, incluyendo el nombre del propietario.
     *
     * @return Cadena con la información detallada de la mascota.
     */

    @Override
    public String toString() {
        // Busca al propietario de la mascota en la base de datos simulada.
        model.User propietario = User_DB.getUserById(ownerId);
        String ownerName;

        // Si el propietario existe, muestra su nombre; si no, indica que es desconocido.
        if (propietario != null) {
            ownerName = propietario.getName();
        } else {
            ownerName = "--- Desconocido ---";
        }

        // Construye y devuelve una cadena con los datos completos de la mascota.
        return "=== Datos de la mascota ===\n" +
                "ID: " + petId + "\n" +
                "Nombre: " + petName + "\n" +
                "Raza: " + petBreed + "\n" +
                "Especie: " + animalType + "\n" +
                "Edad: " + age + " " + "años" +"\n" +
                "Peso: " + weight + "Kg" + "\n" +
                "Propietario: " + ownerName;
    }


}