package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Juguete;

public interface JugueteService {
    void agregarJug(String nombre, double precio, int cantidad, int material);
    void disminuirExist(String nombre, int dism);
    void aumentarExist(String nombre, int aum);
    void juguetesTipo(int[] cantTipo);
    void mostrarTipo();
    void totalJuguetes();
    void valorTotal();
    void masxTipo();
    void menorTipo();
    void juguetesMayor(String[] juguetesMay, double valor);
}
