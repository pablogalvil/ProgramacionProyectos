package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AvestruzDAO {
	/**
	 * Elimina un elemento de la tabla avestruz que tenga el id dado
	 * 
	 * @param id  id del avestruz a borrar
	 * @param con
	 * @return 0 si se ha borrado, -1 si ha habido un error
	 */
	public static int eliminar(int id, Connection con) {
		try {

			Statement stmt = con.createStatement();

			int num = stmt.executeUpdate("DELETE FROM AVESTRUZ WHERE idAvestruz=" + id);

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
	 * @param avestruz
	 * @param con
	 * @return 1 si se ha podido insertar y 0 sino
	 */
	public static int insertar(AvestruzDO avestruz, Connection con) {
		try {
			String query = "";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (avestruz == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (avestruz.getNombre() == null)
				return 0;
			if (avestruz.getNickGuerra() == null)
				return 0;

			if (avestruz.getIdAvestruz() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM AVESTRUZ WHERE idAvestruz=" + avestruz.getIdAvestruz());
				if (rs == null) {
					query = "INSERT INTO AVESTRUZ VALUES(idAvestruz, nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos) ("
							+ avestruz.getIdAvestruz();
					query += ",'" + avestruz.getNombre();
					query += "','" + avestruz.getNickGuerra();
					query += "'," + avestruz.getEdad();
					query += "," + avestruz.getAltura();
					query += "," + avestruz.getNivelMalaLeche();
					query += "," + avestruz.getNumHuevos() + ")";
				} else {
					query = "INSERT INTO AVESTRUZ VALUES(idAvestruz, nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos) ('"
							+ avestruz.getNombre();
					query += "','" + avestruz.getNickGuerra();
					query += "'," + avestruz.getEdad();
					query += "," + avestruz.getAltura();
					query += "," + avestruz.getNivelMalaLeche();
					query += "," + avestruz.getNumHuevos() + ")";
				}
			}

			int num = stmt.executeUpdate(query);

			return num;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int actualizar(AvestruzDO avestruz, Connection con) {
		try {
			String query = "";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (avestruz == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (avestruz.getNombre() == null)
				return 0;
			if (avestruz.getNickGuerra() == null)
				return 0;

			if (avestruz.getIdAvestruz() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM AVESTRUZ WHERE idAvestruz=" + avestruz.getIdAvestruz());
				if (rs == null) {
					query = "UPDATE AVESTRUZ SET idAvestruz=, nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos"
							+ avestruz.getIdAvestruz();
					query += ",'" + avestruz.getNombre();
					query += "','" + avestruz.getNickGuerra();
					query += "'," + avestruz.getEdad();
					query += "," + avestruz.getAltura();
					query += "," + avestruz.getNivelMalaLeche();
					query += "," + avestruz.getNumHuevos() + "";
				} else {
					return 0;
				}
			}

			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
