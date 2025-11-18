/*
Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_07 {

    public static void main(String[] args) 
    {
        final int TAM = 15 ;
        int[] numero = new int[TAM];
        int i, aux;

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");

        for (i = 0; i < TAM; i++) 
            numero[i] = Integer.parseInt(System.console().readLine());
        

        System.out.println();

        // Muestra el array original ///////////////
        System.out.println("Array original:");
        for (i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", i);
        
        System.out.println("|");
        for (i = 0; i < 75; i++) 
            System.out.print("-");
        
        System.out.println("-");
        for (i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", numero[i]);
        
        System.out.println("|");
        
      
        // rota una posición a la derecha //////////
        aux = numero[TAM-1];
        for (i = 14; i > 0; i--) 
            numero[i] = numero[i - 1];
        
        numero[0] = aux;
        
         System.out.println("\nArray rotado a la derecha una posición:");
        for (i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", i);
        
        System.out.println("|");
        for (i = 0; i < 75; i++) 
            System.out.print("-");
        
        System.out.println("-");
        for (i = 0; i < 15; i++) 
            System.out.printf("|%3d ", numero[i]);
        
        System.out.println("|");

    }
}
