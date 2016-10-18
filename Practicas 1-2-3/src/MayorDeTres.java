/** 1.2.1. (P) Ejercicios: Introducción a la programación
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 12
 *  MayorDeTres.java
 *  Pide tres numeros e identifica cual de ellos es mayor.
 */

import java.util.Scanner;
public class MayorDeTres
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
		Integer num2;
		Integer num3;
		
		
		// Mostramos un mensaje de bienvenida al programa
		System.out.print("Bienvenido al comparador de digitos enteros\n");
		System.out.print("A continuacion introduce los digitos a comparar:\n");
		
		// Pedimos los tres digitos como "String" y configuramos que ese mismo
		// dato sea tranformado a "Integer" para poder ser comparado como numero
        // entero
		System.out.print("\nPrimer digito: ");
		num = teclado.nextLine();
		num1 = new Integer(num);
		
		System.out.print("\nSegundo digito: ");
		num = teclado.nextLine();
		num2 = new Integer(num);
		
		System.out.print("\nTercer digito: ");
		num = teclado.nextLine();
		num3 = new Integer(num);
		
        // Comparamos los digitos proporcionados a traves de una secuencia
		// matematica y expresa un mensaje identificando el mayor de los tres
		
		int resultado=Math.max(num1, num2);
		resultado=Math.max(resultado, num3);

		System.out.print("\nEl numero, "+ resultado +" es el mayor de los tres");
		
	}
}
		
		