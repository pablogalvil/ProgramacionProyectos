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
		int numOrgano = 0;
		boolean existeOrgano = false;
		boolean debeHacerTransplante = false;
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].getNombre() == O.getNombre() && organos[i].revision() == false) {
				numOrgano = i;
				existeOrgano = true;
				break;
			}
		}
		if (!existeOrgano)
			return -1;
		if ((organos[numOrgano].analisis(organo.ONCOLOGICO) == false
				|| organos[numOrgano].analisis(organo.ESTADO) == false) && O.getEstado() == organo.SANO) {
			debeHacerTransplante = true;
		} else if ((organos[numOrgano].analisis(organo.ONCOLOGICO) == false
				|| organos[numOrgano].analisis(organo.ESTADO) == false)
				&& (O.analisis(organo.ONCOLOGICO) == false || O.analisis(organo.ESTADO) == false)) {
			this.estado = MUERTO;
			return -1;
		} else {
			return -1;
		}

		if (debeHacerTransplante) {
			organos[numOrgano] = null;
			organos[numOrgano] = O;
		}
		return 0;
	}

	public organo cura(organo O) {
		boolean puedeSerCuradoCancer = false;
		boolean puedeSerCuradoPerjudicado = false;
		boolean esCuradoCancer = false;
		boolean esCuradoPerjudicado = false;
		if (O.revision() == true) {
			if (O.analisis(organo.ONCOLOGICO) == false && O.analisis(organo.RUTINARIO)) {
				puedeSerCuradoCancer = true;
			} else if (O.analisis(organo.ONCOLOGICO) == true) {
				esCuradoCancer = true;
			} else {
				return null;
			}
			if (O.analisis(organo.PERJUDICADO) == false && (O.getNombre() != "cerebro" || O.getNombre() != "corazon")) {
				puedeSerCuradoPerjudicado = true;
			} else if (O.analisis(organo.PERJUDICADO) == false) {
				esCuradoPerjudicado = true;
			} else {
				return null;
			}
		}
		return O;
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
