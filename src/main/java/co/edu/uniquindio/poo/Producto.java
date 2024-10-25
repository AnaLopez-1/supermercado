package co.edu.uniquindio.poo;

public class Producto {
    private String nombre;
    private double precioUnitario;
    private int id;
    private String fechaVencimiento;
    private int stock;

    public Producto (String nombre, double precioUnitario, int id, String fechaVencimiento, int stock){
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.stock=stock;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }


    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + "," + precioUnitario + ", id: " + id
                + ", fechaVencimiento: " + fechaVencimiento;
    }

    public boolean reducirStockProducto(int cantidad){
        if (cantidad<=stock){
            stock-=cantidad;
            return true;
        }else{
            return false;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

