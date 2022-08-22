package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.services.impl.JugueteServiceImpl;

import javax.swing.*;
import java.util.Locale;

public class JugueteController {
    JugueteServiceImpl jugueteImp = new JugueteServiceImpl();
    String material;
    public Juguete[] juguetes= new Juguete[10];
    public int i = 0;

    public void crearJug(){
        String nombre = JOptionPane.showInputDialog("Escriba el nombre del juguete").toLowerCase();
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las existencias"));
        int mater = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que corresponda al material\n" +
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
                material = Material.electronico;
                break;
            default:
                break;
        }
        Juguete juguete = jugueteImp.agregarJug(nombre, precio, cantidad, material);
        juguetes[i] = juguete;
        i++;
    }
    public void disminuirExist(Juguete[] juguetes, int iter){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete").toLowerCase();
        int disminuir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea disminuir"));
        jugueteImp.disminuirExist(nombre, juguetes, iter, disminuir);
    }
}
