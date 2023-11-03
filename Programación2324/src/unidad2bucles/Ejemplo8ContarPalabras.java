package unidad2bucles;

public class Ejemplo8ContarPalabras {

	/**
	 * El programa contara las veces que la palabra está en un texto.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		String texto = "En la casa de pepito la comida está ricala";
		String palabra = "la";
		int numPalabras = 0;
		// La variable posBusc guarda la posición a partir de la cual buscamos.
		int posBusc = 0;

		// Mientras indexOf no nos diga que no hay más palabras, no dejamos de buscar.
		while (posBusc != -1) {
			posBusc = texto.indexOf(palabra, posBusc);
			// Si me devuelve algo distinto a -1, indica que ha encontrado la palabra.
			if (posBusc != -1) {
				numPalabras++;
				posBusc++;
			}
		}
		System.out.println("La palabra " + palabra + " esta " + numPalabras + " veces en el texto.");

	}

}
