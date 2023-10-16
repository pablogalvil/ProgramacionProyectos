package unidad2;

import java.util.Scanner;

public class Ejemplo4Beca 
{
	/**
	 * El programa calcula la cuantía de la beca para un alumno Serán 6000 euros si
	 * el alumno es menor de edad y la renta familiar menos de 20mil euros Serán un
	 * 25% de los 6000 euros si la renta es menor de 30mil euros o es refugiado
	 * Leemos dos datos edadAlumno, rentaFamiliar y esRefugiado
	 * 
	 * @param args
	 */

	public static void main(String[] args) 
	{
		int edadAlumno = 0;
		float rentaFamiliar = 0;
		char esRefugiadoc = 'N';
		boolean esRefugiado = false;
		double resultado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la edad del alumno : ");
		edadAlumno = teclado.nextInt();

		System.out.print("Introduce la renta familiar : ");
		rentaFamiliar = teclado.nextFloat();

		// Leemos esRefugiado como char, con charAt cogemos el primer carácter
		// Del String que se lee con teclado.next
		System.out.print("¿Es usted un refugiado? (S/N) ");
		esRefugiadoc = teclado.next().toUpperCase().charAt(0);

		/*
		 * Utilizamos el operador ternario para asignar true o false a esRefugiado Si la
		 * condición que preguntamos es cierta asigna el valor a continuación Si es
		 * falsa asigna el valor que hay después de los ":"
		 */

		esRefugiado = esRefugiadoc == 'S' ? true : false;

		/*
		 * La anterior sentencia es equivalente a este if
		 * 
		 * if(esRefugiadoc=='S')
		 * 
		 * esRefugiado=true; else esRefugiado=false;
		 */

		if (edadAlumno < 18 && rentaFamiliar < 20000) {
			System.out.println("Le corresponden 6000 euros.");
		} else {
			if (rentaFamiliar < 30000 || esRefugiado == true) {
				resultado = 6000 * 0.25;
				System.out.println("Le corresponden : " + resultado + " euros.");
			} else {
				System.out.println("No le corresponde beca.");
			}
		}
		teclado.close();
	}

}
