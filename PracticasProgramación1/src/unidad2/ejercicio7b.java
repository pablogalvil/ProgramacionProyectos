package unidad2;

import java.util.Scanner;

public class ejercicio7b {

	public static void main(String[] args) {
		int diasMes = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número de días del mes : ");
		diasMes = teclado.nextInt();
		
		diasMes=diasMes%2;
		
		if (diasMes==0) {
			System.out.println("Los pares son Febrero(si no es bisiesto), Abril, Junio, Septiembre y Noviembre");
		}else {
			System.out.println("Los impares son Enero, Febrero(si es bisiesto), Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
		}

		teclado.close();

	}

}
