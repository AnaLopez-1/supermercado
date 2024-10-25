package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private String salario;

    public Empleado (String nombre, String apellido, String email, String cedula, String telefono, String salario){
        super (nombre,apellido,email,cedula,telefono);
        this.salario = salario;
    
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salario=" + salario + ", apellido=" + apellido + ", email=" + email
                + ", cedula=" + cedula + ", telefono=" + telefono + "]";
    }  
}