package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Supermercado {
    private String nombre;
    private String direccion;
    private String descripcion;
    private String horaApertura;
    private String horaCierre;
    private int id;
    private LinkedList<Cliente> clientes; 
    private LinkedList<Empleado> empleados;
    private LinkedList<Producto> productos;

    public Supermercado (String nombre, String direccion, String horaApertura, String descripcion, String horaCierre, int id){
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.id = id;
        clientes = new LinkedList<>();
        empleados = new LinkedList<>();
        productos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Supermercado " + nombre + ", direccion: " + direccion + ", descripcion: " + descripcion
                + ", horaApertura:" + horaApertura + ", horaCierre: " + horaCierre + ", id:" + id + "]";
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    
    
    
}
