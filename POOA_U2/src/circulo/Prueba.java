/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        Circulo c=new Circulo(5);
        Punto centro=null;
        Circulo c2=new Circulo(5,centro);
        System.out.println(c2.centro.getX() + ", " + 
                c2.centro.getY());
    }
}
