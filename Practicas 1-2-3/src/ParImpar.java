/** 1.2.1. (P) Ejercicios: Introducción a la programación
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 10
 *  ParImpar.java
 *  Pide un digito e identifica si este es par o impar.
 */

import java.util.Scanner;
public class ParImpar
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		
		Scanner teclado = new Scanner(System.in);
		
		// Configuramos las variables de tipo "String" y "Integer"
		String num = "";		
		String mensaje = "";
		
		Integer num1;
		int resto;
		
		
		
		// Mostramos un mensaje de bienvenida al programa
		System.out.print("Bienvenido al identificador de numeros pares e impares\n");
		System.out.print("A continuacion introduce el digito a identificar:\n");
		
		// Pedimos el digito como "String" y configuramos que ese mismo
		// dato sea tranformado a "Integer" para poder ser comparado como numero
        // entero
		System.out.print("\nIntroduce un numero: ");
		num = teclado.nextLine();
		num1 = new Integer(num);
		
		
        // Configuramos la variable "resto" para que su valor sea la division de
		// "num1"(digito proporcionado por el usuario) estre "num2" al que le 
		// aplicamos el valor "2" antes
		
		resto = num1%2;
		
		// Por ultimo a traves de un "if" vemos si el valor de "resto" es "0" y por
		// consecuencia par, ya que un numero par entre "2" acabara dando "0",
		// o distinto de "0" y por consecuencia impar
		 
		if (resto==0)
		  System.out.println("El numero, "+ num1 + " es par ");
		else
			  System.out.println("El numero, "+ num1 + " es impar ");
		
	
	}
}