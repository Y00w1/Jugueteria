package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;

public interface JugueteService {
    void agregarJug(String nombre, double precio, int cantidad, int material);
    void disminuirExist(String nombre, Juguete[] juguetes, int iter, int dism);
    void aumentarExist(String nombre, Juguete[] juguetes, int iter, int aum);
    void juguetesTipo(Juguete[] juguetes, int iter, int[] cantTipo);
    void totalJuguetes(Juguete[] juguetes, int iter);
    void valorTotal(Juguete[] juguetes, int iter);
    int masxTipo(Juguete[] juguetes, int iter);
    int menorTipo(Juguete[] juguetes, int iter);
    int juguetesMayor(Juguete[] juguetes, int iter, String[] juguetesMay, double valor);
}
