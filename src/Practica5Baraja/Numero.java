package Practica5Baraja;

/**
 * Enumeración donde encontramos los diferentes números que componen la baraja.
 */
public enum Numero {
	/** As. */
	AS('A'),
	/** Dos. */
	DOS('2'),
	/** Tres. */
	TRES('3'),
	/** Cuatro. */
	CUATRO('4'),
	/** Cinco. */
	CINCO('5'),
	/** Seis. */
	SEIS('6'),
	/** Siete. */
	SIETE('7'),
	/** Sota. */
	SOTA('S'),
	/** Caballo. */
	CABALLO('C'),
	/** Rey. */
	REY('R');

	/** Atributo inmutable donde se almacena la abreviatura del numero. */
	private final char abreviatura;

	/**
	 * Constructor Asigna la abreviatura a cada constante del enum.
	 *
	 * @param abreviatura parámetro identificativo de cada número.
	 */
	private Numero(char abreviatura) {
		this.abreviatura = abreviatura;
	}

	/**
	 * Método que devuelve la abreviatura almacenada.
	 *
	 * @return abreviatura, carácter que representa el palo.
	 */
	public char getAbreviatura() {
		return abreviatura;
	}

}
