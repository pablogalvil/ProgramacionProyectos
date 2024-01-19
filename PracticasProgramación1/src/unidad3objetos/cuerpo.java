package unidad3objetos;

import java.util.Arrays;

public class cuerpo {
	public static final int VIVO = 0;
	public static final int COMA = 1;
	public static final int MUERTO = 2;

	// {"Cerebro","Corazón","Riñon derecho","Riñon izquierdo","Pulmon
	// derecho","Pulmon izquierdo","Oído","Estómago"}
	private organo[] organos;
	private String nombre;
	private int edad;
	private double peso;
	private String raza;
	private int estado;
	private int numCuerpo = 0;

	@Override
	public String toString() {
		return "cuerpo [organos=" + Arrays.toString(organos) + ", nombre=" + nombre + ", edad=" + edad + ", peso="
				+ peso + ", raza=" + raza + ", estado=" + estado + ", numCuerpo=" + numCuerpo + "]";
	}

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
	}

	public cuerpo(organo[] organos, String nombre, int edad, double peso, String raza, int estado) {
		super();
		this.organos = organos;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.estado = estado;
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
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
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
