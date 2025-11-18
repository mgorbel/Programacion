/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_02 
{
    //---------------------------------------------------------------------
    public static void mostrar( int[] _array)
    {
        System.out.print( " {");
        for (int i = 0; i < _array.length; i++) 
            System.out.print( _array[i] + ((i < _array.length -1)? ", ": " "));
        
        System.out.println( "}");
    }
    
    //---------------------------------------------------------------------
    public static void mostrarInversa( int[] _array)
    {
        System.out.print( " {");
        for (int i = _array.length-1; i >=0; i--) 
            System.out.print( _array[i] + ((i > 0)? ", ": " "));
        
        System.out.println( "}");
    }
    
    //---------------------------------------------------------------------
    public static void main(String[] args) 
    {
        final int TAM = 12 ;
        int[] num = new int[ TAM];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        System.out.println("\nMostrar el contenido del array");
        mostrar( num) ;
        
         System.out.println("\nMostrar contenido a la inversa");
        mostrarInversa( num) ;        
    }
}
