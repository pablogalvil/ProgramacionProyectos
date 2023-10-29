package unidad2;

import java.util.Scanner;

public class ejercicio7b {

	public static void main(String[] args) {
		//Declaramos variables
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
		if (numMes == 1) {
			System.out.println("Enero tiene 31 días");
		} else if (numMes == 2 && esBisiesto == false) {
			System.out.println("Febrero tiene 28 días");
		} else if (numMes == 2 && esBisiesto == true) {
			System.out.println("Febrero tiene 29 días");
		} else if (numMes == 3) {
			System.out.println("Marzo tiene 31 días");
		} else if (numMes == 4) {
			System.out.println("Abril tiene 30 días");
		} else if (numMes == 5) {
			System.out.println("Mayo tiene 31 días");
		} else if (numMes == 6) {
			System.out.println("Junio tiene 30 días");
		} else if (numMes == 7) {
			System.out.println("Julio tiene 31 días");
		} else if (numMes == 8) {
			System.out.println("Agosto tiene 31 días");
		} else if (numMes == 9) {
			System.out.println("Septiembre tiene 30 días");
		} else if (numMes == 10) {
			System.out.println("Octubre tiene 31 días");
		} else if (numMes == 11) {
			System.out.println("Noviembre tiene 31 días");
		} else if (numMes == 12) {
			System.out.println("Diciembre tiene 31 días");
		}

		//Cerramos teclado.
		teclado.close();

	}

}
