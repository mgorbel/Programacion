/*

 */
package pro_sol_matrices;

import java.util.Scanner;

/**
 *
 * @author manuela
 * @version 0.1
 */
public class Ej08_Tres_en_rayas {

    static final String JUGADOR = "O";
    static final String ORDENADOR = "X";
    
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
        System.out.println("     1   2   3\n");
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

        // juego /////////////////////////////////////////////////
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
                do 
                {
                    fila =    (int) (Math.random() * TAM);
                    columna = (int) (Math.random() * TAM);
                } while (!tablero[fila][columna].equals(" "));

                tablero[fila][columna] = ORDENADOR;
                movimientos++;
                
                // comprueba si gana el ordenador
                ordenadorGana = comprobarJugada( tablero, ORDENADOR) ;
            }

        } while( !jugadorGana && !ordenadorGana && ( movimientos < 9));
        
        // pinta el tablero
        pintarTablero( tablero, nombreFila) ;

        if( jugadorGana)             System.out.println("¡Enhorabuena! ¡Has ganado!");
        else if( ordenadorGana)     System.out.println("Gana el ordenador.");
        else                        System.out.println("Empate. No gana nadie.");        
    }
}
