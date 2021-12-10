package Polimorfismo.Interfaces.Juego;

import Polimorfismo.Interfaces.Criaturas.Elfo;
import Polimorfismo.Interfaces.Criaturas.Enano;
import Polimorfismo.Interfaces.Criaturas.Troll;
import Polimorfismo.Interfaces.Criaturas.Utils.Constantes;


public class JuegoMedieval {

	public static void main(String[] args) {
		
		Troll a = new Troll("Trollito",Constantes.FUERZA_TROLL);
		Enano b = new Enano("Enanito",Constantes.FUERZA_ENANO); 
		Elfo c = new Elfo("Elfito",Constantes.FUERZA_ELFO);  
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); 

	}

}
