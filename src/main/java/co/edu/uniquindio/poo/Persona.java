package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String apellido;
    public String email;
    public String cedula;
    public String telefono;

    public Persona (String nombre, String apellido, String email, String cedula, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    
}

