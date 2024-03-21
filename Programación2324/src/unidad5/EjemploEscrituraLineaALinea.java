package unidad5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EjemploEscrituraLineaALinea {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Usuario\\Documents\\Lectura.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);

			String[] lineas = { "Primera linea", "Segunda linea", "Tercera linea", "Cuarta linea" };

			// Bucle que recorre el array lineas con un for-each y lo escribe en el fichero
			// lectura.txt
			for (String linea : lineas) {
				// Escribimos una linea
				bw.write(linea);
				// Pasamos a la siguiente linea
				bw.newLine();
			}

			bw.close();
			fw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
