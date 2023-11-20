package unidad2bucles;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Variables
		String oracion = "";
		Scanner teclado = new Scanner(System.in);

		// Pedimos la oración
		System.out.print("Introduce tu oración : ");
		oracion = teclado.nextLine();

		// Variable para el total de palabras con más de 5 letras.
		int numPalabras = 0;
		int numLetras = 0;

		// Bucle para la longitud de las palabras.
		for (int i = 0; i < oracion.length(); i++) {
			// Condicional para contar las palabras
			if (oracion.charAt(i) != ' ') {
				numLetras++;
				// Pongo la condicion >= porque sino no me coge las palabras con 6 letras
			} else if (numLetras >= 5) {
				// Aumenta la palabra en 1
				numPalabras++;
				// Reiniciamos el valor para la siguiente palabra
				numLetras = 0;
			} else {
				// Reiniciamos el valor para la siguiente palabra
				numLetras = 0;
			}
		}

		// Mostramos cuantas palabras con más de 5 letras hay en la oración.
		System.out.println("Hay " + numPalabras + " palabras con más de 5 letras");

		teclado.close();
	}

}
