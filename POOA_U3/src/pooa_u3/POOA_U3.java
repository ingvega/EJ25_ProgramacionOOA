/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooa_u3;

/**
 *
 * @author paveg
 */
public class POOA_U3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t=new Triangulo("Equilatero");
        t.setBase(0.5);
        t.setAltura(2);
        System.out.println(t.getBase());
        t.mostrarTipo();
        //System.out.println(t.base);
        System.out.println("-----------------------------------");
        System.out.println(t.convertirATexto());
        System.out.println("-----------------------------------");
        System.out.println(t.toString());
        System.out.println("-----------------------------------");
        System.out.println(t);
    
        Triangulo t1=new Triangulo("Equilatero");
        Triangulo t2=new Triangulo("Equilatero");
        t1.setBase(0.5);
        t1.setAltura(2);
        t2.setBase(0.5);
        t2.setAltura(2);
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals("Equilatero"));
    
    }
    
    
}
