/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Manuela
 * @version 0.0
 */
public class Version_0
{
    /**
     * Uno de los primeros programas que se realizó
     * @param args 
     */
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner( System.in) ;
        int opcion ;
        float a, b ;
        float resultado = 0.f; 
        
        System.out.print("Introduzca un numero: ");
        a = teclado.nextInt() ;

        System.out.print("Introduzca otro numero: ");
        b = teclado.nextInt() ;
        
        resultado = a + b ;        
        System.out.println("La suma es: " + resultado) ;
        
        resultado = a - b ;        
        System.out.println("La resta es: " + resultado) ;
        
        resultado = a * b ;        
        System.out.println("La multiplicacion es: " + resultado) ;
        
        resultado =  a / b ;        
        System.out.printf("La division es: %.2f\n", resultado) ;
        
        resultado = a % b ;        
        System.out.println("El modulo es: " + resultado) ;      
 
    }
}
