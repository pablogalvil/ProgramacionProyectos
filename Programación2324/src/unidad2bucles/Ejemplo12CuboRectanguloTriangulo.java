package unidad2bucles;

import java.util.Scanner;

public class Ejemplo12CuboRectanguloTriangulo {

	public final static int CUADRADO = 1;
	public final static int RECTANGULO = 2;
	public final static int TRIANGULO = 3;

	/**
	 * El programa preguntara que figura quiere que se dibuje por pantalla
	 * 
	 * si un cuadrado, un rectangulo o un triangulo y para cada caso pedirá los
	 * datos necesarios y dibujará por pantalla la figura.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Variables
		int numFig = -1;
		int lado = 0, altura = 0;
		Scanner teclado = new Scanner(System.in);
		// Posible condicion !(numFig==1 || numFig==2 || numFig==3)
		// Mientras no introduzca un número entre 1 y 3, se le sigue pidiendo el número
		while (numFig != 1 && numFig != 2 && numFig != 3) {
			// Leemos la figura a dibujar
			System.out.print("¿Qué figura quieres que te dibuje?\n(1-Cuadrado, 2-Rectángulo, 3-Triángulo) ");
			numFig = teclado.nextInt();
		}
		switch (numFig) {
		case CUADRADO:
			// Dibujamos un cuadrado
			System.out.print("Introduce el lado del cuadrado : ");
			lado = teclado.nextInt();
			for (int j = 0; j < lado; j++) {
				// Dibujamos una linea
				for (int i = 0; i < lado; i++)
					System.out.print("# ");

				// Bajamos a la siguiente linea
				System.out.println();

			}

			break;
		case RECTANGULO:
			// Dibujamos un rectangulo
			System.out.print("Introduce la altura del rectángulo : ");
			altura = teclado.nextInt();
			System.out.print("Introduce la base del rectángulo : ");
			lado = teclado.nextInt();
			for (int j = 0; j < altura; j++) {
				// Dibujamos una linea
				for (int i = 0; i < lado; i++)
					System.out.print("# ");

				// Bajamos a la siguiente linea
				System.out.println();

			}
		case TRIANGULO:
			// Dibujamos un triangulo
			System.out.print("Introduce la altura del triángulo : ");
			altura = teclado.nextInt();
			for (int j = 1; j <= altura; j++) {

				// Dibujamos los espacios de la linea
				for (int z = 1; z <= (altura - j); z++) {
					System.out.print(" ");
				}

				// Dibujamos una linea
				for (int i = 1; i <= (2 * j) - 1; i++) {
					System.out.print("#");
				}

				// Bajamos a la siguiente linea
				System.out.println();

			}
		}

		teclado.close();
	}

}
