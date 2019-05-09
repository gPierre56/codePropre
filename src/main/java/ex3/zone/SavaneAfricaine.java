package ex3.zone;

/**
 * @author Guillaume Classe qui contient les animaux situés en zone africaine
 *
 */
public class SavaneAfricaine extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {

		return listeAnimaux.size() * 10;
	}

}
