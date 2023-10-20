package unidad2;

import java.util.Scanner;

public class ejercicio7b {

	public static void main(String[] args) {
		int diasMes = 0;
		boolean esBisiesto = false;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de días del mes : ");
		diasMes = teclado.nextInt();
		System.out.print("¿El año es bisiesto? ");
		esBisiesto = teclado.nextBoolean();

		teclado.close();

	}

}
