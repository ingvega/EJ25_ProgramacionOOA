/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 * @author paveg
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e=new Empleado();
        e.setNombre("Juan");
        e.setDireccion("Juarez 1, Centro, Uriangato");
        e.setTurno("Nocturno");
        System.out.println(e);
        
        Persona p=new Persona();
        p.setNombre("Juan");
        p.setDireccion("Juarez 1, Centro, Uriangato");
        System.out.println(p);
        
        System.out.println("-----------------");
        String nombre=p.getClass().getName().substring(p.getClass().getName().lastIndexOf(".")+1);
        System.out.println(nombre);
        System.out.println(e.getClass().getSimpleName());
        
        System.out.println(e.equals(p));
    }
    
}
