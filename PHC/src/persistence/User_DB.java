// Paquete donde se encuentra la clase User_DB
package persistence;

// Importa la clase User que representa a un usuario
import model.User;

// Importa las clases necesarias para manejar listas
import java.util.ArrayList;
import java.util.List;

/**
 * Clase User_DB
 * Descripción: Simula una base de datos de usuarios en memoria utilizando una lista.
 * Contiene usuarios predefinidos para pruebas o demostraciones.
 * @author Lucia Vega
 * @version 1.0
 */

public class User_DB {

    // Lista privada que almacena los usuarios
    private final List<User> userList = new ArrayList<>();

    /**
     * Constructor de User_DB
     * Inicializa la lista de usuarios.
     */

    public User_DB () {
        // Crear usuario 1
        User u1 = new User();
        u1.setId("001");
        u1.setName("Annette Guzman");
        u1.setAddress("Alajuela, CR");
        u1.setPhone("70608590");
        u1.setEmail("anng@gmail.com");
        u1.setUserName("anng19");
        u1.setPassword("1234");
        u1.setRole("Propietario");

        // Crear usuario 2
        User u2 = new User();
        u2.setId("002");
        u2.setName("Luis Gonzalez");
        u2.setAddress("Montenegro, CR");
        u2.setPhone("76435476");
        u2.setEmail("luisg@gmail.com");
        u2.setUserName("luisg2");
        u2.setPassword("2345");
        u2.setRole("Administrativo");

        // Crear usuario 3
        User u3 = new User();
        u3.setId("003");
        u3.setName("Dr. Antonio Gamboa");
        u3.setAddress("La Sabana, CR");
        u3.setPhone("79067690");
        u3.setEmail("antogam@gmail.com");
        u3.setUserName("antogam1");
        u3.setPassword("3456");
        u3.setRole("Veterinario");

        // Crear usuario 4
        User u4 = new User();
        u4.setId("004");
        u4.setName("Lucia Vega");
        u4.setAddress("Monserrat, CR");
        u4.setPhone("84567890");
        u4.setEmail("luciav@gmail.com");
        u4.setUserName("luciav2");
        u4.setPassword("4567");
        u4.setRole("Desarrollador");

        // Agregar usuarios a la lista
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

    }


    /**
     * Metodo que retorna la lista de usuarios almacenados
     * @return Lista de objetos User
     */

    public List<User> getUserList() {
        return userList;
    }
}
