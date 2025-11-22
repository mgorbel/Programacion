/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_arrays;

import java.util.Scanner;

/**
 *
 * @author Manuela
 * @version 0.1
 */
public class Ordenar_Arrays 
{
    //------------------------------------------------------------------------
    /**
     * Carga un array con números aleatorios
     * @param _array 
     */
    public static void cargar( int[] _array) 
    {        
        for( int i = 0; i < _array.length; i++) 
            _array[i] = (int) (Math.random() * 100);       
    }
    
    /**
     * Hace una copia del array fuente en el array destino
     * @param _aFuente array de origen
     * @param _aDestino array de destino
     */
    public static void copia( int[] _aFuente, int[] _aDestino) 
    {        
        for( int i = 0; i < _aFuente.length; i++) 
            _aDestino[i] = _aFuente[i];       
    }
    //------------------------------------------------------------------------
    /**
     * Muestra el contenido del array
     * @param _mensaje que quiere que se visualice
     * @param _array a visualizar
     */
    public static void mostrarArray( String _mensaje, int[] _array) 
    {
        System.out.println( _mensaje);
        for( int i = 0; i < _array.length; i++) 
            System.out.printf( "%5d", _array[ i]);   
    }
    
    //------------------------------------------------------------------------
    /**
     * Visualiza el contenido de un array
     * @param _mensaje que quiere que se visualice
     * @param _array a  mostrar
     * @param _salto salta o no de línea
     */
    public static void mostrarArray( String _mensaje, int[] _array, boolean _salto) 
    {
        if( _salto) System.out.println( _mensaje);
        else        System.out.print( _mensaje + " ---> ");
        
        for( int i = 0; i < _array.length; i++) 
            System.out.printf( "%5d", _array[ i]);   
    }
    //------------------------------------------------------------------------
    /**
     * Ordena el array con el método burbuja
     * @param _array a ordenar
     */
    public static void burbuja( int[] _array) 
    {
        for (int i = 0; i < _array.length-1; i++) 
        {
            for (int j = _array.length-1; j > i; j--) 
            {
                if( _array[j] < _array[j - 1]) 
                {
                    int aux = _array[j];
                    _array[j] = _array[j - 1];
                    _array[j - 1] = aux;
                }
                //mostrarArray( "\n   --->> Iteracion j: " + j, _array, false) ;
            }
            //mostrarArray( "\nIteracion i: " +i, _array, false) ;
        }          
    }
    
    //------------------------------------------------------------------------
    /**
     * Ordena un array por el método de selección
     * @param _array a ordenar
     */
    public static void seleccion( int[] _array) 
    {
        int minimo, aux;
        
        for( int i = 0; i < _array.length-1; i++) 
        {
            minimo = i;
            for( int j = i + 1; j < _array.length; j++) 
            {
                if( _array[j] < _array[minimo]) 
                {
                    minimo = j;
                }  
            }
            
            aux = _array[minimo];
            _array[minimo] = _array[i];
            _array[i] = aux;
            
            //mostrarArray( "\nIteracion i: " +i, _array, false) ;
        }
    }
    
    //------------------------------------------------------------------------
    /**
     * Ordena un array por el método de inserción
     * @param _array a ordenar
     */
    public static void insercion( int[] _array)
    {
        int aux;       
        
        for( int i = 1; i < _array.length; i++)
        {
            aux = _array[ i];
            for( int j = i - 1; j >= 0 && _array[j] > aux ; j-- )
            {
                _array[ j + 1] = _array[ j] ;
                _array[ j] = aux ;
                
                //mostrarArray( "\n   --->> Iteracion j: " + j, _array, false) ;
            }            
            //mostrarArray( "\nIteracion i: " +i, _array, false) ;
        }
    }
    
    //------------------------------------------------------------------------
    /**
     * Ordenar un array por el método Shell
     * @param _array a ordenar
     */
    public static void shell( int _array[]) 
    {
        int intervalo, j, k;
        
        intervalo = _array.length / 2;
        
        while (intervalo > 0) 
        {
            for( int i = intervalo; i < _array.length; i++) 
            {
                j = i - intervalo;
                while( j >= 0) 
                {
                    k = j + intervalo;
                    if( _array[j] <= _array[k])   j = -1; /* así termina el bucle, par ordenado */
                    else 
                    {
                        int temp;
                        
                        temp = _array[j];
                        _array[j] = _array[k];
                        _array[k] = temp;
                        j -= intervalo;
                    }  
                }
                //mostrarArray( "\n\nIteracion i: " + i, _array, false ) ;
            }
            intervalo = intervalo / 2;
        }
    }
    
