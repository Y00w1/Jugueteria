package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.impl.CompraProvServImp;

import javax.swing.*;

public class CompraProvController {
    CompraProvServImp compraImpl = new CompraProvServImp();
    public void compraProveedor(Juguete[] juguetes, int cantJ, Proveedor[] proveedores, int cantP){
        try {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));
            String provCodigo = JOptionPane.showInputDialog("Ingrese el código del proveedor");
            String jugueteNombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
            compraImpl.comprarProv(provCodigo, proveedores, cantP, jugueteNombre, juguetes, cantJ, cantidad);
        }catch (Exception e){
            System.out.println(" "+e);
        }
    }
}
