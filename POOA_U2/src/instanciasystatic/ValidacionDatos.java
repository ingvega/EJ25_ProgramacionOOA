/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciasystatic;

import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class ValidacionDatos {
    public static void main(String[] args) {
//        System.out.println(Validacion.enteroValido(""));
//        System.out.println(Validacion.enteroValido("-"));
//        System.out.println(Validacion.enteroValido("-100"));
//        System.out.println(Validacion.enteroValido("100"));
//        System.out.println(Validacion.enteroValido("     "));
//        System.out.println(Validacion.enteroValido("1 00"));
//        System.out.println(Validacion.enteroValido("0"));
//        System.out.println(Validacion.enteroValido("-0"));
        
        
        String respuesta;
        do{
            respuesta=JOptionPane.showInputDialog("Ingresa el semestre actual");
        }while(respuesta==null || respuesta.trim().equals("")
                || Validacion.enteroValido(respuesta)==false);
        
        int dato=Integer.parseInt(respuesta);
        
        if(Validacion.rangoValido(dato, 1, 13)){
            JOptionPane.showMessageDialog(null, "Semestre válido");
        }else{
            JOptionPane.showMessageDialog(null, "Semestre NO válido");
        }
        //JOptionPane.showMessageDialog(null, "El valor ingresado fue " + respuesta);
        
    }
}
