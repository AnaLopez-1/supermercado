package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Factura {
    private LocalDate fecha;
    private double iva;
    private String codigo;
    private LocalTime hora;
    private double total;
    private LinkedList<DetalleFactura> detalleFacturas;

    // Constructor de la factura
    public Factura(LocalDate fecha, double iva, String codigo, LocalTime hora) {
        this.fecha = fecha;
        this.iva = iva;
        this.codigo = codigo;
        this.hora = hora;
        this.total = 0;
        this.detalleFacturas = new LinkedList<>();  // Inicialización correcta de la lista
    }

    // Métodos getters y setters

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LinkedList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(LinkedList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }

    // Método para agregar un detalle a la factura
    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        detalleFacturas.add(detalleFactura);
    }

    // Método para calcular el total de la factura, incluyendo IVA
    public double calcularTotal() {
        total = 0;  
        for (DetalleFactura detalleFactura : detalleFacturas) {
            total += detalleFactura.calcularSubtotal();  // Suma los subtotales
        }
        total += total * iva / 100;  // Aplica el IVA
        return total;
    }

    @Override
    public String toString() {
        return "Factura: " + fecha + ", iva: " + iva + "%, codigo: " + codigo + "," + hora + ", total: " + total
                +",\n" + detalleFacturas;
    }
}

