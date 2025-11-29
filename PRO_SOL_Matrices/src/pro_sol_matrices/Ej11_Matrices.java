/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

/**
 *
 * @author Manuela
 */
public class Ej11_Matrices 
{

    //-------------------------------------------------------------------
    public static boolean esCapicua(long _n) 
    {
        return _n == voltea( _n);
    }

    //-------------------------------------------------------------------
    public static boolean esCapicua(int _n) 
    {
        return esCapicua((long) _n);
    }

    //-------------------------------------------------------------------
    public static boolean esPrimo( long _n) 
    {
        boolean vRetorno = true ;
        boolean salir = false ;
        
        if( _n > 2) 
        {
            for( long i = _n / 2; i >= 2 && !salir; i--) 
            {
                if( _n % i == 0) 
                {
                    vRetorno = false;
                    salir = true ;
                }
            }
        }
        
        return vRetorno;
    }

    //-------------------------------------------------------------------
    /**
     * Devuelve el menor primo que es mayor al número que se pasa como
     * parámetro.
     *
     * @param _n un número entero
     * @return el menor primo que es mayor al número que se pasa como parámetro
     */
    public static int siguientePrimo( int _n) 
    {
        while (!esPrimo(++_n)) 
        {
        };
        
        return _n;
    }

    //-------------------------------------------------------------------
    /**
     * Dada una base y un exponente, devuelve la potencia.
     *
     * @param _base base de la potencia
     * @param _exponente exponente de la potencia
     * @return número resultante de elevar la base a la potencia indicada
     */
    public static double potencia(int _base, int _exponente) 
    {
        double n = 1;
        
        if( _exponente == 0)  n = 1 ;   
        else 
            if( _exponente < 0)   n =  1 / potencia( _base, -_exponente);
            else
                if( _exponente >0)
                {   
                    for (int i = 0; i < Math.abs( _exponente); i++) 
                        n = n * _base;
                }
        
        return n;
    }

    //-------------------------------------------------------------------
    /** Cuenta el número de dígitos de un número entero.
    *
    * @param _n número al que se le quieren contar los dígitos
    * @return número de dígitos que tiene el número que se pasa como parámetro

    */
    public static int digitos( long _n) 
    {
        int dig = 0;
        
        if ( _n < 0) 
            _n = -_n;
        
        if ( _n > 0)  
            while( _n > 0) 
            {
                _n = _n / 10; // se le quita un dígito a x
                dig++; // incrementa la cuenta de dígitos
            }
       
        return dig;        
    }

    //-------------------------------------------------------------------
    /**
     * Cuenta el número de dígitos de un número entero.
     *
     * @param _n número al que se le quieren contar los dígitos
     * @return número de dígitos que tiene el número que se pasa como parámetro
     */
    public static int digitos(int _n) 
    {
        return digitos((long) _n);
    }

    //-------------------------------------------------------------------
    /**
     * Le da la vuelta a un número.
     *
     * @param _n número al que se le quiere dar la vuelta
     * @return número volteado (al revés)
     */
    public static long voltea( long _n) 
    {
        long volteado = 0;
        
        if (_n < 0) 
            volteado = -voltea(-_n);
        
        else
            while (_n > 0) 
            {
                volteado = (volteado * 10) + ( _n % 10);
                _n = _n / 10;
            }
        
        return volteado;
    }

    //-------------------------------------------------------------------
    /**
     * Le da la vuelta a un número.
     *
     * @param _n número al que se le quiere dar la vuelta
     * @return número volteado (al revés)
     */
    public static int voltea( int _n) 
    {
        return (int) voltea((long) _n);
    }

    
    //-------------------------------------------------------------------
    /**
     * Devuelve el dígito que está en la posición <code>_pos</code> de un número
     * entero. Se empieza contando por el 0 y de izquierda a derecha.
     *
     * @param _n número entero
     * @param _pos posición dentro del número <code>_n</code>
     * @return dígito que está en la posición n del número <code>_n</code>
     * empezando a contar por el 0 y de izquierda a derecha
     */
    public static int digitoN( long _n, int _pos) 
    {
        _n = voltea( _n);
        while( _pos-- > 0) 
            _n = _n / 10;
        
        return (int) _n % 10;
    }

    //-------------------------------------------------------------------
    /**
     * Devuelve el dígito que está en la posición n de un número entero. Se
     * empieza contando por el 0 y de izquierda a derecha.
     *
     * @param _n número entero
     * @param _pos posición dentro del número <code>_n</code>
     * @return dígito que está en la posición n del número <code>_n</code>
     * empezando a contar por el 0 y de izquierda a derecha
     */
    public static int digitoN( int _n, int _pos) 
    {
        return digitoN((long) _n, _pos);
    }
    
    //-------------------------------------------------------------------
    /**
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     * @param _n número entero
     * @param _dig dígito a buscar dentro del número
     * @return posición de la primera ocurrencia del dígito dentro del número o
     * -1 si no se encuentra
     */
    public static int posicionDeDigito( long _n, int _dig) 
    {
        int i;
        
        for( i = 0; (i < digitos(_n)) && (digitoN( _n, i) != _dig); i++) 
        {
            ;
        }
        
        if (i == digitos( _n))  i =  -1;
        
        
        return i;        
    }

