package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.CompraProveedor;
import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Proveedor;
import co.edu.cue.jugueteria.services.CompraProvServ;

import javax.swing.*;

public class CompraProvServImp implements CompraProvServ {
    CompraProveedor[] compraProveedores = new CompraProveedor[10];
    int cantPr;
    public int getCantPr() { return cantPr; }
    public CompraProveedor[] getCompraProveedores() { return compraProveedores; }
    public void comprarProv(String provCodigo, Proveedor[] proveedores, int cantP, String jugNombre, Juguete[] juguetes, int cantJ, int cant) {
        boolean prov = false;
        boolean jug = false;
        int posP = 0;
        int posJ = 0;
        try{
            for (int i = 0; i < cantP; i++) {
                if (proveedores[i].getCodigo().equals(provCodigo)){
                    for (int j = 0; j < cantJ; j++) {
                        if (proveedores[i].getMaterial().equals(juguetes[j].getMaterial())){
                            prov = true;
                            posP = i;
                        }
                    }
                }
            }
            for (int i = 0; i < cantJ; i++) {
                if (juguetes[i].getNombre().equals(jugNombre)){
                    jug = true;
                    posJ = i;
                }
            }
            if (jug && prov){
                double precio = (juguetes[posJ].getPrecio()*cant)-(juguetes[posJ].getPrecio()*cant*(0.20));
                compraProveedores[cantPr] = new CompraProveedor(proveedores[posP], juguetes[posJ], precio);
                juguetes[posJ].setCantidad(juguetes[posJ].getCantidad()+cant);
                JOptionPane.showMessageDialog(null, "Se ha comprado\n" +
                        cant+" "+jugNombre+" al proveedor "+proveedores[posP].getCodigo()+"\n" +
                        "Precio: "+compraProveedores[cantPr].getPrecio());
                cantPr++;
            }else {
                System.out.println("El proveedor o juguete no coinciden (Recuerde que un proveedor solo tiene juguetes de un tipo)");
            }
        }catch (Exception e){
            System.out.println(" "+e);
        }
    }
}
