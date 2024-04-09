package ExamenUnidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SocioDAO {
	/**
	 * se le pedirán todos los datos de la tabla Socios de la BD, y se introducirán
	 * los datos en la BD, si introduce algún dato erróneamente o el id ya existe(
	 * si se pide el id, que es opcional), no debe de acabar la ejecución,
	 * simplemente mostrará un mensaje de fallo y volverá al menú principal.
	 * 
	 * @param socio
	 * @param con
	 * @return 0 si todo ha ido bien y -1 si ha habido algun error.
	 */
	public static int altaSocios(SocioDO socio, Connection con) {
		try {
			String query = "";

			// Comprobamos que los datos introducidos son válidos
			if (socio.getNombre() == null || socio == null || (socio.getSexo() > 1 && socio.getSexo() < 0))
				return -1;

			// Creamos un socio con el id dado para compararlo y ver si es null
			SocioDO socioExistente = cargar(con, socio.getIdSocio());

			// Comparamos con el socio cargado para ver si existe el socio o no
			if (socio.getIdSocio() < 1 || socioExistente != null && socioExistente.getIdSocio() == socio.getIdSocio()) {
				// Creamos la query sin el id
				query = "INSERT INTO SOCIO (nombre, edad, sexo, cuota) VALUES (?,?,?,?)";

				PreparedStatement pstmt = con.prepareStatement(query);

				// Metemos los datos en el prepared statement
				pstmt.setString(1, socio.getNombre());
				pstmt.setInt(2, socio.getEdad());
				pstmt.setInt(3, socio.getSexo());
				pstmt.setInt(4, socio.getCuota());

				int num = pstmt.executeUpdate();

				// Si el num es 0, devuelve -1, sino, devuelve 0
				if (num == 0) {
					System.out.println("Ha habido un error");
					return -1;
				} else
					return 0;
			} else
				// Creamos la query con el id
				query = "INSERT INTO SOCIO (idSocio, nombre, edad, sexo, cuota) VALUES (?,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos los datos en el prepared statement
			pstmt.setInt(1, socio.getIdSocio());
			pstmt.setString(2, socio.getNombre());
			pstmt.setInt(3, socio.getEdad());
			pstmt.setInt(4, socio.getSexo());
			pstmt.setInt(5, socio.getCuota());

			int num = pstmt.executeUpdate();

			// Si el num es 0, devuelve -1, sino, devuelve 0
			if (num == 0) {
				System.out.println("Ha habido un error");
				return -1;
			} else
				return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * Funcion creada para el correcto funcionamiento de la funcion alta socios
	 * 
	 * @param con
	 * @param id
	 * @return
	 */
	public static SocioDO cargar(Connection con, int id) {
		try {
			// Creamos la query con la condicion de que tenga el id dado
			String query = "SELECT * FROM SOCIO WHERE idSocio = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement
			pstmt.setInt(1, id);

			// Creamos el socio que devolveremos
			SocioDO socio = new SocioDO();

			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			while (rs.next()) {
				// Si el id es 0, devolvemos null para no hacer más código innecesariamente
				if (rs.getInt(1) == 0)
					return null;
				else {
					// Insertamos los datos en el socio
					socio.setIdSocio(rs.getInt(1));
					socio.setNombre(rs.getString(2));
					socio.setEdad(rs.getInt(3));
					socio.setSexo(rs.getInt(4));
					socio.setCuota(rs.getInt(5));
				}
			}
			return socio;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * devolverá el nombre del socio que tenga el valor mínimo de récord de golpes
	 * en la tabla intermedia.
	 * 
	 * @param con
	 * @return nombre del socio
	 */
	public static String nombreSocioRecord(Connection con) {
		try {
			String query = "SELECT S.nombre FROM CLUBGOLF_HAS_SOCIO CHS INNER JOIN SOCIO S ON CHS.idSocio = S.idSocio WHERE CHS.recordGolpes = (SELECT MIN(recordGolpes) FROM CLUBGOLF_HAS_SOCIO WHERE recordGolpes > 0)";

			PreparedStatement pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();

			rs.next();

			String resultado = rs.getString(1);

			return resultado;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
