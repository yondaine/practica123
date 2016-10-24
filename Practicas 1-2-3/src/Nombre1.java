/** 1.2.1. (P) Ejercicios: Introducción a la programación
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 8
 *  Nombre1.java
 *  Pide y imprime nombre y edad de dos usuarios diferentes.
 */

import java.util.Scanner;
public class Nombre1
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util

		Scanner teclado = new Scanner(System.in);
		
		String nombre1 = "";		// variable de texto 
		String nombre2 = "";        // variable de texto 
		
		int edad1 ;                 // variable numerica 
		int edad2 ;                 // variable numerica
		
		// Configura y muestra mensaje de bienvenida

		System.out.println("Buenas, soy un modesto programa de ordenador...");
		System.out.print("Mi funcion no es otra que adquirir datos de dos "
				        + "personas\n");
		
		// Pide ambos nombres
		System.out.print("\nDíme el nombre del Usuario 1: ");
		nombre1 = teclado.nextLine();
		
		System.out.print("\nDíme el nombre del Usuario 2: ");	
		nombre2 = teclado.nextLine();
		
		// Pide ambas edades
		System.out.print("\nDíme la edad del Usuario 1: ");
		edad1 = teclado.nextInt();
		
		System.out.print("\nDíme la edad del Usuario 2: ");	
		edad2 = teclado.nextInt();
		
		// Muestra mensaje personalizado con monbres y edades intoducidos
		System.out.println("\nBienvenidos a Java.\n");
		
		System.out.println("Usuario 1\n");
		System.out.println("Nombre:" + nombre1);
		System.out.println("Edad:" + edad1);
		
		System.out.println("\nUsuario 2\n");
		System.out.println("Nombre:" + nombre2);
		System.out.print("Edad:" + edad2);
		
	}

}