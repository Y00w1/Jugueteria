package co.edu.cue.jugueteria.model;

public class CompraProveedor {
    private Proveedor proveedor;
    private Juguete juguete;
    private Double precio;

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public CompraProveedor(Proveedor proveedor, Juguete juguete, Double precio) {
        this.proveedor = proveedor;
        this.juguete = juguete;
        this.precio = precio;
    }
}
