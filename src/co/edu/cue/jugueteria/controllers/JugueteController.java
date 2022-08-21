package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.services.impl.JugueteServiceImpl;

import javax.swing.*;

public class JugueteController {
    JugueteServiceImpl jugueteImp = new JugueteServiceImpl();
    String material;
    public Juguete[] juguetes= new Juguete[100];
    int i = 0;

    public void crearJug(){
        String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del juguete");
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las existencias"));
        int mater = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que corresponda al material\n" +
                "1.Plástico\n" +
                "2.Tela\n" +
                "3.Eléctronico"));
        switch (mater){
            case 1:
                material = Material.plastico;
                break;
            case 2:
                material = Material.tela;
                break;
            case 3:
                material = Material.electr;
                break;
            default:
                break;
        }
        Juguete juguete = jugueteImp.agregarJug(nombre, precio, cantidad, material);
        juguetes[i] = juguete;
        i++;
    }
}
