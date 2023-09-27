package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para guardar el número
		float num1;
		
		//Variable para guardar el número
		int num2;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número
		System.out.println("Elige un número:");
		
		//Leo el número del scanner
		num1 = sc.nextFloat();
		
		//Trunco el número
		num2 = (int) num1;
		
		//Compruebo si el número debe ser redondeado por encima o por debajo
		num2 = num1-num2>=0.5 ? num2+1 : num2;
		
		//Doy el número redondeado
		System.out.println("El número redondeado es: " + num2);
		
		//Cierro el scanner
		sc.close();
	}

}
