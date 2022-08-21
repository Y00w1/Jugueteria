package co.edu.cue.jugueteria.model;

public class DetalleVenta {
    private String cantidad;
    private Juguete juguete;

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public DetalleVenta(String cantidad, Juguete juguete) {
        this.cantidad = cantidad;
        this.juguete = juguete;
    }
}
