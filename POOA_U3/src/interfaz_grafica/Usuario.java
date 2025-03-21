/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_grafica;

import java.util.Objects;

/**
 *
 * @author paveg
 */
public class Usuario {
    private String nombre;
    private String usuario;
    private String contrasenia;

    public Usuario(String nombre, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
//        return this.usuario.equals(other.usuario);
//        if(this.usuario.equals(other.usuario))
//            return true;
//        else 
//            return false;
        return Objects.equals(this.usuario, other.usuario);
    }
    
    
}
