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
        String respuesta;
        do{
            respuesta=JOptionPane.showInputDialog("Ingresa el semestre actual");
        }while(respuesta==null || respuesta.trim().equals(""));
        
        int dato=Integer.parseInt(respuesta);
        
        if(Validacion.rangoValido(dato, 1, 13)){
            JOptionPane.showMessageDialog(null, "Semestre válido");
        }else{
            JOptionPane.showMessageDialog(null, "Semestre NO válido");
        }
        //JOptionPane.showMessageDialog(null, "El valor ingresado fue " + respuesta);
        
    }
}
