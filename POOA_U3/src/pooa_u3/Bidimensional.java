/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa_u3;

/**
 *
 * @author paveg
 */
public class Bidimensional {

    private double base;
    private double altura;

    public Bidimensional() {
        System.out.println("Constructor de bidimensional");
        base = altura = 1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("La base debe ser mayor a cero ("+ base +")");
        }
    }

    public double getAltura() {
        return altura;
    }

    void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser mayor a cero ("+ altura +")");
        }
    }

    public void mostrarDimension() {
        System.out.println("Base: " + base + " Altura: " + altura);
    }
}
