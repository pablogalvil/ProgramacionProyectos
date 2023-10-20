package unidad2;

import java.util.Scanner;

public class ejercicio6 {

	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;

	public static void main(String[] args) {

		int dia = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el dia (1 para lunes, 2 para martes, etc) : ");
		dia = teclado.nextInt();

		switch (dia) {
		case LUNES:
			System.out.println("Hoy es Lunes");
			break;
		case MARTES:
			System.out.println("Hoy es Martes");
			break;
		case MIERCOLES:
			System.out.println("Hoy es Miércoles");
			break;
		case JUEVES:
			System.out.println("Hoy es Jueves");
			break;
		case VIERNES:
			System.out.println("Hoy es Viernes");
			break;
		case SABADO:
			System.out.println("Hoy es Sábado");
			break;
		case DOMINGO:
			System.out.println("Hoy es Domingo");
			break;
		default:
			System.out.println("El dia que ha establecido no es válido");
		}

		teclado.close();

	}

}
