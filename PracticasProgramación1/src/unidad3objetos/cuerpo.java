package unidad3objetos;

import java.util.Arrays;

public class cuerpo {
	// Valores para estado
	public static final int VIVO = 0;
	public static final int COMA = 1;
	public static final int MUERTO = 2;

	public static final int MALARIA = 1;
	public static final int PARKINSON = 2;
	public static final int BRONQUITIS = 3;
	public static final int GRIPE = 4;
	public static final int CANCER = 5;
	public static final int SANO = 6;

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
			if (organos[i].getNombre().equals(O.getNombre()) && organos[i].revision() == true) {
				Org = organos[i];
				numOrgano = i;
				existeOrgano = true;
				break;
			}
		}
		if (!existeOrgano) {//Si no hay organos iguales que el dado, falla el transplante
			return -1;
		} else if ((Org.analisis(1) == false || Org.analisis(2) == false) && O.getEstado() == 0) {//Si el organo encontrado está mal y el dado está sano, se hace el transplante
			organos[numOrgano] = O;
		} else if ((Org.analisis(1) == false || Org.analisis(2) == false)
				&& (O.analisis(1) == false || O.analisis(2) == false)) {//Si ambos organos están mal, el cuerpo muere y falla el transplante
			this.estado = MUERTO;
			return -1;
		} else {//Si falla el transplante devuelve -1
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
				if (curaCancer < 0.65) {//65% de posibilidades de curarse
					O.setEstado(organo.SANO);
					return O;
				} else if (O.getImportancia() == 0) {// Para la subida de nota, si es vital, el cuerpo muere
					this.estado = MUERTO;
					return null;
				} else
					return null;
			} else if (O.analisis(1)) {
				// Si no tiene cancer, mira si está perjudicado y si no es ni corazon ni cerebro
				if (O.analisis(2) == false && O.getNombre() != "cerebro" && O.getNombre() != "corazon") {
					// Variable para saber si es posible curar el organo perjudicado o no
					double curaPerjudicado = Math.random();
					if (curaPerjudicado < 0.90) {//90% de posibilidades de curarse
						O.setEstado(0);
						return O;
					} else if (O.getImportancia() == 0) {// Para la subida de nota, si es vital, el cuerpo muere
						this.estado = MUERTO;
						return null;
					} else
						return null;
				} else if (O.analisis(2) == true) {//Si no necesita cura, devuelve el organo
					return O;
				} else{// Para la subida de nota, si es vital, el cuerpo muere (no tiene condición porque siempre se cumple
					this.estado = MUERTO;
					return null;
				}
			} else if (O.getImportancia() == 0) {// Para la subida de nota, si es vital, el cuerpo muere
				this.estado = MUERTO;
				return null;
			} else {//Si tiene cancer pero no el peso adecuado, no se podrá curar
				return null;
			}
		}//No se puede hacer el analisis porque la revision fue mal
		return null;
	}

	/**
	 * Esta funcion realiza un analisis oncologico en todos los organos del cuerpo
	 * para saber si alguno tiene cancer
	 * 
	 * @return true si alguno tiene cancer // false si ninguno tiene cancer
	 */
	public boolean oncologia() {
		for (int i = 0; i < organos.length; i++) {//Bucle para pasar por cada organo
			if (organos[i].analisis(1) == false) {//Si alguno tiene cancer, devuelve true
				return true;
			} else
				continue;
		}
		return false;
	}

	/**
	 * Esta funcion revisa si el cuerpo tiene alguna enfermedad, basandose en si
	 * tiene dolor de cabeza o de estomago por ejemplo
	 * 
	 * @return Array con enfermedades : 1 malaria, 2 parkinson, 3 bronquitis, 4
	 *         gripe, 5 cancer//En su defecto 6 que es sano
	 */
	public int[] revisionGeneral() {
		// Variables miembro
		int numEnfermedades = 0;// Para saber el tamaño del array
		int[] enfermedades;
		// Para saber si cumple las condiciones de cada enfermedad
		boolean cabezaConDolor = false;
		boolean rinonesPerjudicados = false;
		boolean oidoPerjudicado = false;
		boolean cerebroPerjudicado = false;
		boolean pulmonesPerjudicados = false;
		boolean estomagoConDolor = false;
		boolean pulmonesConDolor = false;
		// Variables de enfermedades
		boolean malaria = false;
		boolean parkinson = false;
		boolean bronquitis = false;
		boolean gripe = false;
		boolean cancer = false;
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].getPosicion() == 0 && organos[i].getEstado() == 1) {//Saber si tiene dolor de cabeza
				cabezaConDolor = true;
			} else if ((organos[i].getNombre().equals("riñon izquierdo")
					|| organos[i].getNombre().equals("riñon derecho")) && organos[i].analisis(2) == false) {//Saber si tiene los riñones perjudicados
				rinonesPerjudicados = true;
			} else if (organos[i].getNombre().equals("oido") && organos[i].analisis(2) == false) {//Saber si tiene el oido perjudicado
				oidoPerjudicado = true;
			} else if (organos[i].getNombre().equals("cerebro") && organos[i].analisis(2) == false) {//Saber si tiene el cerebro perjudicado
				cerebroPerjudicado = true;
			} else if ((organos[i].getNombre().equals("pulmon izquierdo")
					|| organos[i].getNombre().equals("pulmon derecho")) && organos[i].analisis(2) == false) {//Saber si tiene los pulmones perjudicados
				pulmonesPerjudicados = true;
			} else if (organos[i].getNombre().equals("estomago") && organos[i].getEstado() == 1) {//Saber si tiene dolor de estomago
				estomagoConDolor = true;
			} else if ((organos[i].getNombre().equals("pulmon izquierdo")
					|| organos[i].getNombre().equals("pulmon derecho")) && organos[i].getEstado() == 1) {//Saber si tiene dolor de pulmones
				pulmonesConDolor = true;
			}
		}
		// Condiciones para saber cuantas enfermedades tiene
		if (cabezaConDolor && rinonesPerjudicados) {// condicion malaria
			numEnfermedades++;
			malaria = true;
		}
		if (oidoPerjudicado && cerebroPerjudicado) {// condicion parkinson
			numEnfermedades++;
			parkinson = true;
		}
		if (cabezaConDolor && pulmonesPerjudicados) {// condicion bronquitis
			numEnfermedades++;
			bronquitis = true;
		}
		if (cabezaConDolor && estomagoConDolor && pulmonesConDolor) {// condicion gripe
			numEnfermedades++;
			gripe = true;
		}
		if (this.oncologia() == true) {// condicion cancer
			numEnfermedades++;
			cancer = true;
		}
		// Condicion para crear el array
		if (numEnfermedades == 0) {
			enfermedades = new int[1];
			enfermedades[0] = SANO;
		} else {// Creamos el array
			enfermedades = new int[numEnfermedades];
			// Bucle para añadir las enfermedades
			for (int i = 0; i < enfermedades.length; i++) {
				if (malaria) {// Si tiene malaria, la introduzco y la pongo en false para que no se repita
					malaria = false;
					enfermedades[i] = MALARIA;
				} else if (parkinson) {// Si tiene parkinson, la introduzco y la pongo en false para que no se repita
					parkinson = false;
					enfermedades[i] = PARKINSON;
				} else if (bronquitis) {// Si tiene bronquitis, la introduzco y la pongo en false para que no se repita
					bronquitis = false;
					enfermedades[i] = BRONQUITIS;
				} else if (gripe) {// Si tiene gripe, la introduzco y la pongo en false para que no se repita
					gripe = false;
					enfermedades[i] = GRIPE;
				} else if (cancer) {// Si tiene cancer, la introduzco y la pongo en false para que no se repita
					cancer = false;
					enfermedades[i] = CANCER;
				}
			}
		}
		return enfermedades;
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
