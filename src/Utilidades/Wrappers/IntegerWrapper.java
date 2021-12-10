package Utilidades.Wrappers;

public class IntegerWrapper {

	public static void main(String[] args) {
		
		System.out.println("Dame un valor");
		String valor1 = Lector.leerString();
		
		System.out.println("Dame otro valor");
		String valor2 = Lector.leerString();
		
		Integer resultado = Integer.valueOf(valor1) + Integer.valueOf(valor2);
	
		System.out.println("El valores que me diste fueron: " + valor1 + "y " + valor2);
		System.out.println("El valor de la suma de a y b es: " + resultado );
		
		
		
	

	}

}
