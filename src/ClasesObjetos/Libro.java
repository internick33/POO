package ClasesObjetos;

public class Libro {
	
	//atributos
	private String isbn;
	private String nombre;
	private float precio;
	
	//construcores
	public Libro() {
		this.isbn = "000-000-00";
		this.nombre = "El retrato de Dorian Gray";
		this.precio = 250.00F;
	}
	
	public Libro(String isbn, String nombre, float precio) {
		this.isbn = isbn;
		this.nombre = nombre;
		this.precio =  precio;
	}
	
	//Getters
	public String getIsbn() {
		return isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	
	//Setters
	public void setIsbn(String isbn ) {
		this.isbn = isbn;
	}
	
	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public void setPrecio(float precio) {
		this.precio= precio;
	}
	
	//Metodo comprar
	public float vender(int cantidad) {
		return cantidad * this.precio;
	}

}
