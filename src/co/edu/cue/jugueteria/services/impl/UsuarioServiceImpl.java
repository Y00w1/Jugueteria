package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
    public Empleado[] empleados = new Empleado[5];
    public Cliente[] clientes = new Cliente[20];
    public int i = 0;
    public int j = 0;

    public void agregarCli(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo) {
        clientes[j] = new Cliente(nombre, cedula, telefono, direccion, fechaNac, correo);
        j++;
    }

    public void agregarEmpl(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario) {
        empleados[i]= new Empleado(nombre, cedula, telefono, direccion, ingresoDato, salario);
        i++;
    }
}
