/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author paveg
 */
public class Alumno extends Persona {

    private String escuela;
    private int semestre;

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        String persona = "Alumno con nombre: " + getNombre()
                + " y lo puedes contactar en el teléfono: " + getTelefono()
                + ". Cursa el semestre " + semestre + " en la escuela:  "
                + escuela;
        return persona;
    }

//    @Override
//    public boolean equals(Object a) {
//        Alumno otro = (Alumno) a; //Unboxing
//        if (this.getNombre().equals(otro.getNombre())) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
