package examenUnidad3;

public class Prueba {

	public static void main(String[] args) {
		// He creado 2 mazmorras, una que cumple todas las condiciones y otra que no las
		// cumple, he ido cambiando la que no las cumple en función de lo que quería
		// probar, por defecto he dejado una que no cumple ninguna de las funciones, ya
		// lo cambiarás tu en función de lo que quieras comprobar.

		// Creamos trampas buenas.
		Trampa[] trampasBuenas = new Trampa[9];

		trampasBuenas[0] = new Trampa("Trampa 1", 0, 50, 5, true, true, 1);
		trampasBuenas[1] = new Trampa("Trampa 2", 0, 50, 5, true, true, 1);
		trampasBuenas[2] = new Trampa("Trampa 3", 0, 50, 5, true, true, 1);
		trampasBuenas[3] = new Trampa("Trampa 4", 0, 50, 5, true, true, 2);
		trampasBuenas[4] = new Trampa("Trampa 5", 0, 50, 5, true, true, 2);
		trampasBuenas[5] = new Trampa("Trampa 6", 0, 50, 5, true, true, 2);
		trampasBuenas[6] = new Trampa("Trampa 7", 0, 50, 5, true, true, 3);
		trampasBuenas[7] = new Trampa("Trampa 8", 0, 50, 5, true, true, 3);
		trampasBuenas[8] = new Trampa("Trampa 9", 0, 50, 5, true, true, 3);

		// Creamos trampas malas.
		Trampa[] trampasMalas = new Trampa[9];

		trampasMalas[0] = new Trampa("Trampa 1", 0, 50, 5, true, true, 1);
		trampasMalas[1] = new Trampa("Trampa 2", 0, 50, 5, true, true, 1);
		trampasMalas[2] = new Trampa("Trampa 3", 0, 50, 5, true, true, 1);
		trampasMalas[3] = new Trampa("Trampa 4", 0, 50, 5, true, true, 2);
		trampasMalas[4] = new Trampa("Trampa 5", 0, 50, 5, true, true, 2);
		trampasMalas[5] = new Trampa("Trampa 6", 0, 50, 5, true, true, 3);
		trampasMalas[6] = new Trampa("Trampa 7", 0, 50, 5, true, true, 3);
		trampasMalas[7] = new Trampa("Trampa 8", 0, 50, 5, true, true, 3);
		trampasMalas[8] = new Trampa("Trampa 9", 0, 50, 5, true, true, 3);

		// Creamos monstruos buenos.
		Monstruo[] monstruosBuenos = new Monstruo[10];

		monstruosBuenos[0] = new Monstruo("Monstruo 1", 0, 1, 1000, 50, 1, 1000);
		monstruosBuenos[1] = new Monstruo("Monstruo 2", 1, 1, 1000, 51, 1, 1000);
		monstruosBuenos[2] = new Monstruo("Monstruo 3", 2, 1, 1000, 54, 1, 1000);
		monstruosBuenos[3] = new Monstruo("Monstruo 4", 3, 1, 1000, 57, 2, 1000);
		monstruosBuenos[4] = new Monstruo("Monstruo 5", 4, 1, 1000, 74, 2, 1000);
		monstruosBuenos[5] = new Monstruo("Monstruo 6", 0, 1, 1000, 50, 2, 1000);
		monstruosBuenos[6] = new Monstruo("Monstruo 7", 1, 1, 1000, 100, 3, 1000);
		monstruosBuenos[7] = new Monstruo("Monstruo 8", 2, 1, 1000, 250, 3, 1000);
		monstruosBuenos[8] = new Monstruo("Monstruo 9", 3, 1, 1000, 53, 3, 1000);
		monstruosBuenos[9] = new Monstruo("Monstruo 10", 4, 1, 1000, 58, 3, 1000);

		// Creamos monstruos malos.
		Monstruo[] monstruosMalos = new Monstruo[10];

		monstruosMalos[0] = new Monstruo("Monstruo 1", 0, 2, 1000, 50, 1, 1000);
		monstruosMalos[1] = new Monstruo("Monstruo 2", 1, 2, 1000, 51, 1, 1000);
		monstruosMalos[2] = new Monstruo("Monstruo 3", 2, 2, 1000, 54, 1, 1000);
		monstruosMalos[3] = new Monstruo("Monstruo 4", 3, 2, 1000, 57, 2, 1000);
		monstruosMalos[4] = new Monstruo("Monstruo 5", 0, 2, 1000, 74, 2, 1000);
		monstruosMalos[5] = new Monstruo("Monstruo 6", 0, 2, 1000, 50, 2, 1000);
		monstruosMalos[6] = new Monstruo("Monstruo 7", 1, 2, 1000, 100, 3, 1000);
		monstruosMalos[7] = new Monstruo("Monstruo 8", 2, 2, 1000, 250, 3, 1000);
		monstruosMalos[8] = new Monstruo("Monstruo 9", 3, 2, 1000, 53, 3, 1000);
		monstruosMalos[9] = new Monstruo("Monstruo 10", 0, 2, 1000, 58, 3, 1000);

		// Creamos las mazmorras con las respectivas trampas y monstruos.
		Mazmorra pruebaBuena = new Mazmorra(trampasBuenas, monstruosBuenos, "Mazmorra Buena", 2000, "Pantano", 3);
		Mazmorra pruebaMala = new Mazmorra(trampasMalas, monstruosMalos, "Mazmorra Mala", 2000, "Pantano", 3);

		// Prueba de la función enemigo final.
		System.out.println("PRUEBAS DE ENEMIGO FINAL");
		System.out.println(" ");
		System.out.println("Prueba buena : " + pruebaBuena.enemigoFinal());
		System.out.println("Prueba fallida : " + pruebaMala.enemigoFinal());
		System.out.println(" ");

		// Prueba de la función regular trampas.
		System.out.println("PRUEBAS DE REGULAR TRAMPAS");
		System.out.println(" ");
		System.out.println("Prueba buena : " + pruebaBuena.regularTrampas(3));
		System.out.println("Prueba fallida : " + pruebaMala.regularTrampas(3));
		System.out.println(" ");

		// Prueba de la función comprobar mazmorra.
		System.out.println("PRUEBAS DE COMPROBAR MAZMORRA");
		System.out.println(" ");
		System.out.println("Prueba buena : " + pruebaBuena.comprobarMazmorra());
		System.out.println("Prueba fallida : " + pruebaMala.comprobarMazmorra());
		System.out.println(" ");
	}

}
