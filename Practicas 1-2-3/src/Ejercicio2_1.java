/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 1
 *  Ejercicio2_1.java
 *  Pide al usuario tres digitos y los imprime en pantalla por orden.
 */
import java.util.Scanner;

public class Ejercicio2_1 {
	
	    // Declaramos la clase principal
	
	public static void main(String argumentos[]) {
	
		// Configuramos las variables de tipo entero y habilitamos la entrada por
        // teclado
		
		int num1;
		int num2;
		int num3;
		
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos al ususario que introduzca un valor a cada variable
		
		System.out.print("Introduce la primera variable: ");
		num1 = teclado.nextInt();
		
		System.out.print("\nIntroduce la segunda variable: ");
		num2 = teclado.nextInt();
		
		System.out.print("\nIntroduce la tercera variable: ");
		num3 = teclado.nextInt();
		
		// Por ultimo mostramos impreso en pantalla las variables escritas por orden
		
		System.out.print("\nPrimera variable: "+ num1);

		System.out.print("\nSegunda variable: "+ num2);
		
		System.out.print("\nTercera variable: "+ num3);
		
	}

}
