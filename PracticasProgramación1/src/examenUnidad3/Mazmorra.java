package examenUnidad3;

import java.util.Arrays;

public class Mazmorra {

	// Variables miembro
	private Trampa[] listaTrampas;
	private Monstruo[] listaMonstruos;
	private String nombre;
	private int tamanio;
	private String clima;
	private int niveles;
	public int numMazmorra = 0;

	// Valores aleatorios
	public Mazmorra() {
		super();
		numMazmorra++;
		this.listaTrampas = new Trampa[7];
		this.listaMonstruos = new Monstruo[10];
		this.nombre = "Mazmorra " + numMazmorra;
		// En metros cuadrados, mínimo 100m2, máximo 2km2.
		this.tamanio = (int) (Math.random() * 1900) + 100;
		this.clima = " ";
		this.niveles = 3;
	}

	public Mazmorra(Trampa[] listaTrampas, Monstruo[] listaMonstruos, String nombre, int tamanio, String clima,
			int niveles) {
		super();
		this.listaTrampas = listaTrampas;
		this.listaMonstruos = listaMonstruos;
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.clima = clima;
		this.niveles = niveles;
	}

	/**
	 * Esta función busca el enemigo final y lo crea si no lo encuentra.
	 * 
	 * @return el enemigo final o boss de la mazmorra.
	 */
	public Monstruo enemigoFinal() {
		// Monstruo final creado con valores mínimos para que pueda ser sustituido
		Monstruo monstruoFinal = new Monstruo(" ", 0, 1, 1, 1, 1, 1);
		// Bucle que busca en la lista de monstruos
		for (int i = 0; i < listaMonstruos.length; i++) {
			// Variable creada para acortar la condición
			Monstruo mons = listaMonstruos[i];
			if ((mons.getTipo() == 1 || mons.getTipo() == 2) && mons.getDebilidad() != 2
					&& mons.getAtaque() > monstruoFinal.getAtaque()) {
				// Sustituimos el monstruo final actual por el nuevo con mayor daño
				monstruoFinal = mons;
			}
		}
		// Si el tipo es troll, es decir, el que puse por defecto, significa que no ha
		// encontrado ningún monstruo
		if (monstruoFinal.getTipo() == 0) {
			// Creamos el monstruo final al no haberlo encontrado, este será de 20m de
			// altura y estará muy op.
			monstruoFinal = new Monstruo("Monstruo final", 1, 1, 10000, 100, 3, 2000);
		}
		return monstruoFinal;
	}

	/**
	 * La función comprueba si las trampas de un nivel están activas y si no hay más
	 * de 3 trampas en el nivel dado.
	 * 
	 * @param nivel que quieres revisar.
	 * @return true si se cumplen las condiciones // false si no se cumplen.
	 */
	public boolean regularTrampas(int nivel) {
		// Variables que usará la función
		boolean todoActivo = true;
		boolean tresOMenos = true;
		int numTrampasNivel = 0;
		boolean todoOk = false;
		for (Trampa tramp : listaTrampas) {
			// Condición para el primer boolean, si todoActivo se convierte en false ya no
			// se cumplirá la condición.
			if (tramp.activa == true && todoActivo) {
				todoActivo = true;
			} else {
				todoActivo = false;
			}
			// Condición para el segundo boolean
			if (tramp.getNivel() == nivel) {
				numTrampasNivel++;
			}
		}
		// Condición para saber si tiene más de tres trampas
		if (numTrampasNivel > 3)
			tresOMenos = false;
		// Condición para saber si todo está bien o no
		if (todoActivo && tresOMenos)
			todoOk = true;
		// Devuelve todoOk
		return todoOk;
	}

