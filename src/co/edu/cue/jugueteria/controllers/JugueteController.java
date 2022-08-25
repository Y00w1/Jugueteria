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
    public void aumentarExist(Juguete[] juguetes, int iter){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete").toLowerCase();
        int aumentar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea aumentar"));
        jugueteImp.aumentarExist(nombre, juguetes, iter, aumentar);
    }
    public void juguetesTipo(Juguete[] juguetes, int iter){
        int[] cantTipo = new int[3];
        jugueteImp.juguetesTipo(juguetes, iter, cantTipo);
        JOptionPane.showMessageDialog(null, "Juguetes de plástico: "+cantTipo[0]+"\nJuguetes de tela: "+cantTipo[1]+"\nJuguetes electrónicos: "+cantTipo[2]);
    }
    public void totalJuguetes(Juguete[] juguetes, int iter){
        jugueteImp.totalJuguetes(juguetes, iter);
    }
    public void valorTotal(Juguete[] juguetes, int iter){
        jugueteImp.valorTotal(juguetes, iter);
    }
    public void masxTipo(Juguete[] juguetes, int iter){
        int max = jugueteImp.masxTipo(juguetes, iter);
        switch (max){
            case 0:
                JOptionPane.showMessageDialog(null, "Plástico tiene mas juguetes");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Tela tiene más juguetes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Electrónico tiene más juguetes");
                break;
            default:
                break;
        }
    }
    public void menorTipo(Juguete[] juguetes, int iter){
        int min = jugueteImp.menorTipo(juguetes, iter);
        switch (min) {
            case 0:
                JOptionPane.showMessageDialog(null, "Plástico tiene menos juguetes");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Tela tiene menos juguetes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Electrónico tiene menos juguetes");
                break;
            default:
                break;
        }
    }
    public void juguetesMay(Juguete[] juguetes, int iter){
        String[] juguetesM = new String[100];
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a comparar"));
        int tam = jugueteImp.juguetesMayor(juguetes, iter, juguetesM, valor);
        for (int i = 0; i < tam; i++) {
            System.out.println(juguetesM[i]);
        }
    }
}
