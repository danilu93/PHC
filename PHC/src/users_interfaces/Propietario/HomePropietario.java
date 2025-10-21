// Paquete donde se encuentra la clase HomePropietario
package users_interfaces.Propietario;

import java.util.Scanner;

/**
 * Clase HomePropietario
 * Descripción: Muestra el menú principal para los usuarios con rol de Propietario.
 * Permite gestionar acciones relacionadas con las mascotas, citas médicas
 * y notificaciones del sistema veterinario.
 * @author Lucia Vega
 * @version 1.0
 */
public class HomePropietario {

    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);

    // Muestra el menú del propietario y permite seleccionar opciones hasta que el usuario decida salir.
    public void showMenu(){
        String input;

        // Ciclo que mantiene el menú activo hasta que se seleccione la opción "6"
        do{
            // Encabezado del menú
            System.out.println("****** MENU DE PROPIETARIO *****");
            System.out.println("1. Registrarse");
            System.out.println("2. Consultar historial medico de la mascota");
            System.out.println("3. Agendar cita medica");
            System.out.println("4. Modificar o cancelar cita");
            System.out.println("5. Ver notificaciones / recordatorios");
            System.out.println("6. Salir / Atras");

            // Solicita la opción al usuario
            System.out.println("");
            System.out.print("Elija una opcion: ");
            input = sc.nextLine();
        }while (!input.equals("6"));  // Sale del menú cuando el usuario elige la opción 6
    }
}