    //-------------------------------------------------------------------
    /**
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero. Si no se encuentra, devuelve -1.
     *
     * @param _n número entero
     * @param _dig dígito a buscar dentro del número
     * @return posición de la primera ocurrencia del dígito dentro del número o
     * -1 si no se encuentra
     */
    public static int posicionDeDigito( int _n, int _dig) 
    {
        return posicionDeDigito((long) _n, _dig);
    }
    
    //-------------------------------------------------------------------
    /**
     * Le quita a un número <code>_dig</code> dígitos por detrás (por la derecha).
     *
     * @param _n número entero
     * @param _dig número de dígitos que se le van a quitar
     * @return número inicial <code>_n</code> con <code>_dig</code> dígitos menos
     * quitados de la derecha
     */
    public static long quitaPorDetras(long _n, int _dig) 
    {
        return _n / (long) potencia(10, _dig);
    }

    //-------------------------------------------------------------------
    /**
     * Le quita a un número <code>_dig</code> dígitos por detrás (por la derecha).
     *
     * @param _n número entero
     * @param _dig número de dígitos que se le van a quitar
     * @return número inicial <code>_n</code> con <code>_dig</code> dígitos menos
     * quitados de la derecha
     */
    public static int quitaPorDetras(int _n, int _dig) 
    {
        return (int) quitaPorDetras((long) _n, _dig);
    }

    //-------------------------------------------------------------------
    /**
     * Le quita a un número <code>_dig</code> dígitos por delante (por la
     * izquierda). \
     *
     *
     * @param _n número entero
     * @param _dig número de dígitos que se le van a quitar
     * @return número inicial <code>_n</code> con <code>_dig</code> dígitos menos
     * quitados de la izquierda
     */
    public static long quitaPorDelante( long _n, int _dig) 
    {
        _n = pegaPorDetras(_n, 1); // "cierra" el número por si acaso termina en 0
        _n = voltea( quitaPorDetras( voltea(_n), _dig));
        _n = quitaPorDetras( _n, 1);
        
        return _n;
    }

    //-------------------------------------------------------------------
    /**
     * Le quita a un número <code>n</code> dígitos por delante (por la
     * izquierda). \
     *
     *
     * @param _n número entero
     * @param _dig número de dígitos que se le van a quitar
     * @return número inicial <code>_n</code> con <code>_dig</code> dígitos menos
     * quitados de la izquierda
     */
    public static int quitaPorDelante(int _n, int _dig) 
    {
        return (int) quitaPorDelante( (long) _n, _dig);
    }

    //-------------------------------------------------------------------
    /**
     * Añade un dígito a un número por detrás (por la derecha).
     *
     * @param _n número entero
     * @param _dig dígito que se le va a pegar por la derecha
     * @return número inicial <code>_n</code> con el dígito <code>_dig</code> pegado
     * por la derecha
     */
    public static long pegaPorDetras( long _n, int _dig) 
    {
        return juntaNumeros( _n, _dig);
    }
    
    //-------------------------------------------------------------------
    /**
     * Añade un dígito a un número por detrás (por la derecha).
     *
     * @param _n número entero
     * @param _dig dígito que se le va a pegar por la derecha
     * @return número inicial <code>_n</code> con el dígito <code>_dig</code> pegado
     * por la derecha
     */
    public static int pegaPorDetras(int _n, int _dig) 
    {
        return (int) pegaPorDetras( (long)_n, _dig);
    }

    //-------------------------------------------------------------------
    /**
     * Añade un dígito a un número por delante (por la izquierda).
     *
     * @param _n número entero
     * @param _dig dígito que se le va a pegar por la izquierda
     * @return número inicial <code>_n</code> con el dígito <code>_dig</code> pegado
     * por la izquierda
     */
    public static long pegaPorDelante( long _n, int _dig) 
    {
        return juntaNumeros( _n, _dig);
    }
    
    //-------------------------------------------------------------------
    /**
     * Añade un dígito a un número por delante (por la izquierda).
     *
     * @param _n número entero
     * @param _dig dígito que se le va a pegar por la izquierda
     * @return número inicial <code>_n</code> con el dígito <code>_dig</code> pegado
     * por la izquierda
     */
    public static int pegaPorDelante( int _n, int _dig) 
    {
        return (int) pegaPorDelante((long) _n, _dig);
    }
    
    //-------------------------------------------------------------------
    /**
     * Toma como parámetros las posiciones inicial y final dentro de un número y
     * devuelve el trozo correspondiente.
     * <p>
     * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
     *
     * @param _n número entero
     * @param _inicio posición inicial
     * @param _fin posición final
     * @return trozo de número compuesto por todos los dígitos que van desde la
     * posición inicial a la posición final incluyendo ambos
     */
    public static long trozoDeNumero( long _n, int _inicio, int _fin) 
    {
        int longitud = digitos( _n);
        
        _n = quitaPorDelante( _n, _inicio);
        _n = quitaPorDetras( _n, longitud - _fin - 1);
        
        return _n;
    }

