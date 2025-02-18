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
public class PruebaPunto {
    public static void main(String[] args) {
        Punto p=new Punto();
        System.out.println(p.getX());
        System.out.println(p.getY());
        p=new Punto(0,0);
        System.out.println(p.getX());
        System.out.println(p.getY());
        
        Date fecha=new Date();
        System.out.println(fecha);
    }
}
