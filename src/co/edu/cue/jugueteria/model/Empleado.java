package co.edu.cue.jugueteria.model;

public class Empleado extends Usuario{
    private String ingresoDato;
    private double salario;

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

    public Empleado(String nombre, String cedula, String telefono, String direccion, String ingresoDato, double salario) {
        super(nombre, cedula, telefono, direccion);
        this.ingresoDato = ingresoDato;
        this.salario = salario;
    }
}
