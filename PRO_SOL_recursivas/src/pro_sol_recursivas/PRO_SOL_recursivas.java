/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro_sol_recursivas;

/**
 *
 * @author Manuela
 */
public class PRO_SOL_recursivas 
{
    /**
     * Diseña un método recursivo llamado invertirCadena(String cadena) que 
     * tome una cadena de texto y devuelva una nueva cadena con los caracteres 
     * en orden inverso.
     * @param _cadena
     * @return
     * Ejemplo: invertirCadena("Hola")
     *             <br> "ola" + 'H'
     *              <br>"la" + 'o' + 'H'
     *              <br>"a" + 'l' + 'o' + 'H'
     *              <br>"" + 'a' + 'l' + 'o' + 'H' -> "aloH"
     * 
     * @author MGB
     */
    public static String invertirCadena( String _cadena) 
    {
        String vRetorno ;
        
        // 1. Caso Base: Si la cadena está vacía o tiene 1 carácter
        if( _cadena == null || _cadena.length() <= 1) 
            vRetorno = _cadena;
        else

        // 2. Paso Recursivo: 
        // Invierte el resto de la cadena (subcadena a partir del índice 1)
        // y le añade el primer carácter al final.
            vRetorno = invertirCadena( _cadena.substring(1)) + _cadena.charAt(0);
        
        return vRetorno ;
    }

    // 

    //--------------------------------------------------------------------------
    /**
     * Crea un método recursivo llamado calcularPotencia(int base, int exponente)
     * que calcule la potencia de un número (baseexponente).
     * Asume que el exponente siempre será un entero no negativo
     * 
     * @param _base
     * @param _exponente
     * @return
     *  Ejemplo: calcularPotencia(2, 4)
     *       <br>2 * calcularPotencia(2, 3)
     *       <br>2 * (2 * calcularPotencia(2, 2))
     *       <br>2 * (2 * (2 * calcularPotencia(2, 1)))
     *       <br>2 * (2 * (2 * (2 * calcularPotencia(2, 0)))
     *       <br>2 * (2 * (2 * (2 * 1)) = 16
     * 
     * * @author MGB
     **/
    public static int calcularPotencia( int _base, int _exponente)
    {
        // Validación básica (Asumimos exponente >= 0)
        if( _exponente < 0) 
        {
            throw new IllegalArgumentException("El exponente debe ser no negativo para esta implementación.");
        }

        int vRetorno ;
        
        /**
         * Caso Base: Cualquier número elevado a 0 es 1
         */
        if( _exponente == 0) vRetorno =  1;
        else    
        /** 
         * Paso Recursivo: base^exponente = base * base^(exponente-1)
         */
            vRetorno = _base * calcularPotencia( _base, _exponente - 1);
        
        return vRetorno ;
    }
    
    //--------------------------------------------------------------------------
    /**
     * Implementa un método recursivo llamado sumarArreglo(int[] arr, 
     * int indice) que calcule la suma de todos los elementos de un 
     * arreglo de enteros. 
     * Debes usar el parámetro indice para controlar el elemento actual 
     * que se está procesando.
     * 
     * @param _array
     * @param _indice
     * @return 
     * 
     *   Ejemplo: sumarArray([1, 5, 7], 0)
     *            <br>1 + sumarArray([1, 5, 7], 1)
     *            <br>1 + (5 + sumarArray([1, 5, 7], 2))
     *            <br>1 + (5 + (7 + sumarArray([1, 5, 7], 3)))
     *            <br>1 + (5 + (7 + 0)) = 13
     * 
     *  @author MGB
     */
    public static int sumarArray( int[] _array, int _indice) 
    {
        int vRetorno ;
        
        /**
         * Caso Base: Si el índice ha alcanzado el final del arreglo
         */
        if ( _indice >= _array.length)      vRetorno = 0; // No hay más elementos que sumar
        else
            /**
             * Paso Recursivo: Suma el elemento actual y llama a la suma del resto
             */
            vRetorno = _array[ _indice] + sumarArray( _array, _indice + 1);
        
        return vRetorno ;
    }

    //--------------------------------------------------------------------------
    /**
     * Crea una función recursiva llamada busquedaBinaria(int[] arr, 
     * int objetivo, int inicio, int fin) que implemente el algoritmo de 
     * búsqueda binaria para encontrar si un objetivo está presente en un 
     * array ordenado.
     * 
     * @param _array   array en el cual se va a buscar el elemento
     * @param _objetivo  elemento a buscar
     * @param _inicio    dónde comienza el array
     * @param _fin       dónde termina el array
     * @return    El índice del objetivo o -1 si no se encuentra
     * @author MGB
     */
    public static int busquedaBinaria( int[] _array, int _objetivo, int _inicio, int _fin) 
    {
        int vRetorno ;
        int medio = _inicio + ( _fin - _inicio) / 2; // Previene overflow
        
        /**
         * Caso Base 1: El segmento de búsqueda está vacío (no se encontró)
        */
        
        if( _inicio > _fin) 
        {
            vRetorno = -1;
        }
        else 
            /** 
            * Caso Base 2: El objetivo se encuentra
            */
            if( _array[ medio] == _objetivo)    vRetorno = medio;
        
        
            /**
             * Pasos Recursivos: Reducir el rango de búsqueda
             */
            else    if( _array[medio] < _objetivo)     // El objetivo está en la mitad derecha
                        vRetorno = busquedaBinaria( _array, _objetivo, medio + 1, _fin);
                    else    // arr[medio] > objetivo
                            // El objetivo está en la mitad izquierda
                        vRetorno = busquedaBinaria( _array, _objetivo, _inicio, medio - 1);
        
        return vRetorno ;
    }
    
    
    //--------------------------------------------------------------------------
    /**
     * Implementa un método recursivo llamado mcd(int a, int b) que encuentre 
     * el Máximo Común Divisor de dos números enteros positivos utilizando 
     * el Algoritmo de Euclides.
     * @param _a
     * @param _b
     * @return
     *      Ejemplo: mcd( 48, 18)
     *              <br>mcd( 18, 48 % 18) = mcd( 18, 12)
     *              <br>mcd( 12, 18 % 12) = mcd( 12, 6)
     *              <br>mcd( 6, 12 % 6)   = mcd( 6, 0)
     *              <br>Retorna 6 (Caso Base)
     * 
     * @author MGB
     */
    public static int mcd( int _a, int _b) 
    {
        int vRetorno ;
        
        /**
         * Caso Base: Si b es 0, el MCD es a
         */
        if( _b == 0)    vRetorno = _a;
        
        /**
         * Paso Recursivo: MCD(a, b) = MCD(b, a mod b)
         *  El nuevo 'a' es el viejo 'b', y el nuevo 'b' es el residuo (módulo)
         */
        else            vRetorno = mcd( _b, _a % _b) ;
        
        return vRetorno ;
    }

    // 

    //--------------------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
}
