package unidad3objetos;

public class raza {
	// Valores para la variable pelo
	public static final int PELIMORENO = 0;
	public static final int RUBIO = 1;
	public static final int PELINEGRO = 2;
	public static final int PELIRROJO = 3;

	// Valores para la variable piel
	public static final int NEGRO = 0;
	public static final int BLANCO = 1;
	public static final int AMARILLO = 2;
	public static final int MORENO = 3;

	// Valores para la variable zona
	public static final int AMERICA = 0;
	public static final int EUROPA = 1;
	public static final int ASIA = 2;
	public static final int AFRICA = 3;
	public static final int OCEANIA = 4;

	// Variables miembro
	private String nombre;
	private String descripcion;
	private double altura;
	private int pelo;
	private int piel;
	private int zona;

	@Override
	public String toString() {
		return "raza [nombre=" + nombre + ", descripcion=" + descripcion + ", altura=" + altura + ", pelo=" + pelo
				+ ", piel=" + piel + ", zona=" + zona + "]";
	}

	// Constructor vacio que genera valores aleatorios para raza
	public raza() {
		super();
		// TODO Auto-generated constructor stub
		this.altura = (Math.random() * 61) + 140;
		this.pelo = (int) (Math.random() * 4);
		this.piel = (int) (Math.random() * 4);
		this.zona = (int) (Math.random() * 5);
		switch (this.piel) {
		case NEGRO:
			this.nombre = "Negro";
			break;
		case BLANCO:
			this.nombre = "Blanco";
			break;
		case AMARILLO:
			this.nombre = "Asiatico";
			break;
		case MORENO:
			this.nombre = "Mulato(Gitano)";
			break;
		}
		switch (this.nombre) {
		case "Negro":
			this.descripcion = "Provenientes del continente africano, esclavos, miembros de BLM";
			break;
		case "Blanco":
			this.descripcion = "Provenientes de las zonas norteñas, generalmente de ideologia nazi, miembros del KKK";
			break;
		case "Asiatico":
			this.descripcion = "Provenientes de oriente, con una cultura distinta al resto, buenos en mateáticas, el 99% tiene gafas y son buenos en los videojuegos.";
			break;
		case "Mulato(Gitano)":
			this.descripcion = "Mezcla de razas negra y blanca, generalmente situados en el ecuador, su centro de operaciones son las 3000 viviendas, viven de robar televisiones, saben cantar";
			break;
		}
	}

	// Constructor que recibe valores para raza
	public raza(String nombre, String descripcion, double altura, int pelo, int piel, int zona) {
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
	public int getPelo() {
		return pelo;
	}

	/**
	 * @param pelo the pelo to set
	 */
	public void setPelo(int pelo) {
		this.pelo = pelo;
	}

	/**
	 * @return the piel
	 */
	public int getPiel() {
		return piel;
	}

	/**
	 * @param piel the piel to set
	 */
	public void setPiel(int piel) {
		this.piel = piel;
	}

	/**
	 * @return the zona
	 */
	public int getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(int zona) {
		this.zona = zona;
	}

}
