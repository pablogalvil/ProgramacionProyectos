package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
			String query = "DELETE FROM AVESTRUZ WHERE idAvestruz = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, id);

			int num = pstmt.executeUpdate();

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
	 * @param avestruz
	 * @param con
	 * @return 1 si se ha podido insertar y 0 sino
	 */
	public static int insertar(AvestruzDO avestruz, Connection con) {
		try {
			String query = "";

			// Comprobamos que el avestruz no es nulo.
			if (avestruz == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (avestruz.getNombre() == null || avestruz.getNickGuerra() == null)
				return 0;

			AvestruzDO avestruzDelId = cargar(con, avestruz.getIdAvestruz());

			if (avestruz.getIdAvestruz() != 0) {
				if (avestruzDelId != null && avestruzDelId.getIdAvestruz() == avestruz.getIdAvestruz()) {
					query = "INSERT INTO AVESTRUZ (nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos) VALUES (?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					pstmt.setString(1, avestruz.getNombre());
					pstmt.setString(2, avestruz.getNickGuerra());
					pstmt.setInt(3, avestruz.getEdad());
					pstmt.setInt(4, avestruz.getAltura());
					pstmt.setInt(5, avestruz.getNivelMalaLeche());
					pstmt.setInt(6, avestruz.getNumHuevos());

					int num = pstmt.executeUpdate();

					return num;
				} else {
					query = "INSERT INTO AVESTRUZ (idAvestruz, nombre, nickGuerra, edad, altura, nivelMalaLeche, numHuevos) VALUES (?,?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					pstmt.setInt(1, avestruz.getIdAvestruz());
					pstmt.setString(2, avestruz.getNombre());
					pstmt.setString(3, avestruz.getNickGuerra());
					pstmt.setInt(4, avestruz.getEdad());
					pstmt.setInt(5, avestruz.getAltura());
					pstmt.setInt(6, avestruz.getNivelMalaLeche());
					pstmt.setInt(7, avestruz.getNumHuevos());

					int num = pstmt.executeUpdate();

					return num;
				}
			} else
				return 0;
		} catch (SQLException e) {
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

			// Comprobamos que el avestruz no es nulo.
			if (avestruz == null)
				return 0;
			// Comprobamos que los campos con string no son nulos
			if (avestruz.getNombre() == null || avestruz.getNickGuerra() == null)
				return 0;

			AvestruzDO avestruzDelId = cargar(con, avestruz.getIdAvestruz());

			if (avestruz.getIdAvestruz() != 0) {
				if (avestruzDelId != null && avestruzDelId.getIdAvestruz() == avestruz.getIdAvestruz()) {
					query += "nombre = ?, nickGuerra = ?, edad = ?, altura = ?, nivelMalaLeche = ?, numHuevos = ? WHERE idAvestruz = ?";

					PreparedStatement pstmt = con.prepareStatement(query);

					pstmt.setString(1, avestruz.getNombre());
					pstmt.setString(2, avestruz.getNickGuerra());
					pstmt.setInt(3, avestruz.getEdad());
					pstmt.setInt(4, avestruz.getAltura());
					pstmt.setInt(5, avestruz.getNivelMalaLeche());
					pstmt.setInt(6, avestruz.getNumHuevos());
					pstmt.setInt(7, avestruz.getIdAvestruz());

					int num = pstmt.executeUpdate();

					return num;
				} else {
					return 0;
				}
			} else
				return 0;

		} catch (SQLException e) {
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
			String query = "SELECT * FROM AVESTRUZ WHERE idAvestruz = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, id);

			AvestruzDO avestruz = new AvestruzDO();

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				if (rs.getInt(1) == 0)
					return null;
				else {
					avestruz.setIdAvestruz(rs.getInt(1));
					avestruz.setNombre(rs.getString(2));
					avestruz.setNickGuerra(rs.getString(3));
					avestruz.setEdad(rs.getInt(4));
					avestruz.setAltura(rs.getInt(5));
					avestruz.setNivelMalaLeche(rs.getInt(6));
					avestruz.setNumHuevos(rs.getInt(7));
				}
			}
			return avestruz;
		} catch (SQLException e) {
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
			String query = "SELECT * FROM KOALA WHERE avestruz_idAvestruz = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, idAvestruz);
			ArrayList<KoalaDO> koalas = new ArrayList<KoalaDO>();
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				KoalaDO koala = new KoalaDO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11));
				koalas.add(koala);
			}
			return koalas;
		} catch (SQLException e) {
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
			String query = "SELECT SUM(cantidad) FROM KOALA_HAS_FRUTA WHERE koala_avestruz_idAvestruz = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, idAvestruz);

			ResultSet rs = pstmt.executeQuery();

			int resultado = rs.getInt(1);

			return resultado;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * Este módulo devolverá todos los Koalas asociados a un avestruz en arraylist
	 * de objetos KoalaDO que cumplan una condición. Para ello realizará una select
	 * cruzada en koalas mostrando sólo los que que pertenezcan al avestruz con id
	 * introducido, y que cumplan la condición que se le pasa en el array
	 * parámetros. Dicho array tendrá 4 Strings: campo,comparación,valor, tipo_dato.
	 * Por ejemplo el array podría llegar con los valores {“edad”,”>”,”18”,”entero”)
	 * y deberá crear la query que muestre sólo los mayores de 18. Comprobará que el
	 * dato concuerde con el tipo de dato introducido, que el campo de la BD exista
	 * en la tabla koalas y podrá admitir 4 operadores de comparación, >,<,= y like.
	 * 
	 * @param con
	 * @param idAvestruz
	 * @param parametros
	 * @return koalas
	 */
	public static ArrayList<KoalaDO> cargarLacayosFiltrado(Connection con, int idAvestruz, String[] parametros) {
		try {
			String query = "SELECT * FROM KOALA WHERE avestruz_idAvestruz=" + idAvestruz + " AND";
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
				try {
					int num = Integer.valueOf(param2);
					return null;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					query += " " + param2;
				}
				break;
			default:
				return null;
			}
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				KoalaDO koala = new KoalaDO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11));
				koalas.add(koala);
			}
			return koalas;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * La función será igual que cargarLacayos, sólo que devolverá solo una cantidad
	 * limitada de lacayos en lugar de todos, esa cantidad viene especificada por el
	 * parámetro numElem. Por otra parte, deberá devolver los lacayos de la página
	 * numPag que recibe como parámetro.
	 * 
	 * Ejemplos de funcionamiento:
	 * 
	 * numElem=20 , numPag1 => rango de koalas del 1 al 19
	 * 
	 * numElem=20 , numPag2 => rango de koalas del 20 al 39
	 * 
	 * numElem=30 , numPag3 => rango de koalas del 60 al 89
	 * 
	 * numElem=10 , numPag4 => rango de koalas del 30 al 39
	 * 
	 * Para conseguirlo se utilizará las palabras reservadas de sql limit para
	 * limitar la cantidad de registros y offset para indicar a partir de que
	 * registro se va a empezar a sacar.
	 * 
	 * @param con
	 * @param idAvestruz
	 * @param numElem
	 * @param numPag
	 * @return koalas
	 */
	public static ArrayList<KoalaDO> cargarLacayosPaginado(Connection con, int idAvestruz, int numElem, int numPag) {
		try {
			String query = "SELECT * FROM KOALA WHERE avestruz_idAvestruz = ? LIMIT ? OFFSET ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, idAvestruz);
			pstmt.setInt(2, numElem);
			pstmt.setInt(3, (numElem * (numPag - 1)));

			ArrayList<KoalaDO> koalas = new ArrayList<KoalaDO>();

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				KoalaDO koala = new KoalaDO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
						rs.getInt(11));
				koalas.add(koala);
			}

			return koalas;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
