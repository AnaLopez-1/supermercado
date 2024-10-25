package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        // Crear el supermercado
        Supermercado supermercado = new Supermercado("MANA", "Armenia, Quindío", "7:00 am", "Las 3 B Bueno, Bonito y Barato", "10:00pm", 9648);

        // Crear cliente y empleado
        Cliente cliente = new Cliente("Dora", "López", "Dora@gmail.com", "10965432", "3126252424", "Carrera 98");
        Empleado empleado = new Empleado("Carlos", "Álvarez", "Arturho@gmail.com", "7550524", "370987543", "3.000.000");

        // Crear productos
        Producto producto = new Producto("Iphone", 10000000, 1396, "28/10/2025", 10);
        Producto producto2 = new Producto("Pepsi", 50000, 1212, "13/12/2024", 5);

        // Agregar cliente, empleado y productos al supermercado
        supermercado.agregarCliente(cliente);
        supermercado.agregarEmpleado(empleado);
        supermercado.agregarProducto(producto);
        supermercado.agregarProducto(producto2);

        // Crear la factura (sin total aún)
        Factura factura = new Factura(LocalDate.now(), 19.0, "F001", LocalTime.now());

        // Crear un detalle de factura y agregarlo a la factura
        DetalleFactura detalleFactura = new DetalleFactura(2, producto);
        factura.agregarDetalleFactura(detalleFactura);

        DetalleFactura detalleFactura2 = new DetalleFactura(3, producto2);
        factura.agregarDetalleFactura(detalleFactura2);

        // Mostrar el mensaje del supermercado
        Supermercado.mostrarMensaje(supermercado.toString());

        // Calcular y mostrar el subtotal de los detalles
        double totalDetalle = detalleFactura.calcularSubtotal();
        double totalDetalle2 = detalleFactura2.calcularSubtotal();
        Supermercado.mostrarMensaje("El subtotal del primer detalle es: " + totalDetalle);
        Supermercado.mostrarMensaje("El subtotal del segundo detalle es: " + totalDetalle2);

        // Calcular el total de la factura sumando todos los detalles
        double totalFactura = factura.calcularTotal();
        Supermercado.mostrarMensaje("El total de la factura es: " + totalFactura);
        Supermercado.mostrarMensaje(factura.toString());

        // Stock disponible de un producto
        Supermercado.mostrarMensaje("El stock disponible del producto " + producto.getNombre() + " es " + producto.getStock());

        // Stock disponible después de la compra
        producto.reducirStockProducto(detalleFactura.getCantidad());
        producto2.reducirStockProducto(detalleFactura2.getCantidad());

        // Mostrar el stock después de la reducción
        Supermercado.mostrarMensaje("El stock actualizado del producto " + producto.getNombre() + " es " + producto.getStock());
        Supermercado.mostrarMensaje("El stock actualizado del producto " + producto2.getNombre() + " es " + producto2.getStock());
    }
}