    //------------------------------------------------------------------------
    /**
     * Ordenar un array por el método Quicksort, método recursivo
     * @param _array a ordenar
     * @param _primero índice del primer elemento del array
     * @param _ultimo índice del último elemento del array
     */
    public static void quicksort( int _array[], int _primero, int _ultimo) 
    {
        int i, j, central;
        double pivote;
        central = ( _primero + _ultimo) / 2;
        pivote = _array[central];
        i = _primero;
        j = _ultimo;
        
        do 
        {
            while( _array[i] < pivote) 
            {
                i++;
            }
            
            while( _array[j] > pivote) 
            {
                j--;
            }
            
            if( i <= j) 
            {
                int tmp;
                
                tmp = _array[i];
                _array[i] = _array[j];
                _array[j] = tmp;
                
                /* intercambia _array[i] con _array[j] */
                i++;
                j--;
            }
        } while (i <= j);
        
        if (_primero < j)   quicksort( _array, _primero, j); /* mismo proceso con sublista izqda */
        
        if(i < _ultimo)     quicksort( _array, i, _ultimo); /* mismo proceso con sublista drcha */      
    }
    
    //------------------------------------------------------------------------
    /**
     * Método que busca un elemento (dato) por el método de búsqueda binaría
     * @param _array dónde se buscará el dato
     * @param dato a buscar
     * @return la posición dónde se encuentra el dato, -1 si no se encuentra
     */
    public static int busqueda_binaria( int[] _array, int dato) 
    {
        int inicio = 0, fin = _array.length - 1, med = _array.length / 2, encontrado = -1;

        while( inicio <= fin && encontrado == -1) 
        {
            if( _array[med] == dato)     encontrado = med;
            else 
            {
                /** 
                 * Dato estará del principio a la mitad
                 */
                if( _array[med] > dato)     fin = med - 1;
                else 
                /** 
                 * Dato estará de la mitad al final  
                 */   
                    inicio = med + 1;
                med = (inicio + fin) / 2;             
            }
        }
        return encontrado;
    }

    //------------------------------------------------------------------------
    /**
     * Visualiza el menu y devuelve la opción elegida
     */
    public static void menu()
    {       
        System.out.println("\n-------------------------------------------------");
        System.out.println("                     MENU ");
        System.out.println("-------------------------------------------------");
        System.out.println("\t1.- Cargar array");
        System.out.println("\t2.- Ordenación BURBUJA");
        System.out.println("\t3.- Ordenación SELECCIÓN");
        System.out.println("\t4.- Ordenación INSERCCIÓN");
        System.out.println("\t5.- Ordenación SHELL");
        System.out.println("\t6.- Ordenación QUCKSORT");
        System.out.println("\t7.- Burcar un dato");
        System.out.println("\t0.- Salir");
        System.out.print("Seleccione una opción: ");
        
    }
    //------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner( System.in) ;
        int[] array;
        int original[], ordenado[] ;
        final int TAM = 10 ;
        byte opcion ;
    
        array = new int[ TAM];
        original = new int[ TAM] ;
        ordenado = new int[ TAM] ;
          //int [] array = {35, 23, 11, 5, 13} ;
        
        //cargar( array);
        
        do{
            menu() ;
            opcion = teclado.nextByte() ;       

            copia( array, original) ;
            switch( opcion)
            {
            case 1: // cargar datos aleatorios
                cargar( array) ;
                break ;
            case 2: // burbuja
                mostrarArray( "\nArray ORIGINAL", array) ; 
                burbuja( array) ;
                mostrarArray( "\nMétodo de la BURBUJA", array) ;
                break ;
                
            case 3: // slección
                mostrarArray( "\nArray ORIGINAL", array) ; 
                seleccion( array) ;
                mostrarArray( "\nMétodo de la SELECCIÓN", array) ;
                break ;
                
            case 4: // insercion
                mostrarArray( "\nArray ORIGINAL", array) ; 
                insercion( array) ;
                mostrarArray( "\nMétodo de la INSERCIóN", array) ;
                break ; 
                
            case 5: // selección
                mostrarArray( "\nArray ORIGINAL", array) ; 
                shell( array) ;
                mostrarArray( "\nMétodo de la SHELL", array) ;
                break ;
            case 6: // quicksort
                mostrarArray( "\nArray ORIGINAL", array) ; 
                quicksort( array, 0, TAM-1) ;
                mostrarArray( "\nMétodo de la QUICKSORT", array) ;
                break ;
            case 7:
                System.out.print("\nIntroduzca el dato a buscar: ");
                int dato = teclado.nextInt() ;
                int pos = busqueda_binaria( ordenado, dato) ;
                
                if( pos == -1) System.out.println("Dato no encontrado");
                else           System.out.printf("\n El dato %d ha sido encontrado en la posición %d.\n", dato, pos);
                break ;

            }
           
            if( opcion != 1)
            {
                copia( array, ordenado) ;
                copia( original, array );
            }
        }while( opcion != 0) ;
        

        
        System.out.println("\nAté mais") ;
    }   
    
}
