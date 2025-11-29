/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

/**
 *
 * @author Manuela
 */
public class Ej07_Matrices 
{

    public static void main(String[] args) 
    {
        final int TAM = 12 ;
        int[][] n = new int[TAM][TAM];
        int aux1, aux2;
        
        // genera el array y lo muestra /////////////////////////
        System.out.println("Array original");
        System.out.println("--------------");
        for( int i = 0; i < TAM; i++) 
        {
            for( int j = 0; j < TAM; j++) 
            {
                n[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }

        // rotación /////////////////////////////////////////////
        for( int capa = 0; capa < 6; capa++) 
        {
            // rota por arriba
            aux1 = n[capa][11 - capa];
            for( int i = 11 - capa; i > capa; i--) 
            {
                n[capa][i] = n[capa][i - 1];
            }
            // rota por la derecha
            aux2 = n[11 - capa][11 - capa];
            for( int i = 11 - capa; i > capa + 1; i--) 
                n[i][11 - capa] = n[i - 1][11 - capa];
            
            n[capa + 1][11 - capa] = aux1;
            // rota por abajo
            aux1 = n[11 - capa][capa];
            for( int i = capa; i < 11 - capa - 1; i++) 
                n[11 - capa][i] = n[11 - capa][i + 1];
            
            n[11 - capa][11 - capa - 1] = aux2;
                // rota por la izquierda
            for( int i = capa; i < 11 - capa - 1; i++) 
                n[i][capa] = n[i + 1][capa];
            
            n[11 - capa - 1][capa] = aux1;
        } // for capa
        
        // muestra el array resultante ///////////////////////////
        System.out.println("\n\nArray rotado en el sentido de las agujas del reloj");
        System.out.println("--------------------------------------------------");
        for( int i = 0; i < TAM; i++) 
        {
            for( int j = 0; j < TAM ; j++) 
                System.out.printf("%5d", n[i][j]);
            
            System.out.println();
        }
    }
}
