package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.*;

public interface VentaService {
    void venderJug(String fechaVenta, double descuento, String cliente, String empleado, Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, int empl, int clien, int jug);
}
