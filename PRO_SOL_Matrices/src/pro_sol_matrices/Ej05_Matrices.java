/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

/**
 *
 * @author Manuela
 */
public class Ej05_Matrices {

    public static void main(String[] args)
            throws InterruptedException 
    {
        final int TAM_F = 6, TAM_C = 10 ;
        int[][] matriz = new int[ TAM_F][TAM_C];
        int minimo = Integer.MAX_VALUE, filMinimo = 0, colMinimo = 0;
        int maximo = Integer.MIN_VALUE, filMaximo = 0, colMaximo = 0;
        boolean repetido;
        
        // Genera el contenido del array sin que se repita ningún valor
        for( int fila = 0; fila < TAM_F; fila++) 
        {
            for( int columna = 0; columna < TAM_C; columna++) 
            {
                do 
                {
                    matriz[fila][columna] = (int) (Math.random() * 1001);
                    // Comprueba si el número generado ya está en el array.
                    repetido = false;
                    for( int i = 0; (i < TAM_C * fila + columna) && !repetido; i++) 
                    {
                        if(matriz[fila][columna] == matriz[i / TAM_C][i % TAM_C]) 
                        {
                            repetido = true;
                        }
                    }
                } while (repetido);
            }
        }

        System.out.print("\n    ");
        for( int columna = 0; columna < 10; columna++) 
            System.out.printf("%5d " , columna );
        
        System.out.println();
        System.out.print("    ");
        for( int columna = 0; columna < 10; columna++) 
            System.out.print("------");
        
        System.out.println("");
        for( int fila = 0; fila < TAM_F; fila++) 
        {
            System.out.print(" " + fila + " |");
            for( int columna = 0; columna < TAM_C; columna++) 
            {
                System.out.printf("%5d ", matriz[fila][columna]);
                Thread.sleep(100);
                // Calcula el mínimo y guarda sus coordenadas
                if (matriz[fila][columna] < minimo) 
                {
                    minimo = matriz[fila][columna];
                    filMinimo = fila;
                    colMinimo = columna;
                }
                // Calcula el máximo y guarda sus coordenadas
                if (matriz[fila][columna] > maximo) 
                {
                    maximo = matriz[fila][columna];
                    filMaximo = fila;
                    colMaximo = columna;
                }
            }
            System.out.println("|");
        }
        
        System.out.print("    ");
        for( int columna = 0; columna < TAM_C; columna++) 
            System.out.print("------");
        
        System.out.println("\n\nEl máximo es " + maximo + " y está en la fila " + filMaximo + ",columna " + colMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filMinimo + ", columna " + colMinimo);
    }
}
