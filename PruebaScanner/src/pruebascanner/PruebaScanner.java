/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebascanner;
/**
 * Escribir el import
 * La clase Scanner se encuentra en el paquete java.util por lo tanto se debe 
 * incluir al inicio del programa la instrucción:
 * import java.util.Scanner;
 * 
 *  @author Manuela
 */
import java.util.Scanner;


public class PruebaScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Crear un objeto de la clase Scanner asociado al dispositivo de entrada. 
         * Para ello escribiremos:
         * Scanner sc = new Scanner(System.in);
         * */
        Scanner sc = new Scanner(System.in);
        int n;
        double x, radio;
        String cad;
        
        // lectura por teclado de un número entero:
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        
        // lectura de un número de tipo double:
        System.out.print("Introduzca número de tipo double: ");
        x = sc.nextDouble();

        sc.nextLine() ; // vaciar el buffer, comenta esta línea para ver que pasa si no la activas
        // lectura de una cadena de caracteres:
        System.out.print("Introduzca texto: ");
        cad = sc.nextLine();

        System.out.print("Introduzca su nombre: ");        
        cad = sc.nextLine();  //leer un String
        System.out.println("Hola " + cad + "!!!");
        System.out.print("Introduzca el radio de la circunferencia: ");
        
        radio = sc.nextDouble(); //leer un double
        System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
        
        System.out.print("Introduzca un número entero: "); 
        n = sc.nextInt(); //leer un entero
        System.out.println("El cuadrado es: " + Math.pow(n,2));

    }
    
}
