package Zoo;

public class Perro extends Canino {

	private String nombre;

	public Perro(int tamano, int peso, String canino, String nombre) {
		super(tamano, peso, canino);
		this.nombre = nombre;
	}

	public Perro() {
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
		return "Los perros tienen de nombre:" + nombre;
	}
}
