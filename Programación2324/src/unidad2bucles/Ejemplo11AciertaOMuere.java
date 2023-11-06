package unidad2bucles;

import java.util.Scanner;

public class Ejemplo11AciertaOMuere {

	/**
	 * Se genera un número aleatorio entre 1 y 10.
	 * 
	 * El usuario tiene 3 intentos para acertarlo.
	 * 
	 * La máquina te da pistas sobre si es menor o mayor en cada fallo.
	 * 
	 * Tiene un 25% de posibilidades de mentir.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int numIntentos = 3;
		int num = 0;
		int numBuscar = (int) (Math.random() * 10) + 1;
		Scanner teclado = new Scanner(System.in);

		while (numIntentos > 0 && num != numBuscar) {
			System.out.println("Te quedan " + numIntentos + " intentos");
			System.out.print("Introduce tu número [Tik Tak, solo " + numIntentos + " intentos para que explote :)] : ");
			num = teclado.nextInt();
			numIntentos--;

			if (num != numBuscar) {

				// Tengo un 25% de posibilidades de mentir
				boolean miento = (Math.random() < 0.25);

				if (num < numBuscar && !miento)
					System.out.println("El número buscado es mayor que el introducido (" + miento + ")");
				else if (num > numBuscar && !miento)
					System.out.println("El numero buscado es menor que el introducido (" + miento + ")");
			}

		}
		if (num == numBuscar)
			System.out.println("Te has salvado esta vez, pero no cantes victoria\nYo tendría cuidado por la calle :D");
		else
			System.out.println("El número a buscar era : " + numBuscar + ", la bomba explotara en 3 segundos :)");

		teclado.close();
	}

}
