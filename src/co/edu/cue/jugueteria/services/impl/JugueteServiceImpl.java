package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

public class JugueteServiceImpl implements JugueteService {

    public Juguete agregarJug(String nombre, double precio, int cantidad, String material) {
        return new Juguete(nombre, precio, cantidad, material);
    }
    public void disminuirExist(String nombre, Juguete[] juguetes, int iter, int dism) {
        boolean existe = false;
        for (int i = 0; i < iter; i++) {
            if (juguetes[i].getNombre().equals(nombre) && juguetes[i].getCantidad()>=dism){
                existe=true;
                juguetes[i].setCantidad(juguetes[i].getCantidad()-dism);
                System.out.println("Hay "+juguetes[i].getCantidad() +" existencias del juguete "+juguetes[i].getNombre());
            }if (!existe){
                System.out.println("No se encontró el nombre o la cantidad es incorrecta.");
            }
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
}
