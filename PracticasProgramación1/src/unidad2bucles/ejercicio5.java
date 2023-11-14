package unidad2bucles;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x < cadena.length; x++) {
			// Segundo bucle para invertir las palabras
			if (cadena[x].length() > 5) {
				for (int y = cadena[x].length() - 1; y >= 0; y--) {
					// Variable para cambiar las letras
					char invertirLetra = cadena[x].charAt(y);
					System.out.print(invertirLetra);
				}
			} else {
				continue;
			}
			System.out.print(" ");
		}

	}

}
