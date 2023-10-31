package unidad2bucles;

import java.util.Scanner;

public class Ejemplo4MaxYMin {

	public static void main(String[] args) {

		// Variables
		int num = 0, cantidad = 0;
		int mayor = 0, segMayor = 0;
		Scanner teclado = new Scanner(System.in);

		// Programa que busca el mayor de un conjunto de números y el segundo mayor

		// Mostramos un mensaje para pedir la cantidad de números
		System.out.print("¿Cuantos números hay en total? ");
		cantidad = teclado.nextInt();

		// Hacemos un bucle for para leer los numeros
		for (int i = 0; i < cantidad; i++) {
			System.out.print("Introduce el numero " + (i + 1) + " : ");
			num = teclado.nextInt();
		}

		teclado.close();
	}

}
