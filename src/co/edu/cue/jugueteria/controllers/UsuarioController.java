package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.impl.UsuarioServiceImpl;

import javax.swing.*;
import java.util.Locale;

public class UsuarioController {
    UsuarioServiceImpl usuario = new UsuarioServiceImpl();
    public Empleado[] empleados = new Empleado[5];
    public Cliente[] clientes = new Cliente[20];
    public int i = 0;
    public int j = 0;

    public void crearEmpl(){
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado").toLowerCase();
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula");
            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono");
            String direccion = JOptionPane.showInputDialog("Ingrese la dirección");
            String ingresoDato = JOptionPane.showInputDialog("Ingrese la fecha de ingreso");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));

            Empleado empleado = usuario.agregarEmpl(nombre, cedula, telefono, direccion, ingresoDato, salario);
            empleados[i]=empleado;
            i++;
        }catch (Exception e){
            System.out.print(e+"\n" +
                    "No se pudo crear el empleado");
        }
    }
    public void crearCli(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente").toLowerCase();
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección");
        String fechaNac = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento");
        String correo = JOptionPane.showInputDialog("Ingrese el correo");
        Cliente cliente = usuario.agregarCli(nombre, cedula, telefono, direccion, fechaNac, correo);
        clientes[j]=cliente;
        j++;
    }

}