    //-------------------------------------------------------------------
    /**
     * Toma como parámetros las posiciones inicial y final dentro de un número y
     * devuelve el trozo correspondiente.
     * <p>
     * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
     *
     * @param _n número entero
     * @param _inicio posición inicial
     * @param _fin posición final
     * @return trozo de número compuesto por todos los dígitos que van desde la
     * posición inicial a la posición final incluyendo ambos
     */
    public static int trozoDeNumero( int _n, int _inicio, int _fin) 
    {
        return (int) trozoDeNumero((long) _n, _inicio, _fin);
    }
    
    //-------------------------------------------------------------------
    /**
     * Pega dos números para formar uno solo.
     *
     * @param _izq trozo que se pegará por la izquierda
     * @param _der trozo que se pegará por la derecha
     * @return número compuesto de los trozos <code>_izq</code> e <code>_der</code>
     */
    public static long juntaNumeros(long _izq, long _der) 
    {
        return (long) (_izq * potencia( 10, digitos(_der))) + _der;
    }
    
    //-------------------------------------------------------------------
    /**
     * Pega dos números para formar uno solo.
     *
     * @param _izq trozo que se pegará por la izquierda
     * @param _der trozo que se pegará por la derecha
     * @return número compuesto de los trozos <code>_izq</code> e <code>_der</code>
     */
    public static int juntaNumeros(int _izq, int _der) 
    {
        return (int) ( juntaNumeros( (long) _izq, (long) _der));
    }

    //-------------------------------------------------------------------
    public static void main(String[] args) 
    {
        // esCapicua 
        if( esCapicua(29))      System.out.println("El 29 es capicúa");
        
        if (esCapicua(1661))    System.out.println("El 1661 es capicúa");
        
        // esPrimo 
        if( esPrimo(29))        System.out.println("El 29 es primo");
        
        if( esPrimo(80))        System.out.println("El 80 es primo");
        
        // siguientePrimo 
        System.out.println( "El siguiente primo mayor a 11 es " + siguientePrimo(11));
        System.out.println( "El siguiente primo mayor a 20 es " + siguientePrimo(20));
        
        // potencia 
        System.out.println( "3^10 = " + potencia( 3, 10));
        System.out.println( "5^(-4) = " + potencia( 5, -4));
        System.out.println( "10^7 = " + potencia(10, 7));
        
        // digitos 
        System.out.println( "El número 0 tiene " + digitos(0) + " dígito/s.");
        System.out.println( "El número 8 tiene " + digitos(7) + " dígito/s.");
        System.out.println( "El número 677893123 tiene " + digitos(677893123) + " dígito/s.");
        
        // voltea 
        System.out.println( "El 8 volteado es " + voltea( 8));
        System.out.println( "El 983004321 volteado es " + voltea( 983004321));
        System.out.println( "El -76839 volteado es " + voltea(-76839));
        
        // digitoN 
        System.out.println( "En la posición 0 del 3452 está el " + digitoN(3452, 0));
        System.out.println( "En la posición 6 del 857964034 está el " + digitoN(857964034, 6));
        System.out.println( "En la posición 4 del 857964034 está el " + digitoN(857964034, 4));
        
        // posicionDeDigito 
        System.out.println( "En el 3452, el dígito 4 está en la posición " + posicionDeDigito(3452, 4));
        System.out.println( "En el 78604321, el dígito 1 está en la posición " + posicionDeDigito(78604321, 1));
        System.out.println( "En el 78604321, el dígito 7 está en la posición " + posicionDeDigito(78604321, 7));
        System.out.println( "En el 78604321, el dígito 5 está en la posición " + posicionDeDigito(78604321, 5));
        
        // quitaPorDetras 
        System.out.println( "Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + quitaPorDetras(78604321, 4));
        System.out.println( "Si al 1000 se le quita por detrás 1 dígito, se queda como " + quitaPorDetras(1000, 1));
        
        // quitaPorDelante 
        System.out.println( "Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + quitaPorDelante(78604321, 4));
        System.out.println( "Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + quitaPorDelante(78604000, 2));
        
        // pegaPorDetras    
        System.out.println( "Si al 567 se le pega por detrás el 1 da el " + pegaPorDetras(567, 1));
        System.out.println( "Si al 33 se le pega por detrás el 0 da el " + pegaPorDetras(33, 0));
        
        // pegaPorDelante 
        System.out.println( "Si al 567 se le pega por delate el 1 da el " + pegaPorDelante(567, 1));
        System.out.println( "Si al 33 se le pega por delante el 0 da el " + pegaPorDelante(33, 0));
        
        // trozoDeNumero 
        System.out.println( "Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + trozoDeNumero(78604000, 0, 3));
        System.out.println( "Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + trozoDeNumero(78604000, 4, 6));
        System.out.println( "Al 78604000 le cojo el trozo que va de la posición 2 a la 2: " + trozoDeNumero(78604000, 2, 2));
        
        // juntaNumeros 
        System.out.println( "Juntando el 21 y el 40 da el " + juntaNumeros(21, 40));
        System.out.println( "Juntando el 789 y el 250 da el " + juntaNumeros(789, 250));
    }

}
