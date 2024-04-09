package ExamenUnidad4;

import java.sql.Connection;
import java.util.Scanner;

import ExamenUnidad4.model.ClubgolfDAO;
import ExamenUnidad4.model.ClubgolfDO;
import ExamenUnidad4.model.HoyoDAO;
import ExamenUnidad4.model.SocioDAO;
import ExamenUnidad4.model.SocioDO;
import ExamenUnidad4.utils.UtilsExamen;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = UtilsExamen.conectarBD();

		int i = 0;
		while (i < 1) {
			Scanner teclado = new Scanner(System.in);

			System.out.println("**** Bienvenido a GolfistaPlusUltra ****");
			System.out.println("****     Administración   *******");
			System.out.println(" ");
			System.out.println("	1. Alta de socios");
			System.out.println("	2. Modificar Club Golf");
			System.out.println("	3. Cálculos");
			System.out.println("	4. Eliminar Hoyo");
			System.out.println("	5. Salir");
			System.out.println(" ");
			System.out.print("Elija una opcion : ");
			int num = teclado.nextInt();
			switch (num) {
			case 1:
				SocioDO socio = new SocioDO();
				System.out.print(
						"¿Quieres insertar un id o crearlo automaticamente? (cualquier numero para crearlo, 0 para que sea automatico) : ");
				int x = teclado.nextInt();

				if (x == 0)
					socio.setIdSocio(-1);

				System.out.print("Introduce el nombre del socio : ");
				teclado.nextLine();
				socio.setNombre(teclado.nextLine());

				System.out.print("Introduce la edad del socio : ");
				socio.setEdad(teclado.nextInt());

				System.out.print("Introduce el sexo del socio (1 para hombre, 0 para mujer) : ");
				socio.setSexo(teclado.nextInt());

				System.out.print("Introduce la cuota del socio : ");
				socio.setCuota(teclado.nextInt());

				System.out.println(SocioDAO.altaSocios(socio, con));

				System.out.println("Volviendo al menu principal...");

				break;
			case 2:
				System.out.print("Introduce el id del club de golf que quiere modificar : ");
				int idClubgolf = teclado.nextInt();

				ClubgolfDO clubgolf = ClubgolfDAO.cargarClubGolf(con, idClubgolf);

				if (clubgolf.getIdClubGolf() == 0) {
					System.out.println("Ha habido un error");
					break;
				} else
					System.out.println(clubgolf);

				System.out.print("Introduce el campo a modificar : ");
				teclado.nextLine();
				String campo = teclado.nextLine();

				System.out.print("Introduce el valor de dicho campo : ");
				String valor = teclado.nextLine();

				System.out.println(ClubgolfDAO.modificarClubGolf(con, idClubgolf, campo, valor));

				System.out.println("Volviendo al menu principal...");

				break;
			case 3:
				int j = 0;
				while (j < 1) {
					System.out.println(" ");
					System.out.println("Elija una de las opciones a continuación");
					System.out.println(" ");
					System.out.println("	1. Mostrar suma longitudes de los hoyos de intervalo");
					System.out.println("	2. Nombre del Socio con Récord de golpes");
					System.out.println("	3. Volver");
					System.out.println(" ");
					System.out.print("Elija una opcion : ");
					int caso3 = teclado.nextInt();

					switch (caso3) {
					case 1:
						System.out.print("Introduce el id de menor valor : ");
						int num1 = teclado.nextInt();

						System.out.print("Introduce el id de mayor valor : ");
						int num2 = teclado.nextInt();

						System.out.println(HoyoDAO.sumaLongitudes(num1, num2, con));

						break;
					case 2:
						System.out.println("Calculando...");
						System.out.println("El record es de " + SocioDAO.nombreSocioRecord(con));
						break;
					case 3:
						System.out.println("Volviendo al menu principal...");
						j++;
						break;
					default:
						System.out.println("Ha habido un problema");
						System.out.println("Volviendo al menu Cálculos...");
					}
				}
				break;
			case 4:
				System.out.print("Introduce el id del hoyo a eliminar : ");
				int idHoyo = teclado.nextInt();

				System.out.println(HoyoDAO.eliminarHoyo(con, idHoyo));

				System.out.println("Volviendo al menu principal...");

				break;
			case 5:
				System.out.println("Hasta la proxima!");
				i++;
				break;
			default:
				System.out.println("No ha introducido una opcion correcta");
				System.out.println("Volviendo al menu principal...");
			}
		}
	}
}
