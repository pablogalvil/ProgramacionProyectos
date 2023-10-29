package unidad2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//Declaramos variables.
		int numMes = 0;
		boolean esBisiesto = false;
		
		//Introducimos el número del mes
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número del mes : ");
		numMes = teclado.nextInt();
		//Para febrero
		System.out.print("¿El año es bisiesto? ");
		esBisiesto = teclado.nextBoolean();

		//Condicional para cada mes
		switch (numMes) {
		case 1:
			System.out.println("Enero tiene 31 días");
			break;
		case 2:
			if (esBisiesto == false) {
				System.out.println("Febrero tiene 28 días");
			} else {
				System.out.println("Febrero tiene 29 días");
			}
			break;
		case 3:
			System.out.println("Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("Abril tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("Junio tiene 30 días");
			break;
		case 7:
			System.out.println("Julio tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días");
			break;
		}

		//Cerramos teclado.
		teclado.close();

	}

}
