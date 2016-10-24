/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 4
 *  Ejercicio2_4.java
 *  Programa que pide numeros y pide una confirmacion para seguir introduciendo
 *  al final imprime el numero mas grande introducido
 */

import java.util.Scanner;

public class Ejercicio2_4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int mayor = 0;
		int aux;
		String continuar;
		
		do {
			System.out.print("Introduce un digito: ");
			aux = teclado.nextInt();
			
			if(aux>mayor){
				mayor = aux;
			}
			
			System.out.print("\nIntroduce S para continuar: ");
			continuar = teclado.next();
			
		} while (continuar.equals("S")||continuar.equals("s"));
			
		System.out.println("El mayor numero introducido es el: "+mayor);
	}
			
	}


