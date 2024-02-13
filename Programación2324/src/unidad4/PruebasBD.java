package unidad4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import unidad4.model.ClienteDO;
import unidad4.model.ModelCliente;
//Con este import podemos usar todas las clases del paquete utils
import unidad4.utils.UtilsBD;

public class PruebasBD {

	public static void main(String[] args) {

		System.out.println("Intentamos conectar  con BD");
		// Ejecutamos la conexion
		Connection con = UtilsBD.conectarBD();

		try {

			// Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = ModelCliente.getClientes(con);

			System.out.println("Hay " + rs.getFetchSize() + " registros");

			while (rs.next()) {
				System.out.print(rs.getString("nombre") + " // ");
				System.out.print(rs.getInt("edad") + " // ");
				System.out.println(rs.getString(5));
			}

			/**
			 * Funciones interesantes con resultSet
			 * 
			 * rs.previous() hacia atras
			 * 
			 * rs.getFetchSize() cantidad de elementos
			 * 
			 * rs.beforeFirst() lo mueve al principio
			 * 
			 * rs.afterLast() lo mueve al final
			 * 
			 * rs.getArray(column) devuelve todos los datos de una columna en un array
			 */

			// Modificación
			// int numAff = stmt.executeUpdate("UPDATE CLIENTE SET EDAD=EDAD+1 WHERE
			// SEXO='M'");

			// System.out.println("Se han modificado " + numAff + " columnas");

			// Ejemplo de borrado
			ModelCliente.removeClientes(con);
			int idCliente = 3;
			ClienteDO cliente = new ClienteDO(idCliente, null, "Perlita", 20, 'F', null, null);
			int numAff = ModelCliente.updateCliente(con, cliente);

			// Ejemplo de insercion de registros
			// int numAff3 = stmt.executeUpdate(
			// "INSERT INTO CLIENTE VALUES(1, 'Patricia', 'Bueno', 41, 'F', 'non@icloud.ca',
			// 'GHG80PYD1BW\r\n')");
			ClienteDO cliente2 = new ClienteDO(10, "Luismi", "Toscano", 19, 'M', "ayudaaaa@gmail.com", "toitoto");
			int numAff2 = ModelCliente.insertCliente(con, cliente2);

			// System.out.println("Se han insertado " + numAff3 + " columnnas");

			// Cerramos la conexión
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
