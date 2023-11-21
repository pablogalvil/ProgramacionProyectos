package unidad2bucles;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// Variables.
		int numVeces = 0;
		int num = 0;
		int numPrimos = 0;
		// Variable para el número de divisores.
		int numDivisores = 0;
		// Input.
		Scanner teclado = new Scanner(System.in);
		// Pido los números.
		System.out.print("Introduce la cantidad de números que usarás : ");
		numVeces = teclado.nextInt();

		// Bucle para que introduzca el número.
		for (int i = 1; i <= numVeces; i++) {
			System.out.print("Introduce el " + i + "º número : ");
			num = teclado.nextInt();
			// Bucle para saber si es primo.
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					numDivisores++;
					break;
				} else {
					System.out.println(num + " es primo");
				}
			}

		}
		// Condicional para que muestre en caso de que no haya primos.
		if (numDivisores == numVeces) {
			System.out.println("No hay primos");
		}

		// Condicional para mostrar cuantos primos hay

		// Cerramos teclado.
		teclado.close();
	}

}
