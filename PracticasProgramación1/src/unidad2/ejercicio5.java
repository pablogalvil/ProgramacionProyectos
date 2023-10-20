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
		System.out.print("Introduce el segundo número (0 en caso de raiz cuadrada) : ");
		num2 = teclado.nextDouble();
		System.out.print("Introduce la operación (SUMA, RESTA, MULTIPLICACION, DIVISION, RESTO, RAIZ O POTENCIA) : ");
		operacion = teclado.next();
		operacion = operacion.toUpperCase();

		switch (operacion) {
		case "SUMA":
			resultado = num1 + num2;
			System.out.println(resultado);
			break;
		case "RESTA":
			resultado = num1 - num2;
			System.out.println(resultado);
			break;
		case "MULTIPLICACION":
			resultado = num1 * num2;
			System.out.println(resultado);
			break;
		case "DIVISION":
			resultado = num1 / num2;
			System.out.println(resultado);
			break;
		case "RESTO":
			resultado = num1 % num2;
			System.out.println(resultado);
			break;
		case "RAIZ":
			resultado = Math.sqrt(num1 + num2);
			System.out.println(resultado);
			break;
		case "POTENCIA":
			resultado = Math.pow(num1, num2);
			System.out.println(resultado);
			break;
		default:
			System.out.println("Su operación es indefinida");
			break;
		}

	}

}
