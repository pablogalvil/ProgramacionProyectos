package unidad4;

//Con este import podemos usar todas las clases del paquete utils
import unidad4.utils.UtilsBD;

public class PruebasBD {

	public static void main(String[] args) {

		System.out.println("Intentamos conectar  con BD");
		// Ejecutamos la conexion
		UtilsBD.conectarBD();

	}

}
