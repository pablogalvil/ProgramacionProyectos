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
	 * Funcion factorial que recibe un numero y devuelve la multiplicacion desde 1
	 * hasta dicho numero por ejemplo si num es 3 devolvera 1*2*3 es decir 6
	 * 
	 * @param num
	 * @return
	 */

	public static long factorial(int num) {
		long factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	/**
	 * 6!=6*5*4*3*2*1=6*5! 5!=5*4*3*2*1=5*4! 4!=4*3*2*1 3!=3*2*1 2!=2*1 1!=1
	 * 
	 * n!=n*(n-1)!
	 * 
	 * @param num
	 * @return
	 */
	public static long factorialR(int num) {

		if (num == 1 || num == 0)
			return num;

		return num * factorialR(num - 1);
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

	/**
	 * [2,3,1,5] 2, [3,1,5]
	 * 
	 * @param listaNum
	 * @return
	 */
	public static int minR(int listaNum[]) {

		// Si solo hay un número es el mínimo
		if (listaNum.length == 1)
			return listaNum[0];

		// Separamos el primer número si hay más de uno
		int numIzq = listaNum[0];

		int listaDerecha[] = new int[listaNum.length - 1];

		// Copio todos los datos del array desde la posicion 1 hasta la final
		for (int i = 1; i < listaNum.length; i++) {
			listaDerecha[i - 1] = listaNum[i];
		}

		// Si el número de la izquierda es menor que el menor del resto
		// Devuelvo dicho número, en caso contrario devuelvo el menor del resto
		// minDer sirve para optimizar el código
		int minDer = minR(listaDerecha);
		if (numIzq < minDer)
			return numIzq;
		else
			return minDer;
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
