/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Manuela
 */
public class Version_3 
{
    public static int sumar( int _operando1, int _operando2)
    {
        return( _operando1 + _operando2) ;
    }

    public static int restar( int _operando1, int _operando2)
    {
        return( _operando1 - _operando2) ;
    }
    
    public static int multiplicar( int _operando1, int _operando2)
    {
        return( _operando1 * _operando2) ;
    }
    
    public static double dividir( float _operando1, float _operando2)
    {
        double resultado = 0 ;
        
        if( _operando2 !=0 )   resultado = (double)( _operando1 / _operando2);
        
        return( resultado) ;
    }
    
    public static int modulo( int _operando1, int _operando2)
    {
        int resultado = 0 ;
        
        if( _operando2 !=0 )   resultado = _operando1 % _operando2;
        
        return( resultado) ;
    }
        
    
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
