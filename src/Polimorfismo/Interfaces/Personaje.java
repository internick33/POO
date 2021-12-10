package Polimorfismo.Interfaces;

public class Personaje implements HabilidadesExtras, HabilidadesExtrasEnKorra, HabilidadesDeSoka {
	
	private String nombre;
	private int defensa;
	private int ataque;
	
	public Personaje() {
	}

	public Personaje(String nombre, int defensa, int ataque) {
		super();
		this.nombre = nombre;
		this.defensa = defensa;
		this.ataque = ataque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	//Metodos Propios
	public void tenerSuperVelocidad() {
		System.out.println("Ahora tienes super velocidad");
	}
	
	public void tenerSuperInvicibilidad() {
		System.out.println("Ahora  puedes ser invicible");
	}

	//Metodos ganados con la interface
	@Override
	public void lucharConFuego() {
		System.out.println("Ahora  puedes usar el fuego");
		
	}

	@Override
	public void lucharConAgua() {
		System.out.println("Ahora  puedes usar el agua");
		
	}

	@Override
	public void lucharConTierra() {
		System.out.println("Ahora  puedes usar la tierra");
		
	}

	@Override
	public void lucharConAire() {
		System.out.println("Ahora  puedes usar el aire");
		
	}

	
	//Metodos ganados con la interface de Habilidades de Korra
	@Override
	public void lucharConLava() {
		System.out.println("Ahora  puedes usar la lava para atacar");
		
	}

	@Override
	public void lucharConSangre() {
		System.out.println("Ahora  puedes usar la sangre para atacar");
		
	}

	//Metodos ganados por la interface de Soka
	@Override
	public void lucharConEspada() {
		System.out.println("Ahora  puedes usar la espada para luchar");
		
	}
	

}
