package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

import javax.swing.*;

public class UsuarioServiceImpl implements UsuarioService {
    public Empleado[] empleados = new Empleado[5];
    public Cliente[] clientes = new Cliente[20];
    public Empleado[] getEmpleados() {return empleados;}
    public Cliente[] getClientes() {return clientes; }
    public int i = 0;
    public int j = 0;
    public int getI() {return i;}
    public int getJ() {return j;}

    public void agregarCli(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo, int compras) {
        clientes[j] = new Cliente(nombre, cedula, telefono, direccion, fechaNac, correo, compras);
        System.out.println(clientes[j].getNombre());
        j++;
    }

    public void agregarEmpl(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario, int ventas) {
        empleados[i]= new Empleado(nombre, cedula, telefono, direccion, ingresoDato, salario, ventas);
        System.out.println(empleados[i].getNombre());
        i++;
    }
    public void mayorCompras() {
            int comp = clientes[0].getCompras();
            int mayor = 0;
            for (int i = 1; i < j; i++){
                if (clientes[i].getCompras() > comp){
                    mayor = i;
                }
            }
        JOptionPane.showMessageDialog(null, "El cliente con mayores compras es: "+clientes[mayor].getNombre());
    }
    public void mayorVentas() {
        int comp = empleados[0].getVentas();
        int mayor = 0;
        for (int k = 0; k < i; k++) {
            if (empleados[k].getVentas() > comp){
                mayor = k;
            }
        }
        JOptionPane.showMessageDialog(null, "El mejor empleado es: "+empleados[mayor].getNombre());
    }
}
