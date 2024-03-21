package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			// Creamos la query con la condicion de que tenga el id dado
			String query = "DELETE FROM CARRITOGOLF WHERE idCarritoGolf = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement para completar la query
			pstmt.setInt(1, id);

			int num = pstmt.executeUpdate();

			// Si el num es 0, devuelve -1, sino, devuelve 0
			if (num == 0)
				return -1;
			else
				return 0;
		} catch (SQLException e) {
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
	 * @return 0 si se ha podido insertar y -1 sino
	 */
	public static int insertar(CarritoGolfDO carritoGolf, Connection con) {
		try {
			String query = "";

			// Comprobamos que el carrito no es nulo.
			if (carritoGolf == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (carritoGolf.getNumSerie() == null || carritoGolf.getMarca() == null)
				return -1;

			// Creamos un carrito con el id dado para compararlo y ver si es null
			CarritoGolfDO carritoDelId = cargar(con, carritoGolf.getIdCarritoGolf());

			if (carritoGolf.getIdCarritoGolf() > 0) {
				if (carritoDelId != null && carritoDelId.getIdCarritoGolf() == carritoGolf.getIdCarritoGolf()) {
					// Creamos la query sin el id
					query = "INSERT INTO CARRITOGOLF (numSerie, marca, velocidadMax, armamento, municion) VALUES (?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos en el prepared statement
					pstmt.setString(1, carritoGolf.getNumSerie());
					pstmt.setString(2, carritoGolf.getMarca());
					pstmt.setInt(3, carritoGolf.getVelocidadMax());
					pstmt.setInt(4, carritoGolf.getArmamento());
					pstmt.setInt(5, carritoGolf.getMunicion());

					int num = pstmt.executeUpdate();

					// Si el num es 0, devuelve -1, sino, devuelve 0
					if (num == 0)
						return -1;
					else
						return 0;
				} else {
					// Creamos la query con el id
					query = "INSERT INTO CARRITOGOLF (idCarritoGolf, numSerie, marca, velocidadMax, armamento, municion) VALUES (?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos en el prepared statement
					pstmt.setInt(1, carritoGolf.getIdCarritoGolf());
					pstmt.setString(2, carritoGolf.getNumSerie());
					pstmt.setString(3, carritoGolf.getMarca());
					pstmt.setInt(4, carritoGolf.getVelocidadMax());
					pstmt.setInt(5, carritoGolf.getArmamento());
					pstmt.setInt(6, carritoGolf.getMunicion());

					int num = pstmt.executeUpdate();

					// Si el num es 0, devuelve -1, sino, devuelve 0
					if (num == 0)
						return -1;
					else
						return 0;
				}
			} else
				return -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
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
	 * @return 0 si se ha actualizado, -1 sino
	 */

	public static int actualizar(CarritoGolfDO carritoGolf, Connection con) {
		try {
			String query = "UPDATE CARRITOGOLF SET ";

			// Comprobamos que el carrito no es nulo.
			if (carritoGolf == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (carritoGolf.getNumSerie() == null || carritoGolf.getMarca() == null)
				return -1;

			// Creamos un carrito con el id dado para compararlo y ver si es null
			CarritoGolfDO carritoDelId = cargar(con, carritoGolf.getIdCarritoGolf());

			if (carritoGolf.getIdCarritoGolf() > 0) {
				if (carritoDelId != null && carritoDelId.getIdCarritoGolf() == carritoGolf.getIdCarritoGolf()) {
					// Creamos la query con la condicion de que tenga el id del carrito dado
					query += "numSerie = ?, marca = ?, velocidadMax = ?, armamento = ?, municion = ? WHERE idCarritoGolf = ?";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos en el prepared statement
					pstmt.setString(1, carritoGolf.getNumSerie());
					pstmt.setString(2, carritoGolf.getMarca());
					pstmt.setInt(3, carritoGolf.getVelocidadMax());
					pstmt.setInt(4, carritoGolf.getArmamento());
					pstmt.setInt(5, carritoGolf.getMunicion());
					pstmt.setInt(6, carritoGolf.getIdCarritoGolf());

					int num = pstmt.executeUpdate();

					// Si el num es 0, devuelve -1, sino, devuelve 0
					if (num == 0)
						return -1;
					else
						return 0;
				} else {
					return -1;
				}
			} else
				return -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
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
			// Creamos la query con la condicion de que tenga el id dado
			String query = "SELECT * FROM CARRITOGOLF WHERE idCarritoGolf = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement
			pstmt.setInt(1, id);

			// Creamos el carrito que devolveremos
			CarritoGolfDO carritoGolf = new CarritoGolfDO();

			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			while (rs.next()) {
				// Si el id es 0, devolvemos null para no hacer más código innecesariamente
				if (rs.getInt(1) == 0)
					return null;
				else {
					// Insertamos los datos en el carrito
					carritoGolf.setIdCarritoGolf(rs.getInt(1));
					carritoGolf.setNumSerie(rs.getString(2));
					carritoGolf.setMarca(rs.getString(3));
					carritoGolf.setVelocidadMax(rs.getInt(4));
					carritoGolf.setArmamento(rs.getInt(5));
					carritoGolf.setMunicion(rs.getInt(6));
				}
			}
			return carritoGolf;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
