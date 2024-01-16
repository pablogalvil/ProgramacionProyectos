package unidad3objetos;

public class organo {
	public static final int SANO = 0;
	public static final int DOLOR = 1;
	public static final int PERJUDICADO = 2;
	public static final int CANCERIGENO = 3;

	public static final int CABEZA = 0;
	public static final int TRONCO_SUPERIOR = 1;
	public static final int TRONCO_INFERIOR = 2;

	public static final int VITAL = 0;
	public static final int BASICA = 1;
	public static final int SECUNDARIA = 2;

	public static final boolean SI = true;
	public static final boolean NO = false;

	private String nombre;
	private String funcion;
	private int estado;
	private double peso;
	private int posicion;
	private int importancia;
	private String imagen;
	public boolean activo;

	@Override
	public String toString() {
		return "organo [nombre=" + nombre + ", funcion=" + funcion + ", estado=" + estado + ", peso=" + peso
				+ ", posicion=" + posicion + ", importancia=" + importancia + ", imagen=" + imagen + ", activo="
				+ activo + "]";
	}

	public organo() {
		super();
		// TODO Auto-generated constructor stub
		this.posicion = (int) (Math.random() * 3);
		this.estado = (int) (Math.random() * 4);
		this.peso = (double) (Math.random() * 1001) + 200;
		activo = NO;
	}

	public organo(String nombre, String funcion, int estado, double peso, int posicion, int importancia, String imagen,
			boolean activo) {
		super();
		this.nombre = nombre;
		this.funcion = funcion;
		this.estado = estado;
		this.peso = peso;
		this.posicion = posicion;
		this.importancia = importancia;
		this.imagen = imagen;
		this.activo = activo;
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
	 * @return the funcion
	 */
	public String getFuncion() {
		return funcion;
	}

	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
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
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	/**
	 * @return the importancia
	 */
	public int getImportancia() {
		return importancia;
	}

	/**
	 * @param importancia the importancia to set
	 */
	public void setImportancia(int importancia) {
		this.importancia = importancia;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
