package unidad2bucles;

import java.util.Scanner;

public class Ejemplo7ContarLetras {

	/**
	 * Leemos un String y contamos cuantas vocales tiene un String
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		String palabra = "";
		int numVocal = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una palabra : ");
		palabra = teclado.next().toLowerCase();

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
					|| palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u')
				numVocal++;
		}
		System.out.println("Su palabra tiene " + numVocal + " vocales.");

		teclado.close();
	}

}
