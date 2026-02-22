package PracticaSeisBagGenerica;

import java.util.HashSet;
import java.util.Random;

public class BagGenerica<T> {

	private HashSet<T> bolsa = new HashSet<>();

	/**
	 * Añade un elemento a la bolsa.
	 *
	 * @param e elemento de tipo genérico T que se va a añadir.
	 * @return true, si el elemento se añadió correctamente. Al ser HashSet solo
	 *         añadirá si el elemento no existe ya en la bolsa.
	 */
	public boolean add(T e) {
		return bolsa.add(e);
	}

	/**
	 * Elimina todos los elementos de la bolsa.
	 */
	public void clear() {
		bolsa.clear();
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
		return bolsa.contains(e);
	}

	/**
	 * Indica si la bolsa está vacia o no.
	 *
	 * @return true, si está vacía.
	 */
	public boolean isEmpty() {
		return bolsa.isEmpty();
	}

	/**
	 * Método para saber tamaño de la bolsa.
	 *
	 * @return tamaño de la bolsa.
	 */
	public int size() {
		return bolsa.size();
	}

	/**
	 * Extrae un elemento de la bolsa. Todos, independientemente de cuando se hayan
	 * introducido, tienen la misma probabilidad de ser seleccionados. Para generar
	 * el indice aleatorio se utiliza el método {@link java.util.Random#nextInt(int)}
	 * de la clase {@link java.util.Random}
	 *
	 * @return Devuelve el elemento extraido. En caso de que la lista se encuentre
	 *         vacía, devolverá un "null".
	 */
	public T extract() {

		if (!bolsa.isEmpty()) {
			Random aleatorio = new Random();
			int indiceAleatorio = aleatorio.nextInt(bolsa.size());
			int indiceIteracion = 0;

			for (T elementoHashSet : bolsa) {
				if (indiceIteracion == indiceAleatorio) {
					indiceIteracion = 0;
					bolsa.remove(elementoHashSet);
					return elementoHashSet;
				}
				indiceIteracion++;
			}
		}
		return null;
	}

	/**
	 * Método toString.
	 *
	 * @return Devuelve una cadena de texto representando los elementos almacenados en la bolsa.
	 */
	@Override
	public String toString() {
		return bolsa.toString();
	}

}
