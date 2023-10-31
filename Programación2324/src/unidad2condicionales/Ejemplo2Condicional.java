package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo2Condicional {

	/**
	 * El programa lee de teclado una nota y nos dice si es insuficiente,
	 * suficiente, bien, notable, sobresaliente o matriculo
	 * 
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double nota = 00.0;

		// Mostramos un mensaje para que introduzca la nota
		System.out.print("Introduce la nota: ");
		nota = teclado.nextDouble();

		// Comprobamos si el valor esta dentro del rango
		// if nunca lleva ";"
		if (nota >= 0 && nota <= 10) {
			System.out.println("El valor esta entre 0 y 10");

			if (nota < 5)
				// No hace falta abrir llaves {} porque solo lleva un dato
				System.out.println("Insuficiente");
			else {
				// Entramos en el else cuando la condicion del if asociado es falsa
				// En este caso implicaria que la nota es >=5
				if (nota < 6)
					System.out.println("Suficiente");
				else
				// Entra si es >= a 6
				if (nota < 7)
					System.out.println("Bien");
				else
				// Entra si es >= a 7
				if (nota < 9)
					System.out.println("Notable");
				else
					// Entra si es >= a 9
					System.out.println("Sobresaliente");
			}
		}

		// Siempre hay que cerrar el teclado
		teclado.close();
	}

}
