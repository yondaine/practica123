/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 4
 *  Ejercicio2_4.java
 *  Programa que pide numeros y pide una confirmacion para seguir introduciendo
 *  al final imprime el numero mas grande introducido
 */

import java.util.Scanner;

public class Ejercicio2_4 {
	
	//Declaramos la clase principal
	
	public static void main(String[] args) {
		
		// Habilitamos la entrada por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		// Declaramos las variables que utilizaremos
		
		int mayor = 0;
		int aux;
		String continuar;
		
		// Creamos un bucle "do...while" que nos pida numeros todo el tiempo  
		// Y nos pida una confirmacion para continuar introduciendo digitos
		// A su vez situamos un "if" que vaya almacenando el mayor numero en 
		// una variable
		
		do {
			System.out.print("Introduce un numero: ");
			aux = teclado.nextInt();
			
			if(aux>mayor){
				mayor = aux;
			}

			System.out.print("\nIntroduce S para continuar: ");
			continuar = teclado.next();
			
		} while (continuar.equals("S")||continuar.equals("s"));
		
		// Por ultimo mostramos el mayor digito introducido
			
		System.out.println("El mayor numero introducido es el: "+mayor);
	}
}

