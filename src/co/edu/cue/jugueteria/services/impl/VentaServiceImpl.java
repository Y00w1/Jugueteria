package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.VentaService;

import javax.swing.*;
    public class VentaServiceImpl implements VentaService {
    public Venta[] ventas = new Venta[10];
    int j=0;
    private boolean compararCliente(String clienteN,  Cliente[] clientes,  int clien){
        boolean igualCli = false;
        for (int i = 0; i < clien; i++) {
            if (clientes[i].getNombre().equals(clienteN)){
                igualCli = true;
                //posC = i;
            }
        }
        return igualCli;
    }
    private boolean validEmpleado(String empleadoN, Empleado[] empleados, int empl){
        boolean igualEmpl = false;
        for (int i = 0; i < empl; i++) {
            if (empleados[i].getNombre().equals(empleadoN)){
                igualEmpl = true;
                //posE=i;
            }
        }
        return igualEmpl;
    }
    public void venderJug(String fechaVenta, double descuento, String cliente, String empleado, Empleado[] empleados, Cliente[] clientes, Juguete[] juguetes, int empl, int clien, int jug) {
        //int posE = 0;
        //int posC = 0;
        try{
            boolean validCliente = compararCliente(cliente, clientes, clien);
            boolean validEmpleado = validEmpleado(empleado,empleados, empl);
            if (validCliente & validEmpleado){
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
                            if (unidades <= juguetes[k].getCantidad()){
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
                //empleados[posE].setVentas(empleados[posE].getVentas()+1);
                //clientes[posC].setCompras(clientes[posC].getCompras()+1);
                JOptionPane.showMessageDialog(null, "precio total "+ventas[j].getTotal());
                //System.out.println(empleados[posE].getVentas() +""+ clientes[posC].getCompras());
                j++;
            }else{
                System.out.println("Los nombres de empleado y cliente no coinciden");
            }
        }catch(Exception e){
            System.out.println(e+"");
        }
    }
}
