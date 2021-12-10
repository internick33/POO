package ClasesObjetos;

public class CuentasIti2 {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 =  new Cuenta(200.00D, "Yesenia");
		Cuenta cuenta3 =  new Cuenta(400.00D, "Jose Francisco");
		Cuenta cuenta4 =  new Cuenta(100.00D, "Uriel");
		Cuenta cuenta5 =  new Cuenta(4000.00D, "Eduardo");
		Cuenta cuenta6 =  new Cuenta(1400.00D, "Juan Manuel");
		Cuenta cuenta7 =  new Cuenta(2200.00D, "Damian");
		
		System.out.println("El titular de la cuenta1 es:" + cuenta1.getTitular() + " y tiene un saldo de: "+ cuenta1.getSaldo());
		System.out.println("El titular de la cuenta2 es:" + cuenta2.getTitular() + " y tiene un saldo de: "+ cuenta2.getSaldo());
		System.out.println("El titular de la cuenta3 es:" + cuenta3.getTitular() + " y tiene un saldo de: "+ cuenta3.getSaldo());
		System.out.println("El titular de la cuenta4 es:" + cuenta4.getTitular() + " y tiene un saldo de: "+ cuenta4.getSaldo());
		System.out.println("El titular de la cuenta5 es:" + cuenta5.getTitular() + " y tiene un saldo de: "+ cuenta5.getSaldo());
		System.out.println("El titular de la cuenta6 es:" + cuenta6.getTitular() + " y tiene un saldo de: "+ cuenta6.getSaldo());
		System.out.println("El titular de la cuenta7 es:" + cuenta7.getTitular() + " y tiene un saldo de: "+ cuenta7.getSaldo());

	}

}
