/**
 * Pets Health Control (PHC)
 * Sistema de gestión de expedientes y servicios veterinarios
 * @author Lucia Vega
 * @version 1.0
 * @since 10/20/2025
 */

// Importa la clase Login desde el paquete user_interfaces
// Permite usar la clase Login en la clase Main

import users_interfaces.Login;

public class Main {

    // Metodo Main, punto de entrada donde se ejecuta el programa

    public static void main(String[] args) {
        // Se crea el objeto de la clase Login llamado 'login'
        // Permite acceder a los metodos y funcionalidades de Login
        Login login = new Login();

        // Se llama al metodo showLogin() del objeto 'login'
        // Muestra la interfaz del login
        login.showLogin();

    }
}