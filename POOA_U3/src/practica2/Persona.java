/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author paveg
 */
public class Persona {
    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /*
    Persona con nombre: X, direccion: Y
    Empleado con nombre: X, direccion....
    */
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() +
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion;
                
    }
}
