/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciasystatic;

import circulo.Punto;
import java.util.Scanner;

/**
 *
 * @author paveg
 */ 
public class NewClass {
    public static void main(String[] r) {
        Scanner lector=new Scanner(System.in);
        int x= lector.nextInt();
        int y=lector.nextInt();
        System.out.println(x);
        int z=x+y;
        System.out.println(z);
        
        
        Punto b;
        Punto p=new Punto(1,2);
        b=p;
        b.setX(10);
        System.out.println(p.getX());
        p=new Punto(3,4);
        b.setX(20);
        System.out.println(p.getX());
        Punto a=new Punto(1,1);
         
        
        int q=5;
        int w=q;
        q=q+1;
        System.out.println(w);
        
        
        
        
        
    }
    
}
