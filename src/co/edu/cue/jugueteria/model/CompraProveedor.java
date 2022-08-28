package co.edu.cue.jugueteria.model;

public class CompraProveedor {
    private Proveedor proveedor;
    private Juguete juguete;
    private double precio;

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CompraProveedor(Proveedor proveedor, Juguete juguete, double precio) {
        this.proveedor = proveedor;
        this.juguete = juguete;
        this.precio = precio;
    }
}
