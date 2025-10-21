// Paquete donde se encuentra la clase Login
package users_interfaces;

// Importa la clase Authentication para validar usuarios
import logic.Authentication;
// Importa la clase User que representa al usuario
import model.User;

// Importa Scanner para leer entrada de usuario desde consola
import java.util.Scanner;

/**
 * Clase Login
 * Descripción: Permite al usuario iniciar sesión en el sistema.
 * Valida las credenciales mediante la clase Authentication
 * y redirige al menú correspondiente según el rol.
 * @author Lucia Vega
 * @version 1.0
 */

public class Login {

    // Scanner para leer entrada desde consola
    Scanner sc = new Scanner(System.in);

    // Objeto de la clase Authentication para validar usuarios
    private final Authentication autho = new Authentication();

    // Contador de intentos de login
    private int attempts = 0;

    /**
     * Metodo que muestra la interfaz de login y valida al usuario.
     * Permite hasta 3 intentos antes de finalizar.
     */
    public void showLogin (){
        do{
            // Mensaje de bienvenida
            System.out.println("***** Log In *****");
            System.out.println(" ");

            // Solicita el nombre de usuario
            System.out.print("Ingrese su nombre de usuario: ");
            String userName = sc.nextLine();

            // Solicita la contraseña
            System.out.print("Ingrese su contraseña: ");
            String pass = sc.nextLine();

            // Llama al metodo authenticate para validar usuario y contraseña
            User authenticateUser = autho.authenticate(userName, pass);

            if (authenticateUser == null) {
                // Si las credenciales son incorrectas
                System.out.println(" ");
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println(" ");
                attempts += 1;  // Incrementa el contador de intentos
            }else{
                // Si las credenciales son correctas, redirige al menú principal
                Home home = new Home();
                home.showMenu(authenticateUser);
                return; // Sale del método
            }

        }while (attempts < 3);  // Permite máximo 3 intentos

        // Mensaje al finalizar los intentos
        System.out.println("***** Muchas gracias! *****");
    }
}
