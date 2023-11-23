package unidad2bucles;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// Variables.
		int numVeces = 0;
		int num = 0;
		int numPrimos = 0;
		// Input.
		Scanner teclado = new Scanner(System.in);
		// Pido los números.
		System.out.print("Introduce la cantidad de números que usarás : ");
		numVeces = teclado.nextInt();

		// Bucle para que introduzca el número.
		for (int i = 1; i <= numVeces; i++) {
			System.out.print("Introduce el " + i + "º número : ");
			num = teclado.nextInt();
			// Variable para el número de divisores.
			int numDivisor = 0;
			if (num == 1 || num == 2) {
				numPrimos++;
				System.out.println(num + " es primo");
				continue;
			}
			// Bucle para saber si es primo.
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					numDivisor++;
				}
			}
			if (numDivisor == 0) {
				numPrimos++;
				System.out.println(num + " es primo");
			}

		}
		// Condicional para que muestre en caso de que no haya primos.
		if (numPrimos == 0) {
			System.out.println("No hay primos");
		} else {
			// Muestro cuantos números primos hay
			System.out.println("Hay " + numPrimos + " números primos entre los que has introducido.");
		}

		// Cerramos teclado.
		teclado.close();
	}

}
