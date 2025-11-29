/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

/**
 *
 * @author mgb
 */
public class Ej06__BuscaTesoro 
{

    // Se definen constantes para representar el contenido de las celdas
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;

    public static void main(String[] args) 
    {        
        final int TAM_X = 5, TAM_Y = 4 ;
        int tesoroX, tesoroY; // guardar la posición del tesoro
        int minaX, minaY ;    // guardar la posición de la mina
        int posX, posY ;      // que se pide al jugador
        int[][] cuadrante = new int[TAM_X][TAM_Y];
        int oportunidades = 6;
        boolean salir = false;
        String c = "";

        // Inicializa el array
        for( int x = 0; x < TAM_X; x++)         
            for( int y = 0; y < TAM_Y; y++)             
                cuadrante[x][y] = VACIO;
            
        
        // colocar la mina
        minaX = (int) (Math.random() * 4);
        minaY = (int) (Math.random() * 3);

        cuadrante[minaX][minaY] = MINA;
        // Para depuración:
        System.out.println(minaX + ", " + minaY);


        // colocar el tesoro
        do 
        {
            tesoroX = (int) (Math.random() * 4);
            tesoroY = (int) (Math.random() * 3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));

        cuadrante[tesoroX][tesoroY] = TESORO;

        // Juego
        System.out.println("¡BUSCA EL TESORO!");

        do 
        {
            // Pinta el cuadrante
            for( int y = TAM_Y-1; y >= 0; y--) 
            {
                System.out.print(y + "|");
                for( int x = 0; x < TAM_X; x++) 
                {
                    if (cuadrante[x][y] == INTENTO) System.out.print("X ");
                    else                            System.out.print("  ");                     
                }
                System.out.println();
            }
            
            System.out.println("  ----------\n  0 1 2 3 4\n");

            // Pide las coordenadas
            System.out.print("Coordenada x: ");
            posX = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            posY = Integer.parseInt(System.console().readLine());

            // Mira lo que hay en las coordenadas indicadas por el usuario
            switch (cuadrante[posX][posY]) 
            {
            case VACIO:
                    cuadrante[posX][posY] = INTENTO;
                    if ((Math.abs(posX - minaX) < 2) && (Math.abs(posY - minaY) < 2)) 
                    {
                        System.out.println("Cuidado, hay una mina cerca.");
                    }
                    break;
                    
            case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                    
            case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                    
            }
        } while( !salir);

        // Pinta el cuadrante
        for( int y = TAM_Y-1; y >= 0; y--) 
        {
            System.out.print(y + " ");
            for( int x = 0; x < TAM_X; x++) 
            {
                switch (cuadrante[x][y]) 
                {
                    case VACIO:
                        c = "  ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "x ";
                        break;
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("  ----------\n  0 1 2 3 4\n");
    }
}
