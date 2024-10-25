package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    private String direccion;

    public Cliente (String nombre, String apellido, String email, String cedula, String telefono, String direccion){
        super (nombre,apellido,email,cedula,telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente " + nombre + "," + direccion + "," + apellido + "," + email
                + "," + cedula + "," + telefono + "";
    }

    
}
