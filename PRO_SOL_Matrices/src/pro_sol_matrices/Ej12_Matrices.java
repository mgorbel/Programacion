/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej07_matrices;

import java.util.Scanner;

/**
 *
 * @author manuela
 */
public class Ej12_Matrices 
{

    //----------------------------------------------------------------------
    /**
     * Crea un array y lo rellena con valores aleatorios dentro de un rango.
     * <p>
     * Por ejemplo, <code>generaArrayInt(100, 10, 30)</code> devolvería un array
     * de 100 números generados al azar comprendidos entre 10 y 30.
     *
     * @param _tam número de elementos que contendrá el array
     * @param _min límite inferior del intervalo de números aleatorios
     * @param _max límite superior del intervalo de números aleatorios
     * @return array relleno con valores aleatorios dentro del rango definido
     * por <code>minimo</code> y <code>maximo</code>
     */
    public static int[] generaArray(int _tam, int _min, int _max) 
    {
        int[] x = new int[_tam];
        for (int i = 0; i < _tam; i++) 
            x[i] = (int) (Math.random() * (_max - _min + 1) + _min);        

        return x;
    }

    
    //----------------------------------------------------------------------
    /**
    * Devuelve el mínimo (el número más pequeño) del array que se pasa como
    * parámetro.
    *
    * @param  _array array unidimiensional de números enteros
    * @return el número más pequeño encontrado en el array que se pasa como
    *         parametro
    */
    public static int minimoArray( int[] _array) 
    {
        int min = Integer.MAX_VALUE;
        
        for( int elemento : _array) 
            if( elemento < min) 
                min = elemento;            
        
        return min;
    }
    
    //----------------------------------------------------------------------
    /**
    * Devuelve el máximo (el número más pequeño) del array que se pasa como
    * parámetro.
    *
    * @param  _array array unidimiensional de números enteros
    * @return el número más grande encontrado en el array que se pasa como
    *         parametro
    */
    public static int maximoArray( int[] _array) 
    {
        int max = Integer.MIN_VALUE;
        
        for( int elemento : _array) 
            if( elemento > max) 
                max = elemento;            
        
        return max;
    }
    
    //----------------------------------------------------------------------
    /**
     * Devuelve la media aritmética de los números contenidos en el array que se
     * pasa como parámetro.
     *
     * @param _array array unidimiensional de números enteros
     * @return media aritmética de los números contenidos en el array que se
     * pasa como parámetro
     */
    public static double mediaArray( int[] _array) 
    {
        int suma = 0;
        
        for (int elemento : _array) 
            suma += elemento;
        
        return (double) suma / _array.length;
    }
    
    //----------------------------------------------------------------------
    /**
     * Nos dice si un determindado valor está o no dentro de un array de números
     * enteros.
     *
     * @param _array array unidimiensional de números enteros
     * @param _dato números entero que se buscará dentro del array
     * @return verdadero si <code>_dato</code> se encuentra en el array
     *          <code>_array</code> en caso contrario falso.
     */
    public static boolean estaEnArray(int[] _array, int _dato) 
    {
        boolean enc = false ;
        
        for( int i = 0; i < _array.length && !enc; i++)            
            if (_array[i] == _dato) 
                enc = true;
        
        return enc;
    }
    
    //----------------------------------------------------------------------
    /**
     * Devuelve la posición (el índice) de la primera ocurrencia de un número
     * dentro de un array.
     *
     * @param _array array unidimiensional de números enteros
     * @param _dato números entero que se buscará dentro del array
     * @return  posición (índice) de la primera ocurrencia del número
     *          <code>_dato</code> dentro del array <code>_array</code> 
     *          o -1 en caso de no encontrarse el número
     */
    public static int posicionEnArray( int[] _array, int _dato) 
    {
        int enc = -1 ;
        
        for (int i = 0; (i < _array.length) && (enc == -1); i++)         
            if( _array[i] == _dato) 
                enc = i;            
        
        return enc;
    }
    
    //----------------------------------------------------------------------
    /**
     * Le da la vuelta a un array. Los primeros números estarán al final y
     * viceversa.
     *
     * @param _array array unidimiensional de números enteros
     * @return array volteada con los primeros números al final y viceversa
     */
    public static int[] volteaArray(int[] _array) 
    {
        int[] a = new int[ _array.length];
        
        for (int i = 0; i < _array.length; i++) 
            a[ _array.length - i - 1] = _array[i];
        
        return a;
    }
  
