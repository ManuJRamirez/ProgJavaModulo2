package PracticaOchoFunciones;

import java.util.function.Function;

/**
 * Clase Main.
 * 
 * En la que vamos a crear varios objetos "Dog" y vamos a trabajar con ellos usando "Function" y lambdas.
 */
public class MainAplicacion {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		System.out.println("Dogs y funciones");
		Dog boi = new Dog("boi", 30, 6);
		Dog tyri = new Dog("tyri", 40, 12);
		Dog charis = new Dog("charis", 120, 7);

		System.out.println(boi);
		System.out.println(charis);
		
		System.out.println("================================ Funciones ================================");

		Function<Dog, String> getName = dog -> dog.getName();
		System.out.println("Nombre del perro:            "+getName.apply(tyri));
		
		Function<String, Character> getInitial = name -> name.charAt(0);
		System.out.println("Letra inicial de su nombre:  "+getInitial.apply(getName.apply(tyri)));
		
		Function<Dog, Character> getDogInitialAndThen = getName.andThen(getInitial);
		System.out.println("Letra inicial con \"andThen\": "+getDogInitialAndThen.apply(tyri));
		
		Function<Dog, Character> getDogInitialCompose = getInitial.compose(getName);
		System.out.println("Letra inicial con \"compose\": "+getDogInitialCompose.apply(tyri));
		
		tyri.bark();
		tyri.bark();
	}

}
