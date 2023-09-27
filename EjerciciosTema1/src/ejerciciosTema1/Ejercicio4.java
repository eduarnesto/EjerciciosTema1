package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	//Variable para la base
	float base;
	
	//Variable para la altura
	float altura;
	
	//Variable para el área
	float area;
	
	//Scanner para leer del teclado
	Scanner sc = new Scanner(System.in);
	
	//Pregunto la base
	System.out.println("Introduzca la base del triángulo:");
	
	//Leo el valor del teclado
	base = sc.nextFloat();
	
	//Pregunto la altura
	System.out.println("Introduzca la altura del triángulo:");
	
	//Leo el valor del teclado
	altura = sc.nextFloat();
	
	//Calculo el área
	area = base*altura/2;
	
	//Muestro el area
	System.out.println("El área del triángulo es: " + area);
	
	//Cierro el scanner
	sc.close();
	}
	
}
