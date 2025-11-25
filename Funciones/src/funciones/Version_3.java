/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Manuela
 * @version 0.3
 */
public class Version_3 
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
     * Muestra el menú de las disitncas operaciones que puede solicitar el usuario
     */
    public static void menu()
    {
        System.out.println("------------------ VERSION 3 ------------------------");
        System.out.println("Seleccione una opcion: ");
        System.out.println("\t1.- Sumar (+)");
        System.out.println("\t2.- Restar (-)");
        System.out.println("\t3.- Multiplicar (*)");
        System.out.println("\t4.- Division (/)");
        System.out.println("\t5.- Modulo (%)");
        System.out.println("\t0.- Salir");
        System.out.print("Opcion: ");
    }
    
    /**
     * una calculadora simple que ejecuta una operación matemática básica 
     * entre dos números enteros, y la opción seleccionada.
     * @param _opcion Un código que indica la operación a realizar (1 para suma,
     * 2 para resta, 3 para multiplicación, 4 para división, 5 para módulo)
     * @param operando1  El primer número de la operación
     * @param operando2  El segundo número de la operación
     */
    public static void realizarOperacion( int _opcion, int operando1, int operando2 )
    {
        //int operando1, operando2 ;
        double resultado = 0; 
        String operacion ="";
        
        switch( _opcion)
        {
        case 1: // sumar 2 numeros
                resultado = sumar( operando1, operando2 ) ;
                operacion = " + " ;
                break ;

        case 2: // restar 2 numeros
                resultado = restar( operando1, operando2 ) ;
                operacion = " - " ;
                break ;

        case 3: // multiplicar 2 numeros
                resultado = multiplicar( operando1, operando2 ) ;
                operacion = " * " ;
                break ;

        case 4: // división 2 numeros
                resultado = dividir( operando1, operando2 ) ;
                operacion = " / " ;
                break ;

        case 5: // módulo 2 numeros
                resultado = modulo( operando1, operando2 ) ;
                operacion = " % " ;
                break ;
        }

        // mostrar resultado
        System.out.println("\n ---> Resultado: " + operando1 + operacion + operando2 + " = " + String.format( "%.2f", resultado));
            
    }
    
    /**
     * Función principal del programa Versión 3
     * gestiona la interacción con el usuario, la lectura de datos, 
     * y el flujo continuo de la aplicación hasta que el usuario decide 
     * finalizarla
     * @param args 
     */
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner( System.in) ;
        int opcion ;
        int op1,  op2; 
        
        do
        {
            // Mostrar menu
            menu() ;
            
            opcion = teclado.nextInt() ;
            
            if( opcion != 0)
            {
                System.out.print("Introduzca el operando 1: ");
                op1 = teclado.nextInt() ;

                System.out.print("Introduzca el operando 2: ");
                op2 = teclado.nextInt() ;

                realizarOperacion( opcion, op1, op2) ;    
                
            }
        } while( opcion !=0);
        
        teclado.close() ;
    }
    
}
