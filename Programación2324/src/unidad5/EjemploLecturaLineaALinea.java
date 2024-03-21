package unidad5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLecturaLineaALinea {

	// Lectura linea a linea de un fichero

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\Usuario\\Documents\\lectura.txt");

			BufferedReader br = new BufferedReader(fr);

			System.out.println(br.readLine());

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
