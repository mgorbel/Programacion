/*
Escribe un programa que genere 100 números aleatorios del rango [0,20] y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
generada anteriormente. Los números que se han cambiado deben aparecer entre
comillados.
 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_08 {
    public static void main(String[] args) 
    {
        final int TAM = 100 ;
        int[] numero = new int[TAM];
        String verde = "\033[32m";
        String negro = "\033[30m";

        // Rellena el array con números aleatorios
        for (int i = 0; i < 100; i++) 
        {
            numero[i] = (int) (Math.random() * 21);
            System.out.print(numero[i] + "  ");
        }

        System.out.print("\nIntroduzca un número de los que se han mostrado: ");
        int valor1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int valor2 = Integer.parseInt(System.console().readLine());

        System.out.println();

        for( int i = 0; i < 100; i++) 
        {
            if (numero[i] == valor1) 
            {
                numero[i] = valor2;
                System.out.print( verde + "\"" + numero[i] + "\"  ");
            } 
            else
            {
                System.out.print( negro + numero[i] + "  ");
            }
        }

        System.out.println();
    }
}
