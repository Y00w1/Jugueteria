package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class JugueteServiceImpl implements JugueteService {
    public Juguete[] juguetes = new Juguete[10];
    public Juguete[] getJuguetes() {return juguetes;}
    public int[] cantTipo = new int[3];
    String material = "";
    public int j = 0;
    public int getJ() {return j;}
    public void agregarJug(String nombre, double precio, int cantidad, int mater) {
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
        juguetes[j] = new Juguete(nombre, precio, cantidad, material);
        System.out.println(juguetes[j].getNombre());
        j++;
    }
    public void disminuirExist(String nombre, int dism) {
        boolean existe = false;
        for (int i = 0; i < j; i++) {
            if (juguetes[i].getNombre().equals(nombre) && juguetes[i].getCantidad() >= dism){
                existe = true;
                juguetes[i].setCantidad(juguetes[i].getCantidad()-dism);
                System.out.println("Hay "+juguetes[i].getCantidad() +" existencias del juguete "+juguetes[i].getNombre());
            }
        }if (!existe){
            System.out.println("No se encontró el nombre o la cantidad es incorrecta.");
        }
    }

    public void aumentarExist(String nombre, int aum) {
        boolean existe = false;
        for (int i = 0; i < j; i++) {
            if (juguetes[i].getNombre().equals(nombre)){
                existe=true;
                juguetes[i].setCantidad(juguetes[i].getCantidad()+aum);
                System.out.println("Hay "+juguetes[i].getCantidad() +" existencias del juguete "+juguetes[i].getNombre());
            }if (!existe){
                System.out.println("No se encontró el nombre o la cantidad es incorrecta.");
            }
        }
    }
    public void juguetesTipo(int[] cantTipo) {
        cantTipo[0]=0;
        cantTipo[1]=0;
        cantTipo[2]=0;
        for (int i = 0; i < j; i++) {
            switch (juguetes[i].getMaterial()){
                case "plastico":
                    cantTipo[0] = cantTipo[0] + juguetes[i].getCantidad();
                    break;
                case "tela":
                    cantTipo[1] = cantTipo[1] + juguetes[i].getCantidad();
                    break;
                case "electronico":
                    cantTipo[2] = cantTipo[2] + juguetes[i].getCantidad();
                    break;
                default:
                    break;
            }
        }
    }
    public void mostrarTipo() {
        juguetesTipo(cantTipo);
        JOptionPane.showMessageDialog(null, "Juguetes de plástico: "+cantTipo[0]+"\nJuguetes de tela: "+cantTipo[1]+"\nJuguetes electrónicos: "+cantTipo[2]);
    }
    public void totalJuguetes() {
        int total = 0;
        for (int i = 0; i < j; i++) {
            total = total + juguetes[i].getCantidad();
        }
        JOptionPane.showMessageDialog(null, "Total de juguetes: "+total);
    }
    public void valorTotal() {
        double total = 0;
        for (int i = 0; i < j; i++){
            total = total + (juguetes[i].getCantidad()*juguetes[i].getPrecio());
        }
        JOptionPane.showMessageDialog(null, "Valor total juguetes: "+total);
    }
    public void masxTipo() {
        this.juguetesTipo(cantTipo);
        int j = cantTipo[0];
        int max = 0;
        for (int i = 1; i < 3; i++) {
            if (cantTipo[i]>j){
                max = i;
                j=cantTipo[i];
            }
        }
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
    public void menorTipo() {
        this.juguetesTipo(cantTipo);
        int j = cantTipo[0];
        int min = 0;
        for (int i = 1; i < 3; i++) {
            if (cantTipo[i]<j){
                min = i;
                j = cantTipo[i];
            }
        }
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
    public void juguetesMayor(String[] juguetesMay, double valor) {
        int k = 0;
        for (int i = 0; i < j; i++) {
            if (juguetes[i].getPrecio()>valor){
                juguetesMay[k] = juguetes[i].getNombre();
                k++;
            }
        }
        for (int l = 0; l < j; l++) {
            System.out.println(juguetesMay[l]);
        }
    }
}
