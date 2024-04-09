package ExamenUnidad4.model;

public class HoyoDO {

	private int idHoyo;
	private String nombre;
	private int numero;
	private int longitud;
	private int lago;
	private int numCurvas;
	private int par;
	private int numBunkers;
	private int idClubGolf;

	public HoyoDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoyoDO(int idHoyo, String nombre, int numero, int longitud, int lago, int numCurvas, int par, int numBunkers,
			int idClubGolf) {
		super();
		this.idHoyo = idHoyo;
		this.nombre = nombre;
		this.numero = numero;
		this.longitud = longitud;
		this.lago = lago;
		this.numCurvas = numCurvas;
		this.par = par;
		this.numBunkers = numBunkers;
		this.idClubGolf = idClubGolf;
	}

	/**
	 * @return the idHoyo
	 */
	public int getIdHoyo() {
		return idHoyo;
	}

	/**
	 * @param idHoyo the idHoyo to set
	 */
	public void setIdHoyo(int idHoyo) {
		this.idHoyo = idHoyo;
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
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the lago
	 */
	public int getLago() {
		return lago;
	}

	/**
	 * @param lago the lago to set
	 */
	public void setLago(int lago) {
		this.lago = lago;
	}

	/**
	 * @return the numCurvas
	 */
	public int getNumCurvas() {
		return numCurvas;
	}

	/**
	 * @param numCurvas the numCurvas to set
	 */
	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}

	/**
	 * @return the par
	 */
	public int getPar() {
		return par;
	}

	/**
	 * @param par the par to set
	 */
	public void setPar(int par) {
		this.par = par;
	}

	/**
	 * @return the numBunkers
	 */
	public int getNumBunkers() {
		return numBunkers;
	}

	/**
	 * @param numBunkers the numBunkers to set
	 */
	public void setNumBunkers(int numBunkers) {
		this.numBunkers = numBunkers;
	}

	/**
	 * @return the idClubGolf
	 */
	public int getIdClubGolf() {
		return idClubGolf;
	}

	/**
	 * @param idClubGolf the idClubGolf to set
	 */
	public void setIdClubGolf(int idClubGolf) {
		this.idClubGolf = idClubGolf;
	}

	@Override
	public String toString() {
		return "HoyoDO [idHoyo=" + idHoyo + ", nombre=" + nombre + ", numero=" + numero + ", longitud=" + longitud
				+ ", lago=" + lago + ", numCurvas=" + numCurvas + ", par=" + par + ", numBunkers=" + numBunkers
				+ ", idClubGolf=" + idClubGolf + "]";
	}

}
