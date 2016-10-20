/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 2
 *  Ejercicio2_2.java
 *  Pide un nombre de usuario y lo almacena, tambien lo muestra en pantalla.
 */
import java.util.Scanner;

public class Ejercicio2_2 {

        // Declaramos la clase principal
	
	public static void main(String argumentos[]) {
		
		// Configuramos las variables de tipo "String" y habilitamos la entrada por
        // teclado
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;

		// Pedimos al ususario que introduzca su nombre de usuario
		// Y lo almacenamos en un atibuto de tipo "String" creado anteriormente
		
		System.out.print("Introduce tu nombre de usuario: ");
		nombre = teclado.nextLine();
		
		// Por ultimo imprimimos en pantalla el nombre proporcionado
		
		System.out.print("\nTu nombre de usuario es: "+ nombre);
		
	}

}
