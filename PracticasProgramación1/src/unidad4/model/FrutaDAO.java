package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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

			Statement stmt = con.createStatement();

			int num = stmt.executeUpdate("DELETE FROM FRUTA WHERE idFruta=" + id);

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
	 * @param fruta
	 * @param con
	 * @return 1 si se ha podido insertar y 0 sino
	 */
	public static int insertar(FrutaDO fruta, Connection con) {
		try {
			String query = "";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (fruta == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (fruta.getNombre() == null)
				return 0;

			if (fruta.getIdFruta() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM FRUTA WHERE idFruta=" + fruta.getIdFruta());
				if (rs == null) {
					query = "INSERT INTO FRUTA VALUES(idFruta, nombre, danio, puntosRec, tipo) (" + fruta.getIdFruta();
					query += ",'" + fruta.getNombre();
					query += "'," + fruta.getDanio();
					query += "," + fruta.getPuntosRec();
					query += "," + fruta.getTipo() + ")";
				} else {
					query = "INSERT INTO FRUTA VALUES(idFruta, nombre, danio, puntosRec, tipo) (" + fruta.getNombre();
					query += "'," + fruta.getDanio();
					query += "," + fruta.getPuntosRec();
					query += "," + fruta.getTipo() + ")";
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
	 * @param fruta
	 * @param con
	 * @return 1 si se ha actualizado, 0 sino
	 */

	public static int actualizar(FrutaDO fruta, Connection con) {
		try {
			String query = "UPDATE FRUTA SET ";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (fruta == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (fruta.getNombre() == null)
				return 0;

			if (fruta.getIdFruta() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM FRUTA WHERE idFruta=" + fruta.getIdFruta());
				if (rs != null) {
					query += "nombre=" + fruta.getNombre();
					query += ", danio=" + fruta.getDanio();
					query += ", puntosRec=" + fruta.getPuntosRec();
					query += ", tipo=" + fruta.getTipo();
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
	 * @return fruta que da como resultado
	 */
	public static FrutaDO cargar(Connection con, int id) {
		try {
			Statement stmt = con.createStatement();
			FrutaDO fruta = new FrutaDO();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FRUTA WHERE idFruta=" + id);
			while (rs.next()) {
				fruta.setIdFruta(rs.getInt(1));
				fruta.setNombre(rs.getString(2));
				fruta.setDanio(rs.getInt(3));
				fruta.setPuntosRec(rs.getInt(4));
				fruta.setTipo(rs.getInt(5));
			}
			return fruta;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
