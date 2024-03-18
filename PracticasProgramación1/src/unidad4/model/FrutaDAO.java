package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FrutaDAO {
	/**
	 * Elimina un elemento de la tabla fruta que tenga el id dado
	 * 
	 * @param id  id de la fruta a borrar
	 * @param con
	 * @return 0 si se ha borrado, -1 si ha habido un error
	 */
	public static int eliminar(int id, Connection con) {
		try {
			// Hacemos la query para borrarlo
			String query = "DELETE FROM FRUTA WHERE idFruta = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id dado en el prepared statement para completar la query
			pstmt.setInt(1, id);

			int num = pstmt.executeUpdate();

			// Si es 0, devuelve -1 y si no es 0, devuelve 0
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
	 * @param fruta
	 * @param con
	 * @return 0 si se ha podido insertar y -1 sino
	 */
	public static int insertar(FrutaDO fruta, Connection con) {
		try {
			String query = "";

			// Comprobamos que el avestruz no es nulo.
			if (fruta == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (fruta.getNombre() == null || fruta.getTipo() == null)
				return -1;

			// Cargamos una fruta con el id dado para compararla y ver si es null
			FrutaDO frutaDelId = cargar(con, fruta.getIdFruta());

			if (fruta.getIdFruta() > 0) {
				if (frutaDelId != null && frutaDelId.getIdFruta() == fruta.getIdFruta()) {
					// Creamos la query sin el id
					query = "INSERT INTO FRUTA (nombre, danio, puntosRec, tipo) VALUES(?, ?, ?, ?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos dados en el prepared statement para completar la query, sin
					// el id porque ya existe y se pone en el siguiente libre
					pstmt.setString(1, fruta.getNombre());
					pstmt.setInt(2, fruta.getDanio());
					pstmt.setInt(3, fruta.getPuntosRec());
					pstmt.setString(4, fruta.getTipo());

					int num = pstmt.executeUpdate();

					if (num == 0)
						return -1;
					else
						return 0;
				} else {
					// Creamos la query con el id
					query = "INSERT INTO FRUTA (idFruta, nombre, danio, puntosRec, tipo) VALUES(?, ?, ?, ?, ?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos dados en el prepared statement para completar la query
					pstmt.setInt(1, fruta.getIdFruta());
					pstmt.setString(2, fruta.getNombre());
					pstmt.setInt(3, fruta.getDanio());
					pstmt.setInt(4, fruta.getPuntosRec());
					pstmt.setString(5, fruta.getTipo());

					int num = pstmt.executeUpdate();

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
	 * @param fruta
	 * @param con
	 * @return 0 si se ha actualizado, -1 sino
	 */

	public static int actualizar(FrutaDO fruta, Connection con) {
		try {
			String query = "UPDATE FRUTA SET ";

			// Comprobamos que el avestruz no es nulo.
			if (fruta == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (fruta.getNombre() == null || fruta.getTipo() == null)
				return -1;

			// Cargamos una fruta con el id dado para compararla y ver si es null
			FrutaDO frutaDelId = cargar(con, fruta.getIdFruta());

			if (fruta.getIdFruta() > 0) {
				if (frutaDelId != null && frutaDelId.getIdFruta() == fruta.getIdFruta()) {
					// Creamos la query con la condicion de que tenga el id dado
					query += "nombre = ?, danio = ?, puntosRec = ?, tipo = ? WHERE idFruta = ?";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos dados en el prepared statement para completar la query
					pstmt.setString(1, fruta.getNombre());
					pstmt.setInt(2, fruta.getDanio());
					pstmt.setInt(3, fruta.getPuntosRec());
					pstmt.setString(4, fruta.getTipo());
					pstmt.setInt(5, fruta.getIdFruta());

					int num = pstmt.executeUpdate();

					if (num == 0)
						return -1;
					else
						return 0;
				} else
					return -1;
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
	 * @return fruta que da como resultado
	 */
	public static FrutaDO cargar(Connection con, int id) {
		try {
			// Creamos la query con la condicion de que tenga el id dado
			String query = "SELECT * FROM FRUTA WHERE idFruta = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement para completar la query
			pstmt.setInt(1, id);

			// Creamos la fruta que devolveremos
			FrutaDO fruta = new FrutaDO();

			// Hacemos un resultset para conseguir los datos
			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			while (rs.next()) {
				// Si el id es 0, devolvemos null para no hacer más código innecesariamente
				if (rs.getInt(1) == 0)
					return null;
				else {
					// Insertamos los datos en la fruta
					fruta.setIdFruta(rs.getInt(1));
					fruta.setNombre(rs.getString(2));
					fruta.setDanio(rs.getInt(3));
					fruta.setPuntosRec(rs.getInt(4));
					fruta.setTipo(rs.getString(5));
				}
			}
			return fruta;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
