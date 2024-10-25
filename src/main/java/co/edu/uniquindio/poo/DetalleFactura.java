package co.edu.uniquindio.poo;

public class DetalleFactura {
    private int cantidad;
    private Producto producto;

    public DetalleFactura (int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        
    }
    
    @Override
    public String toString() {
        return "DetalleFactura cantidad: " + cantidad + ", " + producto + "";
    }

    public double calcularSubtotal (Producto producto){
        return cantidad * producto.getPrecioUnitario();
    }

    public void calcularSubtotalStock(){
        if(producto.reducirStockProducto(cantidad)){
            this.subTotal=calcularSubtotal();
        }else{
            Supermercado.mostrarMensaje("Stock insuficiente para el producto:"+producto.getNombre());
            this.subTotal=0;
        }
    }
}
