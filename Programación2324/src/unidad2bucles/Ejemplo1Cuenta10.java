package unidad2bucles;

import java.util.Scanner;

public class Ejemplo1Cuenta10 {

	public static void main(String[] args) {

		// Variables
		int i = 0;
		int numCuenta = 0;
		Scanner teclado = new Scanner(System.in);

		/*
		 * Muestra los números de 1 a 10 el bucle repite las instrucciones de su bloque
		 * de código muchas veces Mientras la condición sea cierta El bucle va
		 * incrementando el valor de i y mostrandolo Parara cuando el valor de i sea 11
		 * Entra en el bucle mienntras la condición sea cierta por lo cual la condición
		 * es cierta mientras la i sea menor de 11 o menor/igual de 10
		 */
		while (i <= 9) {

			i++;
			System.out.println(i);
		}

		/*
		 * Realizar un bucle que me muestre una cuenta atras de la cantidad de números
		 * que me pongan por teclado
		 */
		System.out.print("Cantidad de numeros de la cuenta atras : ");
		numCuenta = teclado.nextInt();

		// Mientras sea mayor o igual a cero vamos contando
		while (numCuenta >= 0) {
			// POR HACER : PONGA NUMCUENTA "." DELANTE DEL NUMERO
			if (numCuenta == 0)
				System.out.println("Pumbaaa!! Sanseacabo!!");
			else
				System.out.println(numCuenta + "...");

			numCuenta--;
		}

		teclado.close();
	}

}
