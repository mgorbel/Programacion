
package funciones;

/**
 *
 * @author Manuela
 * @version 0.1
 */
public class Recursivas 
{
    /**
     * Calcula el factorial de un número utilizando un enfoque iterativo
     * (mediante un bucle for)
     * @param _factorial número  al que se le desea calcular el factorial
     * @return resultado de la operación factorial
     */
    public static int calcularFactorial( int _factorial)
    {
        int fact=1;

        for( int i= _factorial; i>=1; i--)
            fact*=i;

        return fact;
    }
    //--------------------------------------------------------------
    /**
     * calcula el factorial de un número entero no negativo, utilizando el
     * concepto de recursividad
     * Caso Base: Si n es 0 o 1, el factorial es 1.
     * Paso Recursivo: n! = n * (n-1)!
     * <br>
     * @param _nFactorial  número  al que se le desea calcular el factorial
     * @return resultado de la operación factorial
     * 
     */
    public static long factorialRecursivo( int _nFactorial) 
    {
        long vRetorno ;
        
        // Caso Base: Si n es 0 o 1, el factorial es 1.
        if (_nFactorial <= 1)     vRetorno = 1;
        
        // Paso Recursivo: n! = n * (n-1)!
        else            vRetorno = _nFactorial * factorialRecursivo( _nFactorial - 1); // La función se llama a sí misma        
        
        return vRetorno ;
    }
    
    //------------------------------------------------------------------------
    /**
     * calcula el término n-ésimo de la secuencia de Fibonacci 
     * utilizando una implementación puramente recursiva.
     * Casos Base: Detiene la recursión
     * Paso Recursivo: El método se llama a sí misma DOS veces
     * @param n calcula el término n-ésimo de la secuencia de Fibonacci utilizando una implementación puramente recursiva.
     * @return 
     */
    public static int fibonacciRecursivo( int _n) 
    {
        int vRetorno ;
        
        // Casos Base: Detiene la recursión
        if ( _n <= 0)         vRetorno = 0;
        else if ( _n == 1)    vRetorno = 1 ;
        
        // Paso Recursivo: El método se llama a sí misma DOS veces
        else vRetorno = fibonacciRecursivo( _n - 1) + fibonacciRecursivo( _n - 2);
        
        return vRetorno ;        
    }

    /**
     * Ejemplo de utilización de los 2  métodos recursivos
     * @param args 
     */
    public static void main( String[] args) 
    {
        int numero = 6, result;
        long resultado = factorialRecursivo( numero);
        
        System.out.println("El factorial de " + numero + " es: " + resultado); 
        
        result = fibonacciRecursivo( numero) ;
        
        System.out.println("El resultado de fibonacci de " + numero + " es: " + result);
    }
}
    