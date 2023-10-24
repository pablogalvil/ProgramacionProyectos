package unidad2;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		String distancia = "";
		char unidad = 'A';
		int rango = 0;
		double numDist = 0;
		double resultado = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la distancia en metros (solo la primera letra de la unidad siendo m, h o k) : ");
		distancia = teclado.next().toLowerCase();

		// Creo el rango para poder separar el número de la letra.
		rango = (distancia.length() - 1);
		unidad = distancia.charAt(rango);
		distancia = distancia.substring(0, rango);
		// Paso el número de String a double
		numDist = Double.parseDouble(distancia);

		if (unidad == 'k') {
			resultado = numDist * 0.621371;
			System.out.println("Tu número es " + resultado + " millas.");
		} else if (unidad == 'h') {
			resultado = numDist * 0.0621371;
			System.out.println("Tu número es " + resultado + " millas.");
		} else if (unidad == 'm') {
			resultado = numDist * 0.000621371;
			System.out.println("Tu número es " + resultado + " millas.");
		} else {
			System.out.println("La unidad introducida no es válida.");
		}

		teclado.close();

	}

}
