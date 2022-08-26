package co.edu.cue.jugueteria.model;

public class Cliente extends Usuario{

    private String fechaNac;
    private String correo;
    private int compras;

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public Cliente(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo, int compras) {
        super(nombre, cedula, telefono, direccion);
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.compras = compras;
    }
}
