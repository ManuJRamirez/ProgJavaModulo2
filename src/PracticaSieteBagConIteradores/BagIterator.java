package PracticaSieteBagConIteradores;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase BagIterator.
 *
 *Iterador para recorrer los elementos de la bolsa.
 *
 *
 * @param <T> Tipo genérico de los elementos almacenados en la bolsa.
 */
public class BagIterator<T> implements Iterator<T>{
	
	/** Array que contiene los elementos de la bolsa. */
	private final T[] bolsa;
	
	/** Número real de elementos almacenados en la bolsa. */
	private final int tamano;
	
	/** Indice del iterador dentro del array cuando lo estamos recorriendo. */
	private int indiceIterador = 0;
	
	/**
	 * Constructor de clase.
	 *
	 * @param bolsa Array que contiene los elementos de la bolsa.
	 * @param tamano Número de elementos válidos dentro del array.
	 */
	public BagIterator(T[] bolsa, int tamano) {
		this.bolsa = bolsa;
		this.tamano = tamano;
	}
	

	/**
	 * Indica si aún quedan elementos por recorrer en la lista.
	 *
	 * @return true, si hay siguiente. Es decir, devuelve true mientras el indice del iterador no llegue hasta el final del array.
	 */
	@Override
	public boolean hasNext() {
		return indiceIterador < tamano;
	}

	/**
	 * Devuelve el siguiente elemento de la bolsa.
	 *
	 * @return El siguiente elemento de la bolsa.
	 */
	@Override
	public T next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		return bolsa[indiceIterador++];
	}

	
}
