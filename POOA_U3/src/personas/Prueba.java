/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import javax.swing.JOptionPane;

/**
 *
 * @author paveg
 */
public class Prueba {

    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan Perez");
        p.setTelefono("4454577468");
//    System.out.println(p.convertirATexto());
//    JOptionPane.showMessageDialog(null,p.convertirATexto());
//    
//    System.out.println(p);
//    System.out.println(p.toString());
//    JOptionPane.showMessageDialog(null,p);

        Alumno a = new Alumno();
        a.setNombre("Maria Rodriguez");
        a.setTelefono("1234567890");
        a.setSemestre(1);
        a.setEscuela("ITSUR");
        
        Alumno b = new Alumno();
        b.setNombre("Maria Rodriguez");
        b.setTelefono("1234567890");
        b.setSemestre(1);
        b.setEscuela("ITSUR");

        System.out.println(a==b);
        System.out.println(a.equals("Maria"));
    }
}
