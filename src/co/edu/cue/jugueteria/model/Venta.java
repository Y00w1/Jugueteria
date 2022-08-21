package co.edu.cue.jugueteria.model;

public class Venta {
    private String fechaVenta;
    private double descuento;
    private double total;
    private DetalleVenta[] detalleVentas;
    private String cliente;
    private String empleado;

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DetalleVenta[] getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(DetalleVenta[] detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Venta(String fechaVenta, double descuento, double total, DetalleVenta[] detalleVentas, String cliente, String empleado) {
        this.fechaVenta = fechaVenta;
        this.descuento = descuento;
        this.total = total;
        this.detalleVentas = detalleVentas;
        this.cliente = cliente;
        this.empleado = empleado;
    }
}
