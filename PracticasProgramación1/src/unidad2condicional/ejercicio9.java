package unidad2condicional;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		//Declaramos variables
		String distancia = "";
		char unidad = 'A';
		int rango = 0;
		double numDist = 0;
		double resultado = 0;
		int conversion = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la distancia en metros \n(solo la primera letra de la unidad siendo m, h o k) : ");
		distancia = teclado.next().toLowerCase();
		System.out.print("Introduce la unidad a la que quieres pasar \n(1 para millas, 2 para yardas, 3 para pies y 4 para pulgadas) : ");
		conversion = teclado.nextInt();

		// Creo el rango para poder separar el número de la letra.
		rango = (distancia.length() - 1);
		unidad = distancia.charAt(rango);
		distancia = distancia.substring(0, rango);
		// Paso el número de String a double
		numDist = Double.parseDouble(distancia);
		
		//Condicional para la conversion.
		//millas, yardas, pies y pulgadas respectivamente.
		switch(conversion) {
		case 1:
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
		case 2:
			if (unidad == 'k') {
				resultado = numDist * 1093.61;
				System.out.println("Tu número es " + resultado + " yardas.");
			} else if (unidad == 'h') {
				resultado = numDist * 109.361;
				System.out.println("Tu número es " + resultado + " yardas.");
			} else if (unidad == 'm') {
				resultado = numDist * 1.09361;
				System.out.println("Tu número es " + resultado + " yardas.");
			} else {
				System.out.println("La unidad introducida no es válida.");
			}
		case 3:
			if (unidad == 'k') {
				resultado = numDist * 3280.84;
				System.out.println("Tu número es " + resultado + " pies.");
			} else if (unidad == 'h') {
				resultado = numDist * 328.084;
				System.out.println("Tu número es " + resultado + " pies.");
			} else if (unidad == 'm') {
				resultado = numDist * 3.28084;
				System.out.println("Tu número es " + resultado + " pies.");
			} else {
				System.out.println("La unidad introducida no es válida.");
			}
		case 4:
			if (unidad == 'k') {
				resultado = numDist * 39370.1;
				System.out.println("Tu número es " + resultado + " pulgadas.");
			} else if (unidad == 'h') {
				resultado = numDist * 3937.01;
				System.out.println("Tu número es " + resultado + " pulgadas.");
			} else if (unidad == 'm') {
				resultado = numDist * 39.3701;
				System.out.println("Tu número es " + resultado + " pulgadas.");
			} else {
				System.out.println("La unidad introducida no es válida.");
			}
		default:
			System.out.println("La unidad introducida no es válida");
		}

		//Cerramos teclado
		teclado.close();

	}

}
