package PracticaTresEscrituraSobreescritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class HerramientasArchivo {

	/*
	 * En este método leer, línea a línea, un archivo que se le pasa por parámetros
	 * y mostrarlo por consola
	 */
	public static void mostarArchivo(File archivo) {

		try (BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo))) {

			String lineaArchivo; // variable que almacena temporalmente una línea leida del archivo.

			// leemos e imprimimos por consola las líneas del archivo pasado, hasta que
			// llegue al final y readline() devuelva null.
			while ((lineaArchivo = leerArchivo.readLine()) != null) {
				System.out.println(lineaArchivo);
			}

		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}
	}

	/*
	 * En este método vamos a leer y reemplazar caracteres en un archivo. Pasamos
	 * como parámetros el path del archivo, el char que vamos a reemplazar y el char
	 * nuevo.
	 */
	public static void reemplazarTextoEnArchivo(Path archivo, char caracterViejo, char caracterNuevo) {

		// Si no encuentra el archivo, no seguimos avanzando.
		if (!Files.exists(archivo)) {
			System.out.println("No se ha podido encontrar el archivo.");
			return;
		}

		/*
		 * Usamos esta variable para almacenar de forma provisional el texto que hay en
		 * el archivo que pasamos como parámetro. Si fuera un archivo más pesado quizás
		 * deberiamos hacer una copia en un archivo temporal que borrariamos al acabar.
		 * 
		 * Esto se realiza porque no podemos, leer y escribir a la vez en el mismo
		 * archivo.
		 */
		StringBuilder ContenidoArchivoProvisional = new StringBuilder();

		try (BufferedReader leerOrigen = Files.newBufferedReader(archivo)) {

			String lineaTexto;
			// En este bloque "while" reemplazaremos el caracter viejo por el nuevo, además
			// añadiremos un salto de linea.
			while ((lineaTexto = leerOrigen.readLine()) != null) {
				ContenidoArchivoProvisional.append(lineaTexto.replace(caracterViejo, caracterNuevo)).append("\n");
			}

		} catch (IOException e) {
			System.out.println("Error de lectura o escritura del archivo");
			e.printStackTrace();
		}

		// En este bloque try, editaremos el archivo que se le ha pasado, por el texto
		// que habiamos guardado provisionalmente en la variable
		// "contenidoArchivoProvisional"
		try (BufferedWriter editarEnArchivo = Files.newBufferedWriter(archivo)) {
			editarEnArchivo.write(ContenidoArchivoProvisional.toString());

		} catch (IOException e) {
			System.out.println("Error de lectura o escritura del archivo");
			e.printStackTrace();
		}

	}
}
