package unidad2;

import java.util.Scanner;

public class Ejemplo8AciertaNumero {

	/**
	 * El programa genera un número aleatorio entre 1 y 19 y el usuario lo acertara
	 * en 3 intentos o explotara una bomba enganchada a su cuerpo. El programa
	 * diabolico en cada fallo le dirá si el número a acertar es mayor o menor y le
	 * metera presión. En el primer fallo hay un 30% de posibilidades de que la
	 * maquina le mienta.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		int numAleatorio = 0;
		int num1,num2,num3=0;
		
		Scanner teclado=new Scanner(System.in);
		
		num1=2;
		num2=4;
		if (num3==0 && (num1>num2 || num3<num1)) {
			System.out.println("HOLA");
		}

	}

}
