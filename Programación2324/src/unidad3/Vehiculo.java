package unidad3;

/**
 * La clase representa a un vehiculo
 * 
 * Tiene los datos de
 * 
 * número de ruedas
 * 
 * velocidad máxima
 * 
 * potencia
 * 
 * tipo (gasolina, gas, electrico, hibrido, pedales, marino, aereo)
 * 
 * capacidad de carga
 */
public class Vehiculo {
	// Constantes de la clase
	public static final int TIPO_GASOLINA = 1;
	public static final int TIPO_GAS = 2;
	public static final int TIPO_ELECTRICO = 3;
	public static final int TIPO_HIBRIDO = 4;
	public static final int TIPO_PEDALES = 5;
	public static final int TIPO_MARINO = 6;
	public static final int TIPO_AEREO = 7;

	private int numRuedas;
	private double velMax;
	private double potencia;
	private int tipo;
	private int velocidad;
	private double capCarga;

	public Vehiculo() {
		super();
	}

	public Vehiculo(int numRuedas, double velMax, double potencia, int tipo, int velocidad, double capCarga) {
		super();
		this.numRuedas = numRuedas;
		this.velMax = velMax;
		this.potencia = potencia;
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.capCarga = capCarga;
	}

	// Un metodo con el modificador protegido no es ni privdo ni publico, se puede
	// utilizar solo en las clases hijas.
	protected void acelerar(int aceleracion) {
		this.velocidad = aceleracion * velocidad;
	}

	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + ", velMax=" + velMax + ", potencia=" + potencia + ", tipo=" + tipo
				+ ", capCarga=" + capCarga + "]";
	}

	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}

	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	/**
	 * @return the velMax
	 */
	public double getVelMax() {
		return velMax;
	}

	/**
	 * @param velMax the velMax to set
	 */
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the capCarga
	 */
	public double getCapCarga() {
		return capCarga;
	}

	/**
	 * @param capCarga the capCarga to set
	 */
	public void setCapCarga(double capCarga) {
		this.capCarga = capCarga;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
