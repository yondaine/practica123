/** 1.2.3. (P) Ejercicios: Programación básica en Java
 *  Alejandro Navarro Romero 1ºDAW
 *  Ejercicio 6
 *  Ejercicio2_6.java
 *  Programa que imprime en pantalla todos los multiplos de "3" del 1 al 3000
 */
public class Ejercicio2_6 {
    
	// Declaramos la clase principal
	
	public static void main(String[] args) {
        
		// Creamos una variable que haga de contador y otra que ocupe el valor
		// Y realizamos el primer calculo
		
		int contador=1;
		int multiplo=0;
		multiplo = 3*contador;
		
		// Creamos un bucle que automatice todos los calculos hasta que el resultado
		// sea mayor de 3000 
		
		while (multiplo<=3000) {
			
			System.out.println(multiplo);
			contador++;
			multiplo = 3*contador;
		}
		
}
}
