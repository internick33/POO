package ClasesObjetos;

public class TiendaLibros {

	public static void main(String[] args) {
		
		Libro libro1 =  new Libro();
		float totalVentaLibro1 = libro1.vender(5);
		Libro libro2 = new Libro("000-000-01", "Dracula", 150.00F);
		float totalVentaLibro2 = libro2.vender(10);
		
		System.out.println("Libro 1");
		System.out.println("ISBN:" +  libro1.getIsbn());
		System.out.println("Nombre: " + libro1.getNombre());
		System.out.println("Precio: " + libro1.getPrecio());
		System.out.println("Se vendieron 5 libros y cobramos:" + totalVentaLibro1);
		
		System.out.println("");
		System.out.println("Libro 2");
		System.out.println("ISBN:" +  libro2.getIsbn());
		System.out.println("Nombre: " + libro2.getNombre());
		System.out.println("Precio: " + libro2.getPrecio());
		System.out.println("Se vendieron 10 libros y cobramos:" + totalVentaLibro2);

	}

}
