package PracticaDiezStringBuilderStringBuffer;

/**
 * Clase MainAplicacion.
 * 
 * En esta clase vamos a trabajar con StringBuilder y StringBuffer.
 * 
 */
public class MainAplicacion {

	/**
	 * Método Main.
	 * 
	 * Usaremos StringBuilder y StringBuffer, junto con algunos de sus métodos y
	 * mostraremos el resultado por consola.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.println("=======================================================");
		System.out.println("================== StringBuilder ======================");
		System.out.println("=======================================================");

		/** Crear StrinBuilder */
		StringBuilder texto = new StringBuilder("Hay coches");
		System.out.println("Texto inicial: " + texto);

		/** Capacidad y tamaño inicial */
		System.out.println("Capacidad inicial: " + texto.capacity());
		System.out.println("Tamaño inicial: " + texto.length());

		/** Añadir texto */
		texto.append(" en el desguace");
		System.out.println("Texto editado: " + texto);

		/** Reemplazar parte del texto */
		int numero = 1000;
		texto.replace(4, 10, "más de " + numero + " coches");
		System.out.println("Texto reemplazado: " + texto);

		/** String con los últimos 4 chars */
		String ultimosCuatroChars = texto.substring(texto.length() - 4);
		System.out.println("Último 4 caracteres del texto: " + ultimosCuatroChars);

		/** Capacidad y tamaño final */
		System.out.println("Capacidad final: " + texto.capacity());
		System.out.println("Tamaño final: " + texto.length());
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("=================== StringBuffer ======================");
		System.out.println("=======================================================");

		/** Crear StringBuffer */
		StringBuffer textoBuffer = new StringBuffer("Hay coches");
		System.out.println("Texto inicial: " + textoBuffer);

		/** Capacidad y tamaño inicial */
		System.out.println("Capacidad inicial: " + textoBuffer.capacity());
		System.out.println("Tamaño inicial: " + textoBuffer.length());

		/** Añadir texto */
		textoBuffer.append(" en el desguace");
		System.out.println("Texto editado: " + textoBuffer);

		/** Reemplazar parte del texto */
		textoBuffer.replace(4, 10, "más de " + numero + " coches");
		System.out.println("Texto reemplazado: " + textoBuffer);

		/** String con los últimos 4 chars */
		String ultimosCuatroCharsBuffer = textoBuffer.substring(textoBuffer.length() - 4);
		System.out.println("Últimos 4 caracteres del texto: " + ultimosCuatroCharsBuffer);

		/** Capacidad y tamaño final */
		System.out.println("Capacidad final: " + textoBuffer.capacity());
		System.out.println("Tamaño final: " + textoBuffer.length());
	}

}