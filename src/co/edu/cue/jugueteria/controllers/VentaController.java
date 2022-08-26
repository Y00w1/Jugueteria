package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.impl.VentaServiceImpl;

import javax.swing.*;

public class VentaController {
    VentaServiceImpl ventaImp = new VentaServiceImpl();
    public void crearVenta(Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, int empl, int clien, int jug){
        try {
            String fechaVenta = JOptionPane.showInputDialog("Ingrese la fecha");
            double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento en porcentaje"));
            String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente").toLowerCase();
            String empleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado").toLowerCase();
            ventaImp.venderJug(fechaVenta, descuento, cliente, empleado, empleados, clientes, juguetes, empl, clien, jug);
    }catch (Exception e){
            System.out.println(e+"\n" +
                    "Datos inválidos");
        }
    }
}
