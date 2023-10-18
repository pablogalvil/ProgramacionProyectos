package unidad1;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		/**
		 * Esto es un comentario Javadoc
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Conociendo : ax2 + bx + c : ");
		System.out.print("Introduce el valor de a : ");
		a = teclado.nextInt();
		System.out.print("Introduce el valor de b : ");
		b = teclado.nextInt();
		System.out.print("Introduce el valor de c : ");
		c = teclado.nextInt();
		double resultado1 = (-b + (Math.sqrt((b * b) - (4 * (a * c))))) / (2 * a);
		double resultado2 = (-b - (Math.sqrt((b * b) - (4 * (a * c))))) / (2 * a);
		System.out.println("Hay dos resultados");
		System.out.println("El resultado sumando es : " + resultado1);
		System.out.println("El resultado restando es : " + resultado2);

	}

}
