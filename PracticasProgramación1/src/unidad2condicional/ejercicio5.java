package unidad2condicional;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		//Declaramos variables
		double num1 = 0, num2 = 0;
		double resultado = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número : ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce el segundo número : ");
		num2 = teclado.nextDouble();
		System.out.print("Introduce el resultado : ");
		resultado = teclado.nextDouble();

		//Condicional para cada tipo de operación.
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
		//Para la raíz cuadrada y la potencia solo cojo el primer número.
		} else if (resultado == (Math.sqrt(num1))) {
			System.out.println("Su operación es raíz cuadrada");
		} else if (resultado == (Math.pow(num1, 2))) {
			System.out.println("Su operación es potencia de dos");
		} else {
			System.out.println("Su operación es indefinida");
		}
		
		//Cierro teclado.
		teclado.close();
	}

}
