package Herencia;

public class MiClaseTest {

	public static void main(String[] args) {
		
		MiClase mc = new MiClase();
		MiClase mc2 = new MiClase();
		
		System.out.println("mc:" + mc);
		System.out.println("mc:" + mc2);
		System.out.println("toString():" + mc.toString());
		System.out.println("hashCode():" + mc.hashCode());
		System.out.println("getClass():" + mc.getClass());
		System.out.println("equals():" + mc.equals(mc2));

	}

}
