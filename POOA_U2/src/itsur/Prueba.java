/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itsur;

/**
 *
 * @author paveg
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno a=new Alumno();
        //a.nombre="Juan";
        System.out.println(a.getSemestre());
        a.setSemestre((byte)5);
        a.setSemestre((byte)-1);
        System.out.println(a.getSemestre());
        a.setNombre("Juan");
        a.setNombre("      ");
        a.setNombre(null);
        a.setNombre("    s  ");
        System.out.println(a.getNombre());
        //System.out.println((int)a.inicialCarrera);
        
        //int x;
        //System.out.println(x);
    }
    
}
