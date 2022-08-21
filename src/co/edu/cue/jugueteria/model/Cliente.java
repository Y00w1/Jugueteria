package co.edu.cue.jugueteria.model;

public class Cliente extends Usuario{

    private String fechaNac;
    private String correo;

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

    public Cliente(String nombre, String cedula, String telefono, String direccion, String fechaNac, String correo) {
        super(nombre, cedula, telefono, direccion);
        this.fechaNac = fechaNac;
        this.correo = correo;
    }
}