	/**
	 * Esta función comprueba que hay al menos un dragon en el nivel 3, que tiene 3
	 * niveles la mazmorra, que en cada nivel hay al menos 2 trampas y 3 monstruos,
	 * que hay al menos un monstruo de cada tipo, y que todas las trampas están
	 * activas.
	 * 
	 * @return true si se cumplen todas las condiciones // false si no se cumplen
	 */
	public boolean comprobarMazmorra() {
		// Variables que usará la función
		boolean hayDragon = false;
		boolean nivelesOk = false;
		boolean trampasYMonstruosOk = false;
		boolean todosLosTipos = false;
		boolean trampasActivas = true;
		boolean todoOk = false;

		// Booleans para los tipos
		boolean tipoTroll = false;
		boolean tipoDragon = false;
		boolean tipoKoala = false;
		boolean tipoSlime = false;
		boolean tipoOruga = false;

		// Enteros para contar los monstruos en cada nivel
		int monsNivel1 = 0;
		int monsNivel2 = 0;
		int monsNivel3 = 0;

		// Enteros para contar las trampas en cada nivel
		int trampNivel1 = 0;
		int trampNivel2 = 0;
		int trampNivel3 = 0;

		// Comprueba si la mazmorra tiene 3 niveles
		if (this.niveles == 3)
			nivelesOk = true;

		// Bucle que pasa por la lista de monstruos
		for (int i = 0; i < listaMonstruos.length; i++) {
			// Variable creada para acortar las condiciones
			Monstruo mons = listaMonstruos[i];
			// Comprueba si hay dragon en el nivel 3
			if (mons.getNivel() == 3 && mons.getTipo() == 1) {
				hayDragon = true;
			}
			// Miramos si hay todos los tipos de monstruo
			if (mons.getTipo() == 0)
				tipoTroll = true;
			else if (mons.getTipo() == 1)
				tipoDragon = true;
			else if (mons.getTipo() == 2)
				tipoKoala = true;
			else if (mons.getTipo() == 3)
				tipoSlime = true;
			else if (mons.getTipo() == 4)
				tipoOruga = true;
			// Miramos cuantos monstruos hay en cada nivel
			if (mons.getNivel() == 1)
				monsNivel1++;
			else if (mons.getNivel() == 2)
				monsNivel2++;
			else if (mons.getNivel() == 3)
				monsNivel3++;
		}
		// Miramos si se cumple que existe un monstruo de cada tipo
		if (tipoTroll && tipoDragon && tipoKoala && tipoSlime && tipoOruga)
			todosLosTipos = true;
		// Bucle para pasar por cada trampa
		for (int i = 0; i < listaTrampas.length; i++) {
			// Variable para acortar la condición
			Trampa tramp = listaTrampas[i];
			// Condición para el primer boolean, si todoActivo se convierte en false ya no
			// se cumplirá la condición.
			if (tramp.activa == true && trampasActivas) {
				trampasActivas = true;
			} else {
				trampasActivas = false;
			}
			// Miramos cuantas trampas hay en cada nivel
			if (tramp.getNivel() == 1)
				trampNivel1++;
			else if (tramp.getNivel() == 2)
				trampNivel2++;
			else if (tramp.getNivel() == 3)
				trampNivel3++;
		}
		// Miramos si hay al menos 3 monstruos y 2 trampas por nivel
		if (monsNivel1 >= 3 && monsNivel2 >= 3 && monsNivel3 >= 3 && trampNivel1 >= 2 && trampNivel2 >= 2
				&& trampNivel3 >= 2) {
			trampasYMonstruosOk = true;
		}
		// Miramos si se cumplen todas las condiciones
		if (hayDragon && nivelesOk && trampasYMonstruosOk && todosLosTipos && trampasActivas) {
			todoOk = true;
		}
		// Devuelve todoOk
		return todoOk;
	}

	/**
	 * @return the trampas
	 */
	public Trampa[] getTrampas() {
		return listaTrampas;
	}

	/**
	 * @param trampas the trampas to set
	 */
	public void setTrampas(Trampa[] trampas) {
		this.listaTrampas = trampas;
	}

	/**
	 * @return the monstruos
	 */
	public Monstruo[] getMonstruos() {
		return listaMonstruos;
	}

	/**
	 * @param monstruos the monstruos to set
	 */
	public void setMonstruos(Monstruo[] monstruos) {
		this.listaMonstruos = monstruos;
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
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * @return the clima
	 */
	public String getClima() {
		return clima;
	}

	/**
	 * @param clima the clima to set
	 */
	public void setClima(String clima) {
		this.clima = clima;
	}

	/**
	 * @return the niveles
	 */
	public int getNiveles() {
		return niveles;
	}

	/**
	 * @param niveles the niveles to set
	 */
	public void setNiveles(int niveles) {
		this.niveles = niveles;
	}

	@Override
	public String toString() {
		return "Mazmorra [trampas=" + Arrays.toString(listaTrampas) + ", monstruos=" + Arrays.toString(listaMonstruos)
				+ ", nombre=" + nombre + ", tamanio=" + tamanio + ", clima=" + clima + ", niveles=" + niveles + "]";
	}

}
