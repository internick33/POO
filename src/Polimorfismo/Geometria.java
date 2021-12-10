package Polimorfismo;

public class Geometria {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(new Punto(10,10), 5);
		Triangulo t1 = new Triangulo(10, 10);
		Cuadrado cu1 = new Cuadrado(10);
		
		System.out.println("Circulo");
		System.out.println("El area del circulo es:" + c1.calcularArea());
		System.out.println("El perimetro del circulo es:" + c1.calcularPerimetro());
		
		System.out.println("");
		System.out.println("Triangulo");
		System.out.println("El area del triangulo es:" + t1.calcularArea());
		System.out.println("El perimetro del triangulo es:" + t1.calcularPerimetro());
		
		System.out.println("");
		System.out.println("Cuadrado");
		System.out.println("El area del cuadrado es:" + cu1.calcularArea());
		System.out.println("El perimetro del cuadrado es:" + cu1.calcularPerimetro());

	}

}
