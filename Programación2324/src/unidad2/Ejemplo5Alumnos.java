package unidad2;

import java.util.Scanner;

public class Ejemplo5Alumnos {

	/**
	 * El programa lee el año de nacimiento de un alumno del instituto y le dice el
	 * curso que le corresponde
	 * 
	 * @param args
	 */

	/*
	 * Declaramos constantes para los años de la eso se hace poniendo final, esto
	 * hace que el valor no se pueda modificar, es siempre el que se le asigna en la
	 * declaración
	 */

	public final static int EDAD1_ESO = 2011;
	public final static int EDAD2_ESO = 2010;
	public final static int EDAD3_ESO = 2009;
	public final static int EDAD4_ESO = 2008;
	public final static int EDAD1_BACH = 2007;
	public final static int EDAD2_BACH = 2006;

	public static void main(String[] args) {

		// final int edad1Eso=2011;

		// Variables
		int birthYear = 0;
		Scanner teclado = new Scanner(System.in);

		// Leemos el año de teclado
		System.out.print("Escribe tu año de nacimiento : ");
		birthYear = teclado.nextInt();

		/*
		 * El switch compara el valor entre parentesis con los distintos casos. Cuando
		 * coincida con uno, realiza las instrucciones pertinentes.
		 */
		switch (birthYear) {
		case EDAD1_ESO:
			System.out.println("Eres de 1º de la ESO");
			break;
		case EDAD2_ESO:
			System.out.println("Eres de 2º de la ESO");
			break;
		case EDAD3_ESO:
			System.out.println("Eres de 3º de la ESO");
			break;
		case EDAD4_ESO:
			System.out.println("Eres de 4º de la ESO");
			break;
		case EDAD1_BACH:
			System.out.println("Eres de 1º de bachillerato");
			break;
		case EDAD2_BACH:
			System.out.println("Eres de 2º de bachillerato");
			break;
		default:
			System.out.println("No eres del instituto");
		}

		teclado.close();
	}

}
