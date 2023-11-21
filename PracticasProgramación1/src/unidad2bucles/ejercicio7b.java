package unidad2bucles;

import java.util.Scanner;

public class ejercicio7b {

	public static void main(String[] args) {
		// Variables.
		String palabraIso = "";
		Scanner teclado = new Scanner(System.in);
		// Boolean para determinar si es isograma o no.
		boolean isograma = true;

		System.out.print("Introduce tu palabra : ");
		// Lo pongo en minúscula para que no de error en caso de que una sea mayuscula y
		// otra minuscula.
		palabraIso = teclado.next().toLowerCase();

		// Bucle para saber si es isograma o no.
		for (int i = 0; i < palabraIso.length(); i++) {
			// La condición es buscada en internet, no se si se hace así pero no sabía
			// hacerlo de otra forma.
			if (palabraIso.substring(i + 1).contains(String.valueOf(palabraIso.charAt(i)))) {
				isograma = false;
			}
		}
		// If para mostrar si es isograma o no.
		if (isograma) {
			System.out.println("Tu palabra es un isograma");
		} else {
			System.out.println("Tu palabra no es un isograma");
		}

		// Cerramos teclado.
		teclado.close();

	}

}
