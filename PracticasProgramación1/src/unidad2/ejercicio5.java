package unidad2;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		double num1, num2 = 0;
		String operacion = "";
		double resultado = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número : ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce el segundo número : ");
		num2 = teclado.nextDouble();
		System.out.print("Introduce el resultado : ");
		resultado = teclado.nextDouble();

		if (resultado == (num1 + num2)) {
			System.out.println("Su operación es una suma");
		} else if (resultado == (num1 - num2)) {
			System.out.println("Su operación es una resta");
		} else if (resultado == (num1 * num2)) {
			System.out.println("Su operación es una multiplicación");
		} else if (resultado == (num1 / num2)) {
			System.out.println("Su operación es una división");
		} else if (resultado == (num1 % num2)) {
			System.out.println("Su operación es resto");
		} else if (resultado == (Math.sqrt(num1))) {
			System.out.println("Su operación es raíz cuadrada");
		} else if (resultado == (Math.pow(num1, 2))) {
			System.out.println("Su operación es potencia de dos");
		} else {
			System.out.println("Su operación es indefinida");
		}
		teclado.close();
	}

}
