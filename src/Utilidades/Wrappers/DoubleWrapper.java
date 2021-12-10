package Utilidades.Wrappers;

public class DoubleWrapper {

	public static void main(String[] args) {
		
		System.out.println("Dame un valor");
		Double valor1 = Lector.leerDouble();
		
		System.out.println("Dame un valor");
		Double valor2 = Lector.leerDouble();
		
		Double resultado = valor1+valor2;
	
		System.out.println("El valores que me diste fueron: " + valor1 + "y " + valor2);
		System.out.println("El valor de la suma de a y b es: " + resultado );

	}

}
