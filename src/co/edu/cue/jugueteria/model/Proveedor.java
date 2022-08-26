package co.edu.cue.jugueteria.model;

public class Proveedor {
    private String codigo;
    private String fecha;
    private String qos;
    private String material;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Proveedor(String codigo, String fecha, String qos, String material) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.qos = qos;
        this.material = material;
    }
}
