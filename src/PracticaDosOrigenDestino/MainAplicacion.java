package PracticaDosOrigenDestino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainAplicacion {

	public static void main(String[] args) {

		// Definimos las rutas de los archivos origen y destino.
		String origen = "/PracticaDosOrigenDestino/M2_T02_Origen.txt";
		Path destino = Path.of("src/PracticaDosOrigenDestino/M2_02_Destino.txt");

		// creamos el flujo de entrada y comprobamos que no devuelva null, que exista el archivo.
		InputStream isOrigen = MainAplicacion.class.getResourceAsStream(origen);
		if (isOrigen == null) {
			System.out.println("No se ha podido encontrar el archivo.");
			return;
		}

		/*
		 * metemos dentro de los parentesis del try, el BufferedReader y BufferedWriter
		 * para que al acabar el bloque try se cierre de forma automatica sin hacer
		 * falta poner un "finally". Usamos Buffered para trabajar con las lineas completas.
		 */
		try (BufferedReader leerOrigen = new BufferedReader(new InputStreamReader(isOrigen));
				BufferedWriter escribirDestino = Files.newBufferedWriter(destino)) {

			String lineaTexto; // creamos una variable para almacenar temporalmente las lineas completas del archivo origen.

			// Usamos un bloque while para que lea las lineas del archivo origen hasta el final y readLine() devuelva un "null".
			while ((lineaTexto = leerOrigen.readLine()) != null) {
				lineaTexto = lineaTexto.replace(' ', '-'); // reemplazamos los caracteres "espacios" por "guiones".
				escribirDestino.write(lineaTexto); // escribimos las lineas modificadas en el archivo nuevo destino.
				escribirDestino.newLine(); // creamos un salto de linea.
			}

			System.out.println("¡Operación realizada correctamente!");

		} catch (IOException e) { //capturamos los errores de lectura y escritura.
			System.out.println("Error al realizar la operación");
			e.printStackTrace();
		}

	}

}
