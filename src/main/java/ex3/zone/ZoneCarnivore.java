package ex3.zone;

/**
 * @author Guillaume Classe qui contient les animaux situés en zone carnivore
 *
 */
public class ZoneCarnivore extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimaux.size() * 10;
	}

	public ZoneCarnivore() {
		super();
		// TODO Auto-generated constructor stub
	}

}
