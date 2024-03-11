package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

	/**
	 * int actualizar(elementoDO,Connection con), actualiza en BD el elemento DO que
	 * se le introduce de su tipo, comprobará que no es nulo y que tiene datos en
	 * todos los campos. Si el elemento tiene el id no nulo, comprobará en BD si ya
	 * hay un registro con dicho id antes de actualizarlo. Es obligatorio que el DO
	 * tenga el id.
	 * 
	 * @param avestruz
	 * @param con
	 * @return 1 si se ha actualizado, 0 sino
	 */

	public static int actualizar(AvestruzDO avestruz, Connection con) {
		try {
			String query = "UPDATE AVESTRUZ SET ";

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
				if (rs != null) {
					query += "nombre=" + avestruz.getNombre();
					query += ", nickGuerra=" + avestruz.getNickGuerra();
					query += ", edad=" + avestruz.getEdad();
					query += ", altura=" + avestruz.getAltura();
					query += ", nivelMalaLeche=" + avestruz.getNivelMalaLeche();
					query += ", numHuevos=" + avestruz.getNumHuevos();
					query += " WHERE idAvestruz=" + avestruz.getIdAvestruz();
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
	 * @return avestruz que da como resultado
	 */
	public static AvestruzDO cargar(Connection con, int id) {
		try {
			Statement stmt = con.createStatement();
			AvestruzDO avestruz = new AvestruzDO();
			ResultSet rs = stmt.executeQuery("SELECT * FROM AVESTRUZ WHERE idAvestruz=" + id);
			while (rs.next()) {
				avestruz.setIdAvestruz(rs.getInt(1));
				avestruz.setNombre(rs.getString(2));
				avestruz.setNickGuerra(rs.getString(3));
				avestruz.setEdad(rs.getInt(4));
				avestruz.setAltura(rs.getInt(5));
				avestruz.setNivelMalaLeche(rs.getInt(6));
				avestruz.setNumHuevos(rs.getInt(7));
			}
			return avestruz;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Este módulo devolverá todos los Koalas asociados a un avestruz en arraylist
	 * de objetos KoalaDO. Para ello realizará una select cruzada en koalas
	 * mostrando sólo los que que pertenezcan al avestruz con id introducido, y para
	 * cada registro creará un objeto de tipo carreraVO con sus datos y lo agrega al
	 * ArrayList.
	 * 
	 * @param idAvestruz
	 * @param con
	 * @return lista con todos los koalas
	 */
	public static ArrayList<KoalaDO> cargarLacayos(int idAvestruz, Connection con) {
		try {
			Statement stmt = con.createStatement();
			ArrayList<KoalaDO> koalas = new ArrayList<KoalaDO>();
			ResultSet rs = stmt.executeQuery("SELECT * FROM KOALA WHERE avestruz_idAvestruz=" + idAvestruz);
			while (rs.next()) {
				KoalaDO koala = new KoalaDO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11));
				koalas.add(koala);
			}
			return koalas;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Devolverá el número de frutas que puede disparar el regimiento del avestruz
	 * cuyo id se introduce como parámetro. (utilizar sum() de sql obligatorio)
	 * 
	 * @param idAvestruz
	 * @param con
	 * @return la suma de la cantidad de frutas que tienen todos los koalas de dicho
	 *         avestruz
	 */
	public static int cantidadFrutas(int idAvestruz, Connection con) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT SUM(cantidad) FROM KOALA_HAS_FRUTA WHERE koala_avestruz_idAvestruz=" + idAvestruz);
			int resultado = rs.getInt(1);
			return resultado;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	public static ArrayList<KoalaDO> cargarLacayosFiltrado(Connection con, int idAvestruz, String[] parametros) {
		try {
			String query = "SELECT * FROM KOALA WHERE avestruz_idAvestruz=" + idAvestruz + " AND";
			Statement stmt = con.createStatement();
			ArrayList<KoalaDO> koalas = new ArrayList<KoalaDO>();
			String param0 = parametros[0];
			if (param0.equals("idKoala") || param0.equals("nombre") || param0.equals("nickGuerra")
					|| param0.equals("edad") || param0.equals("color") || param0.equals("fuerza")
					|| param0.equals("inteligencia") || param0.equals("horasSueno") || param0.equals("tiempoBerserk")
					|| param0.equals("avestruz_idAvestruz") || param0.equals("carritoGolf_idCarritoGolf")) {
				query += " " + param0;
			} else
				return null;
			String param1 = parametros[1];
			// Miramos si el comparador es correcto, en el like lo pongo toLowerCase() por
			// si lo introduce en mayusculas
			if (param1.equals(">") || param1.equals("<") || param1.equals("=") || param1.toLowerCase().equals("like")) {
				query += " " + param1;
			} else
				return null;
			String param2 = parametros[2];
			String param3 = parametros[3].toLowerCase();
			switch (param3) {
			case "entero":
				try {
					int num = Integer.valueOf(param2);
					query += " " + num;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return null;
				}
				break;
			case "decimal":
				try {
					double num = Double.parseDouble(param2);
					query += " " + num;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return null;
				}
				break;
			case "cadena":
				if (param2 instanceof String)
					query += " " + param2;
				break;
			default:
				return null;
			}
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				KoalaDO koala = new KoalaDO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11));
				koalas.add(koala);
			}
			return koalas;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
