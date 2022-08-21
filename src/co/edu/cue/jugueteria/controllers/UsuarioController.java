package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class UsuarioController {
    UsuarioServiceImpl usuario = new UsuarioServiceImpl();
    public Empleado[] empleados = new Empleado[5];
    public Cliente[] clientes = new Cliente[20];
    int i = 0;
    int j = 0;

    public void crearEmpl(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección");
        String ingresoDato = JOptionPane.showInputDialog(null, "Ingrese la fecha de ingreso");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
        Empleado empleado = usuario.agregarEmpl(nombre, cedula, telefono, direccion, ingresoDato, salario);
        empleados[i]=empleado;
        i++;
    }
    public void crearCli(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente");
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono");
        String direccion = JOptionPane.showInputDialog(null, "Ingrese la dirección");
        String fechaNac = JOptionPane.showInputDialog(null,"Ingrese la fecha de nacimiento");
        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo");
        Cliente cliente = usuario.agregarCli(nombre, cedula, telefono, direccion, fechaNac, correo);
        clientes[j]=cliente;
        j++;
    }

}
