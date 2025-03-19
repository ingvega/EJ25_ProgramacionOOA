/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa_u3;

import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class PruebaEquals {
    public static void main(String[] args) {
        //Triangulo[]
        ArrayList<Triangulo> lista=new ArrayList<>();
        Triangulo t=new Triangulo("Rectangulo");
        t.setBase(5);
        t.setAltura(10);
        lista.add(t);
        
        t=new Triangulo("Equilatero");
        t.setBase(5);
        t.setAltura(4.7);
        lista.add(t);
        
        Triangulo t1=new Triangulo("Rectangulo");
        t1.setBase(5);
        t1.setAltura(4.7);
        
        System.out.println(lista.contains(t1));
        
        
    }
}
