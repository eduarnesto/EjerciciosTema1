package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para guardar el número
		float num1;
		
		//Variable para guardar el otro número
		float num2;
		
		//Variable para guardar la diferencia entre el número y el múltiplo del segundo número más cercano
		float resto;

		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
				
		//Pregunto por el número
		System.out.println("Elige un número:");
		
		//Leo el número del scanner
		num1 = sc.nextFloat();
		
		//Pregunto por el número
		System.out.println("Elige otro número:");
		
		//Leo el número del scanner
		num2 = sc.nextFloat();
		
		//Compruebo si el primer número 1 es divisible por número 2
		resto = num1%num2==0 ? 0 : num2 - num1%num2;
		
		//Muestro cuanto hay que sumarle al número 1 para que sea múltiplo del número 2
		System.out.println("A " + num1 + " hay que sumarle " + resto + " para que sea múltiplo de " + num2);
		
		//Cierro scanner
		sc.close();

	}

}
