/*
Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_05 
{
    public static void main(String[] args) 
    {
        final int TAM = 10 ;
        int[] array = new int[TAM];
        int i;

        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");

        for (i = 0; i < TAM; i++) 
            array[i] = Integer.parseInt(System.console().readLine());
        

        System.out.println("\nLos números introducidos, al revés, son los siguientes:");
        for (i = TAM-1; i >= 0; i--) 
            System.out.println( array[i]);
        
  }
}
