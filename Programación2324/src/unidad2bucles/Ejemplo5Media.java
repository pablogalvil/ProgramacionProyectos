package unidad2bucles;

public class Ejemplo5Media {

	/**
	 * El programa recibe un string con las notas. Cada carácter es un número de 1 a
	 * 9. El programa devuelve la media
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		String sNotas = "32432445435343223423";
		float media = 0.0f;
		float suma = 0.0f;

		// System.out.println("Ultimo número : " + sNotas.charAt(19));
		// System.out.println("Longitud : " + sNotas.length());

		// Recorremos el string carácter a carácter
		for (int i = 0; i < sNotas.length(); i++) {

			System.out.println("letra " + i + " : " + sNotas.charAt(i));

			suma = suma + Character.getNumericValue(sNotas.charAt(i));
		}
		// Calculamos la media
		media = suma / (sNotas.length() + 1);
		System.out.println("La suma es : " + suma);
		System.out.println("La media es : " + media);

	}

}
