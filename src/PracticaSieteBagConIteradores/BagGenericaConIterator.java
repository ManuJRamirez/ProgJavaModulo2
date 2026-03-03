package PracticaSieteBagConIteradores;

import java.util.Iterator;
import java.util.Random;

/**
 * Clase BagGenericaConIterator de tipo genérico.
 * 
 * Permite almacenar elementos de tipo T dentro de una bolsa.
 * 
 * 
 *
 * @param <T> tipo genérico que definirá la bolsa.
 */
public class BagGenericaConIterator<T> implements Iterable<T> {

	/** Array donde se almacena los elementos de la bolsa. */
	private T[] bolsa;

	/** Atributo donde almacenaremos el número real de elementos en la bolsa. */
	private int tamano;

	/**
	 * Constructor de clase sin parámetros.
	 * 
	 * Inicializa una bolsa con una longitud de array de 10 y un tamaño(elementos
	 * reales dentro del array) de 0.
	 */
	@SuppressWarnings("unchecked")
	public BagGenericaConIterator() {
		bolsa = (T[]) new Object[10];
		tamano = 0;
	}

	/**
	 * Añade un elemento a la bolsa. Si el array está lleno, se amplía al doble de
	 * su "lenght". Además sumamos +1 al atributo tamaño, para dejar registro de ese
	 * nuevo elemento.
	 *
	 * @param e elemento de tipo genérico T que se va a añadir.
	 * @return true, si el elemento se añadió correctamente.
	 */
	public boolean add(T e) {
		if (tamano == bolsa.length) {
			ampliarBolsa();
		}
		bolsa[tamano++] = e;
		return true;
	}

	/**
	 * Duplica la capacidad del array(bolsa). Para esto, creamos otro array
	 * provisional del doble de capacidad del original. Copiaremos los elementos del
	 * original al nuevo array "nuevaBolsa" y finalmente hacemos que "bolsa" apunte
	 * al nuevo array ampliado.
	 */
	@SuppressWarnings("unchecked")
	private void ampliarBolsa() {
		T[] nuevaBolsa = (T[]) new Object[bolsa.length * 2];
		System.arraycopy(bolsa, 0, nuevaBolsa, 0, bolsa.length);
		bolsa = nuevaBolsa;
	}

	/**
	 * Elimina todos los elementos de la bolsa.
	 */
	public void clear() {
		tamano = 0;
		System.out.println("Bolsa vaciada");
	}

	/**
	 * Comprueba si un elemento determinado está en la bolsa.
	 *
	 * @param e elemento de tipo T, que vamos a verificar si se encuentra en la
	 *          lista.
	 * @return true, si la lista contiene ese elemento.
	 */
	public boolean contains(T e) {
		boolean isExiste = false;
		for (int i = 0; i < tamano; i++) {
			if (bolsa[i].equals(e)) {
				isExiste = true;
			}
		}
		return isExiste;
	}

	/**
	 * Indica si la bolsa está vacia o no.
	 *
	 * @return true, si está vacía.
	 */
	public boolean isEmpty() {
		return tamano == 0;
	}

	/**
	 * Método para saber tamaño de la bolsa.
	 * 
	 * NOTA: Este método devuelve el tamaño de la bolsa, es decir los elementos que
	 * hay dentro de ella. NO devuelve el tamaño del array (bolsa.lenght).
	 *
	 * @return tamaño de la bolsa.
	 */
	public int size() {
		return tamano;
	}

	/**
	 * Extrae un elemento de la bolsa. Todos, independientemente de cuando se hayan
	 * introducido, tienen la misma probabilidad de ser seleccionados. Para generar
	 * el indice aleatorio se utiliza el método
	 * {@link java.util.Random#nextInt(int)} de la clase {@link java.util.Random}.
	 * 
	 * El último elemento de la lista se copia en la posición del elemento extraido
	 * y su posición como último elemento del array pasa a "null". Para finalizar,
	 * restamos -1 al tamaño de la bolsa.
	 *
	 * @return elemento. Devuelve el elemento extraido. En caso de que la lista se
	 *         encuentre vacía, devolverá un "null".
	 */
	public T extract() {

		if (isEmpty()) {
			return null;
		}

		Random aleatorio = new Random();
		int indicePosicionAleatoria = aleatorio.nextInt(tamano);

		T elemento = bolsa[indicePosicionAleatoria];
		bolsa[indicePosicionAleatoria] = bolsa[tamano - 1];
		bolsa[tamano - 1] = null;
		tamano--;

		return elemento;

	}

	/**
	 * Método iterator. Para ello acudimos al iterador de la bolsa "BagIterator".
	 *
	 * @return devuelve un {@link Iterator} de tipo T que recorre los elementos de
	 *         la bolsa.
	 */
	@Override
	public Iterator<T> iterator() {
		return new BagIterator<T>(bolsa, tamano);
	}

	/**
	 * Método toString.
	 *
	 * @return Devuelve una cadena de texto representando los elementos almacenados
	 *         en la bolsa.
	 */
	@Override
	public String toString() {
		return bolsa.toString();
	}

}
