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

		// Separamos la string para convertirla en array
		String[] cadena = new String[100];

		// Variable para el total de palabras con más de 5 letras.

		// Bucle para la longitud de las palabras.
		for (int i = 0; i < oracion.length(); i++) {
			int j = 0;
			while (j < oracion.length()) {
				if (oracion.charAt(j) != ' ') {
					cadena[i] += oracion.charAt(j);
				} else {
					break;
				}
			}
		}
		// Mostramos cuantas palabras con más de 5 letras hay en la oración.
		System.out.println(cadena[2]);

		// Segunda parte, mostrar las palabras invertidas

		// Bucle para pasar por cada palabra, igual que el anterior
		// Usare x e y para las variables

		teclado.close();
	}

}
