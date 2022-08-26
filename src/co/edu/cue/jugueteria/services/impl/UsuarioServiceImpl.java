package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
    public Empleado[] empleados = new Empleado[5];
    public Cliente[] clientes = new Cliente[20];
    public Empleado[] getEmpleados() {return empleados;}
    public Cliente[] getClientes() {return clientes; }
    public int i = 0;
    public int j = 0;
    public int getI() {return i;}
    public int getJ() {return j;}

    public void agregarCli(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo) {
        clientes[j] = new Cliente(nombre, cedula, telefono, direccion, fechaNac, correo);
        System.out.println(clientes[j].getNombre());
        j++;
    }

    public void agregarEmpl(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario) {
        empleados[i]= new Empleado(nombre, cedula, telefono, direccion, ingresoDato, salario);
        System.out.println(empleados[i].getNombre());
        i++;
    }
}
