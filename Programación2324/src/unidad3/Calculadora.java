package unidad3;

public class Calculadora {

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

}
