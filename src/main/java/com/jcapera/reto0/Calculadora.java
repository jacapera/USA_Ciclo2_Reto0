package com.jcapera.reto0;

/**
 *
 * @author Jesus Capera
 */
public class Calculadora {
    
    public void suma(float num1, float num2){
        float sumar = num1 + num2;
        System.out.print(String.format("%.1f", sumar));
    }
    
    public void producto(float num1, float num2){
        float multiplicar = num1 * num2;
        System.out.print(String.format("%.1f", multiplicar));
    }
    
}
