package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.constants.Menu;
import co.edu.cue.jugueteria.services.impl.JugueteServiceImpl;

import javax.swing.*;
import java.util.Locale;

public class JugueteController {
    JugueteServiceImpl jugueteImp = new JugueteServiceImpl();
    Menu menus = new Menu();
    public JugueteServiceImpl getJugueteImp() {return jugueteImp;}
    public void crearJug(){
        String nombre = JOptionPane.showInputDialog("Escriba el nombre del juguete").toLowerCase();
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las existencias"));
        int mater = Integer.parseInt(JOptionPane.showInputDialog(menus.menuMater));
        jugueteImp.agregarJug(nombre, precio, cantidad, mater);
    }
    public void disminuirExist(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete").toLowerCase();
        int disminuir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea disminuir"));
        jugueteImp.disminuirExist(nombre, disminuir);
    }
    public void aumentarExist(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete").toLowerCase();
        int aumentar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea aumentar"));
        jugueteImp.aumentarExist(nombre, aumentar);
    }
    public void juguetesTipo() { jugueteImp.mostrarTipo(); }
    public void totalJuguetes(){ jugueteImp.totalJuguetes(); }
    public void valorTotal(){ jugueteImp.valorTotal(); }
    public void masxTipo(){  jugueteImp.masxTipo(); }
    public void menorTipo(){ jugueteImp.menorTipo(); }
    public void juguetesMay(){
        String[] juguetesM = new String[100];
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a comparar"));
        jugueteImp.juguetesMayor(juguetesM, valor);
    }
}
