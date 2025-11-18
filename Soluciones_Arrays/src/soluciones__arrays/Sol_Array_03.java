/*
 Seguir con el ejercicio anterior. Realizar un menú para que se pueda elegir entre:
a. pedir al usuario los datos del array
b. visualizar los datos del array
c. visualizarlos los datos de manera inversa.
d. método que pueda cambiar el dato de una posición del array, el método recibirá la
posición a cambiar y el nuevo dato.
e. Salir
 */
package soluciones__arrays;

import java.util.Scanner;

/**
 *
 * @author Manuela
 */
public class Sol_Array_03 
{
    public static void cargarDatos( int[] _array )
    {
        Scanner teclado = new Scanner( System.in) ;
        
        for( int i = 0; i < _array.length; i++)
        {
            System.out.print("Introduzca datos del array: ");
            _array[ i] = teclado.nextInt() ;            
        }
        
        //teclado.close( );
    }
    
    public static void mostrar( int [] _array)
    {
        System.out.print("[ ");
        for( int i = 0; i < _array.length; i++)
        {            
            System.out.print( _array[i] + (( i < (_array.length-1))? ", ": ""));            
        }
        System.out.println(" ]");
    }
    
    public static void mostrarInversa( int [] _array)
    {
        System.out.println(" ---->   Visualizacion inversa");
        System.out.print("[ ");
        for( int i = _array.length-1; i >= 0; i--)
        {            
            System.out.print( _array[i] + (( i != 0)? ", ": ""));            
        }
        System.out.println(" ]");
    }
    
    public static void cambiarDatos( int[] _array, int _pos, int _dato)
    {
        _array[_pos] = _dato ;
    }
    
    
    public static void menu()
    {
        System.out.println("\n----------------------------------------------");
        System.out.println("           Seleccione una opcion");
        System.out.println("\t1.- Cargar datos del array");
        System.out.println("\t2.- Mostrar datos");
        System.out.println("\t3.- Mostrar datos - inversa");
        System.out.println("\t4.- Cambiar dato de una posicion");
        System.out.println("\t0.- Salir");
        System.out.print("Elija opcion: ");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner (System.in) ;
        int opcion, pos, dato ;
        int[] vector = new int[ 12] ;

        do
        {
            menu() ;
            opcion = teclado.nextInt();
            
            switch( opcion)
            {
            case 1:
                    cargarDatos(  vector) ;
                    break ;
            case 2:
                    mostrar( vector) ;
                    break ;
            case 3:
                    mostrarInversa( vector) ;
                    break ;
            case 4:
                    System.out.print("Introduzca la posición a cambiar: ");
                    pos = teclado.nextInt() ;
                    System.out.print("Introduzca el nuevo dato: ");
                    dato = teclado.nextInt() ;
                    
                    cambiarDatos( vector, pos, dato) ;
                    
                    break ;
            }
            
        }while( opcion != 0) ;
        
    }
    
}
