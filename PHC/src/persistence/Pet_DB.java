// Paquete donde se encuentra la clase Pet_DB
package persistence;

// Importa la clase Pet,
// ya que esta clase almacena objetos de tipo Pet (Mascota)
import model.Pet;

// Importa las clases necesarias para manejar listas
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Pet_DB
 * Descripción: Simula una base de datos de mascotas en memoria utilizando una lista.
 * Contiene el registro de mascotas con los datos ingresados por el usuario Veterinario.
 * @author Lucia Vega
 * @version 1.1
 */

public class Pet_DB {

    // Lista que almacena todas las mascotas registradas en memoria
    private final List<Pet> petList = new ArrayList<>();

    /**
     * Metodo getter que devuelve la lista completa de mascotas registradas.
     * @return Lista de objetos Pet (todas las mascotas guardadas).
     */

    public List<Pet> getPetList() {
        return petList;
    }

    /**
     * Agrega una nueva mascota al registro (lista).
     * @param m Objeto Pet que representa la mascota a agregar.
     */

    public void addMascota(Pet m) {
        petList.add(m);
    }

    /**
     * Busca una mascota dentro de la lista utilizando su ID.
     * @param petId Identificador único de la mascota que se desea buscar.
     * @return El objeto Pet si se encuentra, o null si no existe una mascota con ese ID.
     */

    public Pet getMascotaById(String petId) {
        for (Pet m : petList) { // Recorre todas las mascotas registradas.
            if(m.getPetId().equals(petId)) { // Compara el ID buscado con el de la mascota actual.
                return m; // Si coincide, retorna la mascota encontrada.
            }
        }
        return null;
    }

}