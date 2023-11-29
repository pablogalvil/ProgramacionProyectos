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

		// Variables para invertir las palabras.
		int principioPalabra = 0;
		int finalPalabra = 0;
		int numArray = 0;
		int numArray2 = 0;
		String nuevaPalabra = "";
		// Para contar cuantas palabras hay.
		int totalPalabras = 0;

		for (int j = 0; j < oracion.length(); j++) {
			// Condicional para contar las palabras
			if (oracion.charAt(j) != ' ') {
				numLetras++;
			} else if (numLetras > 5) {
				totalPalabras++;
			} else {
				numLetras = 0;
			}
		}

		// Volvemos a iniciar el numero de letras a 0
		numLetras = 0;

		// Usamos el total de palabras para inicializar el array
		String[] invertirPalabras = new String[totalPalabras];

		// Bucle para la longitud de las palabras.
		for (int i = 0; i < oracion.length(); i++) {
			// Condicional para contar las palabras
			if (oracion.charAt(i) != ' ') {
				numLetras++;
				// Pongo la condicion > 5 para saber si tiene más de 5 letras
			} else if (numLetras > 5) {
				// Aumenta la palabra en 1
				numPalabras++;
				finalPalabra = i - 1;
				nuevaPalabra = oracion.substring(principioPalabra, finalPalabra);
				char[] palabraInvertida = new char[nuevaPalabra.length()];
				// Bucle para guardar la palabra invertida en el array
				for (int j = nuevaPalabra.length() - 1; j >= 0; j++) {
					palabraInvertida[numArray2] = nuevaPalabra.charAt(j);
					numArray2++;
				}
				// Guardamos la palabra invertida en el array
				invertirPalabras[numArray] = palabraInvertida;
				// Reiniciamos el valor para la siguiente palabra
				numLetras = 0;
				// Para saber donde empieza la siguiente palabra.
				principioPalabra = i + 1;
				// Aumentamos el número del array
				numArray++;
			} else {
				// Reiniciamos el valor para la siguiente palabra
				numLetras = 0;
				// Para saber donde empieza la siguiente palabra
				principioPalabra = i + 1;
			}
		}

		// Condicion para la última palabra
		if (numLetras > 5) {
			numPalabras++;
		}

		// Mostramos cuantas palabras con más de 5 letras hay en la oración.
		System.out.println("Hay " + numPalabras + " palabras con más de 5 letras");

		for (int x = 0; x < invertirPalabras.length; x++) {
			System.out.print(invertirPalabras[x] + " ");
		}

		teclado.close();
	}

}
