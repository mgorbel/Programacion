/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro_sol_matrices;

/**
 *
 * @author manuela
 */
public class Ej01_matrices 
{
    public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
 
    int[][] num = new int[3][6]; // array de 3 filas por 6 columnas

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 7;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    

    System.out.print("       ");
    for( int columna = 0; columna < 6; columna++) 
    {
      System.out.print("   Columna " + columna);
    }
    for( int fila = 0; fila < 3; fila++) 
    {

      System.out.print("\nFila " + fila);
  
      for( int columna = 0; columna < 6; columna++) 
      {
        System.out.printf("%9d   ", num[fila][columna]);
        Thread.sleep(500); // retardo de medio segundo
      }
    }
  }
}
