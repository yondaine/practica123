/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 2
 *  Ejercicio2_2.java
 *  Programa que a partir del capital inicial, interes y numero de años
 *  proporcionados por el usuario calcula el capital final.
 */

import java.util.Scanner;

public class Ejercicio2_2 {
    
	// Declaramos la clase principal
	
	static public void main(String argumentos[]){
		
		Scanner teclado = new Scanner(System.in);
		
		// Declaramos tambien las variables que necesitaremos de tipo "double" y
		// "int"
		
		double cfinal,cinicial,interes;
		int naños;
		
		// Mostramos un mensaje de bienvenida y pedimos los datos variables al
		// usuario
		
		System.out.println("CALCULADORA DE CAPITAL FINAL");
		
		System.out.print("\nIntroduce el capital inicial: ");
		cinicial = teclado.nextDouble();
		
		System.out.print("Introduce el interes anual: ");
		interes = teclado.nextDouble();
		
		System.out.print("Introduce el numero de años: ");
		naños = teclado.nextInt();
		
		// A partir de una expresion matematica calculamos el "cfinal" partiendo de
		// los datos introducidos por el usuario
		
		cfinal = Math.pow((1 + interes),naños)*cinicial;
		
		// Por ultimo mostramos el capital final y el interes con el que se adquiere
		
		System.out.print("\nEl capital final con un interes anual del, "+interes);
		System.out.print(" tiene un valor de: "+cfinal);
		
	}
}
		