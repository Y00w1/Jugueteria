package co.edu.cue.jugueteria.application;

import co.edu.cue.jugueteria.constants.Menu;
import co.edu.cue.jugueteria.controllers.JugueteController;
import co.edu.cue.jugueteria.controllers.ProveedorController;
import co.edu.cue.jugueteria.controllers.UsuarioController;
import co.edu.cue.jugueteria.controllers.VentaController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioController usuarioC = new UsuarioController();
        JugueteController jugueteC = new JugueteController();
        VentaController ventaC = new VentaController();
        ProveedorController provC = new ProveedorController();
        Menu menus = new Menu();
       int op = 1;
       int op1;
       int opInf;

       while (op!=0){
           op = Integer.parseInt(JOptionPane.showInputDialog(menus.menu));
           switch (op){
               case 1:
                   op1 = Integer.parseInt(JOptionPane.showInputDialog(menus.menu1));
                   switch (op1){
                       case 1:
                           jugueteC.crearJug();
                           break;
                       case 2:
                           usuarioC.crearCli();
                           break;
                       case 3:
                           usuarioC.crearEmpl();
                           break;
                       case 4:
                           provC.agregarProv();
                           break;
                       default:
                           break;
                   }

                   break;
               case 2:
                   ventaC.crearVenta(usuarioC.getUsuario().getEmpleados(), usuarioC.getUsuario().getClientes(), jugueteC.getJugueteImp().getJuguetes(), usuarioC.getUsuario().getI(), usuarioC.getUsuario().getJ(), jugueteC.getJugueteImp().getJ());
//                   System.out.print(ventaC.ventas[0].getDetalleVentas()[0].getJuguete()+" "+ventaC.ventas[0].getTotal());
                   break;
               case 3:
                   jugueteC.disminuirExist();
                   break;
               case 4:
                   jugueteC.aumentarExist();
                   break;
               case 5:
                   opInf = Integer.parseInt(JOptionPane.showInputDialog(menus.menuInf));
                   switch (opInf){
                       case 1:
                           jugueteC.juguetesTipo();
                           break;
                       case 2:
                           jugueteC.totalJuguetes();
                           break;
                       case 3:
                           jugueteC.valorTotal();
                           break;
                       case 4:
                           jugueteC.masxTipo();
                           break;
                       case 5:
                           jugueteC.menorTipo();
                           break;
                       case 6:
                           jugueteC.juguetesMay();
                           break;
                       default:
                           break;
                   }
                   break;
               default:
                   break;
           }
       }
    }
}