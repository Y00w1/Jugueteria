package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;

public interface UsuarioService {
    void agregarCli(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo, int compras);

    void agregarEmpl(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario, int ventas);
    void mayorCompras();
    void mayorVentas();
}
