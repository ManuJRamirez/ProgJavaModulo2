package PracticaOchoFunciones;

/**
 * Clase Dog.
 * 
 * Representamos un objeto "Dog" con su "name", "weight" y "age" como
 * parámetros. Almacena la información básica de un perro, junto con métodos
 * para acceder a esos datos.
 */
public class Dog {

	/** Atributo de tipo String en el que almacenamos el nombre de perro. */
	private String name;

	/** Atributo de tipo int en el que almacenamos el peso del perro. */
	private int weight;

	/** Atributo de tipo int en el que almacenamos la edad del perro. */
	private int age;

	/**
	 * Constructor con parámetros de la clase.
	 *
	 * @param name   nombre del perro.
	 * @param weight peso del perro.
	 * @param age    edad del perro.
	 */
	public Dog(String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	/**
	 * Método que devuelve el nombre del perro.
	 *
	 * @return Nombre del perro.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método que devuelve el peso del perro.
	 *
	 * @return Peso del perro.
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Método que devuelve la edad del perro.
	 *
	 * @return Edad del perro.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Devuelve una representación en texto del objeto "Dog".
	 * En este caso sólo devuelve el atribuno "name".
	 *
	 * @return Nombre del perro
	 */
	@Override
	public String toString() {
		return name;
	}

	/**
	 * Muestra por consola un ladrido del perro, "just for fun".
	 */
	public void bark() {
		System.out.println("Woof!");
	}

}
