package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class KoalaDAO {
	/**
	 * Elimina un elemento de la tabla koala que tenga el id dado
	 * 
	 * @param id  id del koala a borrar
	 * @param con
	 * @return 0 si se ha borrado, -1 si ha habido un error
	 */
	public static int eliminar(int id, Connection con) {
		try {

			Statement stmt = con.createStatement();

			int num = stmt.executeUpdate("DELETE FROM KOALA WHERE idKoala=" + id);

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
	 * @param koala
	 * @param con
	 * @return 1 si se ha podido insertar y 0 sino
	 */
	public static int insertar(KoalaDO koala, Connection con) {
		try {
			String query = "";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (koala == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (koala.getNombre() == null)
				return 0;
			if (koala.getNickGuerra() == null)
				return 0;
			if (koala.getColor() == null)
				return 0;

			if (koala.getIdKoala() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM KOALA WHERE idKoala=" + koala.getIdKoala());
				if (rs == null) {
					query = "INSERT INTO KOALA VALUES(idKoala, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueno, tiempoBerserk, avestruz_idAvestruz, carritoGolf_idCarritoGolf) ("
							+ koala.getIdKoala();
					query += ",'" + koala.getNombre();
					query += "','" + koala.getNickGuerra();
					query += "'," + koala.getEdad();
					query += ",'" + koala.getColor();
					query += "'," + koala.getFuerza();
					query += "," + koala.getInteligencia();
					query += "," + koala.getHorasSueno();
					query += "," + koala.getTiempoBerserk();
					query += "," + koala.getAvestruz_idAvestruz();
					query += "," + koala.getCarritoGolf_idCarritoGolf() + ")";
				} else {
					query = "INSERT INTO KOALA VALUES(idKoala, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueno, tiempoBerserk, avestruz_idAvestruz, carritoGolf_idCarritoGolf) ('"
							+ koala.getNombre();
					query += "','" + koala.getNickGuerra();
					query += "'," + koala.getEdad();
					query += ",'" + koala.getColor();
					query += "'," + koala.getFuerza();
					query += "," + koala.getInteligencia();
					query += "," + koala.getHorasSueno();
					query += "," + koala.getTiempoBerserk();
					query += "," + koala.getAvestruz_idAvestruz();
					query += "," + koala.getCarritoGolf_idCarritoGolf() + ")";
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
	 * @param koala
	 * @param con
	 * @return 1 si se ha actualizado, 0 sino
	 */

	public static int actualizar(KoalaDO koala, Connection con) {
		try {
			String query = "UPDATE KOALA SET ";

			Statement stmt = con.createStatement();

			// Comprobamos que el avestruz no es nulo.
			if (koala == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (koala.getNombre() == null)
				return 0;
			if (koala.getNickGuerra() == null)
				return 0;
			if (koala.getColor() == null)
				return 0;

			if (koala.getIdKoala() != 0) {
				ResultSet rs = stmt.executeQuery("SELECT * FROM KOALA WHERE idKoala=" + koala.getIdKoala());
				if (rs != null) {
					query += "nombre=" + koala.getNombre();
					query += ", nickGuerra=" + koala.getNickGuerra();
					query += ", edad=" + koala.getEdad();
					query += ", color=" + koala.getColor();
					query += ", fuerza=" + koala.getFuerza();
					query += ", inteligencia=" + koala.getInteligencia();
					query += ", horasSueno=" + koala.getHorasSueno();
					query += ", tiempoBerserk=" + koala.getTiempoBerserk();
					query += ", avestruz_idAvestruz=" + koala.getAvestruz_idAvestruz();
					query += ", carritoGolf_idCarritoGolf=" + koala.getCarritoGolf_idCarritoGolf();
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
	 * @return koala que da como resultado
	 */
	public static KoalaDO cargar(Connection con, int id) {
		try {
			Statement stmt = con.createStatement();
			KoalaDO koala = new KoalaDO();
			ResultSet rs = stmt.executeQuery("SELECT * FROM KOALA WHERE idKoala=" + id);
			while (rs.next()) {
				koala.setIdKoala(rs.getInt(1));
				koala.setNombre(rs.getString(2));
				koala.setNickGuerra(rs.getString(3));
				koala.setEdad(rs.getInt(4));
				koala.setColor(rs.getString(5));
				koala.setFuerza(rs.getInt(6));
				koala.setInteligencia(rs.getInt(7));
				koala.setHorasSueno(rs.getInt(8));
				koala.setTiempoBerserk(rs.getInt(9));
				koala.setAvestruz_idAvestruz(rs.getInt(10));
				koala.setCarritoGolf_idCarritoGolf(rs.getInt(11));
			}
			return koala;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
