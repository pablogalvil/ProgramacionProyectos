package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo6SwitchEstados {

	public static final int ESTADO_VOLANDO = 0;
	public static final int ESTADO_CUBIERTO = 1;
	public static final int ESTADO_INVISIBLE = 2;
	public static final int ESTADO_AGACHADO = 3;

	// Definimos constantes para las acciones
	public static final int ACCION_DISPARAR = 0;
	public static final int ACCION_SALTAR = 1;
	public static final int ACCION_ESCANEO_VISIBILIDAD = 2;

	public static final int RESULTADO_PERMITIDO = 1;
	public static final int RESULTADO_NO_PERMITIDO = 0;

	/**
	 * El programa recibe el estado de un personaje y la acción a realizar, y
	 * dependiendo del estado se podra realizar o no.
	 * 
	 * El jugador podrá disparar si no está cubierto.
	 * 
	 * El jugador puede saltar si no está saltando o invisible.
	 * 
	 * El jugador es visible si no es invisible y no está a cubierto.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Variables
		int estado = -1;
		int accion = -1;
		// Por defecto no se permite la acción
		int resultado = RESULTADO_NO_PERMITIDO;
		Scanner teclado = new Scanner(System.in);

		// Leemos por teclado los datos
		System.out.print("Introduce una accion (0 - Disparar, 1 - Saltar, 2 - Escaneo) : ");
		accion = teclado.nextInt();

		System.out.print("Introduce un estado (0 - Saltando, 1 - A cubierto, 2 - Invisible, 3 - Agachado) : ");
		estado = teclado.nextInt();

		/*
		 * POR HACER POR EL ALUMNO, COMPROBAR QUE LA ACCION Y EL ESTADO SON VALORES
		 * CORRECTOS SINO SALIR CON EXIT exit(-1).
		 */

		switch (accion) {
		case ACCION_DISPARAR:
			if (estado != ESTADO_CUBIERTO)
				resultado = RESULTADO_PERMITIDO;
			break;
		case ACCION_SALTAR:
			if (estado != ESTADO_VOLANDO && estado != ESTADO_INVISIBLE)
				resultado = RESULTADO_PERMITIDO;
			break;
		case ACCION_ESCANEO_VISIBILIDAD:
			if (estado != ESTADO_INVISIBLE && estado != ESTADO_CUBIERTO)
				resultado = RESULTADO_PERMITIDO;
			break;

		}

		if (resultado == RESULTADO_PERMITIDO)
			System.out.println("La acción puede llevarse a cabo");
		else if (resultado == RESULTADO_NO_PERMITIDO)
			System.out.println("La acción no puede llevarse a cabo");

		teclado.close();

	}

}
