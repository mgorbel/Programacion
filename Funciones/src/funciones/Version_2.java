
package funciones;

import java.util.Scanner;

/**
 *
 * @author Manuela
 * @version 0.2
 */
public class Version_2 
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
     * Se muestra un menú con las distintas opciones de operaciones que se pueden realizan
     * Termina al pulsar 0.
     * @param args 
     */
    public static void main(String[] args) 
    {
        
        Scanner teclado = new Scanner( System.in) ;
        int opcion ;
        int operando1, operando2 ;
        double resultado = 0; 
        String operacion ="";
        
        do
        {
            // Mostrar menu
            System.out.println("------------------- VERSION 2 -----------------------");
            System.out.println("Seleccione una opcion: ");
            System.out.println("\t1.- Sumar (+)");
            System.out.println("\t2.- Restar (-)");
            System.out.println("\t3.- Multiplicar (*)");
            System.out.println("\t4.- Division (/)");
            System.out.println("\t5.- Modulo (%)");
            System.out.println("\t0.- Salir");
            System.out.print("Opcion: ");
            
            opcion = teclado.nextInt() ;
            
            if( opcion != 0)
            {
                System.out.print("Introduzca el operando 1: ");
                operando1 = teclado.nextInt() ;

                System.out.print("Introduzca el operando 2: ");
                operando2 = teclado.nextInt() ;


                switch( opcion)
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
        } while( opcion !=0);
        
        teclado.close() ;
    }
    
}
