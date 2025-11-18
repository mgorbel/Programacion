/*
Realiza el ejercicio anterior utilizando funciones, al menos debe tener la función de visualizar
el array, otra para averiguar el máximo del array y por último otra función que averigue el
mínimo.
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_11 
{
    public static void mostrar( int[] _array, int _destacado)
    {
        // Mostrar el resultado.
        for (int i = 0; i < _array.length; i++) 
        {
            if( _array[i] == _destacado)  System.out.print( " **" + _array[i] + "** ");
            else                          System.out.print( _array[i] + " ");  
            
            if( (i+1) %10 == 0) System.out.println("");
        }
        System.out.println("");
    }
    
    public static int conseguirMinimo( int[] _array)
    {
        int min = 100 ;
        
        // Genera los números y calcula el máximo y el mínimo
        for (int i = 0; i < _array.length; i++) 
            if (_array[i] < min)  min = _array[i];
        
        return min ;
    }
    
    public static int conseguirMaximo( int[] _array)
    {
        int max = 0 ;
        
        // Genera los números y calcula el máximo y el mínimo
        for (int i = 0; i < _array.length; i++) 
            if (_array[i] > max)  max = _array[i];
        
        return max ;
    }
    
    
    public static void main(String[] args) 
    {
        final int TAM = 100 ;
        int[] array = new int[TAM];
        int maximo,  minimo;
        int destacado = -1, opcion ;

        // Genera los números 
        for (int i = 0; i < TAM; i++) 
        {
            array[i] = (int) (Math.random() * 501);
        }
        
        minimo = conseguirMinimo( array) ;
        maximo = conseguirMaximo( array) ;

        // Mostrar el array original
        System.out.println("Array original");
        mostrar( array, destacado) ;

        System.out.print("\n\n¿Que quiere destacar? (1 – minimo, 2 – maximo): ");
        opcion = Integer.parseInt(System.console().readLine());


        switch( opcion) 
        {
        case 1:    
                destacado = minimo;
                break;
        case 2:
                destacado = maximo;
                break;
        }

        System.out.println("\nArray destacado");
        mostrar( array, destacado) ;
        
    }
}
