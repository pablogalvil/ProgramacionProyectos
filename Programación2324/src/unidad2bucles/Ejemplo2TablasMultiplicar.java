package unidad2bucles;

import java.util.Scanner;

public class Ejemplo2TablasMultiplicar {

	public static void main(String[] args) {

		// Variables
		int i = 1;
		int numTabla = 1;
		long limMult = 0;
		Scanner teclado = new Scanner(System.in);

		// Tabla de multiplicar del 5
		while (i <= 10) {
			System.out.println("5 x " + i + " = " + (5 * i));
			i++;
		}

		// Tabla de multiplicar de un número que nos introducen por pantalla
		System.out.print("Tabla de multiplicar del : ");
		numTabla = teclado.nextInt();
		System.out.print("¿Hasta que número quieres multiplicar? ");
		limMult = teclado.nextLong();

		// Hay que reiniciar los valores
		i = 1;

		while (i <= limMult) {
			System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
			i++;
		}

		/*
		 * Ejemplo de bucle for equivalente al primer while tiene tres partes, primero
		 * declaración de indices y variables segunda parte condición, es igual que en
		 * el while, mientras que sea cierta se repite tercera parte incremento del
		 * indice o instrucciones para pasar al siguiente elemento
		 */

		for (int j = 1; j <= 10; j++)
			System.out.println(j);

		teclado.close();
	}

}
