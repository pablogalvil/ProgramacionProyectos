package unidad2bucles;

import java.util.Scanner;

public class Ejemplo6Password {

	/**
	 * El password debera cumplir lo siguiente. Como mínimo 9 carácteres Sólo puede
	 * empezar por letras Tiene que tener mayúsculas y minúsculas. Tiene que tener
	 * números.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		String password = "";
		boolean esValido = false;
		boolean longMinOk = false;
		boolean empLetOk = false;
		boolean mayMinOk = false;
		boolean tieneNumOk = false;
		int numIntentos = 5;

		Scanner teclado = new Scanner(System.in);

		do {
			// Leemos el password
			System.out.println("Te quedan " + numIntentos + " intentos.");
			System.out.print("Introduce tu contraseña : ");
			password = teclado.next();
			numIntentos--;

			// Comprobamos si cumple la longitud mínima
			if (password.length() >= 9)
				longMinOk = true;

			// Verificamos si empieza por letra
			char primeraLetra = password.charAt(0);
			// Character.isAlphabetic(primeraLetra);
			if (Character.isAlphabetic(primeraLetra))
				empLetOk = true;

			// Recorremos todos los carácteres del password
			for (int i = 0; i < password.length(); i++) {
				// Comprobamos si el carácter actual es un número
				if (Character.isDigit(password.charAt(i))) {
					tieneNumOk = true;
				}

				// Comprobamos si hay mayúsculas
				if (Character.isUpperCase(password.charAt(i)) && Character.isUpperCase(password.charAt(i))) {
					mayMinOk = true;
				}

			}

			// No hace especificar a que es igual un boolean, viene por defecto true o false
			if (longMinOk && empLetOk && tieneNumOk && mayMinOk)
				esValido = true;
			/*
			 * Se sigue repitiendo mientras tengas intentos y la contraseña no sea válida.
			 */

		} while (numIntentos > 0 && !esValido);

		if (!esValido)
			System.out.println("Te has quedado sin intentos, cuenta bloqueada");
		else
			System.out.println(
					"Espere a ser atendido por nuestros operadores, tiempo estimado : 60 años aproximadamente");

		/*
		 * System.out.println("Tiene más de 8 carácteres : " + longMinOk);
		 * System.out.println("Empieza por una letra : " + empLetOk);
		 * System.out.println("Tiene números : " + tieneNumOk);
		 * System.out.println("Tiene mayúsculas y minúsculas : " + mayMinOk);
		 * System.out.print("Por lo cual la contraseña "); System.out.println(esValido ?
		 * "es válida" : "no es válida");
		 *
		 */

		teclado.close();

	}

}
