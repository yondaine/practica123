/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 7
 *  Ejercicio2_7.java
 *  Programa que imprime en pantalla todos los multiplos de "3" del 1 al 3000
 */
import java.util.Scanner;

public class Ejercicio2_7 {
	
	// Declaramos la clase principal
	
	public static void main(String[] args) {
		
		// Declaramos las variables que necsitamos
		
		double num1,resultado;
		int redondeo;
		int tot;
		boolean bucle = true;
		
		// Habilitamos la entrada por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		// Mostramos un mensaje de bienvenida al usuario
		
		System.out.println("REDONDEADOR DE NUMEROS DECIMALES");
		System.out.println("---Introduce un 0 para salir---");
		
		// Utilizando un bucle realizamos la funcion del programa hasta que
		// el usuario introduzca un "0" en cualquier parte del programa
		
		while (bucle){
			System.out.print("\nIntroduce un numero decimal: ");
			num1 = teclado.nextDouble();
			if (num1 == 0){
				break;
			}

			System.out.print("\nRedondear a: ");
			redondeo = teclado.nextInt();
			if (redondeo == 0){
				break;
			}
			
		    tot = (int) Math.pow(10,redondeo);
			
			resultado = Math.rint(num1*tot)/tot;
			
			System.out.println("\nEl numero redondeado es: "+resultado);
			
		}
			
	        // Mensaje de fin del programa	
		
	        System.out.println("FIN DEL PROGRAMA");
	}
}
