package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.DetalleVenta;
import co.edu.cue.jugueteria.model.Venta;
import co.edu.cue.jugueteria.services.VentaService;

public class VentaServiceImpl implements VentaService {
    public Venta[] ventas = new Venta[10];
    int j=0;
    public Venta venderJug(String fechaVenta, double descuento, double total, DetalleVenta[] detalleVentas, String cliente, String empleado) {
        return new Venta(fechaVenta, descuento, total, detalleVentas, cliente, empleado);
    }
}
