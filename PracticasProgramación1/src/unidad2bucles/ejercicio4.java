package unidad2bucles;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Variables
		String oracion = "";
		Scanner teclado = new Scanner(System.in);
		// Para que no se resetee el número de letras en el bucle que guarda la cadena
		int numLetra = 0;

		// Pedimos la oración
		System.out.print("Introduce tu oración : ");
		oracion = teclado.nextLine();

		// Separamos la string para convertirla en array
		char[] array = {};

		// Variable para el total de palabras con más de 5 letras.
		int numPalabras = 0;

		// Bucle para la longitud de las palabras.
		for (int i = 0; i < oracion.length(); i++) {
			System.out.println(i);
			for (int j = 0; j < oracion.length(); j++) {
				j += numLetra;
				if (oracion.charAt(j) != ' ') {
					array[i] += oracion.charAt(j);
				} else {
					numLetra++;
					break;
				}
			}
		}
		String[] cadena = asda;

		for (int z = 0; z < cadena.length; z++) {
			// Segundo bucle para invertir las palabras
			if (cadena[z].length() > 5) {
				numPalabras++;
			} else {
				continue;
			}
		}

		// Mostramos cuantas palabras con más de 5 letras hay en la oración.
		System.out.println("Hay " + numPalabras + " palabras con más de 5 letras");

		// Segunda parte, mostrar las palabras invertidas

		// Bucle para pasar por cada palabra, igual que el anterior
		// Usare x e y para las variables
		for (int x = 0; x < cadena.length; x++) {
			// Segundo bucle para invertir las palabras
			if (cadena[x].length() > 5) {
				for (int y = cadena[x].length() - 1; y >= 0; y--) {
					// Variable para cambiar las letras
					char invertirLetra = cadena[x].charAt(y);
					System.out.print(invertirLetra);
				}
			} else {
				continue;
			}
			System.out.print(" ");
		}

		teclado.close();
	}

}
