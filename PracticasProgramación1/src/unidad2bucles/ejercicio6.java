package unidad2bucles;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Variables
		// número al que queremos llegar
		int n = 0;
		// número de posiciones que se quieren saltar
		int d = 0;
		// variable usada para el bucle, inicializada en 0 porque le dare valor mas
		// tarde
		int i = 0;
		// resultado de la multiplicación
		// Uso double porque coge más digitos que el long
		double resultado = 1;
		Scanner teclado = new Scanner(System.in);

		// Cogemos datos por teclado
		System.out.print("Introduce el número al que quieres llegar : ");
		n = teclado.nextInt();
		System.out.print("Introduce el número de posiciones que quieres saltar entre número y número : ");
		d = teclado.nextInt();

		// Lo sumo fuera para que empiece por el número que quiere
		i = d;

		// Bucle para hacer el factorial
		while (i < n) {
			resultado = i * resultado;
			i += d;
		}
		System.out.println(resultado);

		// Cerramos teclado
		teclado.close();
	}

}
