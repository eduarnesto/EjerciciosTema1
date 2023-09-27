package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para guardar el valor de a
		float a;
		
		//Variable para guardar el valor de b
		float b;
		
		//Variable para guardar el valor de c
		float c;
		
		//Variable para guardar el valor de x
		float x;
		
		//Variable para guardar el valor de y
		float y;
				
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el valor de a
		System.out.println("Introduzca el valor de a");
		
		//Leo del teclado el valor de a
		a = sc.nextFloat();
		 
		//Pregunto por el valor de b
		System.out.println("Introduzca el valor de b");
			
		//Leo del teclado el valor de b
		b = sc.nextFloat();
			 
		//Pregunto por el valor de c
		System.out.println("Introduzca el valor de c");
				
		//Leo del teclado el valor de c
		c = sc.nextFloat();
				 
		//Pregunto por el valor de x
		System.out.println("Introduzca el valor de x");
					
		//Leo del teclado el valor de x
		x = sc.nextFloat();
		
		//Calculo el valor de y
		y=(float) (a*Math.pow(x, 2)+b*x+c);
		
		//Muestro el valor de y
		System.out.println("Y vale: " + y);
		
		//Cierro el scanner
		sc.close();
	}

}
