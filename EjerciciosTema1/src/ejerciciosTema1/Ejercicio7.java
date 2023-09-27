package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Variable para guardar el valor de los metros
		float m;
		
		//Variable para guardar el valor de los centímetros
		float cm;
				
		//Variable para guardar el valor de los milímetros
		float mm;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por la cantidad de metros
		System.out.println("Introduzca la cantidad de metros:");
		
		//Leo el valor del teclado
		m = sc.nextFloat();
		
		//Pregunto por la cantidad de metros
		System.out.println("Introduzca la cantidad de cetímetros:");
		
		//Leo el valor del teclado
		cm = sc.nextFloat();
		
		//Pregunto por la cantidad de metros
		System.out.println("Introduzca la cantidad de milimetros:");
		
		//Leo el valor del teclado
		mm = sc.nextFloat();
		
		//Calculo la cantidad de centímetros
		cm = m*100+mm/10+cm;
		
		//Muestro la cantidad de centímetros
		System.out.println("Hay " + cm + "cm");
		
		//Cierro el scanner
		sc.close();
	}

}
