package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Variable para almacenar el valor del primer número
		float num1;
		
		//Variable para almacenar el valor del segundo número
		float num2;
		
		//Variable para almcenar si los dos números son iguales
		boolean igual;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el primer número
		System.out.println("Introduzca el primer número:");
		
		//Leo el valor del teclado
		num1 = sc.nextFloat();
		
		//Pregunto por el segundo número
		System.out.println("Introduzca el segundo número:");
		
		//Leo el valor del teclado
		num2 = sc.nextFloat();
		
		//Compruebo si los números son iguales
		igual = num1==num2;
		
		//Muestro si los dos números son iguales
		System.out.println("¿Son los números iguales? " + igual);
		
		//Cierro el scanner
		sc.close();
	}

}
