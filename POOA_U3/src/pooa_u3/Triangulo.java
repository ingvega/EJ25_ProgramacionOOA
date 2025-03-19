/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooa_u3;

/**
 *
 * @author paveg
 */
public class Triangulo extends Bidimensional {

    private String tipo;

    public Triangulo(String tipo) {
        System.out.println("Constructor de triangulo");
        switch (tipo.toLowerCase()) {
            case "equilatero":
            case "isosceles":
            case "escaleno":
            case "rectangulo":
                this.tipo = tipo;
                break;
            default:
                System.out.println("Tipo de triángulo no válido (se asignará "
                        + "como Isosceles)");
                this.tipo = "Isosceles";
        }
    }

    @Override
    public void setAltura(double altura) {
        if (altura >= 1) {
            super.setAltura(altura);
        } else {
            System.out.println("La altura debe ser mayor o igual a uno (" + altura + ")");
        }
    }
    
    public void setAltura(int altura) {
        if (altura >= 1) {
            super.setAltura(altura);
        } else {
            System.out.println("La altura debe ser mayor o igual a uno (" + altura + ")");
        }
    }
    
    public int setAltura(int altura, int o) {
        if (altura >= 1) {
            super.setAltura(altura);
        } else {
            System.out.println("La altura debe ser mayor o igual a uno (" + altura + ")");
        }
        return 0;
    }

    public void mostrarTipo() {
        System.out.println("Triangulo de tipo " + tipo);
    }

    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }

    public String convertirATexto() {
        String triangulo = "Figura de tipo triángulo con:\n"
                + "Base: " + getBase()
                + "\nAltura: " + getAltura()
                + "\nde tipo: " + tipo;
        return triangulo;
    }

    @Override
    public String toString() {
        String triangulo = "Figura de tipo triángulo con:\n"
                + "Base: " + getBase()
                + "\nAltura: " + getAltura()
                + "\nde tipo: " + tipo
                + "\n" + super.toString();
        return triangulo;
    }
    
    public boolean equals(Object obj){
        Triangulo otro=(Triangulo)obj;
        if(this.getBase()==otro.getBase() &&
                this.getAltura()==otro.getAltura())
            return true;
        else return false;
    }
    
    public boolean igual(Object obj){
        Triangulo otro=(Triangulo)obj;
        if(this.getBase()==otro.getBase() &&
                this.getAltura()==otro.getAltura() &&
                this.tipo.equalsIgnoreCase(otro.tipo))
            return true;
        else return false;
    }
}
