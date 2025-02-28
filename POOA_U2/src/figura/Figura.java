package figura;

import circulo.Punto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Figura {
    private Punto vertices[]=new Punto[15];
    private int contador=0;
    
    public int getCantidadVertices(){
        return contador;
    }
            
    public boolean agregarVertice(Punto vertice){
        if(vertice==null){
            System.err.println("Vertice no valido (null)");
            return false;
        }
        
        if(contador==vertices.length){
            System.err.println("Ya no se pueden agregar mas vertices");
            return false;
        }
            
        //Buscar si el vértice ya existe
        for (int i = 0; i < contador; i++) {
            //if(vertices[i].equals(vertice)){
            if(vertices[i].getX()==vertice.getX() && 
                    vertices[i].getY()==vertice.getY()){
                System.err.println("El vertice que indicaste ya esta en la figura");
                return false;
            }
        }
        vertices[contador]=vertice;
        contador++;
        return true;
    }
    public String detectarFigura(){
        //Detectar punto, linea, triangulo, cuadrado, rectangulo,
        //trapecio, romboide, desconocida
        return null;
    }
    public String generarVertices(){
        //Una cadena que por línea imprima cada vértice
        /*
        (1,5)
        (6,7)
        (-1,8)
        
        Cuando no hay ninguno regresar la palabra Ninguno
        */
        return null;
    }
}
