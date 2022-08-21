package co.edu.cue.jugueteria.model;

public class Juguete {
    private String nombre;
    private double precio;
    private int cantidad;
    private String material;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Juguete(String nombre, double precio, int cantidad, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.material = material;
    }
}
