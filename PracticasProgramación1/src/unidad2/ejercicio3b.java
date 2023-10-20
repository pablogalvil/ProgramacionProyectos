package unidad2;

import java.util.Scanner;

public class ejercicio3b {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		// Estas dos variables las he usado para que el programa me diga si son pares o
		// impares
		int resultado1 = 0;
		int resultado2 = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número : ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo número : ");
		num2 = teclado.nextInt();
		System.out.print("Introduce el tercer número : ");
		num3 = teclado.nextInt();
		System.out.print("Introduce el cuarto número : ");
		num4 = teclado.nextInt();

		if (num1 < num3 && num1 < num4 && num2 < num3 && num2 < num4) {
			resultado1 = num1;
			resultado2 = num2;
			System.out.println(num1 + " y " + num2 + " son los menores");
		} else if (num1 < num2 && num1 < num4 && num3 < num2 && num3 < num4) {
			resultado1 = num1;
			resultado2 = num3;
			System.out.println(num1 + " y " + num3 + " son los menores");
		} else if (num1 < num2 && num1 < num3 && num4 < num2 && num4 < num3) {
			resultado1 = num1;
			resultado2 = num4;
			System.out.println(num1 + " y " + num4 + " son los menores");
		} else if (num2 < num1 && num2 < num4 && num3 < num1 && num3 < num4) {
			resultado1 = num2;
			resultado2 = num3;
			System.out.println(num2 + " y " + num3 + " son los menores");
		} else if (num2 < num1 && num2 < num3 && num4 < num1 && num4 < num3) {
			resultado1 = num2;
			resultado2 = num4;
			System.out.println(num2 + " y " + num4 + " son los menores");
		} else if (num3 < num1 && num3 < num2 && num4 < num1 && num4 < num2) {
			resultado1 = num3;
			resultado2 = num4;
			System.out.println(num3 + " y " + num4 + " son los menores");
		}

		System.out.println("Si el resto es 1, el número es impar, si es 0, el número es par");
		System.out.print("El resto es : " + resultado1 % 2 + " y " + resultado2 % 2);

		teclado.close();

	}

}
