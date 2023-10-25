package unidad2;

import java.util.Scanner;

public class ejercicio10 {
	/**
	 * 
	 * Realizar un programa que lea la edad, si está casado (boolean), el sexo
	 * (char), comunidad autonoma, numero de hijos y el sueldo anual, y muestre las
	 * ayudas anuales al alquiler calculandolas segun las siguientes condiciones
	 * 
	 * Si pertenecen a la comunidad autónoma de Pais Vasco o Valencia o tienen un
	 * sueldo superior a 60000 y más de 2 hijos, su ayuda será un 12% de su sueldo
	 * anual + pluses.
	 * 
	 * Si pertenece a cantabria, andalucia o Madrid, es mujer y sueldo entre 55000 y
	 * 45000, su ayuda sera un 13% del sueldo + pluses.
	 * 
	 * plus1: Si cumplen que estan casados con más de 3 hijos, cobran un fijo de
	 * 100€ mes. plus2: Cualquiera que tenga mas de 5 hijos cobrará 2000€ anuales.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int edad = 0;
		boolean estaCasado = false;
		String genero = "";
		char sexo = 'M';
		int rango = 0;
		String comAuton = "";
		int numHijos = 0;
		double sueldoAnual = 0;
		double ayuda = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu edad : ");
		edad = teclado.nextInt();
		System.out.print("¿Está usted casado? (true o false) ");
		estaCasado = teclado.nextBoolean();
		System.out.print("Introduce tu sexo (H/M) : ");
		genero = teclado.next().toUpperCase();
		rango = (genero.length() - 1);
		sexo = genero.charAt(rango);
		System.out.print("Introduce tu comunidad autónoma : ");
		comAuton = teclado.next().toLowerCase();
		System.out.print("¿Cuántos hijos tienes? ");
		numHijos = teclado.nextInt();
		System.out.print("Introduce tu sueldo anual : ");
		sueldoAnual = teclado.nextDouble();

		if (estaCasado == true && numHijos > 3) {
			ayuda = ayuda + 1200;
		}

		if (numHijos > 5) {
			ayuda = ayuda + 2000;
		}

		if (numHijos > 2 && sueldoAnual >= 60000) {
			ayuda = (ayuda) + (sueldoAnual * 12) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else if (numHijos > 2 && comAuton == "pais vasco") {
			ayuda = (ayuda) + (sueldoAnual * 12) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else if (numHijos > 2 && comAuton == "valencia") {
			ayuda = (ayuda) + (sueldoAnual * 12) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else if (comAuton == "cantabria" && sexo == 'M' && sueldoAnual >= 45000 && sueldoAnual <= 55000) {
			ayuda = (ayuda) + (sueldoAnual * 13) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else if (comAuton == "andalucia" && sexo == 'M' && sueldoAnual >= 45000 && sueldoAnual <= 55000) {
			ayuda = (ayuda) + (sueldoAnual * 13) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else if (comAuton == "madrid" && sexo == 'M' && sueldoAnual >= 45000 && sueldoAnual <= 55000) {
			ayuda = (ayuda) + (sueldoAnual * 13) / 100;
			System.out.println("Su ayuda será de " + ayuda + " euros anuales.");
		} else {
			System.out.println("No le corresponden ayudas.");
		}

		teclado.close();

	}

}
