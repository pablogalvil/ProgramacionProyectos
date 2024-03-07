package unidad4.model;

public class CarritoGolfDO {
	public static final int GRANADA = 0;
	public static final int MISIL = 1;
	public static final int TOMAHAWK = 2;
	public static final int AMETRALLADORA = 3;
	public static final int BALLESTA = 4;
	public static final int DARDO_VENENOSO = 5;

	private int idCarritoGolf;
	private String numSerie;
	private String marca;
	private int velocidadMax;
	private int armamento;
	private int municion;

	public CarritoGolfDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarritoGolfDO(int idCarritoGolf, String numSerie, String marca, int velocidadMax, int armamento,
			int municion) {
		super();
		this.idCarritoGolf = idCarritoGolf;
		this.numSerie = numSerie;
		this.marca = marca;
		this.velocidadMax = velocidadMax;
		this.armamento = armamento;
		this.municion = municion;
	}

	/**
	 * @return the idCarritoGolf
	 */
	public int getIdCarritoGolf() {
		return idCarritoGolf;
	}

	/**
	 * @param idCarritoGolf the idCarritoGolf to set
	 */
	public void setIdCarritoGolf(int idCarritoGolf) {
		this.idCarritoGolf = idCarritoGolf;
	}

	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the velocidadMax
	 */
	public int getVelocidadMax() {
		return velocidadMax;
	}

	/**
	 * @param velocidadMax the velocidadMax to set
	 */
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	/**
	 * @return the armamento
	 */
	public int getArmamento() {
		return armamento;
	}

	/**
	 * @param armamento the armamento to set
	 */
	public void setArmamento(int armamento) {
		this.armamento = armamento;
	}

	/**
	 * @return the municion
	 */
	public int getMunicion() {
		return municion;
	}

	/**
	 * @param municion the municion to set
	 */
	public void setMunicion(int municion) {
		this.municion = municion;
	}

	@Override
	public String toString() {
		return "CarritoGolfDO [idCarritoGolf=" + idCarritoGolf + ", numSerie=" + numSerie + ", marca=" + marca
				+ ", velocidadMax=" + velocidadMax + ", armamento=" + armamento + ", municion=" + municion + "]";
	}
}
