// Paquete donde se encuentra la clase HomeVeterinario
package users_interfaces.Veterinario;

import java.util.Scanner;

/**
 * Clase HomeVeterinario
 * Descripción: Muestra el menú principal para los usuarios con rol de Veterinario.
 * Permite gestionar pacientes, consultas, historial de vacunación,
 * y generar reportes dentro del sistema veterinario.
 * @author Lucia Vega
 * @version 1.0
 */
public class HomeVeterinario {

    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);

    // Muestra el menú del veterinario y permite seleccionar opciones hasta que el usuario decida salir.
    public void showMenu(){
        String input;

        // Ciclo que mantiene el menú activo hasta que se seleccione la opción "6"
        do{
            // Encabezado del menú
            System.out.println("****** MENU DE VETERINARIO *****");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Registrar consulta / diagnostico / tratamiento");
            System.out.println("3. Registrar historial de vacunacion / desparacitaciones");
            System.out.println("4. Consultar expediente del paciente");
            System.out.println("5. Generar reportes");
            System.out.println("6. Salir / Atras");

            // Solicita la opción al usuario
            System.out.println("");
            System.out.print("Elija una opcion: ");
            input = sc.nextLine();
        }while (!input.equals("6")); // Sale del menú cuando el usuario elige la opción 6
    }
}

