
package soluciones__arrays;

/**
 *
 * @author Manuela
 */
public class Sol_Array_01 {

    public static void main(String[] args) 
    {
        final int TAM = 12 ;
        int[] num = new int[ TAM];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int i = 0; i < TAM; i++) 
            System.out.printf("num[%2d]: %d\n", i, num[i]);
        

        // Como se puede observar, los valores del array se inicializan automáticamente a 0.
    }
}
