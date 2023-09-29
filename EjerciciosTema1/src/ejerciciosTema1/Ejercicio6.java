package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para guardar la cantidad de segundos iniciales
		int segundosiniciales;
		
		//Variable para guardar la cantidad de segundos finales
		int segundosfinales;
		
		//Variable para guardar la cantidad de minutos
		int minutos;
		
		//Variable para guardar la cantidad de horas
		int horas;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por la cantidad de segundosiniciales
		System.out.println("Introduzca la cantidad de segundosiniciales:");
		
		//Leo la cantidad de segundosiniciales
		segundosiniciales=sc.nextInt();
		
		//Calculo la cantidad de horas
		horas = segundosiniciales/3600;
		
		//Calculo la cantidad de minutos
		minutos = segundosiniciales%3600/60;
		
		//Calculo la cantidad de segundosiniciales
		segundosfinales = segundosiniciales%3600%60;
		
		//Muestro el número de horas, minutos y segundosiniciales
		System.out.println("Hay " + horas + " horas, " + minutos + " minutos, " + segundosfinales + " segundos.");
		
		//Cierro el scanner
		sc.close();

	}

}
