package unidad2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		int diasMes = 0;
		boolean esBisiesto = false;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de días del mes : ");
		diasMes = teclado.nextInt();
		System.out.print("¿El año es bisiesto? ");
		esBisiesto = teclado.nextBoolean();

		switch (diasMes) {
		case 4:
			if (esBisiesto == true)
				System.out.println("Estas en febrero");
			break;
		case 0:
			System.out.println("Estas en Febrero, Abril, Junio, Septiembre o Noviembre");
			break;
		case 1:
			System.out.println("Estas en Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre");
			break;
		}

		teclado.close();

	}

}
