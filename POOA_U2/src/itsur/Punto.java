/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsur;

/**
 *
 * @author paveg
 */
public class Punto {

    private int x=1;
    private int y=1;

    public Punto(){
        
    }
    /*
    Un método puede llamarse igual que otro
    pero debe variar en la cantidad y/o tipo
    de dato de los parámetros
    */
    public Punto(int x, int y){
//        if (x > 0) {
//            this.x = x;
//        } else {
//            System.out.println("X solo se aceptan valores positivos mayores a cero");
//        }
        setX(x);
        setY(y);
//        if (y > 0) {
//            this.y = y;
//        } else {
//            System.out.println("Y solo se aceptan valores positivos mayores a cero");
//        }
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        } else {
            System.out.println("Solo se aceptan valores positivos mayores a cero");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else {
            System.out.println("Solo se aceptan valores positivos mayores a cero");
        }
    }

}
