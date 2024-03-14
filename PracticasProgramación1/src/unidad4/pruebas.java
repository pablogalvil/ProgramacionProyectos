package unidad4;

import java.sql.Connection;

import unidad4.model.CarritoGolfDAO;
import unidad4.model.CarritoGolfDO;
import unidad4.utils.UtilsBD;

public class pruebas {

	public static void main(String[] args) {
		Connection con = UtilsBD.conectarBD();
		System.out.println("***********************PRUEBAS CARRITO GOLF***********************");
		CarritoGolfDO carritoConId = new CarritoGolfDO(3, "X8245KG-RB4868", "Citroen", 267, 3, 368);
		CarritoGolfDO carritoSinId = new CarritoGolfDO(25, "W6432LF-BD3285", "Renault", 223, 5, 750);

		System.out.println("Pruebas eliminar correcta : " + CarritoGolfDAO.eliminar(3, con));
		System.out.println("Pruebas eliminar incorrecta : " + CarritoGolfDAO.eliminar(25, con));

		System.out.println("Pruebas cargar correcta : " + CarritoGolfDAO.cargar(con, 5));
		System.out.println("Pruebas cargar incorrecta : " + CarritoGolfDAO.cargar(con, 35));

		System.out.println("Pruebas insertar correcta : " + CarritoGolfDAO.insertar(carritoSinId, con));
		System.out.println("Pruebas insertar incorrecta : " + CarritoGolfDAO.insertar(carritoConId, con));
	}

}
