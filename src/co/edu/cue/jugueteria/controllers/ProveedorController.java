package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.constants.Menu;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.services.impl.ProveedorServiceImlp;

import javax.swing.*;

public class ProveedorController {
    Menu menus = new Menu();
    ProveedorServiceImlp provServ = new ProveedorServiceImlp();
    public void agregarProv(){
        try{
            String codigo = JOptionPane.showInputDialog("Ingrese el código del proveedor");
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
            String qos = JOptionPane.showInputDialog("Ingrese la promesa de tiempo de entrega de productos (qos)");
            int mater = Integer.parseInt(JOptionPane.showInputDialog(menus.menuMater));
                provServ.agregarProv(codigo, fecha, qos, mater);
        }catch (Exception e){
            System.out.println(" "+e);
        }
    }
}
