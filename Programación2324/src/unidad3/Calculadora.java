package unidad3;

public class Calculadora {

	// Si el modificador de una variable es public se puede acceder desde cualquier
	// clase.
	public final double PI = 3.14159;

	// Si el modificador de acceso es private implica que solo se puede usar dentro
	// de la clase.
	private final double PLCK = 2323.2323;

	/**
	 * Funcion que recibe dos números y los suma
	 * 
	 * Para definir una funcion se sigue la siguiente sintaxis :
	 * 
	 * public <tipo devolver> nombre_funcion(<param1>,<param2>, ...){
	 * 
	 * codigo
	 * 
	 * }
	 * 
	 * @param x
	 * @param y
	 * @return
	 */

	public int suma(int x, int y) {
		// Hago los calculos
		int suma = x + y;
		// Con return devuelvo la suma de los dos números que me pasan como parámetros
		return suma;
	}

	/**
	 * Funcion que divide dos numeros
	 * 
	 * @param x dividendo
	 * @param y divisor
	 * @return -1 si el divisor es 0 o el resultado de la division
	 */

	public static int division(int x, int y) {
		// Con return devuelvo la suma de los dos números que me pasan como parámetros
		if (y == 0)
			return -1;

		return x / y;
	}

	public static float division(float x, float y) {
		// Con return devuelvo la suma de los dos números que me pasan como parámetros
		if (y == 0)
			return -3.0f;

		return x / y;
	}

	/**
	 * Recibe un array de enteros y devuelve el valor mínimo
	 * 
	 * @param listaNum array de enteros
	 * @return valor mínimo
	 */

	public static int min(int listaNum[]) {
		int min = Integer.MAX_VALUE;
		// Recorremos todos los elementos del array
		for (int i = 0; i < listaNum.length; i++) {
			// Si hay un nuevo mínimo se guarda
			if (listaNum[i] < min)
				min = listaNum[i];
		}

		return min;
	}

	public double areaCirculo(double radio) {
		double PI = 3.15;
		double area = 0;

		// this sirve para usar la variable que prefieres
		area = this.PI * radio * radio;

		// Devolvemos la función
		return area;
	}

}
