package unidad2;

import java.util.Scanner;

public class Ejemplo3Calculadora {
	/**
	 * El programa lee dos números y una operación y nos saca el resultado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		int num1 = 0, num2 = 0;
		float resultado = 0;
		String operacion = "";
		Scanner teclado = new Scanner(System.in);

		// Leemos los datos
		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextInt();

		System.out.print("Introduce el segundo número: ");
		num2 = teclado.nextInt();

		System.out.print("Introduce la operación (SUMA, RESTA, MULTIPLICACION, DIVISION): ");
		// teclado.next() es para leer la primera palabra y teclado.nextLine() es para
		// leer todo hasta darle a enter
		operacion = teclado.next();
		// Pasamos a mayúsculas el texto con la función toUpperCase (Esto se hace en
		// caso de que el usuario use minúsculas
		operacion = operacion.toUpperCase();

		// Si la operación no es ninguna de las mostradas, mostramos mensaje de error
		// Al ser un String, no podemos usar "!=" porque solo sirve con números y lo
		// sustituimos por "!variable.equals"
		if (!operacion.equals("SUMA") && !operacion.equals("RESTA") && !operacion.equals("MULTIPLICACION")
				&& !operacion.equals("DIVISION")) {
			System.out.println("La operación que has introducido no es valida");
		} else {
			// Si la operación que han introducido es correcta, hacemos las operaciones

			// Si es una suma, sumamos los números
			if (operacion.equals("SUMA")) {
				resultado = num1 + num2;

			}
			if (operacion.equals("RESTA")) {
				resultado = num1 - num2;

			}
			if (operacion.equals("MULTIPLICACION")) {
				resultado = num1 * num2;

			}
			if (operacion.equals("DIVISION")) {
				// Si el divisor (num2) es 0, es infinito, no hacemos la operación
				if (num2 == 0) {
					// Si ademas el num1 es 0 el resultado es indeterminado
					if (num1 == 0)
						System.out.println("El resultado es indeterminado");
					else
						System.out.println("El resultado es infinito");
				} else {
					// Si el numero que divide no es 0, hacemos la division normalmente
					resultado = num1 / num2;
					System.out.println("La operación da como resultado : " + resultado);
				}
			} else
				// Mostramos el resultado por pantalla
				System.out.println("La operación da como resultado : " + resultado);
		}

		// Cerramos teclado
		teclado.close();
	}

}
