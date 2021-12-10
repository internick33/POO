package Zoo;

public class Felino  extends Animal{
	
	private String pupilas;

	public Felino() {
		super();
	}

	public Felino(int tamano, int peso, String pupilas) {
		super(tamano, peso);
		this.pupilas = pupilas;
	}

	public String getPupilas() {
		return pupilas;
	}

	public void setPupilas(String pupilas) {
		this.pupilas = pupilas;
	}

	@Override
	public String toString() {
		return " y los feninos tinenen: " + pupilas;
	}
	
}
