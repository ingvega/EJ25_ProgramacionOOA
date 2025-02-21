/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;
 
/** 
 *
 * @author paveg
 */
public class Circulo {
    private int radio;
    public Punto centro;
    
    public Circulo(int radio){
        if(radio>0){
            this.radio=radio;
        }else{
            this.radio=1;
            System.out.println("Radio no válido");
        }
        centro=new Punto(0,0);
        
    }
    
    public Circulo(int radio, Punto centro){
        if(radio>0){
            this.radio=radio;
        }else{
            this.radio=1;
            System.out.println("Radio no válido");
        }
        this.centro=centro;
    }
    
    
}
