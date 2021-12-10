package Zoo;

public class Lobo extends Canino {
	
	private String nombre;

	public Lobo(int tamano, int peso, String canino, String nombre) {
		super( tamano, peso, canino);
		this.nombre = nombre;
	}

	public Lobo() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Los Lobos tienen de nombre:" + nombre;
	}

}
