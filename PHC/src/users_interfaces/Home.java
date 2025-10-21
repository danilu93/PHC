// Paquete donde se encuentra la clase Home
package users_interfaces;

// Importa la clase User que representa al usuario actual
import model.User;

// Importa las clases de interfaces de cada tipo de usuario
import users_interfaces.Administrador.HomeAdministrador;
import users_interfaces.Desarrollador.HomeDesarrollador;
import users_interfaces.Propietario.HomePropietario;
import users_interfaces.Veterinario.HomeVeterinario;


/**
 * Clase Home
 * Descripción: Muestra el menú principal correspondiente según el rol del usuario.
 * Dependiendo del rol, redirige al menú específico de cada tipo de usuario.
 * @author Lucia Vega
 * @version 1.0
 */

public class Home {

    /**
     * Muestra el menú correspondiente al usuario según su rol.
     * @param user Usuario que ha iniciado sesión
     */

    public void showMenu (User user){

        // Saludo al usuario
        System.out.println("Bienvenido " + user.getName());
        System.out.println("");

        // Obtiene el rol del usuario
        String role = user.getRole();

        // Dependiendo del rol, redirige al menú específico
        switch (role.toLowerCase()) {
            case "administrativo":
                HomeAdministrador hAdmin = new HomeAdministrador();
                hAdmin.showMenu();      // Muestra menú de administrador
                break;
            case "desarrollador":
                HomeDesarrollador hDev = new HomeDesarrollador();
                hDev.showMenu();        // Muestra menú de desarrollador
                break;
            case "propietario":
                HomePropietario hOwner = new HomePropietario();
                hOwner.showMenu();      // Muestra menú de propietario
                break;
            case "veterinario":
                HomeVeterinario hVet = new HomeVeterinario();
                hVet.showMenu();        // Muestra menú de veterinario
                break;

            default:
                // Mensaje si el rol no coincide con ningún caso
                System.out.println("Rol no encontrado");

        }

    }
}
