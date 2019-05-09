package ex3.zone;

/**
 * @author Guillaume Classe qui contient les animaux situés en zone aquarium
 *
 */
public class Aquarium extends Zone {

	public Aquarium() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 0.2;
	}

}
