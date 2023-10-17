package unidad2;

import java.util.Scanner;

public class Ejemplo7Loteria {

	/**
	 * Realizar un programa que genere aleatoriamente un número de loteria de forma
	 * aleatoria entre 1 y 15.
	 * 
	 * Dos usuarios introduciran sus números de loteria por teclado.
	 * 
	 * El programa debera decir a los usuarios si les ha tocado el número de
	 * loteria.
	 * 
	 * Tambien dirá que usuario ha estado más cerca de acerta o si están igual.
	 * 
	 * @param args
	 */

	public static final int NUMEROS_COINCIDEN = 0;
	public static final int NUMEROS_NO_COINCIDEN = 1;
	public static final int NUMEROS_COINCIDEN2 = 2;
	public static final int NUMEROS_NO_COINCIDEN2 = 3;

	public static final int RESULTADO_GANADOR = 0;
	public static final int RESULTADO_NO_GANADOR = 1;
	public static final int RESULTADO_GANADOR2 = 2;
	public static final int RESULTADO_NO_GANADOR2 = 3;

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int loteria = 0;
		int resultado = RESULTADO_NO_GANADOR;
		String nom1 = "";
		String nom2 = "";
		Scanner teclado = new Scanner(System.in);

		System.out.print("Bienvenido usuario 1, por favor introduzca su nombre : ");
		nom1 = teclado.next();
		System.out.print(nom1 + " por favor introduzca su número : ");
		num1 = teclado.nextInt();

		System.out.print("Bienvenido usuario 2, por favor introduzca su nombre : ");
		nom2 = teclado.next();
		System.out.print(nom2 + " por favor introduzca su número : ");
		num2 = teclado.nextInt();

		loteria = (int) (Math.random() * 2);

		switch (num1) {
		case NUMEROS_NO_COINCIDEN:
			if (num1 != loteria) {
				resultado = RESULTADO_NO_GANADOR;
			}
			break;
		case NUMEROS_COINCIDEN:
			if (num1 == loteria) {
				resultado = RESULTADO_GANADOR;
			}
			break;
		}
		switch (num2) {
		case NUMEROS_NO_COINCIDEN2:
			if (num2 != loteria) {
				resultado = RESULTADO_NO_GANADOR2;
			}
			break;
		case NUMEROS_COINCIDEN2:
			if (num2 == loteria) {
				resultado = RESULTADO_GANADOR2;
			}
			break;
		}

		if (resultado == RESULTADO_NO_GANADOR && resultado == RESULTADO_NO_GANADOR2) {
			System.out.println("Lo sentimos, " + nom1 + " y " + nom2 + " ninguno de ustedes ha consiguido el premio.");
		} else {
			if (resultado == RESULTADO_GANADOR && resultado == RESULTADO_NO_GANADOR2) {
				System.out.println("¡Felicidades, " + nom1 + " usted ha ganado el premio!");
				System.out.println("Lo sentimos, " + nom2 + " usted no ha tenido la misma suerte :(");
			} else {
				if (resultado == RESULTADO_GANADOR2 && resultado == RESULTADO_NO_GANADOR) {
					System.out.println("¡Felicidades, " + nom2 + " usted ha ganado el premio!");
					System.out.println("Lo sentimos, " + nom1 + " usted no ha tenido la misma suerte :(");
				} else {
					if (resultado == RESULTADO_GANADOR && resultado == RESULTADO_GANADOR2) {
						System.out.println("¡Felicidades, " + nom1 + " y " + nom2 + " ambos han ganado el premio!");
					}
				}
			}

		}

		teclado.close();
	}
}
