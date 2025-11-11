// Paquete donde se encuentra la clase HomeVeterinario
package users_interfaces.Veterinario;

import model.Consultation;
import model.Pet;
import persistence.Consultation_DB;
import persistence.Pet_DB;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * Clase HomeVeterinario
 * Descripción: Muestra el menú principal para los usuarios con rol de Veterinario.
 * Permite gestionar pacientes, consultas, historial de vacunación,
 * y generar reportes dentro del sistema veterinario.
 * @author Lucia Vega
 * @version 1.1
 */
public class HomeVeterinario {

    // --------------------- ATRIBUTOS ---------------------

    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);

    // Instancia de la base de datos simulada de mascotas
    Pet_DB pet_db = new Pet_DB();

    // Instancia de la base de datos simulada de consultas
    Consultation_DB consultation_db = new Consultation_DB();

    // --------------------- MÉTODOS PRINCIPALES ---------------------

    /** Muestra el menú del veterinario.
    * Permite seleccionar opciones hasta que el usuario decida salir.
    */

    public void showMenu(){
        String input;

        // Ciclo que mantiene el menú activo hasta que se seleccione la opción deseada
        do{
            // Encabezado del menú
            System.out.println("****** MENU DE VETERINARIO *****");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Registrar consulta / diagnostico / tratamiento");
            System.out.println("3. Registrar historial de vacunación / desparasitaciones");
            System.out.println("4. Consultar expediente del paciente");
            System.out.println("5. Generar reportes");
            System.out.println("6. Salir / Atrás");

            // Solicita la opción al usuario
            System.out.println(" ");
            System.out.print("Elija una opción: ");
            input = sc.nextLine();
            System.out.println(" ");

            // Control de opciones del menú
            switch (input) {
                case "1":
                    registrarPaciente();
                    break;
                 case "2":
                    registrarConsulta();
                    break;
                case "4":
                    consultarExpediente();
                    break;
            }

        }while (!input.equals("6")); // Termina cuando el usuario elige la opción Salir.
    }

    // --------------------- REGISTRO DE PACIENTE ---------------------

    /**
     * Metodo que permite registrar una nueva mascota (paciente) en el sistema.
     * Solicita al usuario los datos de la mascota y los almacena en la base simulada.
     */

    private void registrarPaciente(){

        System.out.println("***** Registro de pacientes *****");
        System.out.println(" ");

        // Captura de datos de la mascota desde consola
        System.out.print("Nombre de la mascota: ");
        String petName = sc.nextLine();
        System.out.print("Especie: ");
        String animalType = sc.nextLine();
        System.out.print("Raza: ");
        String petBreed = sc.nextLine();
        System.out.print("Edad: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Peso (Kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("Sexo: ");
        String petSex = sc.nextLine();
        System.out.print("Id del propietario: ");
        String ownerId = sc.nextLine();
        System.out.println(" ");
        System.out.println("---- Paciente registrado exitosamente ----");
        System.out.println(" ");
        System.out.println("---- Pulse una tecla para volver al menu principal ----");
        sc.nextLine();

        // Crea una nueva instancia de mascota con los datos ingresados
        Pet newPet = new Pet(petName, petBreed, animalType, age, weight, petSex, ownerId);

        // Agrega la mascota a la base de datos simulada
        pet_db.addMascota(newPet);

    }

    // --------------------- REGISTRO DE CONSULTA ---------------------

    /**
     * Metodo que permite registrar una nueva consulta veterinaria.
     * Verifica que la mascota exista antes de registrar el diagnóstico y tratamiento.
     */

    private void registrarConsulta(){

        System.out.println("***** Registro de consulta *****");
        System.out.println(" ");

        // === VALIDAR EXISTENCIA DE LA MASCOTA ===
        String petId;
        while (true) {
            System.out.print("Id de la mascota: ");
            petId = sc.nextLine();

            // Verifica si la mascota existe en la base de datos simulada
            if (pet_db.getMascotaById(petId) != null) {
                break; // Valida si la mascota existe, se continúa el registro
            } else {
                // Mensaje de error si la mascota no existe
                System.out.println(" ");
                System.out.println("--- Error: no existe una mascota registrada con el ID " + petId + " ---");
                System.out.println("Por favor, registre primero la mascota o ingrese un ID válido.\n");
                sc.nextLine();
                return; // Sale del metodo
            }
        }

        // Captura de datos de la consulta desde consola
        String date;
        while (true) {
            System.out.print("Ingrese la fecha de la consulta (yyyy-MM-dd): ");
            date = sc.nextLine();

            // Validación del formato de fecha
            if (date.matches("\\d{4}-\\d{2}-\\d{2}")) break;
            System.out.println("--- Error: formato de fecha inválido. Intente de nuevo. ---");
        }
        LocalDate localDate = LocalDate.parse(date);

        System.out.print("Razón por la que consulta: ");
        String reason = sc.nextLine();
        System.out.print("Diagnostico: ");
        String diagnosis = sc.nextLine();
        System.out.print("Tratamiento: ");
        String treatment = sc.nextLine();
        System.out.print("Id del veterinario: ");
        String vetId = sc.nextLine();
        System.out.println(" ");
        System.out.println("---- Consulta registrada exitosamente ----");
        System.out.println(" ");
        System.out.println("---- Pulse una tecla para volver al menu principal ----");
        sc.nextLine();

        // Crea una nueva instancia de consulta con los datos ingresados
        Consultation newC = new Consultation(localDate, petId, reason, diagnosis, treatment, vetId);

        // Agrega la consulta a la base de datos simulada
        consultation_db.addConsulta(newC);

    }

    // --------------------- CONSULTAR EXPEDIENTE ---------------------

    /**
     * Metodo que permite consultar el expediente completo de una mascota.
     * Muestra sus datos y todas las consultas registradas en el sistema.
     */

    private void consultarExpediente(){

        System.out.print("Ingrese el id de la mascota: ");
        String petId = sc.nextLine();
        System.out.println(" ");

        // Busca la mascota por su ID
        Pet pet = pet_db.getMascotaById(petId);

        // Si no existe, se muestra un mensaje de error y se interrumpe la ejecución
        if (pet == null) {
            System.out.println("--- No existe ninguna mascota registrada con el ID " + petId + "---");
            System.out.println("Por favor, registre primero la mascota o ingrese un ID válido.\n");
            sc.nextLine();
            return;

        }

        // Obtiene todas las consultas registradas para esa mascota
        List<Consultation> petConsultList = consultation_db.getConsultaByPetId(petId);

        // --- Muestra del expediente ---

        System.out.println("\n===== EXPEDIENTE VETERINARIO =====");
        System.out.println("Información del paciente:");
        System.out.println(pet);

        System.out.println("\nHistorial de consultas:");
        System.out.println(" ");

        // Si la mascota no tiene consultas registradas
        if (petConsultList.isEmpty()) {
            System.out.println(" No hay consultas registradas para esta mascota.");
        } else {
            // Muestra todas las consultas asociadas a la mascota
            for (Consultation c : petConsultList) {
                System.out.println(c.toString());
                System.out.println("-----------------------------------");
            }
        }
        System.out.println(" ");
        System.out.println("---- Pulse una tecla para volver al menu principal ----");
        sc.nextLine();


    }
}

