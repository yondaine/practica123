/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 2
 *  Ejercicio2_2.java
 *  Pide un nombre de usuario y lo almacena, tambien lo muestra en pantalla.
 */
import java.util.Scanner;

public class Ejercicio2_2 {
	public static void main(String argumentos[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Introduce tu nombre de usuario: ");
		nombre = teclado.nextLine();
		
		System.out.print("\nTu nombre de usuario es: "+ nombre);
		
	}

}
