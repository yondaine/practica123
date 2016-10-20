import java.util.Scanner;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int mayor,mediano,menor;
		int aux;
		
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
		System.out.println("El orden de mayor a menor es: "+mayor+","+mediano+" y "+menor);
		
		
	}
	
}
