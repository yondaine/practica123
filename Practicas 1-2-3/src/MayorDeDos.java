/** 1.2.1. (P) Ejercicios: Introducción a la programación
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 9
 *  MayorDeDos.java
 *  Pide dos numeros e identifica cual de ellos es mayor o menor.
 */

import java.util.Scanner;
public class MayorDeDos
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
		
		// Mostramos un mensaje de bienvenida al programa
		System.out.print("Bienvenido al comparador de digitos enteros\n");
		System.out.print("A continuacion introduce los digitos a comparar:\n");
		
		// Pedimos ambos digitos como "String" y configuramos que ese mismo
		// dato sea tranformado a "Integer" para poder ser comparado como numero
        // entero
		System.out.print("\nPrimer digito: ");
		num = teclado.nextLine();
		num1 = new Integer(num);
		
		System.out.print("\nSegundo digito: ");
		num = teclado.nextLine();
		num2 = new Integer(num);
		
        // Comparamos los digitos proporcionados a traves de un metodo "if" y
		// hacemos que el progrma emita un mensaje dependiendo de los
		// resultados
		
		
		if(num1.equals(num2))
			mensaje = "\nEstamos tratando el mismo numero";

        if (num1 > num2) 
            mensaje = "\nEl mayor es: " + num1;
        

        if (num2 > num1) 
            mensaje = "\nEl mayor es: " + num2;

        System.out.print(mensaje);
		
		
	
	}
}