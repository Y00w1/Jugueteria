package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.ProveedorService;

import javax.swing.*;

public class ProveedorServiceImlp implements ProveedorService {
    private Proveedor[] proveedores = new Proveedor[10];
    public Proveedor[] getProveedores() {return proveedores;}
    int cant = 0;
    public int getCant() {return cant;}
    public void agregarProv(String codigo, String fecha, String qos, int mater) {
        if (mater<4){
            String material = "";
            switch (mater){
                case 1:
                    material = Material.plastico;
                    break;
                case 2:
                    material = Material.tela;
                    break;
                case 3:
                    material = Material.electronico;
                    break;
                default:
                    break;
            }
        proveedores[cant] = new Proveedor(codigo, fecha, qos, material);
            JOptionPane.showMessageDialog(null, "Se agregó el proveedor de código "+proveedores[cant].getCodigo());
        cant++;
        }
    }
}
