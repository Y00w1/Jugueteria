package co.edu.cue.jugueteria.model;

public class DetalleVenta {
    private int cantidad;
    private Juguete juguete;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public DetalleVenta(int cantidad, Juguete juguete) {
        this.cantidad = cantidad;
        this.juguete = juguete;
    }
}
