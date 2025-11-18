/*
Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello
una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_09 
{
    public static void main(String[] args) 
    {
        final int TAM = 10 ;
        int[] n = new int[TAM];
        int[] primo = new int[TAM];
        int[] noPrimo = new int[TAM];
        int primos = 0;
        int noPrimos = 0;
        boolean esPrimo = false;

        System.out.println("Introduzca 10 números separados por INTRO:");

        for (int i = 0; i < TAM; i++) 
        {
            n[i] = Integer.parseInt(System.console().readLine());

            // Comprueba si el número es o no primo.
            esPrimo = true;
            for (int j = 2; j < n[i] - 1; j++) 
            {
                if (n[i] % j == 0)  esPrimo = false;                
            }

            // Si el número es primo, se mete en un array y si
            // no es primo, se mete en otro diferente.
            if (esPrimo)    primo[primos++] = n[i];
            else            noPrimo[noPrimos++] = n[i];
            
        }

        // Muestra el array original
        System.out.println("\n\nArray original:");
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");
        System.out.print("| Índice");
        for( int i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", i);
        
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");
        System.out.print("| Valor  ");
        for( int i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", n[i]);
        
       
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");

        // Los números primos se menten en las primeras
        // posiciones del array original.
        for( int i = 0; i < primos; i++) 
            n[i] = primo[i];
        

        // Los números que no son primos se colocan al final.
        for( int i = primos; i < primos + noPrimos; i++) 
            n[i] = noPrimo[i - primos];
        

        // Muestra el resultado.
        System.out.println("\n\nArray con los primos al principio:");
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");
        System.out.print("| Índice");
        for( int i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", i);
        
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");
        System.out.print("| Valor  ");
        for( int i = 0; i < TAM; i++) 
            System.out.printf("|%3d ", n[i]);
        
        System.out.println("|\n|--------|----|----|----|----|----|----|----|----|----|----|");
    }

}
