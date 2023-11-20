package unidad2bucles;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Variables
		int num = 0;
		// Numero para los impares
		int numImpar = 0;
		// Scanner
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el número : ");
		num = teclado.nextInt();

		System.out.print("Los números impares divisores de " + num + " son : ");

		// Bucle para los divisores, empieza en 1 porque ningun número es divisible
		// entre 0
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				numImpar = i;
				if (num % numImpar == 0) {
					System.out.print(numImpar + " ");
				}
			}
		}

		teclado.close();
	}

}
