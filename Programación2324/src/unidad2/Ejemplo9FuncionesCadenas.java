package unidad2;

public class Ejemplo9FuncionesCadenas {

	public static void main(String[] args) {
		String direccion = "      Calle gorgola 23 23456 burgos spain";
		String memRam = "8192MB";
		int dobleMemoria = 0;

		/*
		 * Ejemplo de funcion charAt, con ella podemos sacar el caracter en la posición
		 * indicada.
		 */

		char quintaPosicion = direccion.charAt(4);

		// Las posiciones empiezan por 0, por lo cual la quinta posicion es el número 4.
		System.out.println("La letra en la posición 5 es " + quintaPosicion);

		/*
		 * La funcion substr (substring) devuelve un corte de la cadena original sobre
		 * la que ejecutamos la funcion, hay que poner la posicion inicial y la final.
		 */

		System.out.println("La calle es : " + direccion.substring(6, 13));

		/*
		 * La propiedad lenght nos dice cuantas letras tiene el String
		 */

		System.out.println("La dirección tiene " + direccion.length() + " carácteres");

		// Cortamos el numero de la memoria ram
		memRam = memRam.substring(0, 4);
		// Para convertir un String a un entero usamos parseInt de integer.
		// Existe un parseDouble de double y parseFloat de float.
		dobleMemoria = Integer.parseInt(memRam) * 2;

		// Para convertir un número a String se utiliza el método valueOf de
		// la clase String.
		memRam = String.valueOf(dobleMemoria);

		// Concat concatena dos cadenas, las dos siguientes expresiones son iguales
		direccion = direccion.concat(" Mundo      ");
		direccion = direccion + " Mundo      ";

		// Strip elimina los espacios en blanco redundantes al final de la cadena

		System.out.println(direccion + "f");
		direccion = direccion.strip();
		System.out.println(direccion + "f");

		// Trim elimina los espacios en blanco redundantes al principio de la cadena

		System.out.println(direccion);
		direccion.trim();
		System.out.println(direccion);

	}

}
