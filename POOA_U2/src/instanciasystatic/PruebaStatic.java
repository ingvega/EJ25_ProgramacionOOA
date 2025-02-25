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
public class PruebaStatic {
    public static void main(String[] args) {
        Alumno a=new Alumno();
        a.setNoControl("S1");
        a.setNombre("Juan Perez");
        a.setSemestre(5);
        a.setVigente(true);
        a.setNumSemestres(12);
        
        Alumno a2=new Alumno();
        a2.setNoControl("S2");
        a2.setNombre("Maria Perez");
        a2.setSemestre(7);
        
        System.out.println(a2.getNumSemestres());
        a2.setNumSemestres(10);
        
        System.out.println(a.getNumSemestres());
        Alumno.numSemestres=13;
        a.numSemestres=9;
        
        
    }
}
