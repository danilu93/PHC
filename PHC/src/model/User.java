// Paquete donde se encuentra la clase User
package model;

/**
 * Clase User
 * Descripción: Datos personales y credenciales de acceso de un usuario.
 * @author Lucia Vega
 * @version 1.0
 */

public class User {

    // Atributos privados del usuario
    private String id;
    private String userName;
    private String password;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String role;

    /**
     * Constructor vacío
     * Permite crear un usuario sin inicializar los atributos
     */
    public User() {}

    // --------------------- GETTERS ---------------------

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    // --------------------- SETTERS ---------------------

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

}