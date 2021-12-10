package Zoo;

public class Animal {
	
	private int tamano;
	private int peso;
	private String nombre;
	
	public Animal() {
	}

	public Animal(int tamano, int peso) {
		this.tamano = tamano;
		this.peso = peso;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return " El tamano del animal es: " + tamano + " y el peso del animal es: " + peso;
	}
}
