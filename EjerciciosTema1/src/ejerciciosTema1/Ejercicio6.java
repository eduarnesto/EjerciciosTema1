package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para guardar la cantidad de segundos
		int segundos;
		
		//Variable para guardar la cantidad de minutos
		int minutos;
		
		//Variable para guardar la cantidad de horas
		int horas;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por la cantidad de segundos
		System.out.println("Introduzca la cantidad de segundos:");
		
		//Leo la cantidad de segundos
		segundos=sc.nextInt();
		
		//Calculo la cantidad de horas
		horas = segundos/3600;
		
		//Calculo la cantidad de minutos
		minutos = segundos%3600/60;
		
		//Calculo la cantidad de segundos
		segundos = segundos%3600%60;
		
		//Muestro el número de horas, minutos y segundos
		System.out.println("Hay " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
		
		//Cierro el scanner
		sc.close();

	}

}
