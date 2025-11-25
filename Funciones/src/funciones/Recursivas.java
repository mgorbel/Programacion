/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author Manuela
 */
public class Recursivas 
{
    public static int calcularFactorial(int _factorial)
    {
        int fact=1;

        for( int i= _factorial; i>=1; i--)
            fact*=i;

        return fact;
    }
    //--------------------------------------------------------------
    public static long factorialRecursivo( int _nFactorial) 
    {
        long vRetorno ;
        
        // 1. Caso Base: Si n es 0 o 1, el factorial es 1.
        if (_nFactorial <= 1)     vRetorno = 1;
        
        // 2. Paso Recursivo: n! = n * (n-1)!
        else            vRetorno = _nFactorial * factorialRecursivo( _nFactorial - 1); // La función se llama a sí misma        
        
        return vRetorno ;
    }
    
    //------------------------------------------------------------------------
    public static int fibonacciRecursivo( int n) 
    {
        int vRetorno ;
        
        // 1. Casos Base: Detiene la recursión
        if (n <= 0)         vRetorno = 0;
        else if (n == 1)    vRetorno = 1 ;
        
        // 2. Paso Recursivo: El método se llama a sí misma DOS veces
        else vRetorno = fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        
        return vRetorno ;        
    }

    public static void main( String[] args) 
    {
        int numero = 6, result;
        long resultado = factorialRecursivo( numero);
        
        System.out.println("El factorial de " + numero + " es: " + resultado); // Salida: 120
        
        result = fibonacciRecursivo( numero) ;
        
        System.out.println("El resultado de fibonacci de " + numero + " es: " + result);
    }
}
    