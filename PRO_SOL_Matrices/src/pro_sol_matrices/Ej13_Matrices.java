/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej07_matrices;

import java.util.Scanner;

/**
 *
 * @author manuela
 */
public class Ej13_Matrices {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(s.nextLine());
    
        for (int i = altura; i > 0; i--) 
        {
            System.out.print( linea(' ', altura - i));
            System.out.println( linea('*', i*2-1));
        }
        
    }

    public static String linea(char caracter, int repeticiones) 
    {
        String resultado = "";
        
        for (int i = 0; i < repeticiones; i++) 
            resultado += caracter;
        
        return resultado;
    }
}
