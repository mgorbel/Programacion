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
public class Ej04_Matrices {

    public static void main(String[] args)
            throws InterruptedException
    {
        int[][] matriz = new int[6][10];
        int minimo = Integer.MAX_VALUE, filMinimo = 0, colMinimo = 0;
        int maximo = Integer.MIN_VALUE, filMaximo = 0,  colMaximo = 0;
        
        System.out.print("\n    ");
        for( int columna = 0; columna < 10; columna++) 
            System.out.printf("%5d " , columna );
        
        System.out.println();
        System.out.print("    ");
        for( int columna = 0; columna < 10; columna++) 
            System.out.print("------");
        
        System.out.println("");
        for( int fila = 0; fila < 6; fila++) 
        {
            System.out.print(" " + fila + " |");
            for( int columna = 0; columna < 10; columna++) 
            {
                matriz[fila][columna] = (int) (Math.random() * 1001);
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
        for( int columna = 0; columna < 10; columna++) 
            System.out.print("------");
        
        System.out.println("\n\nEl máximo es " + maximo + " y está en la fila " + filMaximo + ",columna " + colMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filMinimo + ", columna " + colMinimo);
    }
}
