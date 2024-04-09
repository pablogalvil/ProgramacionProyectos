package ExamenUnidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HoyoDAO {
	/**
	 * pedirá el identificador del hoyo y lo eliminará.
	 * 
	 * @param con
	 * @param idHoyo
	 * @return 0 si se hizo correctamente, -1 si hubo un error
	 */
	public static int eliminarHoyo(Connection con, int idHoyo) {
		try {
			String query = "DELETE FROM HOYO WHERE idHoyo = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, idHoyo);

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
	 * pedirá dos enteros, que serán identificadores de clubs de golf, el programa
	 * devolverá la suma de las longitudes de todos los hoyos de los clubes del
	 * intervalo, incluyendo los dos introducidos.
	 * 
	 * Por ejemplo, si introduce un 2 y un 5, sumará todas las longitudes de los
	 * hoyos de los clubs de golf con id 2,3,4 y 5.
	 * 
	 * @param num1 id de menor valor
	 * @param num2 id de mayor valor
	 * @param con
	 * @return resultado de la suma o -1 si hubo algun error
	 */
	public static int sumaLongitudes(int num1, int num2, Connection con) {
		try {
			String query = "SELECT SUM(longitud) FROM HOYO WHERE idClubGolf BETWEEN ? AND ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, num1);
			pstmt.setInt(2, num2);

			ResultSet rs = pstmt.executeQuery();

			rs.next();

			int resultado = rs.getInt(1);

			return resultado;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
