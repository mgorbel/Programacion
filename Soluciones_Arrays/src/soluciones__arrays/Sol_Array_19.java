/*

 */
package ejercicios_arrays;

import java.util.Scanner;

/**
 * Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia
 * histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación
 * recibirá los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles
 * el ordinal correspondiente. Así, por ejemplo, si hay dos Luis en los nombres de los reyes, el
 * primero debería aparecer como Luis 1º y el segundo como Luis 2º
 * 
 * @author mgordillo
 * @version 0.1
 */
public class Sol_Array_19 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        int tamanio ;
        String[] reyes ;

        
        System.out.print("Introduzca el número total de nombres de reyes: ");
        tamanio = Integer.parseInt( teclado.nextLine());
        reyes = new String[ tamanio];
        
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        
        for( int i = 0; i < tamanio; i++) 
        {
            reyes[i] = teclado.nextLine();
        }
        
        System.out.println("\nLos reyes introducidos son: ");
        for( int i = 0; i < tamanio; i++) 
        {
            int orden = 1;
            
            for( int j = 0; j < i; j++) 
            {
                if( reyes[i].equals( reyes[j])) 
                {
                    orden++;
                }
            }
            
            System.out.println( reyes[i] + " " + orden + "º");
        }
    }
}
