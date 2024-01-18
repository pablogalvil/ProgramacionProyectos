package unidad3objetos;

public class raza {
	private String nombre;
	private String descripcion;
	private double altura;
	private String pelo;
	private String piel;
	private String zona;

	public raza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public raza(String nombre, String descripcion, double altura, String pelo, String piel, String zona) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.altura = altura;
		this.pelo = pelo;
		this.piel = piel;
		this.zona = zona;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the pelo
	 */
	public String getPelo() {
		return pelo;
	}

	/**
	 * @param pelo the pelo to set
	 */
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	/**
	 * @return the piel
	 */
	public String getPiel() {
		return piel;
	}

	/**
	 * @param piel the piel to set
	 */
	public void setPiel(String piel) {
		this.piel = piel;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

}
