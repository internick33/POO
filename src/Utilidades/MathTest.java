package Utilidades;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.abs(-1100));
		System.out.println(Math.max(-1,-5));
		System.out.println(Math.min(-1,5));
		System.out.println(Math.pow(4,10));
		System.out.println(Math.sqrt(900));
		System.out.println("N�mero entero aleatorio entre 0 y 100:");
		System.out.println((int)Math.round(Math.random() * 1000));

	}

}
