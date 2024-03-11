package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CarritoGolfDAO {
	/**
	 * Elimina un elemento de la tabla carritoGolf que tenga el id dado
	 * 
	 * @param id  id del carrito de golf a borrar
	 * @param con
	 * @return 0 si se ha borrado, -1 si ha habido un error
	 */
	public static int eliminar(int id, Connection con) {
		try {

			Statement stmt = con.createStatement();

			int num = stmt.executeUpdate("DELETE FROM CARRITOGOLF WHERE idCarritoGolf=" + id);

			return num;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * inserta en BD el elemento DO que se le introduce de su tipo, comprobará que
	 * no es nulo y que tiene datos en todos los campos. Si el elemento tiene el id
	 * no nulo, comprobará en BD si ya hay un registro con dicho id antes de
	 * insertarlo. Si no hay id en DO o en Bd hay un registro con dicho id,
	 * insertará el registro sin poner el campo id para que utilice el siguiente id
	 * posible (id debe de ser autoincremental).
	 * 
	 * @param carritoGolf
	 * @param con
	 * @return 1 si se ha podido insertar y 0 sino
	 */
	public static int insertar(CarritoGolfDO carritoGolf, Connection con) {
		try {
			String query = "";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (carritoGolf == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (carritoGolf.getNumSerie() == null)
				return 0;
			if (carritoGolf.getMarca() == null)
				return 0;

			if (carritoGolf.getIdCarritoGolf() != 0) {
				ResultSet rs = stmt.executeQuery(
						"SELECT * FROM CARRITOGOLF WHERE idCarritoGolf=" + carritoGolf.getIdCarritoGolf());
				if (rs == null) {
					query = "INSERT INTO CARRITOGOLF VALUES(idCarritoGolf, numSerie, marca, velocidadMax, armamento, municion) ("
							+ carritoGolf.getIdCarritoGolf();
					query += ",'" + carritoGolf.getNumSerie();
					query += "','" + carritoGolf.getMarca();
					query += "'," + carritoGolf.getVelocidadMax();
					query += "," + carritoGolf.getArmamento();
					query += "," + carritoGolf.getMunicion() + ")";
				} else {
					query = "INSERT INTO CARRITOGOLF VALUES(idCarritoGolf, numSerie, marca, velocidadMax, armamento, municion) ('"
							+ carritoGolf.getNumSerie();
					query += "','" + carritoGolf.getMarca();
					query += "'," + carritoGolf.getVelocidadMax();
					query += "," + carritoGolf.getArmamento();
					query += "," + carritoGolf.getMunicion() + ")";
				}
			}

			int num = stmt.executeUpdate(query);

			return num;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * int actualizar(elementoDO,Connection con), actualiza en BD el elemento DO que
	 * se le introduce de su tipo, comprobará que no es nulo y que tiene datos en
	 * todos los campos. Si el elemento tiene el id no nulo, comprobará en BD si ya
	 * hay un registro con dicho id antes de actualizarlo. Es obligatorio que el DO
	 * tenga el id.
	 * 
	 * @param carritoGolf
	 * @param con
	 * @return 1 si se ha actualizado, 0 sino
	 */

	public static int actualizar(CarritoGolfDO carritoGolf, Connection con) {
		try {
			String query = "UPDATE CARRITOGOLF SET ";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (carritoGolf == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (carritoGolf.getNumSerie() == null)
				return 0;
			if (carritoGolf.getMarca() == null)
				return 0;

			if (carritoGolf.getIdCarritoGolf() != 0) {
				ResultSet rs = stmt.executeQuery(
						"SELECT * FROM CARRITOGOLF WHERE idCarritoGolf=" + carritoGolf.getIdCarritoGolf());
				if (rs != null) {
					query += "numSerie=" + carritoGolf.getNumSerie();
					query += ", marca=" + carritoGolf.getMarca();
					query += ", velocidadMax=" + carritoGolf.getVelocidadMax();
					query += ", armamento=" + carritoGolf.getArmamento();
					query += ", municion=" + carritoGolf.getMunicion();
					query += " WHERE idCarritoGolf=" + carritoGolf.getIdCarritoGolf();
				} else {
					return 0;
				}
			}
			int num = stmt.executeUpdate(query);

			return num;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * realizará una consulta en la tabla correspondiente para recuperar el
	 * elementoDO con el código introducida y devolverá un objeto elementoDO con los
	 * datos de dicha consulta.
	 * 
	 * @param con
	 * @param id  del elemento
	 * @return Carrito de golf que da como resultado
	 */
	public static CarritoGolfDO cargar(Connection con, int id) {
		try {
			Statement stmt = con.createStatement();
			CarritoGolfDO carritoGolf = new CarritoGolfDO();
			ResultSet rs = stmt.executeQuery("SELECT * FROM CARRITOGOLF WHERE idCarritoGolf=" + id);
			while (rs.next()) {
				carritoGolf.setIdCarritoGolf(rs.getInt(1));
				carritoGolf.setNumSerie(rs.getString(2));
				carritoGolf.setMarca(rs.getString(3));
				carritoGolf.setVelocidadMax(rs.getInt(4));
				carritoGolf.setArmamento(rs.getInt(5));
				carritoGolf.setMunicion(rs.getInt(6));
			}
			return carritoGolf;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
