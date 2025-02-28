/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

import circulo.Punto;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Prueba {
//    public static void main(String[] args) {
//        Figura f=new Figura();
//        f.agregarVertice(new Punto(1,1));
//        f.agregarVertice(new Punto(1,1));
//        System.out.println(f.getCantidadVertices());
//    }

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        Figura f=new Figura();
        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Agregar un vertice");
            System.out.println("2. Contar vertices");
            System.out.println("3. Detectar tipo de figura");
            System.out.println("4. Imprimir vertices");
            System.out.println("5. Reiniciar figura");
            System.out.println("Salir (cualquier otro valor)");
            System.out.println("-------------------------------------------------");
            String respuesta=lector.next();
            switch (respuesta) {
                case "1":
                    System.out.println("Ingresa X y Y");
                    int x=lector.nextInt();
                    int y=lector.nextInt();
                    Punto p=new Punto(x,y);
                    if(f.agregarVertice(p))
                        System.out.println("Vertice agregado");
                    break;
                case "2":
                    System.out.println("La figura actualmente tiene: " +
                            f.getCantidadVertices());
                    break;
                case "3":
                    System.out.println("La figura es: " + 
                            f.detectarFigura());
                    break;
                case "4":
                    System.out.println("La figura tiene los siguientes vertices: \n" + 
                            f.generarVertices());
                    break;
                case "5":
                    f=new Figura();
                    System.out.println("Figura reiniciada");
                    break;
                default:
                    return;
            }
        }
    }
}
