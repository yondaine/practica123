/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 5
 *  Ejercicio2_5.java
 *  Programa que pide numeros infinitamente hasta introducir un "0" que acabaria
 *  y mostraria la suma y media de los datos introducido
 */
import java.util.Scanner;

public class Ejercicio2_5 {

	//Declaramos la clase principal
	
	public static void main(String[] args) {

		// Declaramos las variables que utilizaremos
		
		int aux,num=0,media;
        int contador=0;
        
        // Habilitamos la entrada por teclado
        
		Scanner teclado = new Scanner(System.in);
		
		// Utilizando un bucle "do...while" introducimos numeros todo el tiempo
		// hasta que se introduzca un "0"
		
		do {
			System.out.print("Introduce un numero a sumar: ");
			aux= teclado.nextInt();
			num += aux;
			
			if(aux != 0){
				contador++;
			}
			
		} while (aux != 0);
		
		// Calculamos la media
		
		media = num/contador;
		
		// Por ultimo mostramos la suma y la media de todos los numeros introducidos
		
		System.out.println("Suma de todos los digitos introducidos: "+num);
	    System.out.println("Media de todos los digitos introducidos: "+ media);		          
    }
}
