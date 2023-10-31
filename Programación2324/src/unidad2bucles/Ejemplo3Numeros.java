package unidad2bucles;

public class Ejemplo3Numeros {

	public static void main(String[] args) {

		// Bucle que muestra todos los numeros pares de 1 a 30
		for (int i = 1; i > -1; i++) {
			int j = i % 2;
			if (j == 0) {
				System.out.println(i);
			}
			// Ejemplo de break, salimos del bucle cuando cumple la condicion
			// IMPORTANTE JAMAS UTILIZAR, ES INOPTIMO, NO ES BUENA PRACTICA
			if (i == 1000)
				break;
		}

		// Bucle que saca los multiplos de 5
		// Si vamos sumando en vez de comprobar es mucho más rápido y óptimo
		for (int i = 5; i <= 100; i = i + 5) {
			System.out.println(i);
		}

	}

}
