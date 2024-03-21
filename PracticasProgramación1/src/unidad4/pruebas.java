package unidad4;

import java.sql.Connection;

import unidad4.model.AvestruzDAO;
import unidad4.model.AvestruzDO;
import unidad4.model.CarritoGolfDAO;
import unidad4.model.CarritoGolfDO;
import unidad4.model.FrutaDAO;
import unidad4.model.FrutaDO;
import unidad4.model.KoalaDAO;
import unidad4.model.KoalaDO;
import unidad4.utils.UtilsT;

public class pruebas {

	public static void main(String[] args) {
		// Las pruebas que he puesto son correctas e incorrectas la primera vez que las
		// ejecutas, despues ya no saldran porque he insertado en sitios que ya estaban,
		// pero igualmente puedes hacer drop database y volver a insertarla o cambiar
		// las pruebas.

		Connection con = UtilsT.conectarBD();
		System.out.println("***********************PRUEBAS CARRITO GOLF***********************");
		System.out.println(" ");

		CarritoGolfDO carritoConId = new CarritoGolfDO(3, "X8245KG-RB4868", "Citroen", 267, 3, 368);
		CarritoGolfDO carritoSinId = new CarritoGolfDO(25, "W6432LF-BD3285", "Renault", 223, 5, 750);

		CarritoGolfDO carritoActualizarConId = new CarritoGolfDO(5, "S4346RG-DD4235", "Renault", 523, 2, 478);
		CarritoGolfDO carritoActualizarSinId = new CarritoGolfDO(30, "W6432LF-BD3285", "Renault", 223, 5, 750);

		System.out.println("Pruebas eliminar correcta : " + CarritoGolfDAO.eliminar(3, con));
		System.out.println("Pruebas eliminar incorrecta : " + CarritoGolfDAO.eliminar(25, con));

		System.out.println("Pruebas cargar correcta : " + CarritoGolfDAO.cargar(con, 5));
		System.out.println("Pruebas cargar incorrecta : " + CarritoGolfDAO.cargar(con, 35));

		System.out.println("Pruebas insertar correcta : " + CarritoGolfDAO.insertar(carritoSinId, con));
		System.out.println("Pruebas insertar incorrecta : " + CarritoGolfDAO.insertar(carritoConId, con));

		System.out.println("Pruebas actualizar correcta : " + CarritoGolfDAO.actualizar(carritoActualizarConId, con));
		System.out.println("Pruebas actualizar incorrecta : " + CarritoGolfDAO.actualizar(carritoActualizarSinId, con));

		System.out.println(" ");
		System.out.println("***********************PRUEBAS FRUTA***********************");
		System.out.println(" ");

		FrutaDO frutaConId = new FrutaDO(3, "Pistacho", 67, 33, "Seca");
		FrutaDO frutaSinId = new FrutaDO(55, "Pistacho", 29, 96, "Seca");

		FrutaDO frutaActualizarConId = new FrutaDO(5, "Nuez", 52, 22, "Seca");
		FrutaDO frutaActualizarSinId = new FrutaDO(80, "Nuez", 95, 40, "Seca");

		System.out.println("Pruebas eliminar correcta : " + FrutaDAO.eliminar(3, con));
		System.out.println("Pruebas eliminar incorrecta : " + FrutaDAO.eliminar(55, con));

		System.out.println("Pruebas cargar correcta : " + FrutaDAO.cargar(con, 5));
		System.out.println("Pruebas cargar incorrecta : " + FrutaDAO.cargar(con, 55));

		System.out.println("Pruebas insertar correcta : " + FrutaDAO.insertar(frutaSinId, con));
		System.out.println("Pruebas insertar incorrecta : " + FrutaDAO.insertar(frutaConId, con));

		System.out.println("Pruebas actualizar correcta : " + FrutaDAO.actualizar(frutaActualizarConId, con));
		System.out.println("Pruebas actualizar incorrecta : " + FrutaDAO.actualizar(frutaActualizarSinId, con));

		System.out.println(" ");
		System.out.println("***********************PRUEBAS KOALA***********************");
		System.out.println(" ");

		KoalaDO koalaConId = new KoalaDO(3, "Ashton", "amet", 51, "Verde", 23, 149, 5, 236, 3, 7);
		KoalaDO koalaSinId = new KoalaDO(135, "Ashton", "amet", 34, "Rosa", 86, 78, 3, 132, 3, 7);

		KoalaDO koalaActualizarConId = new KoalaDO(5, "Jonas", "odio", 54, "Morado", 73, 102, 8, 294, 5, 18);
		KoalaDO koalaActualizarSinId = new KoalaDO(800, "Jonas", "odio", 14, "Rosa", 58, 93, 6, 210, 5, 18);

		System.out.println("Pruebas eliminar correcta : " + KoalaDAO.eliminar(3, con));
		System.out.println("Pruebas eliminar incorrecta : " + KoalaDAO.eliminar(135, con));

		System.out.println("Pruebas cargar correcta : " + KoalaDAO.cargar(con, 5));
		System.out.println("Pruebas cargar incorrecta : " + KoalaDAO.cargar(con, 800));

		System.out.println("Pruebas insertar correcta : " + KoalaDAO.insertar(koalaSinId, con));
		System.out.println("Pruebas insertar incorrecta : " + KoalaDAO.insertar(koalaConId, con));

		System.out.println("Pruebas actualizar correcta : " + KoalaDAO.actualizar(koalaActualizarConId, con));
		System.out.println("Pruebas actualizar incorrecta : " + KoalaDAO.actualizar(koalaActualizarSinId, con));

		System.out.println("Pruebas cargarFrutas correcta : " + KoalaDAO.cargarFrutas(34, con));
		System.out.println("Pruebas cargarFrutas incorrecta : " + KoalaDAO.cargarFrutas(140, con));

		System.out.println(" ");
		System.out.println("***********************PRUEBAS AVESTRUZ***********************");
		System.out.println(" ");

		AvestruzDO avestruzConId = new AvestruzDO(3, "Beau", "Sed", 100, 256, 3, 25);
		AvestruzDO avestruzSinId = new AvestruzDO(15, "Beau", "Sed", 87, 200, 2, 19);

		AvestruzDO avestruzActualizarConId = new AvestruzDO(5, "Jared", "mollis", 109, 320, 1, 23);
		AvestruzDO avestruzActualizarSinId = new AvestruzDO(30, "Jared", "mollis", 71, 180, 3, 38);

		String[] paramCorrecto = { "edad", ">", "30", "entero" };
		String[] paramIncorrecto = { "edad", ">", "30", "cadena" };

		System.out.println("Pruebas eliminar correcta : " + AvestruzDAO.eliminar(3, con));
		System.out.println("Pruebas eliminar incorrecta : " + AvestruzDAO.eliminar(15, con));

		System.out.println("Pruebas cargar correcta : " + AvestruzDAO.cargar(con, 5));
		System.out.println("Pruebas cargar incorrecta : " + AvestruzDAO.cargar(con, 30));

		System.out.println(" ");

		System.out.println("Pruebas insertar correcta : " + AvestruzDAO.insertar(avestruzSinId, con));
		System.out.println("Pruebas insertar incorrecta : " + AvestruzDAO.insertar(avestruzConId, con));

		System.out.println(" ");

		System.out.println("Pruebas actualizar correcta : " + AvestruzDAO.actualizar(avestruzActualizarConId, con));
		System.out.println("Pruebas actualizar incorrecta : " + AvestruzDAO.actualizar(avestruzActualizarSinId, con));

		System.out.println(" ");

		System.out.println("Pruebas cargarLacayos correcta : " + AvestruzDAO.cargarLacayos(4, con));
		System.out.println("Pruebas cargarLacayos incorrecta : " + AvestruzDAO.cargarLacayos(40, con));

		System.out.println(" ");

		System.out.println("Pruebas cantidadFrutas correcta : " + AvestruzDAO.cantidadFrutas(2, con));
		System.out.println("Pruebas cantidadFrutas incorrecta : " + AvestruzDAO.cantidadFrutas(20, con));

		System.out.println(" ");

		System.out.println(
				"Pruebas cargarLacayosFiltrado correcta : " + AvestruzDAO.cargarLacayosFiltrado(con, 4, paramCorrecto));
		System.out.println("Pruebas cargarLacayosFiltrado incorrecta : "
				+ AvestruzDAO.cargarLacayosFiltrado(con, 4, paramIncorrecto));

		System.out.println(" ");

		System.out.println(
				"Pruebas cargarLacayosPaginado correcta : " + AvestruzDAO.cargarLacayosPaginado(con, 4, 10, 2));
		System.out.println(
				"Pruebas cargarLacayosPaginado incorrecta : " + AvestruzDAO.cargarLacayosPaginado(con, 4, 20, 2));
	}

}
