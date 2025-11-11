// Paquete donde se encuentra la clase Consulta
package model;

import persistence.User_DB;

import java.time.LocalDate;

/**
 * Clase Consultation
 * Descripción: Datos de la consulta asociada a una mascota.
 * @author Lucia Vega
 * @version 1.1
 */

public class Consultation {

    // Atributos privados de la consulta
    private LocalDate date;
    private String petId;
    private String reason;
    private String diagnosis;
    private String treatment;
    private String vetId;

    /**
     * Constructor parametrico.
     * Inicializa una consulta con todos los datos requeridos.
     */

    public Consultation(LocalDate date, String petId, String reason,
                        String diagnosis, String treatment, String vetId) {
        this.date = date;
        this.petId = petId;
        this.reason = reason;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.vetId = vetId;
    }

    /**
     * Constructor vacío
     * Permite registrar consultas sin inicializar los atributos.
     */
    public Consultation() {}

    // --------------------- GETTERS ---------------------

    public String getPetId() {

        return petId;
    }

    public String getReason() {

        return reason;
    }

    public String getDiagnosis() {

        return diagnosis;
    }

    public LocalDate getDate() {

        return date;
    }

    public String getTreatment() {

        return treatment;
    }

    public String getVetId() {

        return vetId;
    }


    // --------------------- SETTERS ---------------------

    public void setPetId(String petId) {

        this.petId = petId;
    }

    public void setReason(String reason) {

        this.reason = reason;
    }

    public void setDiagnosis(String diagnosis) {

        this.diagnosis = diagnosis;
    }

    public void setDate(LocalDate date) {

        this.date = date;
    }

    public void setTreatment(String treatment) {

        this.treatment = treatment;
    }

    public void setVetId(String vetId) {

        this.vetId = vetId;
    }

    /**
     * Metodo toString sobrescrito.
     * Retorna una representación en texto legible de los datos de la consulta.
     * Incluye la información del veterinario asociada al ID.
     *
     * @return Cadena con los datos completos de la consulta.
     */

    @Override
    public String toString() {
        // Busca al veterinario en la base de datos simulada usando su ID.
        model.User veterinario = User_DB.getUserById(vetId);
        String vetName;

        // Si el veterinario existe, muestra su nombre; de lo contrario, indica que es desconocido.
        if (veterinario != null) {
            vetName = veterinario.getName();
        } else {
            vetName = "--- Desconocido ---";
        }

        // Construye y devuelve una cadena con los datos detallados de la consulta.
        return "=== Datos de la consulta ===\n" +
                "Fecha: " + date + "\n" +
                "Id de la mascota: " + petId + "\n" +
                "Razón de la consulta: " + reason + "\n" +
                "Diagnostico: " + diagnosis + "\n" +
                "Tratamiento: " + treatment + "\n" +
                "Veterinario: " + vetName;
    }


}