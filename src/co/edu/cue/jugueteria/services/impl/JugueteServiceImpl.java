package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.model.Material;
import co.edu.cue.jugueteria.services.JugueteService;

import javax.swing.*;

public class JugueteServiceImpl implements JugueteService {
    public Juguete[] juguetes= new Juguete[10];
    public int i = 0;
    public void agregarJug(String nombre, double precio, int cantidad, int mater) {
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
        juguetes[i] = new Juguete(nombre, precio, cantidad, material);
        i++;
    }
    public void disminuirExist(String nombre, Juguete[] juguetes, int iter, int dism) {
        boolean existe = false;
        for (int i = 0; i < iter; i++) {
            if (juguetes[i].getNombre().equals(nombre) && juguetes[i].getCantidad()>=dism){
                existe=true;
                juguetes[i].setCantidad(juguetes[i].getCantidad()-dism);
                System.out.println("Hay "+juguetes[i].getCantidad() +" existencias del juguete "+juguetes[i].getNombre());
            }
        }if (!existe){
            System.out.println("No se encontró el nombre o la cantidad es incorrecta.");
        }
    }

    public void aumentarExist(String nombre, Juguete[] juguetes, int iter, int aum) {
        boolean existe = false;
        for (int i = 0; i < iter; i++) {
            if (juguetes[i].getNombre().equals(nombre)){
                existe=true;
                juguetes[i].setCantidad(juguetes[i].getCantidad()+aum);
                System.out.println("Hay "+juguetes[i].getCantidad() +" existencias del juguete "+juguetes[i].getNombre());
            }if (!existe){
                System.out.println("No se encontró el nombre o la cantidad es incorrecta.");
            }
        }
    }
    public void juguetesTipo(Juguete[] juguetes, int iter, int[] cantTipo) {
        for (int i = 0; i < iter; i++) {
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
    public void totalJuguetes(Juguete[] juguetes, int iter) {
        int total = 0;
        for (int i = 0; i < iter; i++) {
            total = total + juguetes[i].getCantidad();
        }
        JOptionPane.showMessageDialog(null, "Total de juguetes: "+total);
    }
    public void valorTotal(Juguete[] juguetes, int iter) {
        double total = 0;
        for (int i = 0; i < iter; i++){
            total = total + (juguetes[i].getCantidad()*juguetes[i].getPrecio());
        }
        JOptionPane.showMessageDialog(null, "Valor total juguetes: "+total);
    }
    public int masxTipo(Juguete[] juguetes, int iter) {
        int cantTipo[] = new int[3];
        this.juguetesTipo(juguetes, iter, cantTipo);
        int j = cantTipo[0];
        int max = 0;
        for (int i = 1; i < 3; i++) {
            if (cantTipo[i]>j){
                max = i;
                j=cantTipo[i];
            }
        }
        return max;
    }
    public int menorTipo(Juguete[] juguetes, int iter) {
        int cantTipo[] = new int[3];
        this.juguetesTipo(juguetes, iter, cantTipo);
        int j = cantTipo[0];
        int min = 0;
        for (int i = 1; i < 3; i++) {
            if (cantTipo[i]<j){
                min = i;
                j = cantTipo[i];
            }
        }
        return min;
    }
    public int juguetesMayor(Juguete[] juguetes, int iter, String[] juguetesMay, double valor) {
        int j = 0;
        for (int i = 0; i < iter; i++) {
            if (juguetes[i].getPrecio()>valor){
                juguetesMay[j] = juguetes[i].getNombre();
                j++;
            }
        }
        return j;
    }

}
