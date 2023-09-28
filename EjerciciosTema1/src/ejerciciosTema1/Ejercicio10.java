package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Variable para guardar el valor de los metros
		float m;
		
		//Variable para guardar el valor de los centímetros
		float cm;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por la distancia en m
		System.out.println("Introduzca la longitud en metros");
		
		//Leo el valor del teclado
		m = sc.nextFloat();
		
		//Calculo la distancia en cm
		cm = m*100;
		
		//Trunco los cm
		cm = (int) cm;
		
		//Muestro el resultado
		System.out.println("La distancia del lanzamiento ha sido: " + cm + "cm");
		
		//Cierro el scanner
		sc.close();
	}

}
