// Paquete donde se encuentra la clase HomeDesarrollador
package users_interfaces.Desarrollador;

import java.util.Scanner;

/**
 * Clase HomeDesarrollador
 * Descripción: Muestra el menú principal para los usuarios con rol de Desarrollador.
 * Permite acceder a opciones relacionadas con la gestión técnica del sistema,
 * como permisos, actualizaciones y configuraciones.
 * @author Lucia Vega
 * @version 1.0
 */
public class HomeDesarrollador {

    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);

    // Muestra el menú del desarrollador y permite seleccionar opciones hasta que el usuario decida salir.
    public void showMenu(){
        String input;

        // Ciclo que mantiene el menú activo hasta que se seleccione la opción "5"
        do{
            // Encabezado del menú
            System.out.println("****** MENU DE DESARROLLADOR *****");
            System.out.println("1. Gestionar permisos de acceso");
            System.out.println("2. Actualizar sistema");
            System.out.println("3. Configurar seguridad");
            System.out.println("4. Ajustar configuraciones del sistema");
            System.out.println("5. Salir / Atras");

            // Solicita la opción al usuario
            System.out.println("");
            System.out.print("Elija una opcion: ");
            input = sc.nextLine();
        }while (!input.equals("5")); // Sale del menú cuando el usuario elige la opción 5
    }
}

