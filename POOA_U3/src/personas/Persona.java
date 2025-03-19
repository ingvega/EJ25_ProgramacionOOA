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
public class Persona{
  private String nombre;
  private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  
    public String convertirATexto(){
      	String persona="Persona con nombre: " + nombre + 
          " y la puedes contactar en el teléfono: " + telefono;
      	return persona;
    }
    
    public String toString(){
      String persona="Persona con nombre: " + nombre + 
          " y la puedes contactar en el teléfono: " + telefono;
      	return persona;
    }
}

