package PracticaCuatroProductorConsumidor;

import java.util.LinkedList;

/**
 * Clase "Cola".
 * 
 * Su función será controlar un buffer en el que va a actuar un productor y un
 * consumidor. Esta cola será limitada por lo que el productor no podrá
 * introducir más datos al buffer cuando éste se encuentre lleno.
 * 
 * El productor añade dato al final de la cola, mientras que el consumidor
 * extraerá datos desde el principio.
 */
public class Cola {
//	private final Queue<Integer> colaCompartida = new LinkedList<>();

	/**
	 * Lista de tipo "LinkedList" en la que vamos a almacenar los datos de nuestra
	 * cola.
	 */
	private final LinkedList<Integer> colaCompartida = new LinkedList<Integer>();

	/** Tamaño de nuestra Cola */
	private int tamanoCola;

	public int getTamanoCola() {
		return tamanoCola;
	}

	public void setTamanoCola(int tamanoCola) {
		this.tamanoCola = tamanoCola;
	}

	/**
	 * Constructor con parámetros de clase.
	 *
	 * @param tamanoCola Introduciremos el tamaño de la cola a la hora de crear el
	 *                   objeto.
	 */
	public Cola(int tamanoCola) {
		this.tamanoCola = tamanoCola;
	}

	/**
	 * Método que se usará por el "Productor" para añadir datos a la cola. En caso
	 * de que ésta se encuentre llena, el productor pasará a modo "espera".
	 *
	 * @param dato Dato o valor de tipo int que se va a añadir a la cola.
	 * @throws InterruptedException saltará una excepción del tipo
	 *                              "InterruptedException" cuando se interrumpa el
	 *                              hilo.
	 */
	public synchronized void productorIntroduceEnCola(int dato) throws InterruptedException {
		while (colaCompartida.size() == tamanoCola) {
			wait();
		}

		colaCompartida.add(dato);
		System.out.println(
				"Dato añadido a la cola: " + dato + " <=============> Tamaño de la cola:" + colaCompartida.size());
		notifyAll();
	}

	/**
	 * Método usado por el "Consumidor" para extraer datos de la cola. En el caso de
	 * que la cola se encuentre vacía, pasará a modo "espera".
	 *
	 * @return the int
	 * @throws InterruptedException saltará una excepción del tipo
	 *                              "InterruptedException" cuando se interrumpa el
	 *                              hilo.
	 */
	public synchronized int consumirDatos() throws InterruptedException {
		while (colaCompartida.isEmpty()) {
			wait();
		}

		int datoExtraidoDeCola = colaCompartida.poll();
		System.out.println("Dato extraido de la cola: " + datoExtraidoDeCola + " <=============> Tamaño de la cola:"
				+ colaCompartida.size());
		notifyAll();
		return datoExtraidoDeCola;
	}

}
