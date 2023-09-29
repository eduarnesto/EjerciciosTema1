package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Constante para guardar el precio de las entradas infantiles
		final float ENTRADAS_NIÑOS = 15.50f;
		
		//Constante para guardar el precio de las entradas de adultos
		final float ENTRADAS_ADULTOS = 20;
		
		//Constate para guardar el descuento
		final float DESCUENTO = 95;
		
		//Variable para guardar el valor de entradas infantiles
		int entradasNiños;
		
		//Variable para guardar el valor de entradas adultos
		int entradasAdultos;
		
		//Variable para guardar el precio
		float precio;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el número de entradas infantiles
		System.out.println("¿Cuántas entradas infantiles se han vendido?");
		
		//Leo el valor del teclado
		entradasNiños=sc.nextInt();
		
		//Pregunto por el número de entradas de adultos
		System.out.println("¿Cuántas entradas de adultos se han vendido?");
		
		//Leo el valor del teclado
		entradasAdultos=sc.nextInt();
		
		//Calculo el valor de las entradas
		precio = entradasNiños*ENTRADAS_NIÑOS+entradasAdultos*ENTRADAS_ADULTOS;
		
		//Verifico si tienen descuento
		precio = precio>=100 ? DESCUENTO*precio/100 : precio;
		
		//Muestro el precio de las entradas
		System.out.println("El precio total de las entradas es: " + precio + "€");
		
		//Cierro scanner
		sc.close();

	}

}
