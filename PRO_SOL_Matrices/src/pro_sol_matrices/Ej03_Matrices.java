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
public class Ej03_Matrices
{
    public static void main( String[] args) 
    {
        final int FILAS = 4, COLUMNAS = 5 ;
        Scanner teclado = new Scanner( System.in) ;
        int[][] matriz = new int[4][5]; // array de 4 filas por 5 columnas
        int sumaFila, sumaColumna;
        int sumaTotal = 0;
        
        // Lee los datos de teclado -- aleatorios
        System.out.println("Por favor, introduzca los numeros (enteros) en el array");
        for (int fila = 0; fila < FILAS; fila++) 
        {
            for (int columna = 0; columna < COLUMNAS; columna++) 
            {
                //System.out.print("Fila " + fila + ", columna " + columna + ": ");
                //matriz[fila][columna] = teclado.nextInt();
                matriz[fila][columna] = (int)(Math.random() * 900) + 100;
            }
        }
        
        // Muestra los datos y las sumas parciales de las filas        
        for( int fila = 0; fila < FILAS; fila++) 
        {
            sumaFila = 0;
            for( int columna = 0; columna < COLUMNAS; columna++) 
            {
                System.out.printf("%7d   ", matriz[fila][columna]);
                sumaFila += matriz[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Muestra las sumas parciales de las columnas
        for( int columna = 0; columna < COLUMNAS; columna++) 
        {
            System.out.print("----------");
        }
        System.out.println("-----------");


        for( int columna = 0; columna < COLUMNAS; columna++) 
        {
            sumaColumna = 0;
            for( int fila = 0; fila < FILAS; fila++) 
            {
                sumaColumna += matriz[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   \n", sumaTotal);
    }
}
