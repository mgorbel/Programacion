/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

import java.util.Scanner;

/**
 *
 * @author Manuela
 */
public class Ej08_3enrayas_IA
{
    static final String JUGADOR = "O";
    static final String ORDENADOR = "X";
    
    //--------------------------------------------------------------------------
    /**
     * Comprueba si el jugador  puede ganar en el siguiente turno.
     * @param _tablero El tablero de juego.
     * @param _jugadorr El símbolo del jugador a comprobar ("X" u "0").
     * @return Un array int[2] con [fila, columna] del movimiento ganador, o [-1, -1] si no lo hay.
     */
    public static int[] encontrarMovimientoGanador( String[][] _tablero, String _jugador) 
    {
        int[] vRetorno = new int[2] ;
        boolean salir = false ;
        
        // Recorre todas las casillas del tablero
        for (int fil = 0; fil < _tablero.length && !salir; fil++) 
        {
            for( int col = 0; col < _tablero[fil].length && !salir; col++) 
            {
                // Si la casilla está vacía
                if( _tablero[fil][col].equals(" ")) 
                {
                    // Simula la jugada en esa casilla
                    _tablero[fil][col] = _jugador;

                    // Comprueba si con esa jugada se gana
                    if (comprobarJugada(_tablero, _jugador)) 
                    {
                        // Deshace la jugada simulada (importante)
                        _tablero[ fil][ col] = " ";
                        // Devuelve la posición ganadora
                        vRetorno = new int[]{ fil, col};
                        salir = true ;
                    }
                    else 
                        // Deshace la jugada simulada (importante)
                        _tablero[ fil][ col] = " ";
                }
            }
        }
        // No se encontró ningún movimiento ganador
        if( !salir) vRetorno = new int[]{ -1, -1};
        
        return vRetorno ;
    }
    
    //--------------------------------------------------------------------------
    /**
     * Calcula el movimiento inteligente para el ordenador (Ganar, Bloquear, Aleatorio).
     * @param _tablero El tablero de juego.
     * @return Un array int[2] con [fila, columna] del movimiento.
     */
    public static int[] jugadaOrdenadorInteligente( String[][] _tablero) 
    {        
        int[] movimiento;
        int fila = -1, columna = -1;
        final int TAM = _tablero.length;

        movimiento = encontrarMovimientoGanador( _tablero, ORDENADOR);
        
        if( movimiento[0] == -1 )
        {
            movimiento = encontrarMovimientoGanador( _tablero, JUGADOR);
            if (movimiento[0] == -1) 
            {                
                do 
                {
                    fila = (int) (Math.random() * TAM);
                    columna = (int) (Math.random() * TAM);
                } while (!_tablero[ fila][ columna].equals(" "));
                movimiento = new int[2];
                movimiento[0] =  fila ;
                movimiento[1] =  columna;
            }             
        }        
        
        return movimiento ;
    }
    
    
    //--------------------------------------------------------------------------
    public static boolean comprobarJugada( String[][] _tablero, String _gamer)
    {
        return (( _tablero[0][0] == _gamer) && (_tablero[0][1] == _gamer) && (_tablero[0][2] == _gamer)
        || (_tablero[1][0] == _gamer) && (_tablero[1][1] == _gamer) && (_tablero[1][2] == _gamer)
        || (_tablero[2][0] == _gamer) && (_tablero[2][1] == _gamer) && (_tablero[2][2] == _gamer)
        || (_tablero[0][0] == _gamer) && (_tablero[1][0] == _gamer) && (_tablero[2][0] == _gamer)
        || (_tablero[0][1] == _gamer) && (_tablero[1][1] == _gamer) && (_tablero[2][1] == _gamer)
        || (_tablero[0][2] == _gamer) && (_tablero[1][2] == _gamer) && (_tablero[2][2] == _gamer)
        || (_tablero[0][0] == _gamer) && (_tablero[1][1] == _gamer) && (_tablero[2][2] == _gamer)
        || (_tablero[0][2] == _gamer) && (_tablero[1][1] == _gamer) && (_tablero[2][0] == _gamer));
    }
    
    //--------------------------------------------------------------------------
    public static void pintarTablero( String[][] _tablero, String _nombreFila)
    {
        System.out.println("  -------------");
        for( int i = 0; i < _tablero.length; i++) 
        {
            System.out.print( _nombreFila.charAt(i) + " ");
            for( int j = 0; j < _tablero[0].length; j++)                     
                System.out.print("| " + _tablero[i][j] + " ");

            System.out.println("|");
            System.out.println("  -------------");
        }
        System.out.println("    1   2   3\n");
    }

    //--------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner( System.in) ;
        final int TAM = 3 ;
        String[][] tablero = new String[TAM][TAM];
        int movimientos = 0;
        int fila, columna ;
        boolean jugadorGana = false;
        boolean ordenadorGana = false;
        String nombreFila = "cba";
        String coordenadas;

        // inicializa el tablero
        for( int i = 0; i < TAM; i++) 
        {
            for( int j = 0; j < TAM; j++) 
            {
                tablero[i][j] = " ";
            }
        }

        // juego 
        do {

            // pinta el tablero
            pintarTablero( tablero, nombreFila) ;

            // pide las coordenadas
            System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
            coordenadas = teclado.nextLine() ;
            
            fila = nombreFila.indexOf( coordenadas.charAt(0));
            columna = coordenadas.charAt(1) - 1 - 48;
            tablero[ fila][ columna] = JUGADOR;
            movimientos++;

            // comprueba si gana el jugador
            jugadorGana = comprobarJugada( tablero, JUGADOR) ;
            
            if( !jugadorGana && ( movimientos < 9)) 
            {
                // juega el ordenador
//                do 
//                {
//                    fila =    (int) (Math.random() * TAM);
//                    columna = (int) (Math.random() * TAM);
//                } while (!tablero[fila][columna].equals(" "));
//
                
                // juega el ordenador de forma inteligente
                int[] movimientoOrdenador = jugadaOrdenadorInteligente(tablero);
                fila = movimientoOrdenador[0];
                columna = movimientoOrdenador[1];

                tablero[fila][columna] = ORDENADOR;
                movimientos++;
                
                // comprueba si gana el ordenador
                ordenadorGana = comprobarJugada( tablero, ORDENADOR) ;
            }

        } while( !jugadorGana && !ordenadorGana && ( movimientos < 9));
        
        // pinta el tablero
        pintarTablero( tablero, nombreFila) ;

        if( jugadorGana)            System.out.println( "¡Enhorabuena! ¡Has ganado!");
        else if( ordenadorGana)     System.out.println( "Gana el ordenador.");
        else                        System.out.println( "Empate. No gana nadie.");        
    }
}
