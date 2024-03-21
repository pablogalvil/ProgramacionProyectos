package unidad5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EjemploCopiarImagen {

	public static void main(String[] args) {

		String ficheroOrigen = "C:\\Users\\Usuario\\Pictures\\Captura.PNG";
		String ficheroDestino = "D:\\Programación\\ProgramacionProyectos\\ProgramacionProyectos\\img\\eclipse.PNG";

		File dirImagen = new File(".\\img");
		// Comprobamos si el directorio existe
		if (!(dirImagen.exists())) {
			// Si no existe lo creamos
			dirImagen.mkdir();
		}

		// Abrimos el fichero origen
		try {
			FileInputStream fis = new FileInputStream(ficheroOrigen);
			FileOutputStream fos = new FileOutputStream(ficheroDestino);

			byte[] buffer1k = new byte[1024];

			// Devuelve la cantidad de bytes leidos
			int numDatos = fis.read(buffer1k);

			while (numDatos != -1) {
				fos.write(buffer1k);
				numDatos = fis.read(buffer1k);
			}

			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
