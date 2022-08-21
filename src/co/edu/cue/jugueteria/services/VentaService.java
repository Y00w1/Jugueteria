package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.DetalleVenta;
import co.edu.cue.jugueteria.model.Venta;

public interface VentaService {
    Venta venderJug(String fechaVenta, double descuento, double total, DetalleVenta[] detalleVentas, String cliente, String empleado);
}
