package unidad3objetos;

import java.util.Arrays;

public class cuerpo {
	// Valores para estado
	public static final int VIVO = 0;
	public static final int COMA = 1;
	public static final int MUERTO = 2;

	// Variables miembro
	private organo[] organos;
	private String nombre;
	private int edad;
	private double peso;
	private raza razaC;
	private int estado;
	private int numCuerpo = 0;

	@Override
	public String toString() {
		return "cuerpo [organos=" + Arrays.toString(organos) + ", nombre=" + nombre + ", edad=" + edad + ", peso="
				+ peso + ", razaC=" + razaC + ", estado=" + estado + ", numCuerpo=" + numCuerpo + "]";
	}

	// Constructor vacio que genera valores aleatorios para cuerpo
	public cuerpo() {
		super();
		// TODO Auto-generated constructor stub
		this.numCuerpo++;
		this.nombre = "Cuerpo " + numCuerpo;
		this.edad = (int) (Math.random() * 101);
		this.peso = (double) (Math.random() * 151) + 50;
		this.estado = (int) (Math.random() * 3);
		this.organos = new organo[8];
		for (int i = 0; i < organos.length; i++) {
			this.organos[i] = new organo();
		}
		this.razaC = new raza();
	}

	// Constructor que recibe valores para cuerpo
	public cuerpo(organo[] organos, String nombre, int edad, double peso, raza razaC, int estado) {
		super();
		this.organos = organos;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.razaC = razaC;
		this.estado = estado;
	}

	/**
	 * Esta funcion hace un transplante en tu cuerpo en caso de que sea necesario
	 * 
	 * @param O Organo nuevo a transplantar
	 * @return -1 si por alguna razon no se puede hacer el transplante // 0 si se ha
	 *         hecho el transplante correctamente.
	 */
	public int transplante(organo O) {
		organo Org = new organo();// Variable para sustituir el organo
		int numOrgano = 0;// Variable para poder sustituir el organo mas tarde
		boolean existeOrgano = false;// Variable para saber si existe el organo
		for (int i = 0; i < organos.length; i++) {// Bucle que busca un organo y termina al encontrarlo
			if (organos[i].getNombre().equals(O.getNombre()) && organos[i].revision() == false) {
				Org = organos[i];
				numOrgano = i;
				existeOrgano = true;
				break;
			}
		}
		if (!existeOrgano) {
			return -1;
		} else if ((Org.analisis(1) == false || Org.analisis(2) == false) && O.getEstado() == 0) {
			organos[numOrgano] = O;
		} else if ((Org.analisis(1) == false || Org.analisis(2) == false)
				&& (O.analisis(1) == false || O.analisis(2) == false)) {
			this.estado = MUERTO;
			return -1;
		} else {
			return -1;
		}
		return 0;
	}

	/**
	 * Esta funcion cura un organo cancerigeno o perjudicado siempre que esté en la
	 * posicion correcta. Este organo tendra un 65% de posibilidades de curarse de
	 * cancer y un 90% de curarse de estar perjudicado
	 * 
	 * @param O organo que quieras curar
	 * @return null si no pudo curarse // el organo si se cura
	 */
	public organo cura(organo O) {
		if (O.revision() == true) {
			// Mira si tiene cancer
			if (O.analisis(1) == false && O.analisis(3)) {
				// Variable para saber si es posible curar cancer o no
				double curaCancer = Math.random();
				if (curaCancer < 0.65) {
					O.setEstado(organo.SANO);
					return O;
				} else if (O.getImportancia() == 0) {// Para la subida de nota, si es vital, el cuerpo muere
					this.estado = MUERTO;
					return null;
				} else
					return null;
			} else if (O.analisis(1) == true) {
				// Si no tiene cancer, mira si está perjudicado
				if (O.analisis(2) == false && (O.getNombre() != "cerebro" || O.getNombre() != "corazon")) {
					// Variable para saber si es posible curar el organo perjudicado o no
					double curaPerjudicado = Math.random();
					if (curaPerjudicado < 0.90) {
						O.setEstado(0);
						return O;
					} else
						return null;
				} else if (O.analisis(2) == false) {
					return O;
				} else if (O.getImportancia() == 0) {// Para la subida de nota, si es vital, el cuerpo muere
					this.estado = MUERTO;
					return null;
				} else
					return null;
			} else {
				return null;
			}
		}
		return null;
	}

	/**
	 * Esta funcion realiza un analisis oncologico en todos los organos del cuerpo
	 * para saber si alguno tiene cancer
	 * 
	 * @return true si alguno tiene cancer // false si ninguno tiene cancer
	 */
	public boolean oncologia() {
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].analisis(1) == false) {
				return true;
			} else
				continue;
		}
		return false;
	}

	public int revisionGeneral() {
		for (int i = 0; i < organos.length; i++) {

		}
		return 0;
	}

	/**
	 * @return the organos
	 */
	public organo[] getOrganos() {
		return organos;
	}

	/**
	 * @param organos the organos to set
	 */
	public void setOrganos(organo[] organos) {
		this.organos = organos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the razaC
	 */
	public raza getRazaC() {
		return razaC;
	}

	/**
	 * @param razaC the razaC to set
	 */
	public void setRazaC(raza razaC) {
		this.razaC = razaC;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
