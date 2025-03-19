/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class PruebaEquals {
    public static void main(String[] args) {
        Alumno[] arreglo=new Alumno[5];
        ArrayList<Alumno> lista=new ArrayList<>();
        
        Alumno a=new Alumno();
        a.setNombre("Juan Perez");
        a.setEscuela("ITSUR");
        arreglo[0]=a;
        lista.add(a);
        
        a=new Alumno();
        a.setNombre("JUAN PEREZ");
        a.setEscuela("ITSUR");
        arreglo[1]=a;
        lista.add(a);
        
        a=new Alumno();
        a.setNombre("Luis Juarez");
        a.setEscuela("UDL");
        arreglo[2]=a;
        lista.add(a);
        
        Alumno alumnoBuscar=new Alumno();
        alumnoBuscar.setNombre("JUAN PEREZ");
        
        for (int i = 0; i < 3; i++) {
            //if(arreglo[i].getNombre().equals(alumnoBuscar.getNombre()))
            if(arreglo[i].equals(a)){
                System.out.println("Encontrado");
                System.out.println("Está en la posición " + i);
            }
        }
        
        System.out.println("Encontrado? " + lista.contains(a));
        System.out.println("Esta en la posicion  " + lista.indexOf(a));
        
    }
}
