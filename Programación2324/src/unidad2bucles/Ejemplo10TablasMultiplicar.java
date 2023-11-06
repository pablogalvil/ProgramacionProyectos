package unidad2bucles;

public class Ejemplo10TablasMultiplicar {

	/**
	 * El programa muestra por pantalla todas las tablas de multiplicar del 1 al 10.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Primer bucle for
		for (int num1 = 1; num1 <= 10; num1++) {

			System.out.println("\n----------------------------------");
			System.out.println("Tabla del " + num1);
			System.out.println("----------------------------------\n");

			// Segundo bucle for
			for (int num2 = 1; num2 <= 10; num2++) {
				System.out.println(num1 + " x " + num2 + " = " + (num2 * num1));
			}

		}

		// Otra opción con while
		// int numTablas = 1;
		// int i = 1;
		// while (numTablas <= 10) {
		// System.out.println(numTablas + " x " + i + " = " + (numTablas * i));
		// i++;

		// Si acabamos la tabla actual porque i llega a 10
		// Pasamos a la siguiente tabla
		// if (i == 11) {
		// numTablas++;
		// i = 1;
		// }
		// }

	}

}
