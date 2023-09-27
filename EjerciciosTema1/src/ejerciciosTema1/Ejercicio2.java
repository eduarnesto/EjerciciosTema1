package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para guardar el número
		float num;
		
		//Variable para guardar la diferencia entre el número y el múltiplo de 7 más cercano
		float resto;

		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
				
		//Pregunto por el número
		System.out.println("Elige un número:");
		
		//Leo el número del scanner
		num = sc.nextFloat();
		
		//Compruebo si es divisible por 7
		resto = num%7;
		
		//Muestro cuanto hay que sumarle al número para que sea múltiplo de 7
		System.out.println("A " + num + " hay que sumarle " + resto + " para que sea múltiplo de 7");
		
		//Cierro scanner
		sc.close();
	}

}
