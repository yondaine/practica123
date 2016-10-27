import java.util.Scanner;

public class Ejercicio2_8 {

	public static void main(String[] args) {

		int lado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Longitud del lado del cuadrado: ");
		lado = teclado.nextInt();

		for (int i = 0; i < lado; i++) {
			System.out.print("* ");
			
		}
		System.out.print("\n");
		for (int k = 2; k < lado; k++) {
			System.out.print("* ");
			for (int i = 0; i < lado-2; i++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for (int i = 0; i < lado; i++) {
			System.out.print("* ");
			
		}

	}
}
