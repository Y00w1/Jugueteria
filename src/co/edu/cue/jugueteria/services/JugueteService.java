package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;

public interface JugueteService {
    Juguete agregarJug(String nombre, double precio, int cantidad, String material);
    void disminuirExist(String nombre, Juguete[] juguetes, int iter, int dism);
    void aumentarExist(String nombre, Juguete[] juguetes, int iter, int aum);
    void juguetesTipo(Juguete[] juguetes, int iter);
    void totalJuguetes(Juguete[] juguetes, int iter);
    void valorTotal(Juguete[] juguetes, int iter);
}
