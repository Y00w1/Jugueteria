package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.impl.VentaServiceImpl;

import javax.swing.*;

public class VentaController {
    UsuarioController usuarioC = new UsuarioController();
    VentaServiceImpl ventaImp = new VentaServiceImpl();
    JugueteController jugueteC = new JugueteController();
    public Venta[] ventas = new Venta[10];
    int j=0;

    private boolean compararNombres(String clienteN, String empleadoN, Cliente[] clientes, Empleado[] empleados, int iterCli, int iterEmpl){
        boolean igualCli = false, igualEmpl = false;
        for (int i = 0; i < iterCli; i++) {
            igualCli = clientes[i].getNombre().equals(clienteN);
        }
        for (int i = 0; i < iterEmpl; i++) {
            igualEmpl = empleados[i].getNombre().equals(empleadoN);
        }
        return (igualCli && igualEmpl);
    }

    public void crearVenta(Juguete[] juguetes, int iter, Cliente[] clientes, Empleado[] empleados, int iterCli, int iterEmpl){
        try {
            String fechaVenta = JOptionPane.showInputDialog(null, "Ingrese la fecha");
            double descuento = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el descuento en porcentaje"));
            String cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente").toLowerCase();
            String empleado = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado").toLowerCase();
            boolean nombres = compararNombres(cliente, empleado, clientes, empleados, iterCli, iterEmpl);
            if (nombres){
                DetalleVenta[] detalleVentas = new DetalleVenta[10];
                int cant = 1;
                int i = 0;
                double totalPar = 0;
                while (cant!=0 && i<10){
                    String jugueteN = JOptionPane.showInputDialog(null, "Ingrese el nombre del juguete").toLowerCase();
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las unidades a comprar"));
                    System.out.println(juguetes[0].getNombre());
                    for (int k = 0; k <= iter; k++) {
                        System.out.println(juguetes[k].getNombre());
                        if (juguetes[k].getNombre().equals(jugueteN)){
                            if (unidades<juguetes[k].getCantidad()){
                                int nuevaCantidad = juguetes[k].getCantidad() - unidades;
                                juguetes[k].setCantidad(nuevaCantidad);
                                DetalleVenta detalleVenta=new DetalleVenta(unidades, juguetes[k]);
                                detalleVentas[i] = detalleVenta;
                                i++;
                                System.out.println(juguetes[k].getNombre()+"Se vendió\n quedan "+juguetes[k].getCantidad()+" existenicas");
                                totalPar=totalPar+(juguetes[k].getPrecio()*unidades);
                            }else {
                                System.out.print("Cantidad inválida");
                            }
                        }else{
                            System.out.println("no nombre");
                        }
                    }
                /*for (Juguete juguete : jugueteC.juguetes) {
                    if(String.valueOf(juguete)!="null"){
                        if(jugueteN.equals(String.valueOf(juguete.getNombre()))){
                            if (unidades<juguete.getCantidad()){
                                int nuevaCantidad = juguete.getCantidad() - unidades;
                                juguete.setCantidad(nuevaCantidad);
                                DetalleVenta detalleVenta=new DetalleVenta(unidades, juguete);
                                detalleVentas[i] = detalleVenta;
                                i++;
                                System.out.println(juguete.getNombre()+"Se vendió\n quedan "+juguete.getCantidad()+" existenicas");
                                totalPar=totalPar+(juguete.getCantidad()*unidades);
                            }else {
                                System.out.print("Cantidad inválida");
                            }
                        }else{
                            System.out.println("no nombre");
                        }
                    }else{
                        System.out.println("null");
                    }
                }*/
                    cant = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar un juguete \n 0.Terminar proceso"));
                }if (i==10){
                    System.out.println("No puede agregar mas juguetes");
                }
                double total = totalPar-((descuento*totalPar)/100);
                System.out.println(detalleVentas[0].getJuguete().getNombre());
                Venta venta = ventaImp.venderJug(fechaVenta, descuento, total, detalleVentas, cliente, empleado);
                ventas[j]=venta;
                j++;
            }else{
                System.out.println("Los nombres de empleado y cliente no coinciden");
            }
        }catch (Exception e){
            System.out.println(e+"");
        }
    }
}
