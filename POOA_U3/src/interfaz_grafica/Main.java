/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_grafica;

/**
 *
 * @author paveg
 */
public class Main {
    public static void main(String[] args) {
        //Precargar los usuarios que se establecerán como usuarios registrados
        Informacion.usuariosRegistrados.add(new Usuario("Juan Perez","jPerez","123"));
        Informacion.usuariosRegistrados.add(new Usuario("José García","jGarcia","456"));
        Informacion.usuariosRegistrados.add(new Usuario("Laura Martínez","lMartinez","123"));
        Informacion.usuariosRegistrados.add(new Usuario("Paola Ramírez","pRamirez","456"));
        
        FrmInicioSesion frm=new FrmInicioSesion();
        frm.setVisible(true);
        
        //new FrmInicioSesion().setVisible(true);
        
    }
}








