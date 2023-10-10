package unidad1;

public class Ejemplo3Dados {

	/**
	 * Este programa simula una tirada de dados de 1 a 20
	 * @param args
	 */
	public static void main(String[] args) {
		int tirada20=0;
		
		/**
		 * Generamos un número aleatorio entre 1 y 20 con math.random, que devuelve un númmero entre 0,0000001 y 0,9999999
		 * Lo multiplicamos por 20 para que este en el rango  de tirada y lo convertimos a entero con (int)
		 */
		tirada20 = (int)(Math.random()*20);
	
	
		//Sacamos por pantalla el resultado
		System.out.println("El resultado de la tirada es: " + tirada20);

	}

}
