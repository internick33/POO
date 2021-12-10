package Polimorfismo;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}

}
