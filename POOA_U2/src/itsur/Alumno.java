/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

import java.util.Date;

/**
 *
 * @author paveg
 */
public class Alumno {

    private String noControl;
    private String nombre;
    private String apellidos;
    private byte semestre;
    private Date fechaIngreso;

    public String getNoControl(){
        return noControl;
    }
    
    public void setNoControl(String noControl){
        //"   s24120001   "
        
        String patron="[sgademtc][0-9]{2}12[0-9]{4}";
        if(noControl!=null && noControl.trim().toLowerCase().matches(patron)){
            this.noControl=noControl.trim();
        }else{
            System.err.println("Número de control no válido");
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        /*int -> Integer      
         double -> Double
         */
        String patronNombres="[a-zA-Z .ñÑáéíóúÁÉÍÓÚ]{2,35}";
        if (nombre != null && !nombre.trim().matches(patronNombres)) {
            
            this.nombre=nombre.trim();
//            nombre = nombre.trim();
//            boolean valido = true;
//            for (int i = 0; i < nombre.length(); i++) {
//                char c = nombre.charAt(i);
//                if (!(Character.isLetter(c) || Character.isSpaceChar(c) || c == 'ñ' || c == '.')) {
//                    valido = false;
//                    break;
//                }
//            }
//            if (valido) {
//                this.nombre = nombre;
//            } else {
//                System.err.println("El nombre no puede caracteres no válidos");
//            }
        } else {
            System.err.println("El nombre no puede estar vacío, debe "
                    + "tener caracteres válidos y una longitud entre 2 y 35 caracteres");
        }
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        if (semestre > 0 && semestre <= 13) {
            this.semestre = semestre;
        } else {
            System.err.println("Semestre no válido");
        }
    }
}
