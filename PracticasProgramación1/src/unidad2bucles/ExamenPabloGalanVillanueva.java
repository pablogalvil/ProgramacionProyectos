package unidad2bucles;

import java.util.Scanner;

public class ExamenPabloGalanVillanueva {

	public static final int CATEGORIA_AVENTURA = 0;
	public static final int CATEGORIA_PLATAFORMAS = 1;
	public static final int CATEGORIA_TERROR = 2;
	public static final int CATEGORIA_SHOOTER = 3;

	public static final int PLATAFORMA_SWITCH = 0;
	public static final int PLATAFORMA_XBOX = 1;
	public static final int PLATAFORMA_PLAYSTATION = 2;
	public static final int PLATAFORMA_PC = 3;

	/**
	 * Realizar un programa en java que haga los siguientes cálculos.
	 * 
	 * Leerá un conjunto de n videojuegos de teclado, con los siguientes datos:
	 * 
	 * Nombre Precio Categoría (Aventura, plataformas, Terror, Shooter) Stock
	 * Plataforma (switch, xbox, playstation, pc) Puntuación (entre 1 y 10)
	 * 
	 * El usuario introducirá primero la cantidad de videojuegos que va a introducir
	 * por teclado.
	 * 
	 * Y con dichos datos comprobará los siguiente una vez leídos todos los datos:
	 * 
	 * 
	 * La media de precio y el nombre del videojuego más caro y más barato.
	 * 
	 * Mostrar el nombre de los juegos que sean de categoría Plataformas cuya
	 * puntuación sea superior a 9 o cuesten menos de 19 euros
	 * 
	 * Mostrará el Stock total de los productos de la categoría Terror
	 * 
	 * Según se leen los datos se comprobará que los valores de categoría y
	 * plataforma están dentro de los valores posibles entre paréntesis, sino se le
	 * seguirá pidiendo dicho dato hasta que introduzca un valor correcto.
	 * 
	 * Cuando un producto tenga stock 0 y puntuación superior a 6, guardará su
	 * nombre en un array y mostrará al final la lista de productos sin stock a
	 * pedir de nuevo.
	 * 
	 * 
	 * La correcta lectura y cada uno de los apartados tienen valores iguales, se
	 * utilizará la rúbrica de classroom para valorar el exámen.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Variables
		int numVideojuegos = 0;
		float mediaPrecios = 0;
		// Para buscar el mas barato y el mas caro
		float masCaro = Float.MIN_VALUE;
		String nombreMasCaro = "";
		float masBarato = Float.MAX_VALUE;
		String nombreMasBarato = "";
		// Para guardar el total de stock de los juegos de terror
		int totalStock = 0;
		// Para saber cuantos guardar en el array
		int numSinStock = 0;

		// Scanner
		Scanner teclado = new Scanner(System.in);

		// Pedimos el número de videojuegos que usará
		System.out.print("Introduce el número de videojuegos que usarás : ");
		numVideojuegos = teclado.nextInt();

		String[] sinStock = new String[numVideojuegos];

		// Bucle para pasar por cada videojuego
		for (int i = 0; i < numVideojuegos; i++) {
			// Variables de cada videojuego, dentro del bucle para reiniciar su valor en
			// cada videojuego
			String nombre = "";
			float precio = 0.0f;
			int categoria = 0;// de 0 a 3
			int stock = 0;
			int plataforma = 0;// de 4 a 7
			double puntuacion = 0;// de 1 a 10

			// Pedimos los datos del juego
			System.out.print("Introduce el nombre del juego " + (i + 1) + " : ");
			// Pongo esto para que no salte a la siguiente linea
			teclado.nextLine();
			nombre = teclado.nextLine();

			System.out.print("Introduce el precio del juego " + (i + 1) + " : ");
			precio = teclado.nextFloat();

			System.out.print("Introduce la categoria (0.-Aventura, 1.-Plataformas, 2.-Terror, 3.-Shooter) del juego "
					+ (i + 1) + " : ");
			categoria = teclado.nextInt();
			// Repetimos la lectura en caso de que no esté entre el los valores
			while (categoria < 0 || categoria > 3) {
				System.out
						.print("Introduce la categoria (0.-Aventura, 1.-Plataformas, 2.-Terror, 3.-Shooter) del juego "
								+ (i + 1) + " : ");
				categoria = teclado.nextInt();
			}

			System.out.print("Introduce el Stock del juego " + (i + 1) + " : ");
			stock = teclado.nextInt();

			System.out.print(
					"Introduce la plataforma (0.-Switch, 1.-Xbox, 2.-Playstation, 3.-Pc) del juego " + (i + 1) + " : ");
			plataforma = teclado.nextInt();
			// Repetimos la lectura en caso de que no esté entre el los valores
			while (plataforma < 0 || plataforma > 3) {
				System.out.print("Introduce la plataforma (0.-Switch, 1.-Xbox, 2.-Playstation, 3.-Pc) del juego "
						+ (i + 1) + " : ");
				plataforma = teclado.nextInt();
			}

			System.out.print("Introduce la puntuacion (de 1 a 10) del juego " + (i + 1) + " : ");
			puntuacion = teclado.nextDouble();
			// Repetimos la lectura en caso de que no esté entre el los valores
			while (puntuacion < 1 || puntuacion > 10) {
				System.out.print("Introduce la puntuacion (de 1 a 10) del juego " + (i + 1) + " : ");
				puntuacion = teclado.nextDouble();
			}

			// Sumamos el precio para hacer la media fuera del bucle
			mediaPrecios += precio;

			// Buscamos el mas caro
			// Pongo <= para que saque el último es caso de haber 2 con el mismo precio y
			// que sean el mas caro
			if (masCaro <= precio) {
				masCaro = precio;
				nombreMasCaro = nombre;
			}

			// Buscamos el mas barato
			// Pongo >= para que saque el último es caso de haber 2 con el mismo precio y
			// que sean el mas caro
			if (masBarato >= precio) {
				masBarato = precio;
				nombreMasBarato = nombre;
			}

			// Buscamos juegos de plataformas que tengan puntuacion superior a 9 o cuesten
			// menos de 19 euros
			if (categoria == CATEGORIA_PLATAFORMAS && (puntuacion > 9 || precio < 19)) {
				// Pongo "\n" para que se dejen espacios en blanco y se aprecie mejor la funcion
				// de este if
				System.out.println(" \nEl juego " + nombre + " es recomendable jugarlo\n ");
			} else {
				// Para que en caso de no cumplirse se separe igualmente un texto del otro
				System.out.println(" ");
			}

			// Buscamos los juegos de la categoria terror para sumar su stock
			if (categoria == CATEGORIA_TERROR) {
				totalStock += stock;
			}

			if (stock == 0 && puntuacion > 6) {
				sinStock[numSinStock] = nombre;
				numSinStock++;
			}

		}
		// Hacemos la media de precios
		mediaPrecios = mediaPrecios / numVideojuegos;
		System.out.println("La media de los precios es de " + mediaPrecios);

		// Sacamos el mas barato y el mas caro
		System.out.println("El juego más barato es " + nombreMasBarato);
		System.out.println("El juego más caro es " + nombreMasCaro);

		// Sacamos el total de stock de los juegos de terror
		System.out.println("El stock total de los juegos de terror es de " + totalStock);

		// Mostramos los juegos sin stock por encima de 6 de puntuacion o en su defecto
		// decimos que no debe reponerse ninguno
		if (numSinStock == 0) {
			System.out.println("No debe reponerse ningun juego");
		} else {
			System.out.println("Los juegos que deben reponerse son : ");
			// Bucle para mostrar el array
			for (int j = 0; j < sinStock.length; j++) {
				// Esta condicion es para que no muestre los valores que no haya guardado, que
				// aparecerían como null
				if (sinStock[j] != null) {
					System.out.println(sinStock[j]);
				}
			}
		}

		// Cerramos teclado
		teclado.close();
	}

}
