/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 1
 *  Ejercicio2_1.java
 *  Pide tres numeros y los muestra ordenados de mayor a menor.
 */

import java.util.Scanner;

public class Ejercicio2_1 {

	// Declaramos la clase principal
	
	public static void main(String[] args) {
		
		//Habilitamos la entrada por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		// Declramos las variables que utilizaremos
		
		int mayor,mediano,menor;
		int aux;
		
		// Pedimos los digitos y los vamos guardando en las variables declaradas
		// anteriormente, a traves de secuencias "if"
		
		System.out.println("Primera variable: ");
		mayor = teclado.nextInt();
		
		System.out.println("Segunda variable: ");
		aux = teclado.nextInt();
		
		if(aux>mayor){
			mediano = mayor;
			mayor = aux;
		}else{
			mediano = aux;
		}
		
		System.out.println("Tercera variable: ");
		aux = teclado.nextInt();
		
		if(aux>mayor){
			menor = mediano;
			mediano = mayor;
			mayor = aux;		
		}else{
			if(aux>mediano){
				menor = mediano;
				mediano = aux;
			}else{
				menor = aux;
			}
		}
		// Por ultimo mostramos en pantalla los numeros ordenados de mayor a menor
		
		System.out.println("El orden de mayor a menor es: "+mayor+","+mediano+" y "+menor);
		
		
	}
	
}