    //----------------------------------------------------------------------
    /**
     * Devuelve un array rotada <code>_dato</code> posiciones a la derecha tomando
     * como referencia el array que se pasa como parámetro. Los números que van
     * saliendo por la derecha vuelven a entrar por la izquierda.
     *
     * @param _array array unidimiensional de números enteros
     * @param _dato número de movimientos (rotaciones hacia la derecha) a realizar
     * @return array rotada <code>_dato</code> posiciones a la derecha
     */
    public static int[] rotaDerechaArray( int[] _array, int _nMov) 
    {
        int[] a = _array.clone(); // clona en a el contenido de _array
        int aux;
        
        while( _nMov-- > 0) 
        {
            aux = a[a.length - 1];
            for( int i = a.length - 1; i > 0; i--) 
                a[i] = a[i - 1];
            
            a[0] = aux;
        }
        return a;
    }
   
    //----------------------------------------------------------------------
    /**
     * Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
     * como referencia el array que se pasa como parámetro. Los números que van
     * saliendo por la izquierda vuelven a entrar por la derecha.
     *
     * @param _array array unidimiensional de números enteros
     * @param _nMov número de movimientos (rotaciones hacia la izquierda) a realizar
     * @return array rotada <code>n</code> posiciones a la izquierda
     */
    public static int[] rotaIzquierdaArray(int[] _array, int _nMov) 
    {
        int[] a = _array.clone(); // clona en a el contenido de x
        int aux;
        while( _nMov-- > 0) 
        {
            aux = _array[0];
            for( int i = 0; i < a.length - 1; i++) 
                a[i] = a[i + 1];
            
            a[ a.length - 1] = aux;
        }
        return a;
    }
    
    //----------------------------------------------------------------------
    static public void mostrarArray( int[] _array)
    {
        System.out.print("{ ");
        for (int i = 0; i < _array.length; i++) 
        {
            System.out.print( _array[i] + ( (i < _array.length-1)? ", ": ""));            
        }
        System.out.println(" }");
    }
    
    
    //----------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner( System.in) ;
        int opcion = -1, dato = -1 ;
        int[] a = generaArray(14, 0, 60);
        
        mostrarArray(a);

        
        do
        {
            menu( );
            opcion = teclado.nextInt() ;
            
            switch( opcion)
            {
            case 1: // mostrar ARRAY
                    mostrarArray(a);
                    break ;
            case 2: // Minimo
                    System.out.println("Mínimo: " + minimoArray(a));
                    break ;
            case 3: // Máximo
                    System.out.println("Máximo: " + maximoArray(a));
                    break ;
            case 4: // MEDIA
                    System.out.println("Media: " +  mediaArray(a));
                    break ;
            case 5: // buscar un dato
                    System.out.print("Introduzca dato a buscar: ");
                    dato = teclado.nextInt( );
                    if(  estaEnArray(a, dato))         
                        System.out.printf("El %d está en el array.\n", dato);        
                    else 
                        System.out.printf("El %d no está en el array.\n", dato);
                    break ;
                    
            case 6: // posición del dato
                    System.out.print("Introduzca dato a buscar: ");
                    dato = teclado.nextInt( );
                    System.out.printf("El nº %d está en la posición %d.\n" , dato, posicionEnArray(a, dato));
                    break ;
            
            case 7: // dar la vuelta al array
                    System.out.print("Array al revés: ");
                    mostrarArray( volteaArray(a));
                    break ;
                  
            case 8: // Rotar a la derecha
                    System.out.print("Numero de rotaciones: ");
                    dato = teclado.nextInt( );
                    System.out.printf("Array rotado %d pasos a la derecha: ", dato);
                    mostrarArray( rotaDerechaArray(a, dato));
                    break ;
            case 9:  // Rotar a la izquierda
                    System.out.print("Numero de rotaciones: ");
                    dato = teclado.nextInt( );
                    System.out.printf("Array rotado %d pasos a la izquierda: ", dato);
                    mostrarArray( rotaIzquierdaArray(a, dato));                    
                    break ;
            }
        }while( opcion != 0 ) ;
    }
    
    
    static public void menu()
    {
        System.out.println("------------------------------------");
        System.out.println("                MENU");
        System.out.println("\n\t 1. Mostrar array");
        System.out.println("\t 2. Averigua el minimo");
        System.out.println("\t 3. Averigua el maximo");
        System.out.println("\t 4. Averigua la media");
        System.out.println("\t 5. Busca un dato");
        System.out.println("\t 6. Posición del dato");
        System.out.println("\t 7. Dar la vuelta al array");
        System.out.println("\t 8. Rota a la derecha n posiciones");
        System.out.println("\t 9. Rota a la izquierda n posiciones");
        System.out.println("\t 0. Salir");  
        
        System.out.print("Seleccione opción: ");
        
    }
}


