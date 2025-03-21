/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz_grafica;

import java.awt.Dimension;

/**
 *
 * @author paveg
 */
public class U3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmEjemplo pantalla=new FrmEjemplo();
        pantalla.setVisible(true);
        pantalla.setPreferredSize(new Dimension(400, 400));
        pantalla.pack();
    }
    
}
