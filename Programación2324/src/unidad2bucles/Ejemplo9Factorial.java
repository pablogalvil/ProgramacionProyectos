package unidad2bucles;

import java.util.Scanner;

public class Ejemplo9Factorial {

	/**
	 * Este programa lee un numero de teclado y calcula su factorial y su sumatorio
	 * desde 1 hasta el propio número.
	 * 
	 * Ej-
	 * 
	 * num=6
	 * 
	 * sumatorio? 1+2+3+4+5+6 =21
	 * 
	 * Factorial? 1*2*3*4*5*6 =720
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Variables
		int num = 0;
		long sumatorio = 0;
		// El factorial debe ir inicializado a 1, para asi no multiplicar por 0.
		double factorial = 1;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número : ");
		num = teclado.nextInt();

		for (int i = 1; i <= num; i++) {
			sumatorio = sumatorio + i;
			factorial = factorial * i;

		}
		System.out.println("El sumatorio es : " + sumatorio);
		System.out.println("El factorial es : " + factorial);

		// Cerramos teclado.
		teclado.close();

	}

}
