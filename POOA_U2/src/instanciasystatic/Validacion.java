/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instanciasystatic;

import javax.swing.JOptionPane;

/**
 * Clase con métodos utilitarios para validar elementos de manera básica
 * @author paveg
 */
public class Validacion {
    /**
     * Verifica que el entero recibido como parámetro esté dentro del rango indicado
     * @param valor Entero a revisar
     * @param min Límite inferior (inclusivo) que puede tener valor
     * @param max  Límite superior (inclusivo) que puede tener valor
     * @return <b>true</b> si el valor está dentro del rango, <b>false</b> si 
     * está fuera del rango
     */
    public static boolean rangoValido(int valor,int min, int max){
        return (valor>=min && valor<=max);
//        if(valor>=min && valor<=max){
//            return true;
//        }else{
//            return false;
//        }
    }
//    -4376473
//    -1
//    7364
//    -
//    1-4
    public static boolean enteroValido(String valor){
        //valor=valor.trim();
        for (int i = 0; i < valor.length(); i++) {
            if(Character.isDigit(valor.charAt(i))==false)
                return false;
        }
        return true;
    }
}














