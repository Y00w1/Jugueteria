package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    public Cliente agregarCli(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo) {
        return new Cliente(nombre, cedula, telefono, direccion, fechaNac, correo);
    }

    public Empleado agregarEmpl(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario) {
        return new Empleado(nombre, cedula, telefono, direccion, ingresoDato, salario);
    }
}
