package com.jcapera.reto0;

import java.util.Scanner;

/**
 * Casos de prueba:
 * Entrada 2 4 / Salida 6.0 8.0
 * Entrada 5 5 / Salida 10.0 25.0
 * Entrada 0 2 / Salida 2.0 0.0
 * Entrada 4 5 / Salida 9.0 20.0
 * Entrada 0 0 / Salida 0.0 0.0
 * @author jesus capera
 */
public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        // captura de datos por pantalla en una unica linea
        String ingresoDatos = sc.nextLine();
        
        String[] datosNumericos = ingresoDatos.split(" ");
        double num1 = Double.parseDouble(datosNumericos[0]);
        double num2 = Double.parseDouble(datosNumericos[1]);
        
        Suma suma = new Suma(num1, num2);
        Multiplicacion multiplicar = new Multiplicacion(num1, num2);
        
        
        System.out.println(suma.sumar(num1, num2)+ " "+ multiplicar.multiplicar(num1, num2));
    }
}
