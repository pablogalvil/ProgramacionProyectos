package unidad2bucles;

import java.util.Scanner;

public class Ejemplo4MaxYMin {

	public static void main(String[] args) {

		// Variables
		int num = 0, cantidad = 0;
		// Inicializaos el máximo al menor valor posible MINVALUE
		int mayor = Integer.MIN_VALUE, segMayor = 0;
		Scanner teclado = new Scanner(System.in);

		// Programa que busca el mayor de un conjunto de números y el segundo mayor

		// Mostramos un mensaje para pedir la cantidad de números
		System.out.print("¿Cuantos números hay en total? ");
		cantidad = teclado.nextInt();

		// Hacemos un bucle for para leer los numeros
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Introduce el numero " + (i + 1) + " : ");
			num = teclado.nextInt();

			/*
			 * Si el numero leido por teclado es mayor que nuestro máximo actual, implica
			 * que es el nuevo máximo
			 */
			if (num > mayor) {
				// Antes de actualizar el máximo, guardo el máximo como el segundo mayor
				segMayor = mayor;
				mayor = num;
			} else if (num > segMayor)
				segMayor = num;

		}

		// Una vez acabado el bucle
		System.out.println("El máximo es : " + mayor);
		System.out.println("El segundo máximo es : " + segMayor);

		teclado.close();
	}

}
