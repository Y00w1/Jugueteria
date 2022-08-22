package co.edu.cue.jugueteria.application;

import co.edu.cue.jugueteria.controllers.JugueteController;
import co.edu.cue.jugueteria.controllers.UsuarioController;
import co.edu.cue.jugueteria.controllers.VentaController;
import co.edu.cue.jugueteria.model.Juguete;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioController usuarioC = new UsuarioController();
        JugueteController jugueteC = new JugueteController();
        VentaController ventaC = new VentaController();

       String menu = "1.Agregar un nuevo juguete, cliente o empleado\n" +
               "2.Vender juguetes\n" +
               "3.Disminuir existencias de juguete\n" +
               "4.Aumentar existencias de juguete\n" +
               "0.Finalizar";
       int op = 1;
       String menu1 = "1.Agregar juguete\n" +
               "2.Agregar cliente\n" +
               "3.Agregar empleado\n" +
               "0.cancelar";
        int op1;

       while (op!=0){
           op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
           switch (op){
               case 1:
                   op1 = Integer.parseInt(JOptionPane.showInputDialog(null, menu1));
                   switch (op1){
                       case 1:
                           jugueteC.crearJug();
                           System.out.println(jugueteC.juguetes[jugueteC.i-1].getNombre());
                           break;
                       case 2:
                           usuarioC.crearCli();
                           System.out.println(jugueteC.juguetes[jugueteC.i-1].getNombre());
                           break;
                       case 3:
                           usuarioC.crearEmpl();
                           break;
                       default:
                           break;
                   }

                   break;
               case 2:
                   ventaC.crearVenta(jugueteC.juguetes, jugueteC.i, usuarioC.clientes, usuarioC.empleados, usuarioC.j, usuarioC.i);
//                   System.out.print(ventaC.ventas[0].getDetalleVentas()[0].getJuguete()+" "+ventaC.ventas[0].getTotal());
                   break;
           }
       }
    }
}