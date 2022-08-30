package com.jcapera.reto0;

/**
 *
 * @author Jesus Capera
 */
public class Calculadora {
    private float num1;
    private float num2;

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public void suma(float num1, float num2){
        float sumar = num1 + num2;
        System.out.print(String.format("%.1f", sumar));
    }
    
    public void producto(float num1, float num2){
        float multiplicar = num1 * num2;
        System.out.print(String.format("%.1f", multiplicar));
    }
    
}
