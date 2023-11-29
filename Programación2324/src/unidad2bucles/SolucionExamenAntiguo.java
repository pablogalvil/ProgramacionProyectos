package unidad2bucles;

import java.util.Scanner;

public class SolucionExamenAntiguo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// Variables
		int numEmp = 0;
		String nombre = "";
		int edad = 0;
		float sueldo = 0.0f;
		char estCiv = ' ';
		int diasBaja = 0;
		long sumaDBaja = 0;
		int numCasados = 0;
		int numSolteros = 0;
		int numDivorciados = 0;

		float maxSueldo = Float.MIN_VALUE;
		String nombreMasForrao = "";

		String listaNombres[];

		// Posicion donde guardaremos el número de empleados que cobran la paga de
		// navidad
		int posNombre = 0;

		// Leemos la cantidad de empleados
		System.out.print("Cuantos Empleados vamos a leer? : ");
		numEmp = teclado.nextInt();

		// Creamos el espacio para guardar los nombres en el array
		listaNombres = new String[numEmp];

		// Para cada empleado tratamos los datos
		for (int i = 0; i < numEmp; i++) {
			// Leemos los datos del empleado
			System.out.print("Edad del empleado " + (i + 1) + " : ");
			edad = teclado.nextInt();
			System.out.print("Sueldo del empleado " + (i + 1) + " : ");
			sueldo = teclado.nextFloat();
			System.out.print("Cuantos dias de baja ha estado el empleado " + (i + 1) + " : ");
			diasBaja = teclado.nextInt();
			System.out.print("Estado civil del empleado " + (i + 1) + " (S - Soltero, C - Casado, D - Divorciado) : ");
			estCiv = teclado.next().toUpperCase().charAt(0);
			teclado.nextLine();
			System.out.print("Nombre del empleado " + (i + 1) + " : ");
			nombre = teclado.nextLine();

			// Vamos sumando en sumaDBaja todos los dias de baja de los empleados
			sumaDBaja = sumaDBaja + diasBaja;

			// Vamos guardando el nombre del sueldo máximo
			if (maxSueldo < sueldo) {
				maxSueldo = sueldo;
				nombreMasForrao = nombre;
			}

			if ((diasBaja < 30 && edad > 40) || estCiv == 'D') {

				// Metemos los nombres de los empleados en el array
				listaNombres[posNombre] = nombre;
				posNombre++;
			}

			// Vamos contando los divorciados, solteros y casados
			switch (estCiv) {
			case 'S':
				numSolteros++;
				break;
			case 'C':
				numCasados++;
				break;
			case 'D':
				numDivorciados++;
				break;
			}

		} // Fin del bucle principal

		// Mostramos los resultados por pantalla

		System.out.println("Los días totales de baja son " + sumaDBaja);

		System.out.println("El más forrao de la empresa es " + nombreMasForrao + " cobra " + maxSueldo);

		System.out.println("El porcentaje de empleados casados es " + (numCasados * 100 / numEmp));

		System.out.println("El porcentaje de empleados solteros es " + (numSolteros * 100 / numEmp));

		System.out.println("El porcentaje de empleados divorciados es " + (numDivorciados * 100 / numEmp));

		// Mostramos por pantalla los nombres de los empleados con derecho a extra de
		// navidad

		System.out.println("Los empleados con derecho a extra de navidad son : ");

		for (String nombreAc : listaNombres) {
			if (nombreAc != null)
				System.out.println(nombreAc);
		}

		teclado.close();

	}

}
