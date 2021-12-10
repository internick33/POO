package Polimorfismo.Interfaces;

public class Avatar {

	public static void main(String[] args) {
	
		Personaje Anng = new Personaje("Anng", 1000, 990);
		Personaje Roku = new Personaje("Roku", 2000, 690);
		
		System.out.println("Avatar Anng");
		Anng.tenerSuperInvicibilidad();
		Anng.tenerSuperVelocidad();
		Anng.lucharConAgua();
		Anng.lucharConAire();
		Anng.lucharConFuego();
		Anng.lucharConTierra();
		Anng.lucharConLava();
		Anng.lucharConSangre();
		Anng.lucharConEspada();
		
		System.out.println("");
		System.out.println("Avatar Roku");
		Roku.tenerSuperInvicibilidad();
		Roku.tenerSuperVelocidad();
		Roku.lucharConAgua();
		Roku.lucharConAire();
		Roku.lucharConFuego();
		Roku.lucharConTierra();
		Roku.lucharConSangre();
		Roku.lucharConLava();
		Roku.lucharConEspada();
	}

}
