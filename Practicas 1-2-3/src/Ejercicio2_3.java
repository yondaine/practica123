/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 3
 *  Ejercicio2_3.java
 *  Pide 8 digitos numericos al usuario y los suma entre si utilizando un bucle
 *  de tipo "for"
 */

import java.util.Scanner;

public class Ejercicio2_3 {

	// Declaramos la clase principal
	
     public static void main(String argumentos[]){
    	 
    	 // Configuramos las variables de tipo entero y habilitamos la entrada por
         // teclado
    	 
    	 Scanner teclado = new Scanner(System.in);
    	 
    	 int num1 = 0;
    	 
    	 System.out.println("Introduce los 8 digitos a sumar:");
    	 
    	 // Utilizando un bocle de tipo "for" lo configuramos para que se repita
    	 // el numero de veces que deseamos(8) para recoger los datos que necesitamos
    	 // y se sumen automaticamente
    	 
    	 for (int i = 1; i < 9; i++) {
    		 System.out.print("\n"+i+"º Número: ");
    		 num1+= teclado.nextInt();	
		}
    	 
    	 //Por ultimo mostramos el valor final de la suma
    	 
    	 System.out.print("\nLa suma de esos digitos da un total de: "+num1);
     }
}
