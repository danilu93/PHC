// Paquete donde se encuentra la clase Consultation_DB
package persistence;

// Importa la clase Consultation,
// ya que esta clase almacena objetos de tipo Consultation (Consulta)
import model.Consultation;

// Importa las clases necesarias para manejar listas
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Consultation_DB
 * Descripción: Simula una base de datos de consultas en memoria utilizando una lista.
 * Contiene el registro de consultas para cada mascota
 * con los datos ingresados por el usuario Veterinario.
 * @author Lucia Vega
 * @version 1.1
 */

public class Consultation_DB {

    // Lista que almacena todas las consultas registradas en memoria
    private final List<Consultation> consultationList = new ArrayList<>();

    /**
     * Metodo getter que devuelve la lista completa de consultas registradas.
     * @return Lista de objetos Consultation (todas las consultas guardadas).
     */

    public List<Consultation> getConsultaList() {
        return consultationList;
    }

    /**
     * Agrega una nueva consulta al registro (lista).
     * @param c Objeto Consultation que representa la consulta a agregar.
     */

    public void addConsulta (Consultation c) {
        consultationList.add(c);
    }

    /**
     * Busca todas las consultas veterinarias asociadas a una mascota específica
     * según su ID, y devuelve una lista con los resultados encontrados.
     *
     * @param petId Identificador único de la mascota cuyas consultas se desean obtener.
     * @return Una lista con todas las consultas registradas para esa mascota.
     * Si no se encuentra ninguna, devuelve una lista vacía.
     */

    public List<Consultation> getConsultaByPetId(String petId) {
        // Crea una nueva lista vacía para almacenar las consultas encontradas.
        List<Consultation> resultado = new ArrayList<>();
        for (Consultation c : consultationList) { // Recorre la lista completa de consultas almacenadas.
            if (c.getPetId().equals(petId)) {
                resultado.add(c); // Si coincide, agrega esa consulta a la lista de resultados.
            }
        }

        // Devuelve la lista con todas las consultas encontradas para ese ID de mascota.
        // Si no hay coincidencias, se retorna la lista vacía (no null).
        return resultado;
    }
}