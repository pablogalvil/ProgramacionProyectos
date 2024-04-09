package ExamenUnidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClubgolfDAO {
	/**
	 * pedirá el id del terminal y mostrará sus datos por pantalla, después pedirá
	 * el nombre del campo a modificar y el nuevo valor, y lo modificará. Al igual
	 * que en el apartado anterior, si falla la sentencia sql por fallo de valor,
	 * mostrará el error y volverá al menú principal.
	 * 
	 * @param con
	 * @param id
	 * @param campo
	 * @param valor
	 * @return 0 si se hizo correctamente, -1 si hubo un error
	 */
	public static int modificarClubGolf(Connection con, int id, String campo, String valor) {
		try {
			String query = "UPDATE CLUBGOLF SET ";

			boolean hayNuevoValor = false;
			int nuevoValor = 0;

			if (campo.equals("nombre") || campo.equals("localidad")) {
				query += campo + " = ? WHERE idClubGolf = ?";
			} else if (campo.toLowerCase().equals("recordgolpes") || campo.toLowerCase().equals("escuela")) {
				query += campo + " = ? WHERE idClubGolf = ?";
				nuevoValor = Integer.valueOf(valor);
				hayNuevoValor = true;
			} else {
				System.out.println("Ha habido un error");
				return -1;
			}

			PreparedStatement pstmt = con.prepareStatement(query);

			if (hayNuevoValor)
				pstmt.setInt(1, nuevoValor);
			else
				pstmt.setString(1, valor);

			pstmt.setInt(2, id);
			int num = pstmt.executeUpdate();

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
	 * Función para mostrar el club de golf antes de modificarlo
	 * 
	 * @param con
	 * @param id
	 * @return
	 */
	public static ClubgolfDO cargarClubGolf(Connection con, int id) {
		try {
			// Creamos la query con la condicion de que tenga el id dado
			String query = "SELECT * FROM CLUBGOLF WHERE idClubGolf = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			// Metemos el id en el prepared statement
			pstmt.setInt(1, id);

			// Creamos el club de golf que devolveremos
			ClubgolfDO clubgolf = new ClubgolfDO();

			ResultSet rs = pstmt.executeQuery();

			// Hacemos un bucle que pasara siempre que haya algo en el resultset
			rs.next();
			// Si el id es 0, devolvemos null para no hacer más código innecesariamente
			if (rs.getInt(1) == 0)
				return null;
			else {
				// Insertamos los datos en el club de golf
				clubgolf.setIdClubGolf(rs.getInt(1));
				clubgolf.setNombre(rs.getString(2));
				clubgolf.setLocalidad(rs.getString(3));
				clubgolf.setRecordGolpes(rs.getInt(4));
				clubgolf.setEscuela(rs.getInt(5));

			}
			return clubgolf;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
