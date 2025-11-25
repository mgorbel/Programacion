/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Manuela
 * @version 0.1
 */
public class Version_1 
{
    /**
     * Función que realiza la suma de 2 números y devuelve su resultado
     * @param _operando1 primer numero de la suma
     * @param _operando2 segundo número de la suma
     * @return resultado de la suma de los 2 parámetros de entrada
     */
    public static int sumar( int _operando1, int _operando2)
    {
        return( _operando1 + _operando2) ;
    }

    /**
     * Función que realiza la resta de 2 números y devuelve su resultado
     * @param _operando1  primer numero de la resta
     * @param _operando2  segundo número de la resta
     * @return resultado de la resta de los 2 parámetros de entrada
     */
    public static int restar( int _operando1, int _operando2)
    {
        return( _operando1 - _operando2) ;
    }
    
    /**
     * Función que realiza la multiplicación de 2 números y devuelve su resultado
     * @param _operando1  primer numero de la multiplicación
     * @param _operando2  segundo número de la multiplicación
     * @return resultado de la multiplicación de los 2 parámetros de entrada 
     */
    public static int multiplicar( int _operando1, int _operando2)
    {
        return( _operando1 * _operando2) ;
    }
    
    /**
     * Función que realiza la división de 2 números y devuelve su resultado
     * @param _operando1  dividendo de la división
     * @param _operando2  divisor de la división
     * @return cociente de la división, devuelve 0 si el divisor es 0
     */
    public static float dividir( float _operando1, float _operando2)
    {
        float resultado = 0 ;
        
        if( _operando2 !=0 )   resultado = (float)( _operando1 / _operando2);
        
        return( resultado) ;
    }
    
    /**
     * Función que realiza el módulo de 2 números y devuelve su resultado
     * @param _operando1  dividendo de la división
     * @param _operando2  divisor de la división
     * @return resto de la división, devuelve 0 si el divisor es 0
     */
    public static int modulo( int _operando1, int _operando2)
    {
        int resultado = 0 ;
        
        if( _operando2 !=0 )   resultado = _operando1 % _operando2;
        
        return( resultado) ;
    }
    
    /**
     * Ejemplo de utilización de las funciones que se han realizado en está clase
     * @param args 
     */
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner( System.in) ;
        int operando1, operando2 ;
        float resultado ; 
        String operacion ="";
        
        System.out.print("Introduzca el operando 1: ");
        operando1 = teclado.nextInt() ;

        System.out.print("Introduzca el operando 2: ");
        operando2 = teclado.nextInt() ;
        
        resultado = sumar( operando1, operando2) ;
        System.out.println("\n ---> Resultado de la suma: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
            
        resultado = restar( operando1, operando2) ;
        System.out.println("\n ---> Resultado de la recta: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
         
        resultado = multiplicar( operando1, operando2) ;
        System.out.println("\n ---> Resultado de la multiplicacion: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
         
        resultado = dividir( operando1, operando2) ;
        System.out.println("\n ---> Resultado de la division: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
        
        resultado = modulo( operando1, operando2) ;
        System.out.println("\n ---> Resultado del modulo: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
        
    }
    
}
