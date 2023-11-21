package unidad2bucles;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// Variables
		String palabra = "";
		Scanner teclado = new Scanner(System.in);
		// Boolean para determinar si es isograma o no
		boolean isograma = true;

		System.out.print("Introduce tu palabra : ");
		// Lo pongo en minúscula para que no de error en caso de que una sea mayuscula y
		// otra minuscula
		palabra = teclado.next().toLowerCase();

		// Primer bucle
		for (int i = 0; i < palabra.length(); i++) {
			// Segundo bucle para comparar cada letra
			for (int j = 0; j < palabra.length(); j++) {
				// If para que no cojan la misma letra
				if (i != j) {
					// If para saber si es isograma o no
					if (palabra.charAt(i) == palabra.charAt(j)) {
						isograma = false;
					}
				}
			}
		}
		// If para mostrar si es isograma o no
		if (isograma) {
			System.out.println("Tu palabra es un isograma");
		} else {
			System.out.println("Tu palabra no es un isograma");
		}

		teclado.close();
	}

}
