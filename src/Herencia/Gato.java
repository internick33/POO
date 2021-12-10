package Herencia;

public class Gato {

	public static void main(String[] args) {
		
		Animal gato =  new Animal(1, "Tomas");
		Animal perro = new Animal(2, "Snoopy");
		
		System.out.println(gato.toString());
		System.out.println(perro.toString());
		
		System.out.println("Son iguales: " + gato.equals(perro));

	}

}
