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
	 * La funcion busca la posicion de un número dentro de un array ordenado
	 * 
	 * [1,4,9,13,34,56,122]
	 * 
	 * @param listaNumeros array de numeros ordenado
	 * @param numBus       numero a buscar
	 * @return posicion donde esta el número, -1 si no está
	 */
	public static int buscaNumero(int listaNumeros[], int numBus) {
		for (int i = 0; i < listaNumeros.length; i++) {
			if (numBus == listaNumeros[i]) {
				return i;
			}
		}
		// Si llega hasta aqui es que se ha recorrido todo el array y no se ha
		// encontrado el número
		return -1;
	}

	/**
	 * La funcion busca la posicion de un número dentro de un array ordenado
	 * 
	 * [1,4,9,13,34,56,122]
	 * 
	 * @param listaNumeros array de numeros ordenado
	 * @param numBus       numero a buscar
	 * @return posicion donde esta el número, -1 si no está
	 */
	public static int buscaNumeroR(int listaNumeros[], int numBus, int posAct) {

		// Si encontramos el numero buscado en la posicion actual lo devolvemos
		if (listaNumeros[posAct] == numBus)
			return posAct;
		else if (posAct == listaNumeros.length - 1)
			// Si estamos en la ultima posicion y no es el numero a buscar
			// El numero no se encuentra
			return -1;

		return buscaNumeroR(listaNumeros, numBus, posAct + 1);
	}

	// POR HACER
	// Funcion que recibe un array y una posicion de comienzo y una de fin
	// Devuelve un array resultante de copiar el corte del array que recibe por las
	// posiciones

	/**
	 * Esta funcion recibe un array de enteros y devuelve el valor minimo [2,3,1,5]
	 * 2, [3,1,5]
	 * 
	 * @param listaNum array de enteros
	 * @return el menor de los numeros
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
