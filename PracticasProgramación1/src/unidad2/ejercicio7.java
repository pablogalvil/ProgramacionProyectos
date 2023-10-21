package unidad2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		int diasMes = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de días del mes : ");
		diasMes = teclado.nextInt();
		
		diasMes=diasMes%2;

		switch (diasMes) {
		case 0:
			System.out.println("Los pares son Febrero(si no es bisiesto), Abril, Junio, Septiembre y Noviembre");
			break;
		case 1:
			System.out.println("Los impares son Enero, Febrero(si es bisiesto), Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
			break;
		}

		teclado.close();

	}

}
