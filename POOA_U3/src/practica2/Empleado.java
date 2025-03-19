/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author paveg
 */
public class Empleado extends Persona {

    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        if (turno.equalsIgnoreCase("Matutino")
                || turno.equalsIgnoreCase("Vespertino")
                || turno.equalsIgnoreCase("Nocturno")) {
            this.turno = turno;
        } else {
            System.out.println("Turno no válido");
        }
    }

    public String toString() {
        return super.toString()
                + "\nTurno: " + turno;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }

        Empleado otro = (Empleado) obj;
        if (this.getNombre().equalsIgnoreCase(otro.getNombre())
                && this.getDireccion().equalsIgnoreCase(otro.getDireccion())) {
            return true;
        } else {
            return false;
        }
    }

}
