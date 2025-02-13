/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import ejercicio.Materia;
import java.util.Scanner;
import practica.Carrera;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        //NombreClase variable=new NombreClase();
        //Scanner lector=new Scanner();
        Materia materia=new Materia();
        materia.nombre="Programacion Orientada a Objetos";
        materia.semestre=2;
        materia.clave="SC-002";
        
        Carrera carrera=new Carrera();
        materia.carrera=carrera;
        materia.horas=5;
        //materia.creditos=5;
        
        
    }
}
