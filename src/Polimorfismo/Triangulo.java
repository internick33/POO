package Polimorfismo;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;

	public Triangulo() {
	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return( base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return  base + base + base;
	}
}
