package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			// Creamos la query con la condicion de que tenga el id dado
			String query = "DELETE FROM KOALA WHERE idKoala = ?";

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
	 * @param koala
	 * @param con
	 * @return 0 si se ha podido insertar y -1 sino
	 */
	public static int insertar(KoalaDO koala, Connection con) {
		try {
			String query = "";

			// Comprobamos que el avestruz no es nulo.
			if (koala == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (koala.getNombre() == null || koala.getNickGuerra() == null || koala.getColor() == null)
				return -1;

			// Cargamos un koala con el id dado para compararlo y ver si es null
			KoalaDO koalaDelId = cargar(con, koala.getIdKoala());

			if (koala.getIdKoala() > 0) {
				if (koalaDelId != null && koalaDelId.getIdKoala() == koala.getIdKoala()) {
					// Creamos la query sin el id
					query = "INSERT INTO KOALA (nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueno, tiempoBerserk, avestruz_idAvestruz, carritoGolf_idCarritoGolf) VALUES (?,?,?,?,?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Insertamos los datos en el prepared statement
					pstmt.setString(1, koala.getNombre());
					pstmt.setString(2, koala.getNickGuerra());
					pstmt.setInt(3, koala.getEdad());
					pstmt.setString(4, koala.getColor());
					pstmt.setInt(5, koala.getFuerza());
					pstmt.setInt(6, koala.getInteligencia());
					pstmt.setInt(7, koala.getHorasSueno());
					pstmt.setInt(8, koala.getTiempoBerserk());
					pstmt.setInt(9, koala.getAvestruz_idAvestruz());
					pstmt.setInt(10, koala.getCarritoGolf_idCarritoGolf());

					int num = pstmt.executeUpdate();

					// Si el num es 0, devuelve -1, sino, devuelve 0
					if (num == 0)
						return -1;
					else
						return 0;
				} else {
					// Creamos la query con el id
					query = "INSERT INTO KOALA (idKoala, nombre, nickGuerra, edad, color, fuerza, inteligencia, horasSueno, tiempoBerserk, avestruz_idAvestruz, carritoGolf_idCarritoGolf) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Insertamos los datos en el prepared statement
					pstmt.setInt(1, koala.getIdKoala());
					pstmt.setString(2, koala.getNombre());
					pstmt.setString(3, koala.getNickGuerra());
					pstmt.setInt(4, koala.getEdad());
					pstmt.setString(5, koala.getColor());
					pstmt.setInt(6, koala.getFuerza());
					pstmt.setInt(7, koala.getInteligencia());
					pstmt.setInt(8, koala.getHorasSueno());
					pstmt.setInt(9, koala.getTiempoBerserk());
					pstmt.setInt(10, koala.getAvestruz_idAvestruz());
					pstmt.setInt(11, koala.getCarritoGolf_idCarritoGolf());

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
	 * @param koala
	 * @param con
	 * @return 0 si se ha actualizado, -1 sino
	 */

	public static int actualizar(KoalaDO koala, Connection con) {
		try {
			String query = "UPDATE KOALA SET ";

			// Comprobamos que el avestruz no es nulo.
			if (koala == null)
				return -1;
			// Comprobamos que los campos con string no son nulos
			if (koala.getNombre() == null || koala.getNickGuerra() == null || koala.getColor() == null)
				return -1;

			// Creamos un koala con el id dado para compararlo y ver si es null
			KoalaDO koalaDelId = cargar(con, koala.getIdKoala());

			if (koala.getIdKoala() > 0) {
				if (koalaDelId != null && koalaDelId.getIdKoala() == koala.getIdKoala()) {
					// Creamos la query sin el id
					query += "nombre = ?, nickGuerra = ?, edad = ?, color = ?, fuerza = ?, inteligencia = ?, horasSueno = ?, tiempoBerserk = ?, avestruz_idAvestruz = ?, carritoGolf_idCarritoGolf = ? WHERE idKoala = ?";

					PreparedStatement pstmt = con.prepareStatement(query);

					// Metemos los datos en el prepared statement
					pstmt.setString(1, koala.getNombre());
					pstmt.setString(2, koala.getNickGuerra());
					pstmt.setInt(3, koala.getEdad());
					pstmt.setString(4, koala.getColor());
					pstmt.setInt(5, koala.getFuerza());
					pstmt.setInt(6, koala.getInteligencia());
					pstmt.setInt(7, koala.getHorasSueno());
					pstmt.setInt(8, koala.getTiempoBerserk());
					pstmt.setInt(9, koala.getAvestruz_idAvestruz());
					pstmt.setInt(10, koala.getCarritoGolf_idCarritoGolf());
					pstmt.setInt(11, koala.getIdKoala());

					int num = pstmt.executeUpdate();

					// Si el num es 0, devuelve -1, sino, devuelve 0
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
	 * @return koala que da como resultado
	 */
	public static KoalaDO cargar(Connection con, int id) {
		try {
			// Creamos la query con la condicion de que tenga el id dado
			String query = "SELECT * FROM KOALA WHERE idKoala = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement
			pstmt.setInt(1, id);

			// Creamos el koala que devolveremos
			KoalaDO koala = new KoalaDO();

			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			while (rs.next()) {
				// Si el id es 0, devolvemos null para no hacer más código innecesariamente
				if (rs.getInt(1) == 0)
					return null;
				else {
					// Insertamos los datos en el koala
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
			}
			return koala;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * ArrayList<FrutaDO> cargarFrutas (int id,Connection con) Igual que el primero
	 * de AvestruzDAO pero devolviendo las frutas de el koala cuyo id se ha
	 * introducido.
	 * 
	 * @param id
	 * @param con
	 * @return
	 */
	public static ArrayList<FrutaDO> cargarFrutas(int id, Connection con) {
		try {
			// Hacemos la query con la condicion de que el id de la fruta sea igual que el
			// resultado de la subconsulta que se hace para saber el id de la fruta en la
			// tabla de koala_has_fruta, ya que es ahi donde esta la relacion entre koala y
			// fruta.
			String query = "SELECT * FROM FRUTA WHERE idFruta = (SELECT fruta_idFruta FROM KOALA_HAS_FRUTA WHERE koala_idKoala = ?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Insertamos el id en el prepared statement
			pstmt.setInt(1, id);

			// Creamos el arraylist que devolveremos
			ArrayList<FrutaDO> frutas = new ArrayList<FrutaDO>();

			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			while (rs.next()) {
				// Creamos una fruta temporal, añadimos los datos y añadimos la fruta temporal
				// al arraylist
				FrutaDO fruta = new FrutaDO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
				frutas.add(fruta);
			}
			return frutas;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
