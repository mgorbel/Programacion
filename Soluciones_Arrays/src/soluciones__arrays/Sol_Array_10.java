/*
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios
comprendidos en el rango [ 0, 500]. A continuación el programa mostrará el array y
preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a
mostrar el array escribiendo el número destacado entre dobles asteriscos
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_10 
{
    public static void main(String[] args) 
    {
        final int TAM = 100 ;
        int[] array = new int[TAM];
        int maximo = 0;
        int minimo = 100;
        int destacado = -1, opcion ;

        // Genera los números y calcula el máximo y el mínimo
        for (int i = 0; i < TAM; i++) 
        {
            array[i] = (int) (Math.random() * 501);

            if (array[i] < minimo)  minimo = array[i];
            
            if (array[i] > maximo)  maximo = array[i];
        }

        // Mostrar el array original
        System.out.println("Array original");
        for (int i = 0; i < TAM; i++) 
        {
            System.out.print(array[i] + " ");
            if( (i+1) %10 ==0) System.out.println("");
        }

        System.out.print("\n\n¿Que quiere destacar? (1 – minimo, 2 – maximo): ");
        opcion = Integer.parseInt(System.console().readLine());


        switch( opcion) 
        {
        case 1:    
                destacado = minimo;
                break;
        case 2:
                destacado = maximo;
                break;
        }

        System.out.println("\nArray destacado");

        // Mostrar el resultado.
        for (int i = 0; i < TAM; i++) 
        {
            if (array[i] == destacado)  System.out.print( " **" + array[i] + "** ");
            else                        System.out.print( array[i] + " ");  
            
            if( (i+1) %10 == 0) System.out.println("");
        }
        System.out.println("");
    }

}
