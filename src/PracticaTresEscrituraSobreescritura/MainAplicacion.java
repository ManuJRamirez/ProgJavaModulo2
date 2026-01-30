package PracticaTresEscrituraSobreescritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainAplicacion {

	public static void main(String[] args) {

		// Creamos el archivo con el que vamos a trabajar durante la práctica.
		File archivo = new File("src/PracticaTresEscrituraSobreescritura/datos.txt");

		/* Usaremos un BufferedWriter para escribir en el archivo una sola vez */
		try (BufferedWriter bufferArchivo = new BufferedWriter(new FileWriter(archivo))) {

			// Bloque "for" para los tres "1"
			for (int i = 0; i < 3; i++) {
				bufferArchivo.write("1"); // escribimos en datos.txt
				bufferArchivo.newLine(); // creamos un salto de línea.

			}

			// Bloque "for" para los seis "2"
			for (int i = 0; i < 6; i++) {
				bufferArchivo.write("2"); // escribimos en datos.txt
				bufferArchivo.newLine(); // creamos un salto de línea
			}

		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
		
		//
		System.out.println("===================================== Etapa 1 =====================================");
		HerramientasArchivo.mostarArchivo(archivo); // llamamos al método "mostrarArchivo" de la clase HerramientasArchivo
													// para imprimir por consola el contenido de "datos.txt"
		System.out.println("======================================= FIN =======================================");

		// metemos el path del archivo que vamos a editar en la variable "archivoEditar"
		Path archivoEditar = Path.of("src/PracticaTresEscrituraSobreescritura/datos.txt");
		/*
		 * llamamos al método "reemplazarTextoEnArchivo" de la clase "HerramientasArchivo"
		 * al que le pasamos como parámetros el path, el char antiguo que vamos a
		 * reemplazar y el char nuevo por el que lo vamos a sustituir
		 */
		HerramientasArchivo.reemplazarTextoEnArchivo(archivoEditar, '2', '3');
		
		//Usamos este bloque "if" para que solo se ejecute cuando exista y encuentre el archivo que queremos editar.
		if (Files.exists(archivoEditar)) {
			System.out.println("===================================== Etapa 2 =====================================");
			HerramientasArchivo.mostarArchivo(archivo);
			System.out.println("======================================= FIN =======================================");

		}

	}
}
