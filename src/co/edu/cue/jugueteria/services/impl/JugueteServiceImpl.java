package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Juguete;
import co.edu.cue.jugueteria.services.JugueteService;

public class JugueteServiceImpl implements JugueteService {

    public Juguete agregarJug(String nombre, double precio, int cantidad, String material) {
        return new Juguete(nombre, precio, cantidad, material);
    }
}
