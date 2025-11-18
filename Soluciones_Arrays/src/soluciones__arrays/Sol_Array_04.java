/*

 */
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_04 
{
    public static void main(String[] args) 
    {
        // 1. Define el array de 10 caracteres
        char[] simbolo = new char[10];

        // 2. Asigna los valores según la tabla
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' '; // Espacio en blanco
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        simbolo[9] = 'Z';

        // 3. Muestra el contenido de todos los elementos del array
        System.out.println( "Contenido del array 'simbolo': ");
        for (int i = 0; i < simbolo.length; i++) 
        {
            // Se utiliza (int) simbolo[i] para mostrar el valor numérico ASCII
            // de los caracteres, lo que es útil para ver el valor de los
            // caracteres 'invisibles' como el carácter nulo (ASCII 0).
            System.out.println("simbolo[" + i + "]: '" + simbolo[i] + "' (ASCII: " + (int) simbolo[i] + ")");
        }
    }
}
