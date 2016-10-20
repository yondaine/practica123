import java.util.Scanner;

public class Ejercicio2_52 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros =new int[100];

		for(int i=1; i<numeros.length; i++){
			numeros[i]=i*i+100;
			System.out.println("Introduce un numero: ");
			i = teclado.nextInt();
			
		}
	}

}
