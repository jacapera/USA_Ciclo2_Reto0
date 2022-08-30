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
public class Reto0 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        // captura de datos por pantalla en una sola linea separado por un espacio
        String ingresoDatos = sc.nextLine();
        
        String[] datosNumericos = ingresoDatos.split(" ");
        float num1 = Float.parseFloat(datosNumericos[0]);
        float num2 = Float.parseFloat(datosNumericos[1]);
        
        Calculadora operaciones = new Calculadora(num1, num2);
        
        operaciones.suma(num1, num2);
        System.out.print(" ");
        operaciones.producto(num1, num2);
    }
}
