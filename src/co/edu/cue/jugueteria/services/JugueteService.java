package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;

public interface JugueteService {

    Juguete agregarJug(String nombre, double precio, int cantidad, String material);

}
