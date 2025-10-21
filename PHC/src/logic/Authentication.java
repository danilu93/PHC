/**
 * Clase Authentication
 * Descripción: Se encarga de validar las credenciales de los usuarios.
 * @author Lucia Vega
 * @version 1.0
 */

// Paquete donde se encuentra la clase Authentication
package logic;

// Importa la clase User que representa a un usuario
import model.User;
// Importa la clase User_DB que se encarga de la persistencia de usuarios
import persistence.User_DB;

public class Authentication {

    // Crea un objeto de User_DB para acceder a la lista de usuarios almacenados
    private final User_DB userDb = new User_DB();

    /**
     * Metodo que autentica un usuario dado su nombre y contraseña.
     *
     * @param userName El nombre de usuario que se desea autenticar
     * @param pass La contraseña correspondiente al usuario
     * @return Un objeto User si el usuario existe y la contraseña coincide,
     * o null si no se encuentra el usuario o la contraseña es incorrecta
     */

    public User authenticate (String userName, String pass){
        // Recorre la lista de usuarios obtenida desde User_DB
        for (User u : userDb.getUserList()){
            // Compara si el nombre de usuario y la contraseña coinciden
            if (u.getUserName().equals(userName)
                && u.getPassword().equals(pass)){
                // Retorna el usuario encontrado
                return u;
            }
        }

        // Retorna null si no se encontró ningún usuario válido
        return  null;
    }

}
