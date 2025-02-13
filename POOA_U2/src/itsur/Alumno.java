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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        /*int -> Integer
                 
         double -> Double
         */

        if (nombre != null && !nombre.equals("") && nombre.trim().length() >= 2) {
            nombre = nombre.trim();
            boolean valido = true;
            for (int i = 0; i < nombre.length(); i++) {
                Character c = nombre.charAt(i);
                if (!(Character.isLetter(c) || Character.isSpaceChar(c) || c == 'ñ' || c == '.')) {
                    valido = false;
                    break;
                }
            }
            if (valido) {
                this.nombre = nombre;
            } else {
                System.err.println("El nombre no puede caracteres no válidos");
            }
        } else {
            System.err.println("El nombre no puede estar vacío");
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
