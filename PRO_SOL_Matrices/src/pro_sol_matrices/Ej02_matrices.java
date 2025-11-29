/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

import java.util.Scanner;

/**
 *
 * @author manuela
 */
public class Ej02_matrices 
{
    public static void main( String[] args) 
    {
        final int FILAS = 4, COLUMNAS = 5 ;
        Scanner teclado = new Scanner( System.in) ;
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
        int sumaFila, sumaColumna;
        int sumaTotal = 0;
        
        // Lee los datos de teclado
        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for (int fila = 0; fila < FILAS; fila++) 
        {
            for (int columna = 0; columna < COLUMNAS; columna++) 
            {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] = teclado.nextInt();
            }
        }

        // Muestra los datos y las sumas parciales de las filas
        
        for( int fila = 0; fila < FILAS; fila++) 
        {
            sumaFila = 0;
            for( int columna = 0; columna < COLUMNAS; columna++) 
            {
                System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
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
                sumaColumna += num[fila][columna];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}
