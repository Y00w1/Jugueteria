package co.edu.cue.jugueteria.model;

public class Empleado extends Usuario{
    private String ingresoDato;
    private double salario;
    private int ventas;

    public String getIngresoDato() {
        return ingresoDato;
    }

    public void setIngresoDato(String ingresoDato) {
        this.ingresoDato = ingresoDato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public Empleado(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario, int ventas) {
        super(nombre, cedula, telefono, direccion);
        this.ingresoDato = ingresoDato;
        this.salario = salario;
        this.ventas = ventas;
    }
}
