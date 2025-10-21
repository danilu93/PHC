// Paquete donde se encuentra la clase HomeAdministrador
package users_interfaces.Administrador;

import java.util.Scanner;

/**
 * Clase HomeAdministrador
 * Descripción: Muestra el menú principal para los usuarios con rol de Administrador.
 * Permite navegar por diferentes opciones administrativas del sistema.
 * @author Lucia Vega
 * @version 1.0
 */

public class HomeAdministrador {

    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);

    // Muestra el menú del administrador y permite seleccionar opciones hasta que el usuario decida salir.
    public void showMenu(){
        String input;

        // Ciclo que mantiene el menú activo hasta que se seleccione la opción "5"
        do{
            // Encabezado del menú
            System.out.println("****** MENU DE ADMINISTRADOR *****");
            System.out.println("1. Editar informacion de pacientes");
            System.out.println("2. Eliminar paciente / registro");
            System.out.println("3. Generar reportes");
            System.out.println("4. Buscar informacion de pacientes");
            System.out.println("5. Salir / Atras");

            // Solicita la opción al usuario
            System.out.println("");
            System.out.print("Elija una opcion: ");
            input = sc.nextLine();
        }while (!input.equals("5")); // Sale del menú cuando el usuario elige la opción 5
    }
}
