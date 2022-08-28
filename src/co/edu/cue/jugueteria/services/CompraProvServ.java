package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Proveedor;

public interface CompraProvServ {
    void comprarProv(String provCodigo, Proveedor[] proveedores, int cantP, String jugNombre, Juguete[] juguetes, int cantJ, int cant);
}
