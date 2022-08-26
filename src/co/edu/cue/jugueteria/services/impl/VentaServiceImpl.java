package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.VentaService;

import javax.swing.*;
    public class VentaServiceImpl implements VentaService {
    public Venta[] ventas = new Venta[10];
    int j=0;
    private boolean compararNombres(String clienteN, String empleadoN,Empleado[] empleados, Cliente[] clientes, int empl, int clien){
        boolean igualCli = false, igualEmpl = false;
        for (int i = 0; i < clien; i++) {
            igualCli = clientes[i].getNombre().equals(clienteN);
        }
        for (int i = 0; i < empl; i++) {
            igualEmpl = empleados[i].getNombre().equals(empleadoN);
        }
        return (igualCli && igualEmpl);
    }
    public void venderJug(String fechaVenta, double descuento, String cliente, String empleado, Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, int empl, int clien, int jug) {
        try{
            boolean nombres = compararNombres(cliente, empleado, empleados, clientes, empl, clien);
            if (nombres){
                DetalleVenta[] detalleVentas = new DetalleVenta[10];
                int cant = 1;
                int i = 0;
                double totalPar = 0;
                while (cant!=0 && i<10){
                    String jugueteN = JOptionPane.showInputDialog("Ingrese el nombre del juguete").toLowerCase();
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades a comprar"));
                    for (int k = 0; k <= jug-1; k++) {
                        System.out.println(juguetes[k].getNombre());
                        if (juguetes[k].getNombre().equals(jugueteN)){
                            if (unidades< juguetes[k].getCantidad()){
                                int nuevaCantidad = juguetes[k].getCantidad() - unidades;
                                juguetes[k].setCantidad(nuevaCantidad);
                                DetalleVenta detalleVenta=new DetalleVenta(unidades, juguetes[k]);
                                String infoMat = "";
                                switch (juguetes[k].getMaterial()){
                                    case "plastico":
                                        infoMat= "El juguete no requiere cuidados especiales";
                                        break;
                                    case "tela":
                                        infoMat="El juguete no debe ser mojado";
                                        break;
                                    case "electronico":
                                        infoMat= "El juguete no debe ser mojado y requiere baterías";
                                        break;
                                    default:
                                        break;
                                }
                                detalleVentas[i] = detalleVenta;
                                i++;
                                System.out.println(juguetes[k].getNombre()+"Se vendió\n quedan "+juguetes[k].getCantidad()+" existenicas");
                                totalPar = totalPar+(juguetes[k].getPrecio()*unidades);
                                JOptionPane.showMessageDialog(null, infoMat);
                            }else {
                                System.out.print("Cantidad inválida");
                            }
                        }else{
                            System.out.println("no nombre");
                        }
                    }
                    cant = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar un juguete \n 0.Terminar proceso"));
                }if (i==10){
                    System.out.println("No puede agregar mas juguetes");
                }
                double total = totalPar-((descuento*totalPar)/100);
                ventas[j] = new Venta(fechaVenta, descuento, total, detalleVentas, cliente, empleado);
                JOptionPane.showMessageDialog(null, "precio total "+ventas[j].getTotal());
                j++;
            }else{
                System.out.println("Los nombres de empleado y cliente no coinciden");
            }
        }catch(Exception e){
            System.out.println(e+"");
        }
    }
}
